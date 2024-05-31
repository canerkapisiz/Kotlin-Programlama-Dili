package com.canerkpsz.calisanlarprojesi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val caner = Calisanlar("Caner",10000,"Yazilim",24)
        println(caner.isim)
        caner.maasGoster()
        val zeynep = Calisanlar("Zeynep",1,"Satış",20)
        val atlas = Calisanlar("Atlas",2,"Yazilim",10)
        val mehmet = Calisanlar("Mehmet",3,"Finans",45)
        val ahmet = Calisanlar("Ahmet",4,"Satış",30)
        val levent = Calisanlar("Levent",5,"Yazilim",55)
        val alev = Calisanlar("Alev",6,"Satış",60)
        val ayse = Calisanlar("Ayşe",7,"Satış",40)
        val fatih = Calisanlar("Fatih",8,"Yazilim",36)
        val osman = Calisanlar("Osman",9,"Finans",13)

        val calisan = arrayListOf(caner,zeynep,atlas,mehmet,ahmet,levent,alev,ayse,fatih,osman)

        val yedinciSoruListesi = calisan.filter { it.yas < 25 }.map{it.isim}
        yedinciSoruListesi.forEach { println(it) }

        val altinSoruListesi = calisan.filter { it.yas > 30 }.filter { it.departman == "Yazilim" }.map { it.maasGoster() }
    }
}