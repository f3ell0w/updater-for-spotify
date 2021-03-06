package ru.ra66it.updaterforspotify.rest;

import io.reactivex.Observable;
import retrofit2.http.GET;
import ru.ra66it.updaterforspotify.model.Spotify;


/**
 * Created by 2Rabbit on 22.09.2017.
 */

public interface SpotifyApi {

    @GET("spotify")
    Observable<Spotify> getLatestOrigin();

    @GET("spotify-beta")
    Observable<Spotify> getLatestOriginBeta();

}
