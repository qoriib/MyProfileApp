package edu.learning.myprofileapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ProfileScreen()
        }
    }
}

@Composable
fun ProfileScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        // Header dengan nama Nashrullah Fathul Qoriib
        ProfileHeader(
            name = "Nashrullah Fathul Qoriib"
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Profile Card dengan data spesifik
        ProfileCard(
            bio = "Mahasiswa Teknik Informatika Institut Teknologi Sumatera di Bandar Lampung yang berfokus pada pengembangan teknologi masa depan.",
            email = "nashrullah.122140162@student.itera.ac.id",
            phone = "08972228848",
            location = "Bandar Lampung, Indonesia"
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { /* Aksi edit atau kontak */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Hubungi Saya")
        }
    }
}
