package com.cvillarreal.liftpro.core.workout

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cvillarreal.liftpro.core.exercise.ExerciseSetRepSummary
import com.cvillarreal.liftpro.models.ExerciseInstance
import com.cvillarreal.liftpro.models.Workout
import com.cvillarreal.liftpro.utils.ms_epoch_to_summary_date

class SampleWorkoutProvider: PreviewParameterProvider<Workout> {
    override val values = sequenceOf(
        Workout(
            id = 1,
            name = "Workout 1",
            exercises = listOf(
                ExerciseInstance(
                    id = 1,
                    name = "Bench Press",
                    sets = 3,
                    reps = 10,
                    weight = 135
                ),
                ExerciseInstance(
                    id = 2,
                    name = "Squat",
                    sets = 3,
                    reps = 10,
                    weight = 135
                ),
            ),
            startTime = java.sql.Time(0),
            notes = "Notes"
        ),
        Workout(
            id = 2,
            name = "Workout 2",
            exercises = listOf(
                ExerciseInstance(
                    id = 1,
                    name = "Bench Press",
                    sets = 3,
                    reps = 10,
                    weight = 135
                ),
                ExerciseInstance(
                    id = 2,
                    name = "Squat",
                    sets = 3,
                    reps = 10,
                    weight = 135
                ),
            ),
            startTime = java.sql.Time(1680537600011),
            notes = "\n" +
                    "\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque pharetra eu risus id pharetra. Vivamus id tellus at eros imperdiet accumsan. Pellentesque id sem in dui aliquam sagittis sed at ligula. In vel tincidunt eros. Donec gravida tincidunt placerat. Suspendisse ornare nunc enim, ut pharetra erat finibus sit amet. Sed vestibulum varius sem, ac condimentum felis. Suspendisse faucibus nunc a enim tempus suscipit. Sed enim urna, semper ac nisl eu, gravida dapibus sem. Nullam et pretium mi. Suspendisse a quam ligula. Curabitur eget erat non odio faucibus blandit eget eu purus. Nam tempor nisi quis risus volutpat, non dictum elit malesuada. Fusce sagittis metus et gravida fermentum. Curabitur id turpis bibendum, fermentum nisi eget, porttitor risus. Pellentesque suscipit eros a ex pellentesque facilisis. "
        ),
    )
}


@Preview
@ExperimentalMaterial3Api
@Composable
fun WorkoutCard(
    @PreviewParameter(SampleWorkoutProvider::class)
    workout: Workout
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        ),
    ) {
        Column(modifier = Modifier
            .width(width = 320.dp)
            .padding(all = 10.dp)) {
            Row(

            ) {
                Column(
                    modifier = Modifier
                        .weight(weight = 1f)
                ) {
                    Text(
                        text = "${workout.name}",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Left,
                        lineHeight = 20.sp,
                        style = MaterialTheme.typography.labelLarge)
                    Text(
                        text = ms_epoch_to_summary_date(workout.startTime.time),
                        textAlign = TextAlign.Left,
                        color = MaterialTheme.colorScheme.onSecondaryContainer,
                        lineHeight = 16.sp,
                        style = MaterialTheme.typography.labelSmall)
                }
                Spacer(
                    modifier = Modifier
                        .width(width = 60.dp))
                Spacer(
                    modifier = Modifier
                        .padding(all = 10.dp))
            }
            for (exercise in workout.exercises) {
                    ExerciseSetRepSummary(exerciseInstance = exercise)
            }
        }
    }
}
