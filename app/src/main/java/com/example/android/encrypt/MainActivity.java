package com.example.android.encrypt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the view that shows AES view
        TextView aes = findViewById(R.id.aes);
        // set a onClickListener on that view
        aes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aesIntent = new Intent(MainActivity.this, AesActivity.class);
                startActivity(aesIntent);
            }
        });







        // find the view that shows MD5 view
        TextView md5 = findViewById(R.id.md5);
        // set an onClickListener on that view
        md5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent md5Intent = new Intent(MainActivity.this, Md5Activity.class);
                startActivity(md5Intent);
            }
        });
    }
}