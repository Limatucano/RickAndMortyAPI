package primeiro.cliente.rickandmorty.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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


        Thread(Runnable {
            loadCharacters(rvCharacters)
        }).start()

    }

    private fun loadCharacters(rvCharacters: RecyclerView) {
        val charactersApi = CharacterRepository.getCharacters()
        charactersApi?.results?.let {
            val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
            rvCharacters.post{
                rvCharacters.layoutManager = layoutManager
                rvCharacters.adapter = CharacterAdapter(it)
            }
        }

    }
}