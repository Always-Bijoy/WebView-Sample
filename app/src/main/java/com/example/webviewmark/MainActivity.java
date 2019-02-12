package com.example.webviewmark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3,b4;
    EditText editText;
//    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b4 = findViewById(R.id.lstViewId);

        b3=findViewById(R.id.buttonGo);
        editText=findViewById(R.id.ediId);

//        b1.setOnClickListener(this);

//        web = findViewById(R.id.)
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

        switch (view.getId()){
            case R.id.button:
                intent.putExtra("url", "http://google.com");
                startActivity(intent);
                break;
            case R.id.button2:
                intent.putExtra("url", "http://stackoverflow.com");
                startActivity(intent);
                break;
            case R.id.buttonGo:
                intent.putExtra("url", editText.getText().toString());
                startActivity(intent);
                break;
            case R.id.lstViewId:
                Intent intent1 = new Intent(getApplicationContext(), listViewActivity.class);
                startActivity(intent1);
                break;

                default:
                    break;
        }
    }
}
