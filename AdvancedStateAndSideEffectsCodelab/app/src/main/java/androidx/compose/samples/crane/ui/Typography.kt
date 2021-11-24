/*
 * Copyright 2020 The Android Open Source Project
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

package androidx.compose.samples.crane.ui

import androidx.compose.material3.Typography
import androidx.compose.samples.crane.R
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val light = Font(R.font.raleway_light, FontWeight.W300)
private val regular = Font(R.font.raleway_regular, FontWeight.W400)
private val medium = Font(R.font.raleway_medium, FontWeight.W500)
private val semibold = Font(R.font.raleway_semibold, FontWeight.W600)

private val craneFontFamily = FontFamily(fonts = listOf(light, regular, medium, semibold))

val captionTextStyle = TextStyle(
    fontFamily = craneFontFamily,
    fontWeight = FontWeight.W400,
    fontSize = 16.sp
)

val craneTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W300,
        lineHeight = 64.sp,
        fontSize = 57.sp
    ),
    displayMedium = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W400,
        lineHeight = 52.sp,
        fontSize = 45.sp
    ),
    displaySmall = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W600,
        lineHeight = 44.sp,
        fontSize = 36.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W600,
        lineHeight = 40.sp,
        fontSize = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W600,
        lineHeight = 36.sp,
        fontSize = 28.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W400,
        lineHeight = 32.sp,
        fontSize = 24.sp
    ),
    titleLarge = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W500,
        lineHeight = 28.sp,
        fontSize = 22.sp
    ),
    titleMedium = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W600,
        lineHeight = 24.sp,
        letterSpacing = (0.15f).sp,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W600,
        lineHeight = 20.sp,
        letterSpacing = (0.1f).sp,
        fontSize = 14.sp
    ),
    labelLarge = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp,
        letterSpacing = (0.1f).sp,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W600,
        lineHeight = 16.sp,
        letterSpacing = (0.5f).sp,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W500,
        lineHeight = 6.sp,
        letterSpacing = (0.5f).sp,
        fontSize = 11.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W400,
        lineHeight = 24.sp,
        letterSpacing = (0.15f).sp,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp,
        letterSpacing = (0.25f).sp,
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontFamily = craneFontFamily,
        fontWeight = FontWeight.W400,
        lineHeight = 16.sp,
        letterSpacing = (0.4f).sp,
        fontSize = 12.sp
    )
)
