package com.fbatista.fragments_backstack_sample.signup

class SignUpPresenter : SignUpContract.Presenter {

    private var view: SignUpContract.View? = null
    private val steps = Steps.values()
    private var currentStep: Int = 0

    override fun attachView(view: SignUpContract.View) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }

    override fun onCreatedActivity() {

    }

    override fun onContinueBtnClicked() {

    }
}