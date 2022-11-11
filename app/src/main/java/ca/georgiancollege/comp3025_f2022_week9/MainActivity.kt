package ca.georgiancollege.comp3025_f2022_week9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val FavouriteTVShows = arrayOf<TVShow>(
            TVShow("House of the Dragon", "HBO"),
            TVShow("Lord of the Rings", "Prime Video"),
            TVShow("Andor", "Disney"),
            TVShow("Severance", "AppleTv"),
            TVShow("Star Trek: Strange New Worlds", "Paramount+"))

        val firstAdapter: FirstAdapter = FirstAdapter(FavouriteTVShows)
        val recyclerView: RecyclerView = findViewById(R.id.First_Recycler_View)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = firstAdapter
    }
}