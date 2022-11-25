package com.fpp.sortapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba1 = findViewById<TextView>(R.id.l0)
        val przycisk1 = findViewById<ToggleButton>(R.id.tg1)

        var liczba2 = findViewById<TextView>(R.id.l1)
        val przycisk2 = findViewById<ToggleButton>(R.id.tg2)

        var liczba3 = findViewById<TextView>(R.id.l2)
        val przycisk3 = findViewById<ToggleButton>(R.id.tg3)

        var liczba4 = findViewById<TextView>(R.id.l3)
        val przycisk4 = findViewById<ToggleButton>(R.id.tg4)

        var liczba5 = findViewById<TextView>(R.id.l4)
        val przycisk5 = findViewById<ToggleButton>(R.id.tg5)

        var liczba6 = findViewById<TextView>(R.id.l5)
        val przycisk6 = findViewById<ToggleButton>(R.id.tg6)

        var liczba7 = findViewById<TextView>(R.id.l6)
        val przycisk7 = findViewById<ToggleButton>(R.id.tg7)

        var liczba8 = findViewById<TextView>(R.id.l7)
        val przycisk8 = findViewById<ToggleButton>(R.id.tg8)

        var liczba9 = findViewById<TextView>(R.id.l8)
        val przycisk9 = findViewById<ToggleButton>(R.id.tg9)

        val sortowaniebtn = findViewById<Button>(R.id.sortowanie)
        val losowaniebtn = findViewById<Button>(R.id.losowanie)
        val wynik_sort = findViewById<TextView>(R.id.textarea)

        fun sortowanie(arr:ArrayList<Int>) {
            var swap = true
            while(swap){
                swap = false
                for(i in 0 until arr.size-1){
                    if(arr[i] > arr[i+1]){
                        val temp = arr[i]
                        arr[i] = arr[i+1]
                        arr[i + 1] = temp

                        swap = true
                    }
                }
            }
        }
        losowaniebtn.setOnClickListener {

            liczba1.text = Random.nextInt(0,9).toString()
            liczba2.text = Random.nextInt(0,9).toString()
            liczba3.text = Random.nextInt(0,9).toString()
            liczba4.text = Random.nextInt(0,9).toString()
            liczba5.text = Random.nextInt(0,9).toString()
            liczba6.text = Random.nextInt(0,9).toString()
            liczba7.text = Random.nextInt(0,9).toString()
            liczba8.text = Random.nextInt(0,9).toString()
            liczba9.text = Random.nextInt(0,9).toString()
        }
        sortowaniebtn.setOnClickListener {
            val TablicaSort1 = ArrayList<Int>()
            wynik_sort.text = ""
            if(przycisk1.isChecked){
                TablicaSort1.add(liczba1.text.toString().toInt())
            }
            if(przycisk2.isChecked){
                TablicaSort1.add(liczba2.text.toString().toInt())
            }
            if(przycisk3.isChecked){
                TablicaSort1.add(liczba3.text.toString().toInt())
            }
            if(przycisk4.isChecked){
                TablicaSort1.add(liczba4.text.toString().toInt())
            }
            if(przycisk5.isChecked){
                TablicaSort1.add(liczba5.text.toString().toInt())
            }
            if(przycisk6.isChecked){
                TablicaSort1.add(liczba6.text.toString().toInt())
            }
            if(przycisk7.isChecked){
                TablicaSort1.add(liczba7.text.toString().toInt())
            }
            if(przycisk8.isChecked){
                TablicaSort1.add(liczba8.text.toString().toInt())
            }
            if(przycisk9.isChecked){
                TablicaSort1.add(liczba9.text.toString().toInt())
            }
            sortowanie(TablicaSort1)
            for(elem in TablicaSort1)
            {
                wynik_sort.text = wynik_sort.text.toString() + elem.toString() + ", "
            }
        }
    }
}