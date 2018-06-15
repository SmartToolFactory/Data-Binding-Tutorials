package com.example.tutorial3observables;

import android.content.Context;

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View view;


    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;

    }

    @Override
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }

}