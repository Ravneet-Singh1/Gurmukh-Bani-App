package com.tech.list_view_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainQuotes : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    private val quoteText : TextView
        get() =findViewById(R.id.quoteText)

    private val quoteAuthor : TextView
        get() =findViewById(R.id.quoteAuthor)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_quotes)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(application)).get(MainViewModel::class.java)

        setQuotes(mainViewModel.getQuotes())
    }

    fun setQuotes(quotes: Quotes)
    {
        quoteText.text =quotes.text
        quoteAuthor.text =quotes.author
    }

    // To get the previous quote (the function is made in main view model)
    fun onPrevious(view: android.view.View) {
        setQuotes(mainViewModel.previousQuotes())
    }

    // To get the next quote
    fun onNext(view: android.view.View) {
        setQuotes(mainViewModel.nextQuotes())
    }

    // To share the quote
    fun onShare(view: android.view.View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT,mainViewModel.getQuotes().text)
        startActivity(intent)
    }


}