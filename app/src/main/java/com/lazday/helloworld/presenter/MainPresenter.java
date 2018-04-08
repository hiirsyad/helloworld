package com.lazday.helloworld.presenter;

import com.lazday.helloworld.model.Data;

public class MainPresenter {

    private Data data;
    private View view;

    public MainPresenter(View view){
        this.view = view;
        data = new Data();
    }

    public void setTitle(String title){
        view.setToTextview(data.setTitle(title));
    }

    public interface View{
        void setToTextview(String title);
    }
}
