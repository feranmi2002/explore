package com.faithdeveloper.explore.models

data class FilterChild(
                       var type: String,
                       var data: MutableList<FilterGrandChild>
){
    constructor():this("", mutableListOf())
}
