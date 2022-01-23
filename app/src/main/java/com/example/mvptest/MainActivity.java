package com.example.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  Contract.View{
      private Button button;
      private ProgressBar progressBar;
      private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.ButtonID);
        progressBar=findViewById(R.id.SHOW_PROGRESS);
        textView=findViewById(R.id.textView2);

        Presenter presenter=new Presenter(new Model(),this);
        presenter.OnButtonClicked();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.OnButtonClicked();
            }
        });
    }

    @Override
    public void showProgress() {
           progressBar.setVisibility(View.VISIBLE);
           textView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.VISIBLE);
    }

    @Override
    public void setDescription(String string) {
        textView.setText(string);
    }
}