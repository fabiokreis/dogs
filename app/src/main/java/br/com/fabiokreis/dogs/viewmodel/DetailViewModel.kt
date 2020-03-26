package br.com.fabiokreis.dogs.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import br.com.fabiokreis.dogs.model.DogBreed
import br.com.fabiokreis.dogs.model.DogDatabase
import kotlinx.coroutines.launch

class DetailViewModel(application: Application) : BaseViewModel(application) {

    val dogLiveData = MutableLiveData<DogBreed>()

    fun fetch(uuid: Int) {
        launch {
            val dog = DogDatabase(getApplication()).dogDao().getDog(uuid)
            dogLiveData.value = dog
        }
    }
}