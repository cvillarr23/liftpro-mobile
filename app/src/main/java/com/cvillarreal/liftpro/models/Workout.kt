package com.cvillarreal.liftpro.models

data class Workout(
    var id: Int,
    var name: String,
    var exercises: List<ExerciseInstance>,
    var startTime: java.sql.Time,
    var notes: String,

)
