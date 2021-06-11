package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Info3Activity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);

        Button btnBack = (Button)findViewById(R.id.btnInfo3Back);

        ImageButton img1 = (ImageButton)findViewById(R.id.imgInfo3Img1);
        ImageButton img2 = (ImageButton)findViewById(R.id.imgInfo3Img2);
        ImageButton img3 = (ImageButton)findViewById(R.id.imgInfo3Img3);
        ImageButton img4 = (ImageButton)findViewById(R.id.imgInfo3Img4);
        ImageButton img5 = (ImageButton)findViewById(R.id.imgInfo3Img5);

        img1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://www.youtube.com/watch?v=6oB1iGV3L_0";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://www.youtube.com/watch?v=Z4WZMkSE3w4";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://www.youtube.com/watch?v=yKnx0clgkco";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://www.youtube.com/watch?v=aOReE-XWIyc";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://www.youtube.com/watch?v=eBBlv1-BrNE";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
