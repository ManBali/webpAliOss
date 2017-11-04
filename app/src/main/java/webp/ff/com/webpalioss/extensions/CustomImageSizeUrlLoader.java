package webp.ff.com.webpalioss.extensions;

import android.content.Context;

import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.load.model.stream.BaseGlideUrlLoader;

/**
 * @Created by wushuifang
 * @createtime: on 16/7/28.
 * @email: wsfjlagr@qq.com
 * @description :
 */
public class CustomImageSizeUrlLoader  extends BaseGlideUrlLoader<CustomImageSizeModel> {

    public static final Headers HEADERS = new LazyHeaders.Builder()
            .addHeader("User-Agent","AgentInfo")
            .addHeader("accept","image/webp,image/*,*/*;q=0.8")
            //.addHeader("Encoding","gzip,deflate,sdch")
            .build();

    public CustomImageSizeUrlLoader(Context context) {
        super( context );
    }

    @Override
    protected String getUrl(CustomImageSizeModel model, int width, int height) {
        return model.requestCustomSizeUrl( width, height );
    }

    @Override
    protected Headers getHeaders(CustomImageSizeModel model, int width, int height) {
        return CustomImageSizeUrlLoader.HEADERS;
    }
}
