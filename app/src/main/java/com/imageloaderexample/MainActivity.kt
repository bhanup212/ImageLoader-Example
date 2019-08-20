package com.imageloaderexample



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()
        swipe_refresh_layout.setOnRefreshListener {
            init()
            swipe_refresh_layout.isRefreshing = false
        }
    }
    private fun init(){

        val adapter = ImagesAdapter(this,getImagesUrl())

        recyclerview_images.layoutManager = GridLayoutManager(this,2)
        recyclerview_images.itemAnimator = DefaultItemAnimator()
        recyclerview_images.adapter = adapter
        adapter.notifyDataSetChanged()

    }

    private fun getImagesUrl():ArrayList<String>{
        val imageList:ArrayList<String> = ArrayList()
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/arctichare.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/baboon.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/boat.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/cat.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/frymire.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/tulips.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/serrano.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/pool.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/watch.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/zelda.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/frymire.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/girl.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/lena.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/peppers.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/sails.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/mountain.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/monarch.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/fruits.png")
        imageList.add("https://homepages.cae.wisc.edu/~ece533/images/goldhill.png")


        return imageList
    }
}

