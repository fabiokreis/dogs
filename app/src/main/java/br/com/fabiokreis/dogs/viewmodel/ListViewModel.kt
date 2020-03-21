package br.com.fabiokreis.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.fabiokreis.dogs.model.DogBreed

class ListViewModel : ViewModel() {

    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 = DogBreed("1", "Beagle", "10 years", "domestic", "breadFor", "temperament", "")
        val dog2 = DogBreed("2", "Pastor", "12 years", "domestic", "breadFor", "temperament", "")
        val dog3 = DogBreed("3", "Poodle", "15 years", "domestic", "breadFor", "temperament", "")
        val dogList = arrayListOf(dog1, dog2, dog3)

        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false
    }
}