package com.example.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnmulai = (Button) findViewById(R.id.btndaftar);
        btnmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2.class);
                EditText et = (EditText) findViewById(R.id.etnama);
                String nama = et.getText().toString();
                i.putExtra("data1",nama);
                startActivity(i);
            }
        });
    }
}
