package br.com.fabiokreis.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.fabiokreis.dogs.model.DogBreed

class DetailViewModel : ViewModel() {

    val dogLiveData = MutableLiveData<DogBreed>()

    fun fetch() {
        val dog1 = DogBreed("1", "Beagle", "10 years", "domestic", "breadFor", "temperament", "")

        dogLiveData.value = dog1
    }
}