package com.example.android.bratislavatourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

public class Attractions extends Fragment {


    public Attractions() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.castle), getString(R.string.castle_description), R.drawable.castle));
        infos.add(new Info(getString(R.string.ufoView), getString(R.string.ufoView_description), R.drawable.ufo));
        infos.add(new Info(getString(R.string.slavin), getString(R.string.slavin_description), R.drawable.slavin));
        infos.add(new Info(getString(R.string.gallery), getString(R.string.gallery_description), R.drawable.gallery));

        InfoRecyclerAdapter adapter = new InfoRecyclerAdapter(getContext(), infos, R.color.category_attraction);

        final RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}