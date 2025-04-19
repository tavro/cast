/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package org.example.project

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun WatchesSection(modifier: Modifier = Modifier) {
    val watches = 0
    val barWidth = 8.dp
    Column(
        modifier = modifier
            .padding(16.dp, 8.dp)
            .background(Color.Black)
    ) {
        Text(
            text = "$watches Watches",
            color = Color.White
        )
        Row {
            Column {
                Box(
                    modifier = Modifier
                        .size(barWidth)
                        .background(Color.Cyan)
                )
                Text(
                    text = "Mon",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Box(
                    modifier = Modifier
                        .size(barWidth)
                        .background(Color.Cyan)
                )
                Text(
                    text = "Tue",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Box(
                    modifier = Modifier
                        .size(barWidth)
                        .background(Color.Cyan)
                )
                Text(
                    text = "Wed",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Box(
                    modifier = Modifier
                        .size(barWidth)
                        .background(Color.Cyan)
                )
                Text(
                    text = "Thu",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Box(
                    modifier = Modifier
                        .size(barWidth)
                        .background(Color.Cyan)
                )
                Text(
                    text = "Fri",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Box(
                    modifier = Modifier
                        .size(barWidth)
                        .background(Color.Cyan)
                )
                Text(
                    text = "Sat",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Box(
                    modifier = Modifier
                        .size(barWidth)
                        .background(Color.Cyan)
                )
                Text(
                    text = "Sun",
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun StatisticsSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp, 8.dp)
            .background(Color.Black)
    ) {
        Text(
            text = "Statistics",
            color = Color.White
        )
        Row(modifier = Modifier.background(color = Color.DarkGray)) {
            Column {
                Text(
                    text = "X",
                    color = Color.White
                )
                Text(
                    text = "Total watches",
                    color = Color.Gray
                )
            }
            Column {
                Text(
                    text = "X",
                    color = Color.White
                )
                Text(
                    text = "Avg. daily watches",
                    color = Color.Gray
                )
            }
            Column {
                Text(
                    text = "X",
                    color = Color.White
                )
                Text(
                    text = "Total watching time (hrs)",
                    color = Color.Gray
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.DarkGray)
        ) {
            Text(
                text = "X Movies",
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.DarkGray)
        ) {
            Text(
                text = "X Directors",
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.DarkGray)
        ) {
            Text(
                text = "X Actors",
                color = Color.White
            )
        }
    }
}

@Composable
fun CategoriesSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp, 8.dp)
            .background(Color.Black)
    ) {
        Text(
            text = "Top categories",
            color = Color.White
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .background(color = Color.Cyan)
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Category 1",
                color = Color.White
            )
            Text(
                text = "X",
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .background(color = Color.Cyan)
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Category 2",
                color = Color.White
            )
            Text(
                text = "X",
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .background(color = Color.Cyan)
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Category 3",
                color = Color.White
            )
            Text(
                text = "X",
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .background(color = Color.Cyan)
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Category 4",
                color = Color.White
            )
            Text(
                text = "X",
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .background(color = Color.Cyan)
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Category 5",
                color = Color.White
            )
            Text(
                text = "X",
                color = Color.White
            )
        }
    }
}

@Composable
fun CircularHourGraph(hourValues: List<Float>) {
    Canvas(modifier = Modifier.size(300.dp)) {
        val radius = size.minDimension / 2
        val center = Offset(size.width / 2, size.height / 2)
        val barWidth = 8f
        val maxBarLength = radius * 0.4f
        val innerRadius = radius * 0.6f

        for (i in 0 until 24) {
            val angleDegrees = i * (360f / 24f) - 90f
            val angleRad = angleDegrees * PI / 180f

            val value = hourValues[i].coerceIn(0f, 1f)
            val barLength = value * maxBarLength

            val startX = center.x + innerRadius * cos(angleRad).toFloat()
            val startY = center.y + innerRadius * sin(angleRad).toFloat()

            val endX = center.x + (innerRadius + barLength) * cos(angleRad).toFloat()
            val endY = center.y + (innerRadius + barLength) * sin(angleRad).toFloat()

            drawLine(
                color = Color.hsv(200f, 0.9f, value),
                start = Offset(startX, startY),
                end = Offset(endX, endY),
                strokeWidth = barWidth,
                cap = StrokeCap.Round
            )
        }
    }
}

@Composable
fun ClockSection(modifier: Modifier = Modifier) {
    val hourValues = listOf(
        0.1f,
        0.05f,
        0.05f,
        0.1f,
        0.2f,
        0.4f,
        0.7f,
        0.9f,
        1.0f,
        0.95f,
        0.9f,
        0.85f,
        0.8f,
        0.75f,
        0.7f,
        0.6f,
        0.5f,
        0.4f,
        0.3f,
        0.2f,
        0.15f,
        0.1f,
        0.1f,
        0.1f
    )
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp, 8.dp)
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Watching clock",
            color = Color.White
        )
        CircularHourGraph(hourValues)
    }
}

@Composable
fun ReportsScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState())) {
        WatchesSection()
        StatisticsSection()
        CategoriesSection()
        ClockSection()
    }
}
