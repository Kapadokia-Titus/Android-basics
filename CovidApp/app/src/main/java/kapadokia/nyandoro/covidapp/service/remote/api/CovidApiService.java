package kapadokia.nyandoro.covidapp.service.remote.api;

import androidx.lifecycle.LiveData;

import java.util.List;

import io.reactivex.Observable;
import kapadokia.nyandoro.covidapp.service.Resource;
import kapadokia.nyandoro.covidapp.service.local.model.Country;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface CovidApiService {

    @GET("/countries?yesterday=&sort=")
    Observable <Resource<List<Country>>> getAllCountries();

}
