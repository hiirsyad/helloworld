package com.lazday.helloworld.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lazday.helloworld.R;
import com.lazday.helloworld.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainPresenter.View{

    TextView textView;
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        presenter = new MainPresenter(this);
        presenter.setTitle( getString(R.string.app_name) );
    }

    @Override
    public void setToTextview(String title) {
        textView.setText(title);
    }
}
