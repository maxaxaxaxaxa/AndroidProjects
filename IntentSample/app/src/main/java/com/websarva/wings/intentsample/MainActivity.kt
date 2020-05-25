package com.websarva.wings.intentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        val menuList : MutableList<MutableMap<String, String>> = mutableListOf()
        var menuNameArr = arrayOf("唐揚げ定食","生姜焼き定食","ハンバーグ定食","焼き魚定食","日替わり定食")
        var menuPriceArr = arrayOf("800円","800円","850円","900円","750円")
        var menuLength = (menuNameArr).size

        if(menuLength > 0){
            for(i in menuNameArr) {
                menuList[i].add("name" to menuNameArr[i], "price" to menuPriceArr[i])
            }
        } else {
            print("error")
        }

        menuList.add()
    }
}
