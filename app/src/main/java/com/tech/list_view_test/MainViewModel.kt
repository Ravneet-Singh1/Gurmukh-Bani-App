package com.tech.list_view_test

import android.content.Context
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import kotlin.math.absoluteValue

class MainViewModel(val context : Context) : ViewModel() {

    private var quoteList : Array<Quotes> = emptyArray()
    var index = 0

    init {
        quoteList = loadQuoteFromAssets()
    }

    private fun loadQuoteFromAssets(): Array<Quotes> {

        val inputStream =context.assets.open("quotes.json")  //open the json file
        val size : Int = inputStream.available()  // No. of quotes
        val buffer = ByteArray(size)   // Store the quotes in buffer

        inputStream.read(buffer)  // to read
        inputStream.close()  // close the buffer

        val json = String(buffer, Charsets.UTF_8)  // To convert Byte array into string

        val gson = Gson()  // creating object of Gson
        return gson.fromJson(json,Array<Quotes>::class.java)
    }

    fun getQuotes() = quoteList[index]  // To get the quote

    fun nextQuotes() = quoteList[(++index + quoteList.size) % quoteList.size]  // To get the next quote

    fun previousQuotes() = quoteList[(--index + quoteList.size) % quoteList.size]  // // To get the previous quote


}