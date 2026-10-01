package com.example.praktikum3



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.tuguu),
            contentDescription = "Background Login",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )


        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.3f))
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )


            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 24.dp)
            )


            Image(
                painter = painterResource(id = R.drawable.umy), // Sesuaikan resource logo UMY
                contentDescription = "Logo UMY",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(24.dp))


            Text(
                text = "Nama",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )


            Text(
                text = "Salman Alfarizi",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red,
                modifier = Modifier.padding(bottom = 8.dp)
            )


            Text(
                text = "20040140057",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(bottom = 32.dp)
            )


