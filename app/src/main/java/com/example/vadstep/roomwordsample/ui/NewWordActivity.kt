package com.example.vadstep.roomwordsample.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import com.example.vadstep.roomwordsample.R
import kotlinx.android.synthetic.main.activity_new_word.*


/**
 * Created by User1 on 05/02/2018.
 */
class NewWordActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)
        button_save.setOnClickListener({ v ->
            val replyIntent = Intent()
            if (TextUtils.isEmpty(edit_word.text)) {
                setResult(RESULT_CANCELED, replyIntent)
            } else {
                replyIntent.putExtra(EXTRA_REPLY, edit_word.text.toString())
                setResult(RESULT_OK, replyIntent)
            }
            finish()
        })

    }

    companion object {
        val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }
}