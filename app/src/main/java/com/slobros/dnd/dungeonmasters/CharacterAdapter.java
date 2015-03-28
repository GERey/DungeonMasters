package com.slobros.dnd.dungeonmasters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GRR on 3/27/15.
 */
public class CharacterAdapter extends RecyclerView.Adapter<CharacterViewHolder> {

    //Make a list of the data that a character can be composed of.
    private List<CharacterOverview> characters;

    public CharacterAdapter(List<CharacterOverview> characters){
        if(characters == null)
            this.characters = new ArrayList<>(0);
        else
            this.characters = characters;
    }

    @Override
    public CharacterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        return new CharacterViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CharacterViewHolder characterViewHolder, int i) {
        CharacterOverview characterOverview =characters.get(i);
        characterViewHolder.txtName.setText(characterOverview.characterName);
        characterViewHolder.txtClass.setText(characterOverview.characterClass);
        characterViewHolder.txtRace.setText(characterOverview.characterRace);
        characterViewHolder.txtTitle.setText(characterOverview.characterName);
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}
