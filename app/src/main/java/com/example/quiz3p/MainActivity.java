package com.example.quiz3p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  int ile = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tekst);
    }

    public void dobrze(View view) {
        ile++;
        Toast.makeText(this,R.string.odp_ok,Toast.LENGTH_SHORT).show();
        int wybrany = view.getId();
        Button button =(Button) findViewById(wybrany);
        button.setVisibility(View.INVISIBLE);
        if(ile==4){
            textView.setText(R.string.gratulacje);
        }
    }

    public void zle(View view) {
        Toast toast;
        toast = Toast.makeText(this,R.string.odp_no,Toast.LENGTH_SHORT);
        toast.show();
    }
}