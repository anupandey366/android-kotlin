package com.example.japan_bank

data class Country(val image: Int, val name: String)

object Countries {

    private val images = intArrayOf(

        R.drawable.laos,
        R.drawable.japanese,
        R.drawable.chinese,
        R.drawable.english,
    )

    private val countries = arrayOf(

        "Laos",
        "Japan",
        "China",
        "England"
    )

    var list: ArrayList<Country>? = null
        get() {

            if (field != null)
                return field

            field = ArrayList()
            for (i in images.indices) {

                val imageId = images[i]
                val countryName = countries[i]

                val country = Country(imageId, countryName)
                field!!.add(country)
            }

            return field
        }
}
