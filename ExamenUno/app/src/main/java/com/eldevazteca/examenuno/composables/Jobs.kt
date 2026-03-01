package com.eldevazteca.examenuno.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eldevazteca.examenuno.ui.theme.GreenCash

@Composable
fun Jobs(
    imgJob: Int, nameJob: String, sinceJob: String, salaryJob: String
) {
    Row(modifier = Modifier.padding(vertical = 4.dp).background(Color(0xFF8A8A8A), RoundedCornerShape(20))) {
        Image(
            painterResource(imgJob),
            null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(20))
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text(
            "$nameJob \n$sinceJob",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(alignment = Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            "$$salaryJob",
            color = GreenCash,
            fontSize = 24.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterVertically)
                .padding(horizontal = 6.dp)
        )
    }
}