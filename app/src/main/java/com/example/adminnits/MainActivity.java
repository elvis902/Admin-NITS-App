package com.example.adminnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    MaterialCardView uploadNotice;
    MaterialCardView uploadImage;
    MaterialCardView uploadEbook;
    MaterialCardView uploadFaculty;
    MaterialCardView deleteNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.upload_notice);
        uploadImage = findViewById(R.id.upload_gallery_image);
        uploadEbook = findViewById(R.id.upload_ebook);
        uploadFaculty = findViewById(R.id.upload_faculty);
        deleteNotice = findViewById(R.id.delete_notice);

        uploadNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UploadNotice.class);
                startActivity(intent);
            }
        });
    }
}