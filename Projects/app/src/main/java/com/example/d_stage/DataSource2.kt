package com.example.d_stage

import com.example.d_stage.models.pic

class DataSource2 {
    companion object{

        fun createDataSet(): ArrayList<pic>{
            val list = ArrayList<pic>()
            list.add(
                pic(
                                        "https://images.app.goo.gl/LE3XHqHYVAVTTs988"
                )
            )
            list.add(
                pic(
                      "https://images.app.goo.gl/GD8eqUScVjQiwnPp7"
                )
            )

            list.add(
                pic(
                     "https://images.app.goo.gl/KrmDeDZDa2Lv3wpi8"
                )
            )
            list.add(
                pic(
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/freelance_android_dev_vasiliy_zukanov.png"
                )
            )
            list.add(
                pic(
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/freelance_android_dev_donn_felker.png"
                )
            )
            list.add(
                pic(
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/work_life_balance.png"
                )
            )
            list.add(
                pic(
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/fullsnack_developer.png"

                    )
            )
            list.add(
                pic(
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/javascript_expert_wes_bos.png"
                )
            )

            return list
        }
    }
}
