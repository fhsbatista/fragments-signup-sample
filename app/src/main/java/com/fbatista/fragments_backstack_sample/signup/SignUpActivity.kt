package com.fbatista.fragments_backstack_sample.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.fbatista.fragments_backstack_sample.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity(), SignUpContract.View {

    private val presenter: SignUpContract.Presenter by lazy {
        val presenter = SignUpPresenter()
        presenter.attachView(this)
        presenter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        setListeners()
    }

    private fun setListeners() {
        continueBtn.setOnClickListener {
            presenter.onContinueBtnClicked()
        }
    }

    override fun displayError(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun displayStep(stepIndex: Int) {
        val fragment = Steps.values().get(stepIndex).fragment
        val tag = Steps.values().get(stepIndex).name

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragContainer, fragment, tag)
            .addToBackStack(tag)
            .commit()
    }
}
