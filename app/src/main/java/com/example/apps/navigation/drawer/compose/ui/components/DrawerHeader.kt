package com.example.apps.navigation.drawer.compose.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerHeader() {
    Box(
        modifier = Modifier
            .width(250.dp)
            .padding(vertical = 60.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "HEADER", style = TextStyle(fontSize = 60.sp))
    }
}