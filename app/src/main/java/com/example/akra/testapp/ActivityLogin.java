package com.example.akra.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class ActivityLogin extends AppCompatActivity implements View.OnClickListener
{

    Intent backBttnActive2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        //Toast.makeText(this, "8===>", Toast.LENGTH_LONG).show();

        Button btms2 = (Button)findViewById(R.id.buttonBackToMainScreen2);

        btms2.setOnClickListener(this);

        backBttnActive2 = new Intent(ActivityLogin.this, MainActivity.class);

    }



    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.buttonBackToMainScreen2:
                startActivity(backBttnActive2);
                finish();
                break;

        }
    }

}