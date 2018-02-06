package com.example.vadstep.roomwordsample.ui


import android.app.Activity
import android.arch.lifecycle.Observer
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.example.vadstep.roomwordsample.R
import com.example.vadstep.roomwordsample.models.Word
import com.example.vadstep.roomwordsample.mvvm.WordViewModel
import com.example.vadstep.roomwordsample.ui.adapter.WordListAdapter
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    val NEW_WORD_ACTIVITY_REQUEST_CODE = 1

    @Inject
    lateinit var mWordViewModel: WordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val adapter = WordListAdapter(this)
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)
        mWordViewModel.allWords.observe(this,   Observer<List<Word>> {
            it?.let { it1 -> adapter.setWords(it1) }
        })
        fab.setOnClickListener {
            startActivityForResult(Intent(this@MainActivity, NewWordActivity::class.java), NEW_WORD_ACTIVITY_REQUEST_CODE)
        }
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == NEW_WORD_ACTIVITY_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            mWordViewModel.insert(Word(data.getStringExtra(NewWordActivity.EXTRA_REPLY)))
        } else {
            Snackbar.make(recyclerview, R.string.empty_not_saved, Snackbar.LENGTH_LONG).show()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_delete -> { mWordViewModel.deleteAll();true}
            R.id.action_populate_random -> { mWordViewModel.populateRandom();true}
            R.id.action_delete_one -> { mWordViewModel.deleteOne();true}
            else -> super.onOptionsItemSelected(item)
        }
    }
}
