package zianaaulia.polbeng.ac.id.jasaonline.services

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap
import zianaaulia.polbeng.ac.id.jasaonline.models.LoginResponse

interface UserService {
    @GET("login")
    fun loginUser(
        @QueryMap filter:HashMap<String, String>
    ): Call<LoginResponse>
}