package com.blossoming.maker.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blossoming.schoolradio.R;

/**
 * Created by Blossoming on 2016/9/9.
 */
public class ThirdFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fg_third,container,false);
        return view;
    }
}
