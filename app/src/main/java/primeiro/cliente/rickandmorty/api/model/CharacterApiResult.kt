package primeiro.cliente.rickandmorty.api.model

data class CharacterApiResult (
    val count: Int,
    val results: List<CharacterResult>
)

data class CharacterResult(
    val id : Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val image: String,
    val url: String,
    val created: String,
    val episode: List<String>,
    val origin: Origin,
    val location: Location
)
data class Origin (
    val name : String,
    val url: String
    )

data class Location (
    val name : String,
    val url: String
)
