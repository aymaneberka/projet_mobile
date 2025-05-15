package com.example.locationf.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.locationf.models.FavoriEntity;

@Database(entities = {FavoriEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FavoriDao favoriDao();
}
