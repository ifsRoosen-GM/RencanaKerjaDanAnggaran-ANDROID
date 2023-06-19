package com.example.rencanakerjadananggaran.ui.pengajuan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PengajuanViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Daftar Pengajuan RKA"
    }
    val text: LiveData<String> = _text
}