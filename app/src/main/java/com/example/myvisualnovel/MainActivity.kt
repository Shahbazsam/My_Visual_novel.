package com.example.myvisualnovel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myvisualnovel.ui.theme.MyVisualNovelTheme
import com.example.myvisualnovel.ui.theme.Purple40
import com.example.myvisualnovel.ui.theme.Purple80

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyVisualNovelTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    VisualNovelApp()
                }
            }
        }
    }
}

@Composable
fun NovelPageSlides(
    modifier: Modifier = Modifier,
    textLabelResourceID: Int?,
    textLabelResourceID2: Int?,
    clickableTextLabelResourceID1: Int?,
    clickableTextLabelResourceID2: Int?,
    clickableTextLabelResourceID3: Int?,
    clickableTextLabelResourceID4: Int?,
    clickableTextLabelResourceID5: Int?,
    drawableResourceID: Int?,
    drawableResourceID2: Int?,
    contentDescriptionId: Int?,
    onImageClick1: (() -> Unit)? = null,
    onImageClick2: (() -> Unit)? = null,
    onImageClick3: (() -> Unit)? = null,
    onImageClick4: (() -> Unit)? = null,
    onImageClick5: (() -> Unit)? = null,

) {
        Box(modifier = modifier.fillMaxSize()) {
            drawableResourceID?.let {
                Image(
                    painter = painterResource(drawableResourceID),
                    contentDescription = contentDescriptionId?.let { stringResource(it)},
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            drawableResourceID2?.let {
                Image(
                    painter = painterResource(drawableResourceID2),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(0.dp, 200.dp)
                        .width(284.dp)
                        .height(718.dp)
                        .padding(start = 0.dp),
                    contentScale = ContentScale.FillBounds
                )
            }



            textLabelResourceID?.let {
                Box(
                    modifier = Modifier
                        .padding(top = 352.dp)
                        .size(width = 400.dp, height = 34.dp)
                        .background(color = Purple40)
                ) {
                    Text(
                        text = stringResource(textLabelResourceID),
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .align(alignment = Alignment.Center)
                    )
                }
            }
            textLabelResourceID2?.let {
                Box(
                    modifier = Modifier
                        .padding(top = 188.dp)
                        .size(width = 450.dp, height = 106.dp)
                        .background(color = Color(0xFF4C87A8))
                ) {
                    Text(
                        text = stringResource(textLabelResourceID2),
                        fontSize = 34.sp,
                        color = Color.White,
                        modifier = Modifier
                            .size(width = 360.dp, height = 60.dp)
                            .align(alignment = Alignment.Center)
                    )
                }

            }

            clickableTextLabelResourceID1?.let {
                Button(
                    onClick = onImageClick1!!,
                    shape = RectangleShape,
                    modifier = Modifier
                        .padding(top = 407.dp)
                        .size(width = 400.dp, height = 34.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Purple80
                    )
                ) {
                    Text(
                        text = stringResource(it)
                    )
                }
            }

            clickableTextLabelResourceID2?.let {
                Button(
                    onClick = onImageClick2!!,
                    shape = RectangleShape,
                    modifier = Modifier
                        .padding(top = 467.dp)
                        .size(width = 400.dp, height = 34.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Purple80
                    )
                ) {
                    Text(
                        text = stringResource(it)
                    )
                }
            }

            clickableTextLabelResourceID3?.let {
                Button(
                    onClick = onImageClick3!!,
                    shape = RectangleShape,
                    modifier = Modifier
                        .padding(top = 527.dp)
                        .size(width = 400.dp, height = 34.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Purple80
                    )
                ) {
                    Text(
                        text = stringResource(it)
                    )
                }
            }

            clickableTextLabelResourceID4?.let {
                Button(
                    onClick = onImageClick4!!,
                    colors = ButtonDefaults.buttonColors(Purple40),
                    shape = RectangleShape,
                    modifier = Modifier
                        .width(1200.dp)
                        .align(Alignment.Center)
                        .offset(0.dp, 300.dp)
                ) {
                    Text(stringResource(it))
                }
            }

            clickableTextLabelResourceID5?.let {
                Button(
                    onClick = onImageClick5!!,
                    colors = ButtonDefaults.buttonColors(Purple40),
                    shape = RectangleShape,
                    modifier = Modifier
                        .width(1200.dp)
                        .align(Alignment.Center)
                        .padding(bottom = 16.dp)
                        .offset(0.dp, 50.dp)
                ) {
                    Text(stringResource(it))
                }
            }

        }
}

@Composable
fun SecondScreen(name: String, onNextScreen: (String) -> Unit) {
    val newNameState = remember { mutableStateOf(name) }
    val image = painterResource(R.drawable.image)
    val cat = painterResource(R.drawable.cat_man)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = cat,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(250.dp, 900.dp)
                .padding(top = 30.dp)
                .fillMaxWidth()
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 500.dp)
        ) {
            Surface(color = Color(0xFF28546c)) {
                Text(
                    text = stringResource(R.string.page2_text),
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 10.dp)
                        .fillMaxWidth(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }

            TextField(
                value = newNameState.value,
                onValueChange = { newName ->
                    newNameState.value = newName
                },
                label = { Text(stringResource(R.string.input_your_name)) },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 42.dp)
            )

            Spacer(modifier = Modifier.height(17.dp))

            Button(
                onClick = { onNextScreen(newNameState.value) },
                colors = ButtonDefaults.buttonColors(Color(0xFF28546c)),
                shape = RectangleShape,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(R.string.accept), color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun ThirdScreen(name: String?, onNextScreen1: () -> Unit ,onNextScreen2: () -> Unit,onNextScreen3: () -> Unit ) {
    val image = painterResource(R.drawable.image)
    val cat = painterResource(R.drawable.cat_man)

    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = cat,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(250.dp, 900.dp)
                .padding(top = 30.dp)
                .fillMaxWidth()
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 470.dp)
        ) {
            Surface(color = Color(0xFF28546c)) {
                Text(
                    text = "Great $name! What are we going to do?",
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 10.dp)
                        .fillMaxWidth(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }

            Button(
                onClick = onNextScreen1,
                colors = ButtonDefaults.buttonColors(Purple80),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 21.dp)
            ) {
                Text(
                    text = stringResource(R.string.walking), color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
            }

            Button(
                onClick = onNextScreen2,
                colors = ButtonDefaults.buttonColors(Purple80),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 21.dp)
            ) {
                Text(
                    text = stringResource(R.string.hiking), color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
            }

            Button(
                onClick = onNextScreen3,
                colors = ButtonDefaults.buttonColors(Purple80),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 21.dp)
            ) {
                Text(
                    text = stringResource(R.string.go_to_the_field), color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun VisualNovelApp() {

    var counter by remember { mutableIntStateOf(1) }
    var name by remember { mutableStateOf("") }

    when(counter) {
        1-> NovelPageSlides(
            textLabelResourceID = null,
            textLabelResourceID2 = R.string.page1_text,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = null,
            clickableTextLabelResourceID3 = null,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = R.string.page1_Clickable5,
            drawableResourceID = R.drawable.image,
            drawableResourceID2 = null,
            contentDescriptionId = null,
            onImageClick1 = null,
            onImageClick2 = null,
            onImageClick3 = null,
            onImageClick4 = null,
            onImageClick5 = {counter = 2}
        )

        2 ->  SecondScreen(name ){ newName ->
            name = newName
            counter = 3
        }
        3 -> ThirdScreen(name = name ,
            onNextScreen1 = { counter = 4 },
            onNextScreen2 = { counter = 5 },
            onNextScreen3 = {counter = 6}
        )
        4-> NovelPageSlides(
            textLabelResourceID = R.string.page4_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page4_Clickable2,
            clickableTextLabelResourceID3 = R.string.page4_Clickable3,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image_4,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page4_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 7 },
            onImageClick3 = { counter = 8 }
        )
        5 -> NovelPageSlides(
            textLabelResourceID = R.string.page5_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page5_Clickable2,
            clickableTextLabelResourceID3 = R.string.page5_Clickable3,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image_5,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page5_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 7 },
            onImageClick3 = { counter = 8 }
        )
        6 -> NovelPageSlides(
            textLabelResourceID = R.string.page6_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page6_Clickable2,
            clickableTextLabelResourceID3 = R.string.page6_Clickable3,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image_6,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page6_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 7 },
            onImageClick3 = { counter = 8 }
        )
        7 -> NovelPageSlides(
            textLabelResourceID = R.string.page7_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page7_Clickable2,
            clickableTextLabelResourceID3 = R.string.page7_Clickable3,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image7_9_10,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page7_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 9 },
            onImageClick3 = { counter = 10 }
        )
        8 -> NovelPageSlides(
            textLabelResourceID = R.string.page8_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page8_Clickable2,
            clickableTextLabelResourceID3 = R.string.page8_Clickable3,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image_8,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page8_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 7 },
            onImageClick3 = { counter = 11 }
        )
        9 -> NovelPageSlides(
            textLabelResourceID = R.string.page9_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page9_Clickable2,
            clickableTextLabelResourceID3 = null,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image7_9_10,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page9_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 14 },
            onImageClick3 = null
        )
        10 -> NovelPageSlides(
            textLabelResourceID = R.string.page10_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page10_Clickable2,
            clickableTextLabelResourceID3 = null,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image7_9_10,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page10_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 14 },
            onImageClick3 = null
        )
        11 -> NovelPageSlides(
            textLabelResourceID = R.string.page11_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page11_Clickable2,
            clickableTextLabelResourceID3 = R.string.page11_Clickable3,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image_11_12_13,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page11_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 12 },
            onImageClick3 = { counter = 13 }
        )
        12 -> NovelPageSlides(
            textLabelResourceID = R.string.page12_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page12_Clickable2,
            clickableTextLabelResourceID3 = null,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image_11_12_13,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page12_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 14 },
            onImageClick3 = null
        )
        13 -> NovelPageSlides(
            textLabelResourceID = R.string.page13_text,
            textLabelResourceID2 =null ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page13_Clickable2,
            clickableTextLabelResourceID3 = null,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image_11_12_13,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page13_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 14 },
            onImageClick3 = null
        )
        14 -> NovelPageSlides(
            textLabelResourceID = null,
            textLabelResourceID2 =R.string.page14_text ,
            clickableTextLabelResourceID1 = null,
            clickableTextLabelResourceID2 = R.string.page14_Clickable2,
            clickableTextLabelResourceID3 = null,
            clickableTextLabelResourceID4 = null,
            clickableTextLabelResourceID5 = null,
            drawableResourceID = R.drawable.image,
            drawableResourceID2 = null,
            contentDescriptionId = R.string.page13_ContentDescription,
            onImageClick1 = null,
            onImageClick2 = { counter = 1 },
            onImageClick3 = null
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyVisualNovelTheme {
       VisualNovelApp()
    }
}