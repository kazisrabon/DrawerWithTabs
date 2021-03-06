package com.example.bs_36.drawerwithtabs.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bs_36.drawerwithtabs.R;

/**
 * Created by BS-36 on 4/29/2015.
 */
public class Fragment_1_2 extends Fragment {

    View view;

    // newInstance constructor for creating fragment with arguments
    public static Fragment_1_2 newInstance(int page, String title) {
        Fragment_1_2 fragment_1_2 = new Fragment_1_2();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragment_1_2.setArguments(args);
        return fragment_1_2;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_1_2, container, false);

        return view;
    }
}
