package com.example.riku.tabviewapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.riku.tabviewapp.R;

/**
 * Created by RIKU on 2015/12/18.
 */
public class TestFragment  extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        return  inflater.inflate(R.layout.fragment_main,container,false);

    }
}
