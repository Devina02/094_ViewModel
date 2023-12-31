package com.example.pam5

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pam5.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel(){
    var namausr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var status : String by mutableStateOf("")
        private set
    var email : String by mutableStateOf("")
        private set
    var alamat : String by mutableStateOf("")
        private set


    private val _UiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _UiState.asStateFlow()

    fun InsertData(nm: String, tlp: String, jk:String, stats:String, eml:String, alm:String) {
        namausr = nm;
        noTlp = tlp;
        jenisKl = jk;
        status = stats;
        email = eml;
        alamat = alm;

    }
    fun setJenisK(pilihJK: String){
        _UiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
    fun setstatus(status: String){
        _UiState.update { currentState -> currentState.copy(stats = status) }
    }
}