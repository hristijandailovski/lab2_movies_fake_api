package com.hfad.lab_2movies.model

data class Movie( var title:String,
                  var description:String,
                  var producer:String,
                  var actors:List<Actor>){
    companion object{
        private var idCounter:Int =0
    }
    val id:Int = idCounter
    init {
        idCounter += 1
    }
    fun getDetails():String{
        val stringOfActors:String =this.actors.map { it.toString() }.joinToString(", ")
        return "Movie ID: ${this.id}\n" +
                "Title: ${this.title}\n" +
                "Description: ${this.description}\n" +
                "Producer: ${this.producer}\n" +
                "Actors: ${stringOfActors}\n"
    }
}