package com.canerkpsz.kotlinoop

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
        //Encapsulation
        val caner = Sanatci("Caner",80,"Gitar")
        println(caner.isim)
        caner.isim = "Caner Kapısız"
        println(caner.isim)

        caner.turuYazdir()

        caner.setSacRengiParolali("kahverengi","caner")


        caner.sarkiSoyle()
        println(caner.gozRengi)

        val zeynep = Sanatci("Zeynep",20,"Bateri")
        zeynep.sarkiSoyle()

        println(zeynep.yas)

        //Inheritance

        val kahraman = Kahraman("superman","uçmak")
        kahraman.kos()

        val muhtesemKahraman = MuhtesemKahraman("batman","zengin olmak")
        muhtesemKahraman.kos()
        println(muhtesemKahraman.isim)
        muhtesemKahraman.isim = "caner"
        muhtesemKahraman.muhtesemFonksiyon()

        //Polymorphism

        //statik polymorphism
        val islemler = Islemler()
        println(islemler.cikarma(10,2))
        println(islemler.cikarma(10,2,3))
        println(islemler.cikarma(10,2,3,2))

        //dinamik polymorphism
        val kedi = Hayvan()
        val kopek = Kopek()
        val ornekDizi = arrayOf(kedi, kopek)
        ornekDizi.forEach {
            it.sesCikar()
        }

        //Abstraction
        //Abstract Class, Interface

        //val insan = Insan()



    }
}
