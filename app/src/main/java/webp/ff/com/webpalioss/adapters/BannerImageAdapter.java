package webp.ff.com.webpalioss.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import webp.ff.com.webpalioss.R;
import webp.ff.com.webpalioss.models.BannerImageModel;
import webp.ff.com.webpalioss.widget.FFImageView;

/**
 * Created by luojilab_sufun on 2017/11/4.
 */

public class BannerImageAdapter extends FFBaseAdapter<BannerImageModel> {




    private boolean isUseWeb=false;
    /**
     * @param data    用于展示的列表数据
     * @param context 传入的上下文
     * @param object  引用者
     * @param exObj   此字段用于后期的一些扩展字段，一般没有效果
     */
    public BannerImageAdapter(List<BannerImageModel> data, Context context, Object object, Object exObj) {
        super(data, context, object, exObj);
    }

    @Override
    public void OnItemClickEvent(int position, int eventType, BannerImageModel model) {

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.banner_image_item_layout, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews((BannerImageModel)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    /**
     * 初始化相关数据
     * @param object
     * @param holder
     */
    private void initializeViews(BannerImageModel object, ViewHolder holder) {
        //TODO implement
        if (isUseWeb){
            holder.ivContent.setImgUrlWebP(object.getImgUrl());
        }else {
            holder.ivContent.setImgUrlNormal(object.getImgUrl());
        }
    }

    protected class ViewHolder {
        private FFImageView ivContent;
        public ViewHolder(View view) {
            ivContent = (FFImageView) view.findViewById(R.id.iv_content);
        }
    }

    public boolean isUseWeb() {
        return isUseWeb;
    }

    public void setUseWeb(boolean useWeb) {
        isUseWeb = useWeb;
    }
}
