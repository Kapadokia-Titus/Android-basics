package kapadokia.nyandoro.covidapp.service.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

@Dao
public interface CountryDao {

   @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCountries(Country country);
}
