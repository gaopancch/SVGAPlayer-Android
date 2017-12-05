package com.example.ponycui_home.svgaplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by cuiminghui on 2017/3/30.
 * 将 svga 文件打包到 assets 文件夹中，然后使用 layout.xml 加载动画。
 */

public class SimpleActivity extends Activity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        context = this;
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("gaopan","click");
                Intent intent = new Intent(SimpleActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
