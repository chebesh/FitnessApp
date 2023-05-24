package com.example.fitnessapp.utils

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Calendar

object TimeUtils{
    @SuppressLint("SimpleDateFormat")
    val formator = SimpleDateFormat("mm:ss")
    fun getTime(time: Long): String{
        val cv = Calendar.getInstance()
        cv.timeInMillis = time
        return formator.format(cv.time)
    }
}