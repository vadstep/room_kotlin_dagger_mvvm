package com.example.vadstep.roomwordsample.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.vadstep.roomwordsample.R
import com.example.vadstep.roomwordsample.models.Word




/**
 * Created by User1 on 05/02/2018.
 */
internal class WordListAdapter internal constructor(context: Context) : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    private val mInflater: LayoutInflater = LayoutInflater.from(context)
    private var mWords: List<Word> =arrayListOf()// Cached copy of words

    internal inner class WordViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal val wordItemView: TextView

        init {
            wordItemView = itemView.findViewById(R.id.textView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val itemView = mInflater.inflate(R.layout.recycler_view_item, parent, false)
        return WordViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
          holder.wordItemView.text = mWords[position].word
    }

    internal fun setWords(words: List<Word>) {
        mWords = words
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return  mWords.size
    }
}