package com.eldevazteca.examenuno.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eldevazteca.examenuno.R
import com.eldevazteca.examenuno.composables.Jobs

@Composable
fun HomeScreen(
    modifier: Modifier,
    onProfileClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
    ) {
        Text(
            "${stringResource(R.string.app_name)} - ${stringResource(R.string.title_home_screen)}",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Row(
            modifier = Modifier
                .padding(vertical = 10.dp)
                .clickable { onProfileClick() },
        ) {
            Image(
                painterResource(R.drawable.my_photo),
                null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(50))
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                "${stringResource(R.string.username
                )}\n${stringResource(R.string.jobs)}",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(alignment = Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                "Jobs",
                fontSize = 24.sp,
                modifier = Modifier.align(alignment = Alignment.CenterVertically)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "Start",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.Black, RoundedCornerShape(6))
        ) {
            Image(
                painterResource(R.drawable.img_home_screen),
                null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(210.dp)
                    .clip(RoundedCornerShape(6))
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "Jobs",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Box (
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(6))
        ) {
            Column( modifier = Modifier
                .verticalScroll(rememberScrollState())) {
            Jobs(imgJob = R.drawable.img_first_job, nameJob = "Army Pilot", sinceJob = "Since 2019", salaryJob = "20,000")
            Jobs(imgJob = R.drawable.img_second_job, nameJob = "Motorcycle", sinceJob = "Since 2025", salaryJob = "5,000")
            Jobs(imgJob = R.drawable.my_photo, nameJob = "Android Developer", sinceJob = "Since 2025", salaryJob = "8,000")
            Jobs(imgJob = R.drawable.img_teacher_job, nameJob = "Teacher", sinceJob = "Since 2023", salaryJob = "6,000")
            }
        }
    }
}