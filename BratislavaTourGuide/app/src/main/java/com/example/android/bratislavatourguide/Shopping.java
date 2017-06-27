package com.example.android.bratislavatourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class Shopping extends Fragment {


    public Shopping() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.shop1), getString(R.string.shop1_address), R.drawable.shop1));
        infos.add(new Info(getString(R.string.shop2), getString(R.string.shop2_address), R.drawable.shop2));
        infos.add(new Info(getString(R.string.shop3), getString(R.string.shop3_address), R.drawable.shop3));
        infos.add(new Info(getString(R.string.shop4), getString(R.string.shop4_address), R.drawable.shop4));


        InfoRecyclerAdapter adapter = new InfoRecyclerAdapter(getContext(), infos, R.color.category_shopping);

        final RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}