package primeiro.cliente.rickandmorty.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import primeiro.cliente.rickandmorty.R
import primeiro.cliente.rickandmorty.api.CharacterRepository
import primeiro.cliente.rickandmorty.domain.CharacterData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvCharacters = findViewById<RecyclerView>(R.id.rvCharacters)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val Rick = CharacterData(
                "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
                "Morty Smith",
                "Alien"
        )
        val characters = listOf(
                Rick, Rick,Rick, Rick
        )
        val charactersApi = CharacterRepository.getCharacters()
        rvCharacters.layoutManager = layoutManager
        rvCharacters.adapter = CharacterAdapter(characters)


    }
}