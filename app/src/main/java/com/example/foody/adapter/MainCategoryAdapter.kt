package com.example.foody.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foody.databinding.ItemRvMainCategoryBinding
import com.example.foody.entities.Recipes

class MainCategoryAdapter(): RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>() {


    var arrMainCategory=ArrayList<Recipes>()

    class RecipeViewHolder(val binding: ItemRvMainCategoryBinding):RecyclerView.ViewHolder(binding.root) {

    }
    fun setData(arrData : List<Recipes>){
        arrMainCategory=arrData as ArrayList<Recipes>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(
            ItemRvMainCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.binding.tvDishName.text=arrMainCategory[position].dishName
    }

    override fun getItemCount(): Int {
        return arrMainCategory.size
    }
}