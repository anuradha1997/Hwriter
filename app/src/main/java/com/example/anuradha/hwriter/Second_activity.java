package com.example.anuradha.hwriter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Second_activity extends AppCompatActivity {
    TextView tv1,tv2;
    ImageView i1;
    int author;
    String wri[];
    String info[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        tv1 = (TextView) findViewById(R.id.tg1);
        tv2 = (TextView) findViewById(R.id.tg2);
        i1 = (ImageView) findViewById(R.id.iv1);
        Bundle b = getIntent().getExtras();
        author = b.getInt("auth");
        info = getResources().getStringArray(R.array.gh);
        if (author == 0) {
            i1.setImageResource(R.drawable.premchandra);
            tv1.setText(info[0]);
           String c= b.getString("name");
            String a="Premchandra";
            tv2.setText(a);
            Toast.makeText(this, "name is Premchandra"+c, Toast.LENGTH_SHORT).show();

        } else if (author == 1) {
            tv1.setText(info[1]);
            i1.setImageResource(R.drawable.kalidas);

        } else if (author == 2) {
            i1.setImageResource(R.drawable.harivansh);
            tv1.setText(info[2]);

        } else if (author == 3) {
            i1.setImageResource(R.drawable.tulsidas);
            tv1.setText(info[3]);

        } else if (author == 4) {
            i1.setImageResource(R.drawable.bhartendu);
            tv1.setText(info[4]);

        }
    }
}