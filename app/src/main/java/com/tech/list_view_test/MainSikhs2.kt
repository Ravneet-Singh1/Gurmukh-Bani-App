package com.tech.list_view_test

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_user.*

class MainSikhs2 : AppCompatActivity() {

    private var mlistName : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sikhs2)

        mlistName = intent.getStringExtra("listName")

        textView.text = mlistName.toString().toUpperCase()

        title = "ABOUT SIKHISM"


        when(mlistName){
            "Interesting Facts" -> {
                mainText.setText(R.string.interesting_facts)
            }
            "Sikh Beliefs" -> {
                mainText.setText(R.string.sikh_beleifs)
            }
            "Pillars of Sikhism" -> {
                mainText.setText(R.string.pillars_of_sikhism)
            }
            "Five Kakkars" -> {
                mainText.setText(R.string.five_kakkars)
            }
            "History" -> {
                mainText.setText(R.string.about_sikhism)
            }
            "Five Evils" -> {
                mainText.setText(R.string.five_evils)
            }
            "Five Virtues"-> {
                mainText.setText(R.string.five_virtues)
            }
            "Five Beloved(Panj Pyare)"-> {
                mainText.setText(R.string.panj_pyare)
            }
            "Five Takht(Panj Takht)"-> {
                mainText.setText(R.string.sri_akal_takht_sahib)
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return  when(item?.itemId){

            R.id.colorBlack ->{
                mainText.setTextColor(Color.BLACK)
                true
            }
            R.id.colorGrey ->{
                mainText.setTextColor(Color.GRAY)
                true
            }
            R.id.colorBlue ->{
                mainText.setTextColor(Color.BLUE)
                true
            }
            R.id.colorWhite ->{
                mainText.setTextColor(Color.WHITE)
                true
            }
            R.id.colorRed ->{
                mainText.setTextColor(Color.RED)
                true
            }


            R.id.fontSmall ->{
                mainText.setTextSize(20f)
                true
            }
            R.id.fontMedium ->{
                mainText.setTextSize(25f)
                true
            }
            R.id.fontLarge ->{
                mainText.setTextSize(30f)
                true
            }
            R.id.fontExtraLarge ->{
                mainText.setTextSize(35f)
                true
            }


            R.id.theme_default ->{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                true
            }
            R.id.theme_light ->{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                true
            }
            R.id.theme_dark ->{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }


}