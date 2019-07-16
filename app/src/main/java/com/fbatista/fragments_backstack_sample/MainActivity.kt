package com.fbatista.fragments_backstack_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fbatista.fragments_backstack_sample.signup.SignUpContract
import com.fbatista.fragments_backstack_sample.signup.SignUpPresenter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}
