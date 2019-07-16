package com.fbatista.fragments_backstack_sample.signup

import androidx.fragment.app.Fragment
import com.fbatista.fragments_backstack_sample.signup.address.AddressFragment

enum class Steps(val fragment: Fragment) {
    PERSONAL(AddressFragment()),
    ADDRESS(),
    PASSWORD()
}