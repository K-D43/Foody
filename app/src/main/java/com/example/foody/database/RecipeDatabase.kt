package com.example.foody.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.foody.dao.RecipeDao
import com.example.foody.entities.Recipes

@Database(entities = [Recipes::class], version = 1, exportSchema = false)
abstract class RecipeDatabase:RoomDatabase() {

    abstract fun recipeDao(): RecipeDao

    companion object{

        var recipeDatabase: RecipeDatabase?=null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase {
            if (recipeDatabase !=null){
                recipeDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipeDatabase!!
        }

    }

}