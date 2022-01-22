package com.tech.list_view_test

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    private var mHeading : String? = null
    private var mMessage : String? = null
    private var mLanguage : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        title = "GURBANI"

        mHeading = intent.getStringExtra("name")
        mMessage = intent.getStringExtra("message")
        mLanguage = intent.getStringExtra("Language")

        textView.text = mHeading.toString().toUpperCase()



        when(mHeading)
        {
            "Japji Sahib" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(R.string.JapjiSahib_Punjabi)
                    }
                    "English"->{
                        mainText.setText(R.string.Japji_Sahib)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.JapjiSahib_Hindi)
                    }
                }
            }

            "Jaap Sahib" ->{
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(getString(R.string.JaapSahib_Punjabi_1a) + getString(R.string.JaapSahib_Punjabi_1b))
                    }
                    "English"->{
                        mainText.setText(R.string.Jaap_Sahib)
                    }
                    "Hindi" ->{
                        mainText.setText(getString(R.string.JaapSahib_Hindi_1a) + getString(R.string.JaapSahib_Hindi_1b))
                    }
                }
            }

            "Chaupai Sahib" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(R.string.ChaupaiSahib_Punjabi)
                    }
                    "English"->{
                        mainText.setText(R.string.Chaupai_Sahib)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.ChaupaiSahib_Hindi)
                    }
                }
            }

            "Anand Sahib" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(R.string.AnandSahib_Punjabi)
                    }
                    "English"->{
                        mainText.setText(R.string.Anand_Sahib)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.AnandSahib_Hindi)
                    }
                }
            }

            "Rehras Sahib" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(R.string.RehrasSahib_Punjabi)
                    }
                    "English"->{
                        mainText.setText(R.string.Rehras_Sahib)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.RehrasSahib_Hindi)
                    }
                }
            }

            "Kirtan Sohila" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(getString(R.string.KirtanSohila_Punjabi_1a))
                    }
                    "English"->{
                        mainText.setText(R.string.Kirtan_Sohila)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.KirtanSohila_Hindi_1a)
                    }
                }
            }

            "Asa Di Vaar" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(getString(R.string.AsaDiVaar_Punjabi_1a1) + getString(R.string.AsaDiVaar_Punjabi_1a2) + getString(R.string.AsaDiVaar_Punjabi_1b))
                    }
                    "English"->{
                        mainText.setText(R.string.Asa_Di_Vaar)
                    }
                    "Hindi" ->{
                        mainText.setText(getString(R.string.AsaDiVaar_Hindi_1a) + getString(R.string.AsaDiVaar_Hindi_1b))
                    }
                }
            }

            "Sukhmani Sahib" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(getString(R.string.SukhmaniSahib_Punjabi_1a) + getString(R.string.SukhmaniSahib_Punjabi_1b1)
                                + getString(R.string.SukhmaniSahib_Punjabi_1b2) + getString(R.string.SukhmaniSahib_Punjabi_1c1)
                        + getString(R.string.SukhmaniSahib_Punjabi_1c2) + getString(R.string.SukhmaniSahib_Punjabi_1d1) +
                                getString(R.string.SukhmaniSahib_Punjabi_1d2))
                    }
                    "English"->{
                        mainText.setText(getString(R.string.Sukhmani_Sahib_1_a1) + getString(R.string.Sukhmani_Sahib_1_a2) + getString(R.string.Sukhmani_Sahib_1_b) + getString(R.string.Sukhmani_Sahib_2) + getString(R.string.Sukhmani_Sahib_3))
                    }
                    "Hindi" ->{
                        mainText.setText(getString(R.string.SukhmaniSahib_Hindi_1a) + getString(R.string.SukhmaniSahib_Hindi_1b) + getString(R.string.SukhmaniSahib_Hindi_1c)
                        + getString(R.string.SukhmaniSahib_Hindi_1d) + getString(R.string.SukhmaniSahib_Hindi_1e) + getString(R.string.SukhmaniSahib_Hindi_1f))
                    }
                }
            }

            "Ardaas" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(R.string.Ardaas_Punjabi)
                    }
                    "English"->{
                        mainText.setText(R.string.Ardaas)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.Ardaas_Hindi)
                    }
                }
            }

            "Tav Prasad Savaiye"-> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(R.string.TavPrasadSavaiye_Punjabi)
                    }
                    "English"->{
                        mainText.setText(R.string.Tav_Prasad_Savaiye)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.TavPrasadSavaiye_Hindi)
                    }
                }
            }

            "Dukh Bhanjni Sahib" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(R.string.DukhBhanjniSahib_Punjabi)
                    }
                    "English"->{
                        mainText.setText(R.string.Dukh_Bhanjni_Sahib)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.DukhBhanjniSahib_Hindi)
                    }
                }
            }

            "Barah Maha" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(R.string.BarahMaha_Punjabi)
                    }
                    "English"->{
                        mainText.setText(R.string.Barah_Maha)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.BarahMaha_Hindi)
                    }
                }
            }

            "Aarti" -> {
                when(mLanguage){
                    "Punjabi" ->{
                        mainText.setText(R.string.Aarti_Punjabi)
                    }
                    "English"->{
                        mainText.setText(R.string.Aarti)
                    }
                    "Hindi" ->{
                        mainText.setText(R.string.Aarti_Hindi)
                    }
                }
            }

            else -> {
                mainText.text = "Something wrong"
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