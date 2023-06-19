package com.example.rencanakerjadananggaran.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class SharedPreferences(activity: Activity) {
    private var sp : SharedPreferences? = null
    private val login = "login"

    init {
        sp = activity.getSharedPreferences("MYPREF", Context.MODE_PRIVATE)
    }

    fun setIsLogin(value : Boolean){
        sp!!.edit().putBoolean(login, value).apply()
    }

    fun getIsLogin() : Boolean{
        return sp!!.getBoolean(login, false)
    }

}