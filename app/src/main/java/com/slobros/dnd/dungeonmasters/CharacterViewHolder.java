package com.slobros.dnd.dungeonmasters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by GRR on 3/27/15.
 */
public class CharacterViewHolder extends RecyclerView.ViewHolder {
    protected TextView txtName;
    protected TextView txtClass;
    protected TextView txtRace;
    protected TextView txtTitle;

    public CharacterViewHolder(View itemView) {
        super(itemView);
        txtName = (TextView) itemView.findViewById(R.id.txtName);
        txtClass = (TextView) itemView.findViewById(R.id.txtClass);
        txtRace = (TextView) itemView.findViewById(R.id.txtRace);
        txtTitle = (TextView) itemView.findViewById(R.id.title);
    }
}
