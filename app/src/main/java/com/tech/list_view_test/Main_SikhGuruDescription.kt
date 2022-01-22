package com.tech.list_view_test

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main_sikh_guru_description.*


class Main_SikhGuruDescription : AppCompatActivity() {

    private var mSikhGuru : String? = null
    private var mLanguage : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sikh_guru_description)


        mSikhGuru = intent.getStringExtra("GuruName")
        mLanguage = intent.getStringExtra("Language")

        title = mSikhGuru

        when(mSikhGuru){
            "Sri Guru Nanak Dev Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.guru_nanak_dev_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                      guruDesc.setText(R.string.sri_guru_nanak_dev_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_nanak_dev_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_nanak_dev_ji_english)
                    }
                }
            }

            "Sri Guru Angad Dev Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.sri_guru_angad_dev_ji)
                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_angad_dev_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_angad_dev_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_angad_dev_ji_english)
                    }
                }

            }
            "Sri Guru Amar Das Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.sri_guru_amar_das_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_amar_das_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_amar_das_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_amar_das_ji_english)
                    }
                }
            }

            "Sri Guru Ram Das Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.sri_guru_ram_das_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_ram_das_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_ram_das_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_ram_das_ji_english)
                    }
                }
            }

            "Sri Guru Arjan Dev Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.sri_guru_arjan_dev_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_arjan_dev_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_arjan_dev_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_arjan_dev_ji_english)
                    }
                }
            }

            "Sri Guru Hargobind Singh Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.sri_guru_hargobind_singh_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_hargobind_singh_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_hargobind_singh_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_hargobind_singh_ji_english)
                    }
                }
            }

            "Sri Guru Har Rai Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.sri_guru_har_rai_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_har_rai_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_har_rai_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_har_rai_ji_english)
                    }
                }
            }

            "Sri Guru Har Krishan Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.sri_guru_har_krishan_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_har_krishan_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_nanak_dev_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_nanak_dev_ji_english)
                    }
                }
            }

            "Sri Guru Teg Bahadur Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.sri_guru_teg_bahadur_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_teg_bahadur_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_teg_bahadur_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_teg_bahadur_ji_english)
                    }
                }
            }

            "Sri Guru Gobind Singh Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.sri_guru_gobind_singh_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_gobind_singh_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_gobind_singh_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_gobind_singh_ji_english)
                    }
                }
            }

            "Sri Guru Granth Sahib Ji" ->{
                guruname.text = mSikhGuru
                guru_image.setImageResource(R.drawable.guru_granth_sahib_ji)

                when(mLanguage){

                    "Punjabi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_granth_sahib_ji_punjabi)
                    }
                    "Hindi" ->
                    {
                        guruDesc.setText(R.string.sri_guru_granth_sahib_ji_hindi)
                    }
                    "English" ->
                    {
                        guruDesc.setText(R.string.sri_guru_granth_sahib_ji_english)
                    }
                }
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return  when(item.itemId){

            R.id.colorBlack ->{
                guruDesc.setTextColor(Color.BLACK)
                true
            }
            R.id.colorGrey ->{
                guruDesc.setTextColor(Color.GRAY)
                true
            }
            R.id.colorBlue ->{
                guruDesc.setTextColor(Color.BLUE)
                true
            }
            R.id.colorWhite ->{
                guruDesc.setTextColor(Color.WHITE)
                true
            }
            R.id.colorRed ->{
                guruDesc.setTextColor(Color.RED)
                true
            }


            R.id.fontSmall ->{
                guruDesc.textSize = 20f
                true
            }
            R.id.fontMedium ->{
                guruDesc.textSize = 25f
                true
            }
            R.id.fontLarge ->{
                guruDesc.textSize = 30f
                true
            }
            R.id.fontExtraLarge ->{
                guruDesc.textSize = 35f
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