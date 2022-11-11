package com.example.kotlin2.Fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin2.GalleryAdapter
import com.example.kotlin2.GalleryModel
import com.example.kotlin2.R

class GalleryFragment : Fragment(), OnItemClickListener {

    private var ivPhoto: ImageView? = null
    private var rvGallery: RecyclerView? = null
    private lateinit var galleryList: ArrayList<GalleryModel>
    private lateinit var galleryAdapter: GalleryAdapter
    private var repository = GalleryRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvGallery = view.findViewById(R.id.rv_gallery)
        galleryList = repository.getPhotos() as ArrayList<GalleryModel>
        ivPhoto = view.findViewById(R.id.iv_photo)
        initialize()

    }

    private fun initialize() {
        galleryAdapter = GalleryAdapter(galleryList, this)
        rvGallery?.adapter = galleryAdapter
    }

    override fun onClick(photo: GalleryModel) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(photo.photoUrl)
        startActivity(intent)
    }

    override fun onLongClick(photo : GalleryModel) {
        Toast.makeText(context, "000001", Toast.LENGTH_SHORT).show()
        galleryAdapter.notifyItemRemoved(photo.id)

    }
}