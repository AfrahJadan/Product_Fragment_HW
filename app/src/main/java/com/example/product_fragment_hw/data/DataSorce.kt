package com.example.product_fragment_hw.data

import com.example.product_fragment_hw.R
import com.example.product_fragment_hw.model.Phone

class DataSorce {
    fun loadPhone(): List<Phone>{
        return listOf(
            Phone(R.drawable.iphone,"Iphone 12 64GB","4500 SR", true, 5),
            Phone(R.drawable.samsung_galaxy_uitra,"Samsung Galaxy S21 Ultra","4500 SR", false, 5),
            Phone(R.drawable.xiaomi_pro,"Xiaomi 11T Pro","2000 SR", true, 0),
            Phone(R.drawable.huawei_yp,"Huawei Y6p","500 SR", false, 0),
            Phone(R.drawable.samsung_galaxy_z_flip,"Samsung Galaxy Z Flip3","5000 SR", true, 70),
            Phone(R.drawable.iphone13,"Iphone 13","6000 SR", true, 36),
        )
    }
}