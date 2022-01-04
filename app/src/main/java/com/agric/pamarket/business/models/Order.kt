package com.agric.pamarket.business.models

data class Order(
    val id:String,
    val customerName:String,
    val customerAddress:Location,
    val farmName:String ,
    val  farmLocation: Location,
    val crop:String,
    val price:Int,
    val isDelivered:Boolean,
    val isPickedUp:Boolean
    )