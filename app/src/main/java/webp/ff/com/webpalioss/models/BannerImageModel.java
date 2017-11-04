package webp.ff.com.webpalioss.models;

/**
 * Created by luojilab_sufun on 2017/11/4.
 */

public class BannerImageModel {


    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    private String imgUrl="";

    private boolean isWebP=false;

    public boolean isWebP() {
        return isWebP;
    }

    public void setWebP(boolean webP) {
        isWebP = webP;
    }
}
