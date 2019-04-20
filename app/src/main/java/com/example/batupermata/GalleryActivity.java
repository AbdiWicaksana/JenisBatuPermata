package com.example.batupermata;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getIncomingIntent();


    }

    private void getIncomingIntent(){
        if (getIntent().hasExtra("url_image") && getIntent().hasExtra("name_image") && getIntent().hasExtra("desc_image")){

            String imageUrl = getIntent().getStringExtra("url_image");
            String imageName = getIntent().getStringExtra("name_image");
            String jbImagesDesc = getIntent().getStringExtra("desc_image");

            setImage(imageUrl,imageName,jbImagesDesc);
        }

    }

    private void setImage(String imageUrl, String imageName, String jbImagesDesc){
        TextView name = findViewById(R.id.img_desc);
        name.setText(imageName);
        TextView det = findViewById(R.id.img_det);
        det.setText(jbImagesDesc);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}
