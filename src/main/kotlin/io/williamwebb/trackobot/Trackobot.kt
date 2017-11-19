/**
 * Created by williamwebb on 4/5/17.
 */
package io.williamwebb.trackobot

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import io.williamwebb.trackobot.model.ResultData
import io.williamwebb.trackobot.model.TrackobotUser
import io.williamwebb.trackobot.model.Url
import io.williamwebb.trackobot.model.arena.ArenaHistory
import io.williamwebb.trackobot.model.ladder.LadderHistory
import io.williamwebb.trackobot.model.stats.arena.ArenaStats
import io.williamwebb.trackobot.model.stats.classes.ClassesStats
import io.williamwebb.trackobot.model.stats.decks.DecksStats
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

class TrackobotClient(okHttpClient: OkHttpClient, username: String, password: String = "", token: String = "") {

    private val BASE_URL = "https://trackobot.com/"

    interface API {
        @GET("profile/history.json") fun getLadderHistory(): Observable<LadderHistory>
        @GET("profile/history.json") fun getArenaRun(@Query("arena_id") arenaId: String): Observable<LadderHistory>
        @GET("profile/arena.json") fun getArenaHistory(): Observable<ArenaHistory>
        @GET("profile/stats/arena.json") fun getStatsArena(): Observable<ArenaStats>
        @GET("profile/stats/decks.json") fun getStatsDecks(): Observable<DecksStats>
        @GET("profile/stats/classes.json") fun getStatsClasses(): Observable<ClassesStats>
        @POST("profile/results.json") fun postResults(@Body resultData: ResultData): Observable<ResultData>
        @POST("one_time_auth.json") fun oneTimeUrl(): Observable<Url>
        @POST("users.json") fun createUser(): Observable<TrackobotUser>
    }

    private val service: API

    private val passwordAuth = Interceptor {
        val url = it.request().url().toString()
        if(url.contains("users.json")) return@Interceptor it.proceed(it.request())

        return@Interceptor it.proceed(it.request().newBuilder()
                .header("Authorization", Credentials.basic(username, password))
                .build())
    }

    private val tokenAuth = Interceptor {
        val url = it.request().url().toString()
        if(url.contains("users.json")) return@Interceptor it.proceed(it.request())

        val request = it.request()
        return@Interceptor it.proceed(request
                .newBuilder()
                .url(url + (if (url.contains('?')) "&" else "?") + "username=$username&token=$token")
                .build()
        )
    }

    init {
        if(password.isNotEmpty() && token.isNotEmpty()) throw IllegalArgumentException("Only token or password should be supplied")
        if(password.isEmpty() && token.isEmpty()) throw IllegalArgumentException("Token or password must be supplied")

        val authInterceptor = if(token.isEmpty()) {
            passwordAuth
        } else {
            tokenAuth
        }

        val localClient = okHttpClient.newBuilder().addInterceptor(authInterceptor).build()

        val retrofit = Retrofit.Builder()
                .client(localClient)
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        service = retrofit.create(API::class.java)
    }

    fun getLadderHistory(): Observable<LadderHistory> = service.getLadderHistory().subscribeOn(Schedulers.io())
    fun getArenaRun(arenaId: String): Observable<LadderHistory> = service.getArenaRun(arenaId).subscribeOn(Schedulers.io())
    fun getArenaHistory(): Observable<ArenaHistory> = service.getArenaHistory().subscribeOn(Schedulers.io())
    fun getStatsArena(): Observable<ArenaStats> = service.getStatsArena().subscribeOn(Schedulers.io())
    fun getStatsClasses(): Observable<ClassesStats> = service.getStatsClasses().subscribeOn(Schedulers.io())
    fun getStatsDecks(): Observable<DecksStats> = service.getStatsDecks().subscribeOn(Schedulers.io())
    fun postResults(results: ResultData): Observable<ResultData> = service.postResults(results).subscribeOn(Schedulers.io())
    fun createUser(): Observable<TrackobotUser> = service.createUser().subscribeOn(Schedulers.io())
    fun oneTimeUrl(): Observable<Url> = service.oneTimeUrl().subscribeOn(Schedulers.io())
}