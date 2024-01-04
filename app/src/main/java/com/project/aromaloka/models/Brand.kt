package com.project.aromaloka.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Brand(
    var brandName: String = "Alien Object",
    var isClicked: Boolean = false
) : Parcelable