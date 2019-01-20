package com.example.michell.appfromscratch;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

public class RVViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private TextView textView2;
    private TextView textView3;


    public RVViewHolder(@NonNull View itemView) {
        super(itemView);

       textView = itemView.findViewById(R.id.text_view);
       textView2 = itemView.findViewById(R.id.text2);
       textView3 = itemView.findViewById(R.id.text3);
    }

    public void onBind(AndroidVersions android){
       textView.setText(android.getVer());
       textView2.setText(android.getApi());
        textView3.setText(android.getName());
    }
}
