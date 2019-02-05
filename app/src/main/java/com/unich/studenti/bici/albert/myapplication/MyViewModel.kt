package com.unich.studenti.bici.albert.myapplication

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.widget.EditText

class MyViewModel : ViewModel() {
    private lateinit var inserimento: MutableLiveData<List<EditText>>

    fun getInserimento(): LiveData<List<EditText>> {
        if (!::inserimento.isInitialized) {
            inserimento = MutableLiveData()
            loadInserimento()
        }
        return inserimento
    }

    private fun loadInserimento() {
        // Do an asynchronous operation to fetch users.
    }
}
