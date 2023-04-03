package com.cvillarreal.liftpro.core.exercise

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cvillarreal.liftpro.models.ExerciseInstance

class SampleExerciseInstanceProvider: PreviewParameterProvider<ExerciseInstance> {
    override val values = sequenceOf(
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
    )
}

@Preview
@Composable
fun ExerciseSetRepSummary(
    @PreviewParameter(SampleExerciseInstanceProvider::class)
    exerciseInstance: ExerciseInstance
) {
    Row {
        Text(
            text = exerciseInstance.name,
            //md_theme_on_primary_container
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            textAlign = TextAlign.Left,
            lineHeight = 16.sp,
            style = MaterialTheme.typography.labelSmall,
            modifier = Modifier
                .weight(weight = 1f)
        )
        Spacer(
            modifier = Modifier
                .width(width = 10.dp)
        )
        Text(
            text = "${exerciseInstance.sets} x ${exerciseInstance.reps} @ ${exerciseInstance.weight}lb",
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            textAlign = TextAlign.Right,
            lineHeight = 16.sp,
            style = MaterialTheme.typography.labelSmall,
        )
    }
}