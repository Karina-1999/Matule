package com.example.uikit_lybrary.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.ui.tooling.preview.Preview
import com.example.uikit_lybrary.ui.accent


@Composable
fun AppToggle(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
){
    Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        colors = SwitchDefaults.colors(
            checkedThumbColor = MaterialTheme.colorScheme.primary,
            checkedTrackColor = accent,
            uncheckedThumbColor = MaterialTheme.colorScheme.secondary,
            uncheckedTrackColor = MaterialTheme.colorScheme.secondaryContainer,
        )
    )
}

@Preview(showBackground = true)
@Composable
fun TogglePreview(){
    AppToggle(
        checked = true,
        onCheckedChange = {}
    )
}

