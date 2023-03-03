package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.SystemFontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Default
import com.example.myapplication.screen.ScreenMain
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Purple700

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DisplayImage()
                //    ScreenMain()
                }
            }
        }
    }
}
@Composable
fun DisplayImage(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        ,verticalArrangement = Arrangement.Center
        ,horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "voice", style = TextStyle(fontSize = 70.sp), fontFamily = FontFamily.Serif)
        Spacer(modifier = Modifier.height(40.dp))
        MyImage()
        Spacer(modifier = Modifier.height(40.dp))

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Add voice")
            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Sample list")
            }
        }

        Box(modifier = Modifier.fillMaxSize()) {
            ClickableText(
                text = AnnotatedString("log out"),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(10.dp),
                onClick = { },
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    textDecoration = TextDecoration.Underline,
                    color = Purple700
                )
            )
        }
    }
}

@Composable
fun MyImage(){
    Image(painter = painterResource(id = R.drawable.voice),
          contentDescription = "Image",
          modifier = Modifier
              .padding(10.dp)
              .width(200.dp)
              .height(200.dp)
    )
}
@Preview(showBackground = true, widthDp = 390, heightDp = 800)

//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
       DisplayImage()
     //   ScreenMain()
    }
}