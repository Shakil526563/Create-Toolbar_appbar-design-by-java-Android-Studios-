package com.example.toolbar_appbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbarid);

        //java er sathe toolbar er connect compete
        setSupportActionBar(toolbar);
        //step 2 te get korbo toolbar k
        if(getSupportActionBar()!=null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My Toolbar");

        }
        //toolbar.setTitle("My toolbar");
        toolbar.setSubtitle("Sub title");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_file,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid=item.getItemId();
        if(itemid==R.id.new_btn){
            Toast.makeText(this, "item new", Toast.LENGTH_SHORT).show();
        }
        else if(itemid==R.id.act_btn){
            Toast.makeText(this, "Action perform", Toast.LENGTH_SHORT).show();
        }
        else if(itemid==R.id.his_tn){
            Toast.makeText(this, "See history", Toast.LENGTH_SHORT).show();
        }
        else if(itemid==R.id.toolbarid){
            super.onBackPressed();

        }
        return super.onOptionsItemSelected(item);
    }
}