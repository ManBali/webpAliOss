package webp.ff.com.webpalioss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import webp.ff.com.webpalioss.ui.FFWebPImageLoaderAct;

public class FFMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ffmain);


        findViewById(R.id.btnWebp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(FFMainActivity.this, FFWebPImageLoaderAct.class);
                startActivity(intent);
            }
        });


//        findViewById(R.id.btnNormal).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent();
//                intent.setClass(FFMainActivity.this, FFNormalImageLoaderAct.class);
//                startActivity(intent);
//            }
//        });
    }
}
