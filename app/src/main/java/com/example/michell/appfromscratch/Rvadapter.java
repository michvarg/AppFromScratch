package com.example.michell.appfromscratch;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Rvadapter extends RecyclerView.Adapter<RVViewHolder> {
    List<AndroidVersions> myAndroids = new ArrayList<>();

    @NonNull
    @Override
    public RVViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new RVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolder rvViewHolder, int i) {
        rvViewHolder.onBind(myAndroids.get(i));

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
