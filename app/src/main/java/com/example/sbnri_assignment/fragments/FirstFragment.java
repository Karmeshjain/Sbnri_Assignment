package com.example.sbnri_assignment.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sbnri_assignment.ModelFeed;
import com.example.sbnri_assignment.R;
import com.example.sbnri_assignment.adapters.AdapterFeed;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ModelFeed> modelFeedArrayList;
    private AdapterFeed adapterFeed;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        modelFeedArrayList = new ArrayList<>();
        adapterFeed = new AdapterFeed(getContext(), modelFeedArrayList);
        recyclerView.setAdapter(adapterFeed);

        populateRecyclerView();

        return view;
    }

    public void populateRecyclerView() {
        ModelFeed modelFeed = new ModelFeed(1, 9, 2, R.drawable.ic_propic1, R.drawable.img_post1,
                "Ayush Agarwal", "2 hrs", "What is Urvar?");
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(2, 26, 6, R.drawable.ic_propic2, 0,
                "Anjali Shrestha", "9 hrs", "Don't be afraid of your fears. They're not there to scare you. They're there to\n" +
                "let you know that something is worth it.");
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(3, 17, 5, R.drawable.ic_propic3, R.drawable.img_post1,
                "Lakshya Ram", "13 hrs", "That reflection!!!");
        modelFeedArrayList.add(modelFeed);

        adapterFeed.notifyDataSetChanged();
    }

}