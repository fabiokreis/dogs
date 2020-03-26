package br.com.fabiokreis.dogs.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import br.com.fabiokreis.dogs.R
import br.com.fabiokreis.dogs.model.DogBreed
import br.com.fabiokreis.dogs.util.getProgressDrawable
import br.com.fabiokreis.dogs.util.loadImage
import kotlinx.android.synthetic.main.item_dog.view.*

class DogsListAdapter(val dogsList: ArrayList<DogBreed>) :
    RecyclerView.Adapter<DogsListAdapter.DogViewHolder>() {

    fun updateDogList(newDogList: List<DogBreed>) {
        dogsList.clear()
        dogsList.addAll(newDogList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_dog, parent, false)
        return DogViewHolder(view)
    }

    override fun getItemCount(): Int = dogsList.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val viewHolder = holder.view
        val dog = dogsList[position]

        viewHolder.name.text = dog.dogBreed
        viewHolder.lifespan.text = dog.lifeSpan
        viewHolder.imageView.loadImage(dog.imageUrl, getProgressDrawable(viewHolder.imageView.context))
        viewHolder.setOnClickListener {
            val action = ListFragmentDirections.actionDetailFragment()
            action.dogUuid = dogsList[position].uuid
            Navigation.findNavController(it).navigate(action)
        }
    }

    class DogViewHolder(var view: View) : RecyclerView.ViewHolder(view)
}