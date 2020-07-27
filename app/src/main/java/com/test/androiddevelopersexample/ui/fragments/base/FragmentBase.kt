package com.test.androiddevelopersexample.ui.fragments.base

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

/**
 * Created by ignaciodeandreisdenis on 7/24/20.
 */
open class FragmentBase : Fragment() {

    open var screenTag = "FragmentBase"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("onCreate", screenTag)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", screenTag)
    }


}
