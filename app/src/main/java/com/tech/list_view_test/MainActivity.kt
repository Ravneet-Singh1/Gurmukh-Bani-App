package com.tech.list_view_test

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import com.tech.list_view_test.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    //========================================
    var selectedItemIndex = 0
    private val arrItems = arrayOf("Punjabi", "Hindi", "English")
    var selectedItem = arrItems[selectedItemIndex]
    //========================================



    private lateinit var binding: ActivityMainBinding


    private lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        title = "GURBANI"

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val imageId = intArrayOf(R.drawable.ic_arrow, R.drawable.ic_arrow, R.drawable.ic_arrow,
            R.drawable.ic_arrow, R.drawable.ic_arrow, R.drawable.ic_arrow,
            R.drawable.ic_arrow, R.drawable.ic_arrow, R.drawable.ic_arrow, R.drawable.ic_arrow,
            R.drawable.ic_arrow, R.drawable.ic_arrow, R.drawable.ic_arrow)

//        val audioId = intArrayOf(R.drawable.ic_play, R.drawable.ic_play, R.drawable.ic_play,
//            R.drawable.ic_play, R.drawable.ic_play, R.drawable.ic_play,
//            R.drawable.ic_play, R.drawable.ic_play, R.drawable.ic_play, R.drawable.ic_play,
//            R.drawable.ic_play, R.drawable.ic_play, R.drawable.ic_play)

        val name = arrayOf("Japji Sahib", "Jaap Sahib", "Tav Prasad Savaiye", "Chaupai Sahib", "Anand Sahib",
            "Rehras Sahib", "Ardaas", "Kirtan Sohila" , "Sukhmani Sahib" , "Dukh Bhanjni Sahib",
            "Asa Di Vaar", "Barah Maha", "Aarti")

        val lastMessage = arrayOf("ਜਪੁਜੀ ਸਾਹਿਬ", "ਜਾਪ ਸਾਹਿਬ", "ਤਵ ਪ੍ਰਸਾਦਿ ਸਵਾਰੀਐ", "ਚੌਪਈ ਸਾਹਿਬ", "ਆਨੰਦ ਸਾਹਿਬ",
            "ਰਹਿਰਾਸ ਸਾਹਿਬ", "ਅਰਦਾਸ", "ਕੀਰਤਨ ਸੋਹਿਲਾ", "ਸੁਖਮਨੀ ਸਾਹਿਬ", "ਦੁਖ ਭੰਜਨੀ ਸਾਹਿਬ",
            "ਆਸਾ ਦੀ ਵਾਰ", "ਬਾਰਹ ਮਹਾ", "ਆਰਤੀ")

        userArrayList = ArrayList()

        for (i in name.indices){
            val user = User(name[i], lastMessage[i], imageId[i])     //  audioId[i]
            userArrayList.add(user)
        }

        binding.listView.isClickable = true
        binding.listView.adapter = MyAdapter(this, userArrayList)



        binding.listView.setOnItemClickListener{parent, view, position, id ->

            val name = name[position]
            val imageId = imageId[position]
            val lastMessage = lastMessage[position]
          //  val audioId = audioId[position]


            //======================================== For alert dialogue

            MaterialAlertDialogBuilder(this)
                .setTitle("Please Select the Language")
                .setSingleChoiceItems(arrItems,selectedItemIndex){
                        dialog, which ->
                    selectedItemIndex = which
                    selectedItem = arrItems[which]
                }

                .setPositiveButton("OK"){dialog, which ->

                  //  Toast.makeText(this,"${selectedItem} is selected", Toast.LENGTH_LONG).show()
                    val intent= Intent(this, UserActivity::class.java)

                    intent.putExtra("name",name)  // name is Item(in English)
                    intent.putExtra("imageID",imageId)  // imageID is the key
                    intent.putExtra("message",lastMessage)  // lastMessage is Item(in Punjabi)
                    intent.putExtra("Language",selectedItem) // selectedItem is the Chosen language
                    startActivity(intent)

                }
                .setNeutralButton("Cancel"){
                        dialog, which ->
                    // Handle press for button Neutral
                }.show()

            //========================================

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
            R.id.theme_dark ->{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                true
            }
            R.id.aboutUs ->{
                val intent=Intent(this, AboutUs::class.java)
                startActivity(intent)
                true
            }
            //==============
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
            R.id.Share ->{

                    val shareSub = "Connect with Sikhism through Gurmukh Bani! Its a fast and simple app we can use to read Gurbani/Nitnem and everything related to Sikhism, available in different languages. \nGet it at https://play.google.com/store/apps/details?id=com.tech.list_view_test "
                    val intent = Intent(Intent.ACTION_SEND)
                    intent.type="text/plain"
                    intent.putExtra(Intent.EXTRA_TEXT,shareSub)
                    startActivity(intent)
                true
            }
            //===============
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }
}