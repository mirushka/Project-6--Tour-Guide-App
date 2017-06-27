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


public class Events extends Fragment {


    public Events() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.event1), getString(R.string.event1_desctription), R.drawable.event1));
        infos.add(new Info(getString(R.string.event2), getString(R.string.event_desctription2), R.drawable.event2));
        infos.add(new Info(getString(R.string.event3), getString(R.string.event_desctription3), R.drawable.event3));
        infos.add(new Info(getString(R.string.event4), getString(R.string.event_desctription4), R.drawable.event4));
        infos.add(new Info(getString(R.string.event5), getString(R.string.event_desctription5), R.drawable.event5_2));

        InfoRecyclerAdapter adapter = new InfoRecyclerAdapter(getContext(), infos, R.color.category_events);

        final RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}