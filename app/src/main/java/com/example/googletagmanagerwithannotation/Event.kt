package com.example.googletagmanagerwithannotation

import com.example.annotation.AnalyticEvent
import com.example.annotation.EventParam
import com.example.googletagmanagerwithannotation.Product
import com.google.firebase.analytics.FirebaseAnalytics

class Event {

    @AnalyticEvent(nameAsKey = true, eventKey = FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS)
    class ProductImpression (
        val ITEM_LIST: String,
        val items: ArrayList<Product>
    )
}