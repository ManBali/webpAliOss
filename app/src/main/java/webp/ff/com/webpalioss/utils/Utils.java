package webp.ff.com.webpalioss.utils;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import webp.ff.com.webpalioss.models.BannerImageModel;

/**
 * Created by luojilab_sufun on 2017/11/4.
 */

public class Utils {

    public static List<BannerImageModel> getBannerDatas(Context context){
        List<BannerImageModel>  datas=new ArrayList<>();

        String[] imagesUrl=new String[]{
                "http://igetcool.oss-cn-beijing.aliyuncs.com/series/cover/fe7135dd-a8c0-48e1-8ef1-6a0c00456695.jpg",
                "http://igetcool.oss-cn-beijing.aliyuncs.com/test/series/cover/bde098a8-def8-4264-81f4-b9adff41ddff.jpg",
                "http://igetcool.oss-cn-beijing.aliyuncs.com/test/series/cover/fcc7de8e-5d18-4741-8247-7ddcc022e0c3.jpg",
                "http://igetcool.oss-cn-beijing.aliyuncs.com/test/series/cover/48e73678-0700-4143-806d-9b8e13103f4a.jpg",
                "http://igetcool.oss-cn-beijing.aliyuncs.com/test/series/cover/6b2014ea-9f9e-4077-8be7-bfb4c4feb730.jpeg"
        };
        for (int i=0;i<imagesUrl.length;i++){
            BannerImageModel imageModel=new BannerImageModel();
            imageModel.setImgUrl(imagesUrl[i]);
            datas.add(imageModel);
        }
        return datas;
    }
}
