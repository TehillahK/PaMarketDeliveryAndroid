package com.agric.pamarket.business

import com.agric.pamarket.models.Location
import com.agric.pamarket.models.Order

class AccessOrders() {
    private val orders:ArrayList<Order> = ArrayList<Order>()

    init {
        orders.add( Order("gygy","John Doe",
            Location("30 River Street",0, 0),"",
            Location("30 River Street",0,0),"",0, isDelivered = false, isPickedUp = false
        ))
    }

}