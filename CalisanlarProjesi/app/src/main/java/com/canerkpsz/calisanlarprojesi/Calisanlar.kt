package com.canerkpsz.calisanlarprojesi

class Calisanlar(val isim : String, maas : Int, var departman : String, var yas : Int) {

    private val _maas = maas

    fun maasGoster(){
        println(this._maas)
    }
}