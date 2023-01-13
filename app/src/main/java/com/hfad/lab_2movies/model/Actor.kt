package com.hfad.lab_2movies.model

class Actor(var name:String,var surname:String){
    companion object{
        fun parseActors(string: String,separator:String):List<Actor>{
            return string.split(separator).map{
                val fullname:List<String> = it.split(" ")
                if(fullname.size==2){
                     Actor(fullname[0],fullname[1])
                }else{
                    null
                }
            }.filterNotNull().toList()

        }
    }
    override fun toString(): String {
        return name +" "+surname
    }
}