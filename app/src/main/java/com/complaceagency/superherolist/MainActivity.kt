package com.complaceagency.superherolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.complaceagency.superherolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var superheros: List<SuperHero> = listOf(
            SuperHero("Spiderman", "Peter Parker", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
            SuperHero("Daredevil", "Matthew Michael Murdock", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"),
            SuperHero("Wolverine", "James Howlett", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"),
            SuperHero("Batman", "Bruce Wayne", "DC", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
            SuperHero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"),
            SuperHero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"),
            SuperHero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"),
            SuperHero("Wonder Woman", "DC", "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg")
    )

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        superheros[0].realName
        initRecicler()
    }

    fun initRecicler(){
        binding.rvSuperHero.layoutManager = LinearLayoutManager (this)
        val adapter = HeroAdapter(superheros)
        binding.rvSuperHero.adapter= adapter

    }
}