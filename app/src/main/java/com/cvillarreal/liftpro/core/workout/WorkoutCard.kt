package com.cvillarreal.liftpro.core.workout

@Composable
fun WorkoutCard() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xff46464f),
            contentColor = Color(0xffe0e0ff)
        ),
        modifier = Modifier
            .padding(all = 10.dp)
            .clip(shape = RoundedCornerShape(20.dp))
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {
            item {
                Row(
                    modifier = Modifier
                        .width(width = 320.dp)
                        .padding(all = 10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .weight(weight = 1f)
                    ) {
                        Text(
                            text = "Workout Name",
                            color = Color(0xffe0e0ff),
                            textAlign = TextAlign.Center,
                            lineHeight = 20.sp,
                            style = MaterialTheme.typography.labelLarge)
                        Text(
                            text = "January 1 at 00:00am",
                            color = Color(0xffc7c5d0),
                            textAlign = TextAlign.Center,
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
            }

            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .width(width = 300.dp)
                    ) {
                        Text(
                            text = "Exercise",
                            color = Color(0xffd5e8d0),
                            textAlign = TextAlign.Center,
                            lineHeight = 16.sp,
                            style = MaterialTheme.typography.labelSmall,
                            modifier = Modifier
                                .weight(weight = 1f))
                        Text(
                            text = "Set x Rep @ Avg Weight",
                            color = Color(0xffd5e8d0),
                            textAlign = TextAlign.Center,
                            lineHeight = 16.sp,
                            style = MaterialTheme.typography.labelSmall)
                    }
                    // TODO: Replace with a list of exercises
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .width(width = 300.dp)
                                .padding(horizontal = 10.dp)
                        ) {
                            Text(
                                text = "Barbell Bench Press",
                                color = Color(0xffe0e0ff),
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
                                style = MaterialTheme.typography.labelSmall)
                        }
                        Spacer(
                            modifier = Modifier
                                .height(height = 5.dp))
                        Row(
                            modifier = Modifier
                                .width(width = 300.dp)
                                .padding(horizontal = 10.dp)
                        ) {
                            Text(
                                text = "Barbell Bench Press",
                                color = Color(0xffe0e0ff),
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
                                style = MaterialTheme.typography.labelSmall)
                        }
                        Spacer(
                            modifier = Modifier
                                .height(height = 5.dp))
                        Row(
                            modifier = Modifier
                                .width(width = 300.dp)
                                .padding(horizontal = 10.dp)
                        ) {
                            Text(
                                text = "Barbell Bench Press",
                                color = Color(0xffe0e0ff),
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
                                style = MaterialTheme.typography.labelSmall)
                        }
                        Spacer(
                            modifier = Modifier
                                .height(height = 5.dp))
                        Row(
                            modifier = Modifier
                                .width(width = 300.dp)
                                .padding(horizontal = 10.dp)
                        ) {
                            Text(
                                text = "Barbell Bench Press",
                                color = Color(0xffe0e0ff),
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
                                style = MaterialTheme.typography.labelSmall)
                        }
                        Spacer(
                            modifier = Modifier
                                .height(height = 5.dp))
                        Row(
                            modifier = Modifier
                                .width(width = 300.dp)
                                .padding(horizontal = 10.dp)
                        ) {
                            Text(
                                text = "Barbell Bench Press",
                                color = Color(0xffe0e0ff),
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
                                style = MaterialTheme.typography.labelSmall)
                        }
                    }
                }
            }

        }
    }
}