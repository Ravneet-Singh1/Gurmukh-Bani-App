package com.tech.list_view_test

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main_sikhism.*

class MainSikhism : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sikhism)

        title = "SIKHISM"

        val names = arrayOf("History", "Sikh Beliefs", "Interesting Facts", "Pillars of Sikhism", "Five Kakkars",
             "Five Evils", "Five Virtues", "Five Beloved(Panj Pyare)", "Five Takht(Panj Takht)")

//        val arrayAdapter : ArrayAdapter<String> = ArrayAdapter(
//            this, android.R.layout.simple_list_item_1, names
//        )
        val arrayAdapter : ArrayAdapter<String> = ArrayAdapter(applicationContext, R.layout.custom_list_layout,names)

        listView1.adapter = arrayAdapter

        listView1.setOnItemClickListener{
                adapterView, view, i, l ->
           // Toast.makeText(this,"Item Selected : ${names[i]}", Toast.LENGTH_LONG).show()
            var name1 = names[i]
            val intent= Intent(this, MainSikhs2::class.java)
            intent.putExtra("listName",name1) // About Sikhism list
            startActivity(intent)

        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu_new,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return  when(item?.itemId){

            R.id.theme_default ->{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                true
            }
            R.id.theme_light ->{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                true
            }
            R.id.theme_dark -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                true
            }
            R.id.aboutUs ->{
                val intent=Intent(this, AboutUs::class.java)
                startActivity(intent)
                true
            }
            R.id.Share ->{

                val shareSub = "Connect with Sikhism through Gurmukh Bani! Its a fast and simple app we can use to read Gurbani/Nitnem and everything related to Sikhism, available in different languages. \nGet it at https://play.google.com/store/apps/details?id=com.tech.list_view_test "
                val intent = Intent(Intent.ACTION_SEND)
                intent.type="text/plain"
                intent.putExtra(Intent.EXTRA_TEXT,shareSub)
                startActivity(intent)
                true
            }
            R.id.rateUs ->{

                val uri : Uri = Uri.parse("market://details?id=com.tech.list_view_test")
                val goToMarket = Intent(Intent.ACTION_VIEW,uri)

                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY or
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK)

                try{
                    startActivity(goToMarket)
                }
                catch (e: ActivityNotFoundException){
                    startActivity(Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.tech.list_view_test")
                    ))
                }
                true
            }

            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }
}