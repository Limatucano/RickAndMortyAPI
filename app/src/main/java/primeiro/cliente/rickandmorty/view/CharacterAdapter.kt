package primeiro.cliente.rickandmorty.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import primeiro.cliente.rickandmorty.R
import primeiro.cliente.rickandmorty.api.model.CharacterResult

class CharacterAdapter(private val items: List<CharacterResult>) : RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_item,parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    override fun getItemCount() = items.size

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bindView(item: CharacterResult) = with(itemView){
            val ivCharacter = findViewById<ImageView>(R.id.ivCharacter)
            val tvName = findViewById<TextView>(R.id.tvName)
            val tvSpecies = findViewById<TextView>(R.id.tvSpecies)

            tvName.text = item.name
            tvSpecies.text = item.species
        }
    }


}