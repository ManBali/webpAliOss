package webp.ff.com.webpalioss.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.bumptech.glide.Glide;

import webp.ff.com.webpalioss.R;
import webp.ff.com.webpalioss.extensions.CustomImageSizeModel;
import webp.ff.com.webpalioss.extensions.CustomImageSizeModelFutureStudio;
import webp.ff.com.webpalioss.extensions.CustomImageSizeUrlLoader;

/**
 * Created by luojilab_sufun on 2017/11/4.
 */
public class FFImageView extends AppCompatImageView {
    public FFImageView(Context context) {
        super(context);
    }

    public FFImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FFImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 根据控件的大小进行加载定向重写加载+web进行压缩
     * @param urlWebP
     */
    public void setImgUrlWebP(String urlWebP){
        CustomImageSizeModel customImageRequest = new CustomImageSizeModelFutureStudio(urlWebP);
        Glide.with(getContext()).  //CoreApplication.getInstance()
                using(new CustomImageSizeUrlLoader(getContext()))
                .load(customImageRequest)
                .asBitmap()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(this);
    }

    /**
     * 正常的图片加载
     * @param urlNormal
     */
    public void setImgUrlNormal(String urlNormal){
        Glide.with(getContext()).load(urlNormal).placeholder(R.mipmap.ic_launcher).into(this);
    }
}
