package com.example.dungeon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton tocheck=(ImageButton)findViewById(R.id.imageView);
        tocheck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), check.class);
                startActivityForResult(intent, 0);
            }
        });
        ImageButton tonob=(ImageButton)findViewById(R.id.imageView2);
        tonob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), nobless.class);
                startActivityForResult(intent, 0);
            }
        });
        ImageButton tohib=(ImageButton)findViewById(R.id.imageView3);
        tohib.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), hib.class);
                startActivityForResult(intent, 0);
            }
        });
        ImageButton tosori=(ImageButton)findViewById(R.id.imageView4);
        tosori.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), sori.class);
                startActivityForResult(intent, 0);
            }
        });
        ImageButton todenma=(ImageButton)findViewById(R.id.imageView5);
        todenma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), denma.class);
                startActivityForResult(intent, 0);
            }
        });
    }

}
