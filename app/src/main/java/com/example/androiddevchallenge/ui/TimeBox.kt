/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TimeBox(isMinute: Boolean, timeText: Int) {
    Text(
        color = MaterialTheme.colors.onPrimary,
        text = timeText.toString(),
        fontSize = 82.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp, top = 30.dp)
    )

    Text(
        color = MaterialTheme.colors.onSecondary,
        text = if (isMinute) "MIN" else "SEC",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 35.dp, end = 35.dp)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth(timeText / 60.0f)
            .height(35.dp)
            .padding(start = 35.dp, end = 35.dp, top = 5.dp)
            .background(
                color = MaterialTheme.colors.onBackground,
                RoundedCornerShape(50)
            )
            .animateContentSize()
    )
}

@Preview(widthDp = 360, heightDp = 280)
@Composable
fun LightPreview() {
    Column {
        TimeBox(true, 30)
    }
}

@Preview(widthDp = 360, heightDp = 280)
@Composable
fun DarkPreview() {
    Column {
        TimeBox(false, 59)
    }
}
