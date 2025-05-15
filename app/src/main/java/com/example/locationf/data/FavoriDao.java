package com.example.locationf.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Delete;

import com.example.locationf.models.FavoriEntity;

import java.util.List;

@Dao
public interface FavoriDao {

    @Query("SELECT * FROM favoris")
    List<FavoriEntity> getAll();

    @Insert
    void insert(FavoriEntity favori);

    @Delete
    void delete(FavoriEntity favori);

    @Query("DELETE FROM favoris WHERE id = :id")
    void deleteById(String id);

    @Query("SELECT EXISTS(SELECT 1 FROM favoris WHERE id = :id)")
    boolean exists(String id);
}
