package com.cvillarreal.liftpro.core.exercise

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.cvillarreal.liftpro.model.exercise.UserExerciseInstance

@Composable
fun ExerciseSetRepSummary(exerciseInstance: w) {
    /**
     * Row(
     *                             modifier = Modifier
     *                                 .width(width = 300.dp)
     *                                 .padding(horizontal = 10.dp)
     *                         ) {
     *                             Text(
     *                                 text = "Barbell Bench Press",
     *                                 color = Color(0xffe0e0ff),
     *                                 textAlign = TextAlign.Center,
     *                                 lineHeight = 16.sp,
     *                                 style = MaterialTheme.typography.labelSmall,
     *                                 modifier = Modifier
     *                                     .weight(weight = 1f))
     *                             Spacer(
     *                                 modifier = Modifier
     *                                     .width(width = 10.dp))
     *                             Text(
     *                                 text = "3 x 5 @ 150lb",
     *                                 color = Color(0xffe0e0ff),
     *                                 textAlign = TextAlign.Center,
     *                                 lineHeight = 16.sp,
     *                                 style = MaterialTheme.typography.labelSmall)
     *                         }
     */
    Row {
        Text(
            text = exercise.name,
            //md_theme_on_primary_container
            color = MaterialTheme.colors.onPrimary,
            textAlign = TextAlign.Center,
            lineHeight = 16.sp,
            style = MaterialTheme.typography.labelSmall,
            modifier = Modifier
                .weight(weight = 1f))
        Spacer(
            modifier = Modifier
                .width(width = 10.dp))
        Text(
            text = "3 x 5 @ 150lb",
            color = Color(0xffe0e0ff),
            textAlign = TextAlign.Center,
            lineHeight = 16.sp,
            style = MaterialTheme.typography.body1)
    }
}