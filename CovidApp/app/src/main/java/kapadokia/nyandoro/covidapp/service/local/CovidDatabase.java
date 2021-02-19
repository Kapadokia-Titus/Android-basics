package kapadokia.nyandoro.covidapp.service;


import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;

import kapadokia.nyandoro.covidapp.service.local.dao.CountryDao;
import kapadokia.nyandoro.covidapp.service.local.model.Country;

@Database(entities = {Country.class}, version = 1, exportSchema = false)
public abstract class CovidDatabase extends RoomDatabase {

    public abstract CountryDao countryDao();

    private static volatile CovidDatabase INSTANCE;
    public static CovidDatabase getInstance(Context context){
        if (INSTANCE == null){
            synchronized (CovidDatabase.class){
                if (INSTANCE==null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            CovidDatabase.class, "covid_database")
                            .fallbackToDestructiveMigration()
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }

        return INSTANCE;
    }


}
