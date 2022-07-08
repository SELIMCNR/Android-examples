package com.example.superkahraman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun olustur(view:View){
        val isim = isimText.text.toString()
        val yas = yasText.text.toString().toIntOrNull()
        val meslek = meslekText.text.toString()
        val ulke = ulkeText.text.toString()
        val tcpz = tcText.text.toString()

        if (yas == null){
            sonucText.text="Doğru Yaşı Giriniz"
        }
        else {
            val SuperKahraman = superkahraman(isim, yas, meslek,ulke,tcpz)
            sonucText.text =
                "İsim : ${SuperKahraman.isim} Yaş: ${SuperKahraman.yas} Meslek: ${SuperKahraman.meslek} Ulke: ${SuperKahraman.ulke} Tc: ${
                    SuperKahraman.tcpz
                }"
        }
        }






    }
