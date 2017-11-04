package webp.ff.com.webpalioss.extensions;

/**
 * @Created by wushuifang
 * @createtime: on 16/7/28.
 * @email: wsfjlagr@qq.com
 * @description :
 */
public class CustomImageSizeModelFutureStudio implements CustomImageSizeModel {

    String baseImageUrl="";    //"http://www.stylewe.com/image_cache/resize/";//RequestAPI.DOMAIN_URL;

    static final double scaleData=0.7;//0.65;
    public CustomImageSizeModelFutureStudio(String baseImageUrl) {
        this.baseImageUrl = baseImageUrl;
    }

    @Override
    public String requestCustomSizeUrl(int width, int height) {
        //具体的缩放规则
        //https://help.aliyun.com/document_detail/44688.html?spm=5176.doc44687.6.945.WXaOMG
        if (baseImageUrl.contains("x-oss-process=image/resize,m_mfit,h_"))
        {
            return baseImageUrl;
        }
        else {
            return baseImageUrl+"?x-oss-process=image/resize,m_mfit,h_"+ (int)(height*scaleData)+",w_"+(int)(width*scaleData)+"/format,webp";
        }

        //return baseImageUrl;
    }
}
