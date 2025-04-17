package tavro.cast.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cast.composeapp.generated.resources.Res
import cast.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

@Composable
fun MovieListItem(
    title: String,
    directorName: String,
    timeStamp: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth().background(Color.Black).padding(16.dp, 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Image(
                modifier = Modifier.size(64.dp),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Movie Cover Image"
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.weight(1.0f)) {
            Text(
                text = title,
                color = Color.White
            )
            Text(
                text = directorName,
                color = Color.Gray
            )
        }
        Column {
            Text(
                text = timeStamp,
                color = Color.Gray
            )
        }
    }
}