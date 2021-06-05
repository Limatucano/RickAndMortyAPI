package primeiro.cliente.rickandmorty.api

import android.util.Log
import primeiro.cliente.rickandmorty.api.model.CharacterApiResult
import primeiro.cliente.rickandmorty.api.model.CharacterResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object CharacterRepository {
    private val service: CharacterService
    //BASE URL: https://rickandmortyapi.com/api/character

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        service = retrofit.create(CharacterService::class.java)
    }



    fun getCharacters(): CharacterApiResult? {
        val call = service.listCharacters()
        return call.execute().body()
//        call.enqueue(object : Callback<CharacterApiResult>{
//            override fun onResponse(call: Call<CharacterApiResult>, response: Response<CharacterApiResult>) {
//                Log.d("RICK_MORTY","Loaded")
//                if(response.isSuccessful){
//
//
//
//
//
//                }
//            }
//
//            override fun onFailure(call: Call<CharacterApiResult>, t: Throwable) {
//                Log.e("RICK_MORTY","Error loading")
//            }
//
//        })

    }
}