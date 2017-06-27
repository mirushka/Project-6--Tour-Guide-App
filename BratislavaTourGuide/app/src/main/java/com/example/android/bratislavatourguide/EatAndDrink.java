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


public class EatAndDrink extends Fragment {


    public EatAndDrink() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.resaurant1), getString(R.string.restaurant1_address), R.drawable.res1));
        infos.add(new Info(getString(R.string.resaurant2), getString(R.string.restaurant2_address), R.drawable.res2));
        infos.add(new Info(getString(R.string.resaurant3), getString(R.string.restaurant3_address), R.drawable.res3));
        infos.add(new Info(getString(R.string.resaurant4), getString(R.string.restaurant4_address), R.drawable.res4));

        InfoRecyclerAdapter adapter = new InfoRecyclerAdapter(getContext(), infos, R.color.category_eatAndDrink);

        final RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}