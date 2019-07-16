package com.fbatista.fragments_backstack_sample.signup

interface SignUpContract {


    interface View {
        fun displayError(msg: String)
        fun displayStep(stepIndex: Int)
    }

    interface Presenter {
        fun attachView(view: SignUpContract.View)
        fun detachView()
        fun onCreatedActivity()
        fun onContinueBtnClicked()

    }


}