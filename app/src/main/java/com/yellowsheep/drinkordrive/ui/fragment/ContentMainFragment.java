package com.yellowsheep.drinkordrive.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yellowsheep.drinkordrive.R;

/**
 * Created by friz on 26/05/16.
 */
public class ContentMainFragment extends Fragment {

    public ContentMainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content_main, container, false);

    }

}
