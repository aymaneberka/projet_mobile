package com.example.locationf.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "favoris")
public class FavoriEntity {

    @PrimaryKey
    @NonNull
    public String id;

    public String titre;
    public String description;
    public String superficie;
    public int pieces;
    public double loyer;

    public FavoriEntity(String id, String titre, String description, String superficie, int pieces, double loyer) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.superficie = superficie;
        this.pieces = pieces;
        this.loyer = loyer;
    }
}
