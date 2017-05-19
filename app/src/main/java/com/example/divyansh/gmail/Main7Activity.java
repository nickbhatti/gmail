package com.example.divyansh.gmail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main7Activity extends AppCompatActivity {
    public void mainClick(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void mainClick2(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void mainClick3(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void mainClick4(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void mainClick5(View view){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
    public void mainClick6(View view){
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }
    public void mainClick7(View view){
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
    public void mainClick8(View view){
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }
    public void mainClick9(View view){
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
}
