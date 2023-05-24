package com.example.fitnessapp.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fitnessapp.R

object FragmentManager {
    var currentFrag: Fragment? = null
    fun setFragment(newFragment: Fragment, act: AppCompatActivity) {
        val transaction = act.supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            android.R.anim.fade_in,
            android.R.anim.fade_out
        )
        transaction.replace(R.id.placeHolder, newFragment)
        transaction.commit()
        currentFrag = newFragment


    }
}