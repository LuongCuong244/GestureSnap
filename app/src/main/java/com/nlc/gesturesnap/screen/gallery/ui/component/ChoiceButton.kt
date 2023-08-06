package com.nlc.gesturesnap.screen.gallery.ui.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nlc.gesturesnap.R
import com.nlc.gesturesnap.screen.gallery.view_model.GalleryViewModel

@Composable
fun ChoiceButton(galleryViewModel: GalleryViewModel = viewModel()){

    val buttonText = if(galleryViewModel.isSelectable.value)
        stringResource(R.string.cancel) else stringResource(R.string.select)

    Button(
        onClick = {
            galleryViewModel.setIsSelectable(!galleryViewModel.isSelectable.value)
        },
        contentPadding = PaddingValues(10.dp, 0.dp),
        colors = ButtonDefaults.buttonColors(colorResource(R.color.gray)),
        modifier = Modifier
            .height(27.dp)
    ) {
        Text(
            text = buttonText,
            modifier = Modifier
                .padding(top = 3.dp),
            fontFamily = FontFamily(Font(R.font.poppins_semibold)),
            fontSize = 14.sp
        )
    }
}