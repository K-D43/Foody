package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foody.adapter.MainCategoryAdapter
import com.example.foody.adapter.SubCategoryAdapter
import com.example.foody.databinding.ActivityMainBinding
import com.example.foody.entities.Recipes

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var arrMainCategory=ArrayList<Recipes>()
    var arrSubCategory=ArrayList<Recipes>()

    var MainCatAdapter=MainCategoryAdapter()
    var SubCatAdapter= SubCategoryAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrMainCategory.add(Recipes(1,"NonVeg"))
        arrMainCategory.add(Recipes(2,"Veg"))
        arrMainCategory.add(Recipes(3,"Desert"))
        arrMainCategory.add(Recipes(4,"Lamb"))
        arrMainCategory.add(Recipes(5,"NonVeg"))
        arrMainCategory.add(Recipes(6,"Veg"))
        arrMainCategory.add(Recipes(7,"Desert"))
        arrMainCategory.add(Recipes(8,"Lamb"))

        MainCatAdapter.setData(arrMainCategory)
        binding.rvMainCategory.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvMainCategory.adapter=MainCatAdapter

        arrSubCategory.add(Recipes(1,"Chicken"))
        arrSubCategory.add(Recipes(2,"Veg and NonVeg"))
        arrSubCategory.add(Recipes(3,"Juice and Icecream"))
        arrSubCategory.add(Recipes(4,"Kapsalon"))
        arrSubCategory.add(Recipes(5,"Chicken"))
        arrSubCategory.add(Recipes(6,"Veg and NonVeg"))
        arrSubCategory.add(Recipes(7,"Juice and Icecream"))
        arrSubCategory.add(Recipes(8,"Kapsalon"))

        SubCatAdapter.setData(arrSubCategory)
        binding.rvSubCategory.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvSubCategory.adapter=SubCatAdapter


    }
}