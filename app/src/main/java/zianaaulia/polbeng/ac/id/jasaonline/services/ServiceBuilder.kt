package zianaaulia.polbeng.ac.id.jasaonline.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import zianaaulia.polbeng.ac.id.jasaonline.helpers.Config

object ServiceBuilder {
    //create okhttp client
    private val okhttp: OkHttpClient.Builder = OkHttpClient.Builder()

    //Create Retrofit builder
    private val builder: Retrofit.Builder=
        Retrofit.Builder().baseUrl(Config.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okhttp.build())

    //create retrofit instance
    private val retrofit: Retrofit = builder.build()

    fun <T> buildService(ServiceType: Class<T>): T{
        return retrofit.create(ServiceType)
    }
}