package com.habitbread.main.data

import com.google.gson.annotations.SerializedName

class UserInfoRequest (
    @SerializedName("name")
    val name : String?,
    @SerializedName("exp")
    val exp: Int?,
    @SerializedName("fcmToken")
    val fcmToken: String?
)