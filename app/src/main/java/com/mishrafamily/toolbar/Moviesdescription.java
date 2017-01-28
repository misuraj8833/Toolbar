package com.mishrafamily.toolbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Moviesdescription extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moviesdescription);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_movie_description);
        textView=(TextView)findViewById(R.id.textViewDescription);
        /*
        get the intent data from mainactivity
         */
        String Name= getIntent().getStringExtra("movieName");
        movieDesc(Name);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void movieDesc(String name)
    {
        /*
        always use equals() method for equating the string.
         */
        if(name.equals("Suicide Squad"))
        {

            String text = getResources().getString(R.string.suicide_squad_desc);
            textView.setText(text);

        }
    }
}
