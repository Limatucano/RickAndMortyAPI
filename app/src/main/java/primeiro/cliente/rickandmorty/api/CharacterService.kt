package primeiro.cliente.rickandmorty.api

import primeiro.cliente.rickandmorty.api.model.CharacterApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterService {

    @GET("character")
    fun listCharacters(): Call<CharacterApiResult>
}