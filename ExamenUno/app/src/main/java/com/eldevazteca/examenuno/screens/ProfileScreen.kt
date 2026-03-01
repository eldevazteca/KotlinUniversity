package com.eldevazteca.examenuno.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Icon
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
import com.eldevazteca.examenuno.composables.ToComplete

@Composable
fun ProfileScreen(
    modifier: Modifier,
    onBack: () -> Unit
) {
    BackHandler {
        onBack()
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
    ) {
        Text(
            "${stringResource(R.string.app_name)} - ${stringResource(R.string.title_profile_screen)}",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painterResource(R.drawable.my_photo),
                null,
                modifier = Modifier
                    .size(150.dp)
                    .clip(RoundedCornerShape(50)),
                contentScale = ContentScale.Crop
            )
            Text(stringResource(R.string.username), fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(vertical = 10.dp))
            Text("2 Jobs", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFA8A8A8), RoundedCornerShape(20))) {
            Icon(
                Icons.Outlined.Info,
                null,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
            )
            Spacer(Modifier.width(4.dp))
            Text(
                stringResource(R.string.info_message),
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.align(alignment = Alignment.CenterVertically)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(stringResource(R.string.to_complete_section), fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(vertical = 10.dp))
        Spacer(modifier = Modifier.height(16.dp))
        Box (
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(6))
        ) {
            Column( modifier = Modifier
                .verticalScroll(rememberScrollState())) {
                ToComplete(R.drawable.img_developers)
                ToComplete(R.drawable.img_kawasaki)
            }
        }
    }
}