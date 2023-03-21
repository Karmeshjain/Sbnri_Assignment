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


public class SecFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ModelFeed> modelFeedArrayList;
    private AdapterFeed adapterFeed;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        modelFeedArrayList = new ArrayList<>();
        adapterFeed = new AdapterFeed(getContext(), modelFeedArrayList);
        recyclerView.setAdapter(adapterFeed);

        populateRecyclerView();

        return view;
    }
    public void populateRecyclerView() {
        ModelFeed modelFeed = new ModelFeed(1, 9, 2, R.drawable.dog1, R.drawable.cat,
                "Prabhat Madan", "6 hrs", "Hi Whats app everyone");
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(2, 26, 6, R.drawable.dog2, 0,
                "Kumari Astha", "10 hrs", "These Thought of the Day Quote are truly best in nature as they teach how to be confident and happy in the most difficult " +
                "situations of life. it will be with every day to answer the most difficult questions of life");
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(3, 17, 5, R.drawable.cat, R.drawable.dog2,
                "Arjun Shrivastav", "13 hrs", "Whatever your path is, every person will find something extra special below." +
                " So live life the way you want, face the challenges without any fear, ");
        modelFeedArrayList.add(modelFeed);

        adapterFeed.notifyDataSetChanged();
    }
}