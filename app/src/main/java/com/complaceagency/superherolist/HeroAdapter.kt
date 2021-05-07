package com.complaceagency.superherolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.complaceagency.superherolist.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class HeroAdapter(var superhero: List<SuperHero>): RecyclerView.Adapter<HeroAdapter.HeroHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero,parent, false))

    }

    override fun getItemCount(): Int = superhero.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }

    class HeroHolder(var view:View):RecyclerView.ViewHolder(view){

        val binding = ItemSuperheroBinding.bind(view)

        fun render(superHero: SuperHero){
            binding.tvSuperHeroName.text = superHero.superHeroName
            binding.tvRealName.text = superHero.realName
            binding.tvPublisher.text = superHero.publisher
            Picasso.get().load(superHero.image).into(binding.ivHero)
            view.setOnClickListener { Toast.makeText(view.context, "Has seleccionado a ${superHero.superHeroName}", Toast.LENGTH_SHORT ).show() }
        }


    }
}