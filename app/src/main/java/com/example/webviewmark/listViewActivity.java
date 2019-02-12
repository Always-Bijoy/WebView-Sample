package com.example.webviewmark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listViewActivity extends AppCompatActivity {

    ListView simpleList;
    String language[] = {"TutorialPoint","Android Hive","Kotlin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //listView

        simpleList=findViewById(R.id.lstID);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, language);
        simpleList.setAdapter(arrayAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                    intent.putExtra("url", "http://tutorialspoint.com");
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                    intent.putExtra("url", "http://androidhive.info");
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
