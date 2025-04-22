
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ideasapp.firstgame.R
import com.ideasapp.firstgame.ui.theme.FirstGameTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource



@Composable
fun ImageOverlayScreen() {
    // Состояние, контролирующее видимость человека
    var isPersonVisible by remember { mutableStateOf(true) }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Фоновая картинка
        Image(
            painter = painterResource(id = R.drawable.background_image),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Картинка человека, которая пропадает при нажатии
        if (isPersonVisible) {
            Image(
                painter = painterResource(id = R.drawable.person_image),
                contentDescription = "Person",
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.Center)
                    .clickable {isPersonVisible = false}
            )
        }
    }
}

