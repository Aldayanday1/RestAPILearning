package project.consumeapi.ui

import android.text.Spannable.Factory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import project.consumeapi.KontakAplikation
import project.consumeapi.ui.home.viewmodel.HomeViewModel
import project.consumeapi.ui.kontak.viewmodel.InsertViewModel

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

fun CreationExtras.aplikasiKontak(): KontakAplikation =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakAplikation)