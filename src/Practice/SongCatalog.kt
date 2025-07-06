package Practice

class Songcatalog(val title: String,val artist : String, val year : Int, val playCount : Int){
    fun popular(){
        if(playCount > 1000){
            println("This song in popular with ${playCount} plays!")
        }else{
            println("This song is not popular")
        }
    }

    fun songDescription(){
        println("$title, performed by $artist, was released in $year")
    }
}

fun main(){
    val song = Songcatalog("Ranjheya Ve", "Zoin Akhtar", 2025,2000)
    song.popular()
    song.songDescription()
}