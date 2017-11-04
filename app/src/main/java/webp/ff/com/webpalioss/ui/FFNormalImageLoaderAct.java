package webp.ff.com.webpalioss.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import webp.ff.com.webpalioss.R;
import webp.ff.com.webpalioss.adapters.BannerImageAdapter;
import webp.ff.com.webpalioss.utils.Utils;

/**
 * Created by luojilab_sufun on 2017/11/4.
 */

public class FFNormalImageLoaderAct extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_activity);
        init();
    }

    ListView listView;
    BannerImageAdapter adapter;
    void init(){
        listView=(ListView)findViewById(R.id.lv);
        adapter=new BannerImageAdapter(Utils.getBannerDatas(this),this,null,null);
        adapter.setUseWeb(false);
        listView.setAdapter(adapter);
    }
}
