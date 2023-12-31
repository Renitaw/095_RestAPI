package com.example.consumerestapi.ui.home.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.consumerestapi.ui.home.HomeViewModel
import com.example.consumerestapi.KontakApplication

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiKontak().container.kontakRepository)
        }
        initializer {
            InsertViewModel(aplikasiKontak().container.kontakRepository)
        }
    }
}
fun CreationExtras.aplikasiKontak(): KontakApplication = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as KontakApplication)