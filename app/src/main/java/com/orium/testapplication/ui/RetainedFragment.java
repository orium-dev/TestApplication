package com.orium.testapplication.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class RetainedFragment<T> extends Fragment {

    public static final String RETAIN_FRAGMENT_TAG = "fragment_data";

    private T data;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}
