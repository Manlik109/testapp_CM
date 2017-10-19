package com.example.akra.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class ActivityHighscore extends AppCompatActivity implements View.OnClickListener
{

    Intent backBttnActive3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        //Toast.makeText(this, "8===>", Toast.LENGTH_LONG).show();

        Button btms3 = (Button)findViewById(R.id.buttonBackToMainScreen3);

        btms3.setOnClickListener(this);

        backBttnActive3 = new Intent(ActivityHighscore.this, MainActivity.class);

    }



    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.buttonBackToMainScreen3:
                startActivity(backBttnActive3);
                finish();
                break;

        }
    }

}