package com.example.kotlin2.Fragment

import com.example.kotlin2.GalleryModel

class GalleryRepository {
    private val galleryList = mutableListOf<GalleryModel>()

    fun getPhotos(): List<GalleryModel> {
        galleryList.add(
            GalleryModel(
                1,
                "https://c8.alamy.com/comp/EM6HGB/letter-w-fancy-font-EM6HGB.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                2,
                "https://i.pinimg.com/originals/fb/1d/d6/fb1dd695cf985379da1909b2ceea3257.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                3,
                "https://i.pinimg.com/originals/7e/11/4a/7e114a1832ad3af1244833da497fe507.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                4,
                "https://cdn.pixabay.com/photo/2012/04/14/12/42/letter-33760_960_720.png"
            )
        )
        galleryList.add(
            GalleryModel(
                5,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBwXETvH_OtHP6_zMXvjlhiqsASLhKRP15LejguJKSB2tr1bwGVzC_EqJdzeGdnuMwpUY&usqp=CAU"
            )
        )
        galleryList.add(
            GalleryModel(
                6,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBwXETvH_OtHP6_zMXvjlhiqsASLhKRP15LejguJKSB2tr1bwGVzC_EqJdzeGdnuMwpUY&usqp=CAU"
            )
        )
        galleryList.add(
            GalleryModel(
                7,
                "https://st2.depositphotos.com/5262531/7758/i/950/depositphotos_77583112-stock-photo-blue-abstract-letter-w.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                8,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-lXrWCdqornSHCXV0tupehVB2lRPwZyRIof_rvo7fo0JUTaKkPRdOzgsyMXTH70raiGA&usqp=CAU"
            )
        )
        galleryList.add(
            GalleryModel(
                9,
                "https://thumbs.dreamstime.com/b/%D0%BF%D0%B8%D1%81%D1%8C%D0%BC%D0%BE-w-%D0%B2%D0%BE%D0%B4%D1%8B-%D0%BD%D0%B0-%D1%87%D0%B5%D1%80%D0%BD%D0%BE%D1%82%D0%B5-29150520.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                10,
                "https://st3.depositphotos.com/5366154/13886/i/1600/depositphotos_138865974-stock-photo-fire-letter-w-of-burning.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                11,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqpeV5Oy7wHX4GFnlQrr-T5eBrXM_MU0ANTAVf0wmRrBuiDpSJ18LoexWTmU0Qd_NFbG8&usqp=CAU"
            )
        )
        galleryList.add(
            GalleryModel(
                12,
                "https://us.123rf.com/450wm/ornitopter/ornitopter1602/ornitopter160200012/52530992-red-light-letter-w.jpg?ver=6"
            )
        )

        return galleryList
    }
}