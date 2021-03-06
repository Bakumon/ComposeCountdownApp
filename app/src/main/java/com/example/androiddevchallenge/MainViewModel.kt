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
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var minutes by mutableStateOf(30)

    var seconds by mutableStateOf(59)

    /**
     * false：未开始
     * true；正在进行
     */
    var isRunning by mutableStateOf(false)

    fun startCountDown() {

        val totalSeconds = minutes * 60 + seconds
        if (totalSeconds <= 0) {
            return
        }

        val current = totalSeconds - 1
        minutes = current / 60
        seconds = current % 60

        isRunning = current > 0
    }
}
