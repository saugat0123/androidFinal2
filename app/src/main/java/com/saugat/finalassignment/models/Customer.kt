package com.saugat.finalassignment.models

data class Customer (
        var customerId : Int? = 0,
        var customerFirstName : String? = null,
        var customerLastName : String? = null,
        var customerPassword : String? = null,
        var customerAddress : String? = null,
        var customerPhone : String? = null,
        var customerEmail : String? = null,
        )