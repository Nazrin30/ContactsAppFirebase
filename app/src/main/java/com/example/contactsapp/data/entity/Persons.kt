package com.example.contactsapp.data.entity

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable

@IgnoreExtraProperties
data class Persons(var id:String? = "",
                   var name:String? = "",
                   var phone:String? = "") : Serializable {
}