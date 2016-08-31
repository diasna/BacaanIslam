package com.cahayakearifan.bacaanislam.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cahayakearifan.bacaanislam.R;

/**
 * Created by diaxz <dias.arifin@gmail.com> on 11/4/15.
 */
public class FragmentDrawer extends Fragment {

    public FragmentDrawer() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_navigation_drawer_lv, container, false);
        return layout;
    }
}
