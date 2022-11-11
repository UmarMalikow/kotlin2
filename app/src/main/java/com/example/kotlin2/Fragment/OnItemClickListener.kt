package com.example.kotlin2.Fragment

import com.example.kotlin2.GalleryModel

interface OnItemClickListener {

    fun onClick(photo : GalleryModel)

    fun onLongClick(photo : GalleryModel)
}