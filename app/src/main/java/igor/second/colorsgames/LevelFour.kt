package igor.second.colorsgames

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun LevelFour(navController: NavController) {
    val showMyDialog1 = remember { mutableStateOf(false) }
    val showMyDialog2 = remember { mutableStateOf(false) }
    var result by remember { mutableIntStateOf(0) }
    var count by remember { mutableIntStateOf(0) }
    var sec by remember { mutableIntStateOf(120) }
    var start by remember { mutableStateOf(false) }
    val imageResource = when (result){
        1 -> R.drawable.black
        2 -> R.drawable.blue
        3 -> R.drawable.orange
        4 -> R.drawable.green
        5 -> R.drawable.red
        6 -> R.drawable.pink
        7 -> R.drawable.purple
        8 -> R.drawable.brown
        9 -> R.drawable.gray
        10 -> R.drawable.yellow
        11 -> R.drawable.white
        12 -> R.drawable.kvblack
        13 -> R.drawable.kvblue
        14 -> R.drawable.kvorange
        15 -> R.drawable.kvgreen
        16 -> R.drawable.kvred
        17 -> R.drawable.kvpink
        18 -> R.drawable.kvpurple
        19 -> R.drawable.kvbrown
        20 -> R.drawable.kvgray
        21 -> R.drawable.kvyellow
        22 -> R.drawable.kvwhite
        23 -> R.drawable.trblack
        24 -> R.drawable.trblue
        25 -> R.drawable.trorange
        26 -> R.drawable.trgreen
        27 -> R.drawable.trred
        28 -> R.drawable.trpink
        29 -> R.drawable.trpurple
        30 -> R.drawable.trbrown
        31 -> R.drawable.trgray
        32 -> R.drawable.tryellow
        33 -> R.drawable.trwhite
        34 -> R.drawable.black
        35 -> R.drawable.blue
        36 -> R.drawable.orange
        37 -> R.drawable.green
        38 -> R.drawable.red
        39 -> R.drawable.pink
        40 -> R.drawable.purple
        41 -> R.drawable.brown
        42 -> R.drawable.gray
        43 -> R.drawable.yellow
        44 -> R.drawable.white
        45 -> R.drawable.kvblack
        46 -> R.drawable.kvblue
        47 -> R.drawable.kvorange
        48 -> R.drawable.kvgreen
        49 -> R.drawable.kvred
        50 -> R.drawable.kvpink
        51 -> R.drawable.kvpurple
        52 -> R.drawable.kvbrown
        53 -> R.drawable.kvgray
        54 -> R.drawable.kvyellow
        55 -> R.drawable.kvwhite
        56 -> R.drawable.trblack
        57 -> R.drawable.trblue
        58 -> R.drawable.trorange
        59 -> R.drawable.trgreen
        60 -> R.drawable.trred
        61 -> R.drawable.trpink
        62 -> R.drawable.trpurple
        63 -> R.drawable.trbrown
        64 -> R.drawable.trgray
        65 -> R.drawable.tryellow
        66 -> R.drawable.trwhite
        else -> R.drawable.pressimg
    }
    val counter = when (result){
        1 -> R.string.blackCircle
        2 -> R.string.blueCircle
        3 -> R.string.orangeCircle
        4 -> R.string.greenCircle
        5 -> R.string.redCircle
        6 -> R.string.pinkCircle
        7 -> R.string.purpleCircle
        8 -> R.string.brownCircle
        9 -> R.string.grayCircle
        10 -> R.string.yellowCircle
        11 -> R.string.whiteCircle
        12 -> R.string.blackSquare
        13 -> R.string.blueSquare
        14 -> R.string.orangeSquare
        15 -> R.string.greenSquare
        16 -> R.string.redSquare
        17 -> R.string.pinkSquare
        18 -> R.string.purpleSquare
        19 -> R.string.brownSquare
        20 -> R.string.graySquare
        21 -> R.string.yellowSquare
        22 -> R.string.whiteSquare
        23 -> R.string.blackTriangle
        24 -> R.string.blueTriangle
        25 -> R.string.orangeTriangle
        26 -> R.string.greenTriangle
        27 -> R.string.redTriangle
        28 -> R.string.pinkTriangle
        29 -> R.string.purpleTriangle
        30 -> R.string.brownTriangle
        31 -> R.string.grayTriangle
        32 -> R.string.yellowTriangle
        33 -> R.string.whiteTriangle
        34 -> R.string.pinkCircle
        35 -> R.string.yellowTriangle
        36 -> R.string.graySquare
        37 -> R.string.brownCircle
        38 -> R.string.purpleTriangle
        39 -> R.string.whiteSquare
        40 -> R.string.redCircle
        41 -> R.string.greenTriangle
        42 -> R.string.orangeSquare
        43 -> R.string.blueCircle
        44 -> R.string.blackTriangle
        45 -> R.string.pinkSquare
        46 -> R.string.yellowCircle
        47 -> R.string.grayTriangle
        48 -> R.string.brownSquare
        49 -> R.string.purpleCircle
        50 -> R.string.whiteTriangle
        51 -> R.string.redSquare
        52 -> R.string.greenCircle
        53 -> R.string.orangeTriangle
        54 -> R.string.blueSquare
        55 -> R.string.blackCircle
        56 -> R.string.pinkTriangle
        57 -> R.string.yellowSquare
        58 -> R.string.grayCircle
        59 -> R.string.brownTriangle
        60 -> R.string.purpleSquare
        61 -> R.string.whiteCircle
        62 -> R.string.redTriangle
        63 -> R.string.greenSquare
        64 -> R.string.orangeCircle
        65 -> R.string.blueTriangle
        66 -> R.string.blackSquare
        else -> R.string.start
    }
    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.preview6),
            contentDescription = "preview",
            contentScale = ContentScale.FillBounds
        )
    }
    Row (
        modifier = Modifier.padding(32.dp),
        horizontalArrangement = Arrangement.End
    ){ Button(
        onClick = {navController.navigate(Screens.WorkLayout.route)},
        border = BorderStroke(2.dp, Color.Blue),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Blue)) {
        Text(stringResource(id = R.string.cansel),
            fontSize = 18.sp,
            style = MaterialTheme.typography.bodyMedium)
    }
    }
    Row (
        modifier = Modifier.padding(32.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        // Иконка информации об уровне
        IconButton(onClick = {showMyDialog1.value = true}) {
            Icon(
                Icons.Filled.Info,
                contentDescription = "App information",
                modifier = Modifier.size(64.dp),
                tint = Color.Blue
            )
        }
        if(showMyDialog1.value){
            Dialog(onDismissRequest = { showMyDialog1.value = false }) {
                Card (modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp),
                    shape = RoundedCornerShape(16.dp),
                ) {
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)){
                        Text(text = stringResource(R.string.textDescription4))
                        TextButton(onClick = {showMyDialog1.value = false},
                            modifier = Modifier
                                .fillMaxSize()
                                .wrapContentSize(Alignment.CenterEnd)) {
                            Text(stringResource(id = R.string.next))
                        }
                    }
                }
            }
        }
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Функция таймера c диалоговым окном окончания и продолжения уровня
        Row {
            Text(
                text = stringResource(id = R.string.times, "$sec"),
                fontSize = 24.sp,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Blue
            )
            if (start){
                LaunchedEffect(sec) {
                    if (sec != 0) {
                        delay(1000)
                        sec--
                    }else{
                        showMyDialog2.value = true
                    }
                }
                if (showMyDialog2.value){
                    Dialog(onDismissRequest = {
                        showMyDialog2.value = false
                        sec = 120
                        start = false
                        count = 0
                    }) {
                        Card (modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(16.dp),
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center){
                                Text(stringResource(id = R.string.youScore, "$count"),
                                    fontSize = 24.sp)
                                Spacer(modifier = Modifier.padding(16.dp))
                                Row (verticalAlignment = Alignment.Bottom,
                                    horizontalArrangement = Arrangement.Center) {
                                    TextButton(onClick = {
                                        showMyDialog2.value = false
                                        navController.navigate(Screens.WorkLayout.route)},
                                        modifier = Modifier
                                            .wrapContentSize(Alignment.CenterStart)) {
                                        Text(stringResource(id = R.string.cansel),
                                            fontSize = 24.sp)
                                    }
                                    TextButton(onClick = {
                                        showMyDialog2.value = false
                                        sec = 120
                                        start = false
                                        count = 0
                                                         },
                                        modifier = Modifier
                                            .wrapContentSize(Alignment.CenterStart)) {
                                        Text(stringResource(id = R.string.next),
                                            fontSize = 24.sp)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            stringResource(id = R.string.youScore, "$count"),
            fontSize = 24.sp,
            color = Color.Blue,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.padding(32.dp)
        )
        Text(
            text = stringResource(id = counter),
            color = Color.Blue,
            fontSize = 24.sp,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(
            modifier = Modifier.padding(32.dp)
        )
        Banner(id = R.string.banner_Ad_Mob)
        Spacer(
            modifier = Modifier.padding(16.dp)
        )
    }
    Row (
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Button(
            onClick = {
                if(result in 34..66){
                    count += 1
                }
                else {count -= 1}
                result = (1..66).random()
                start = true
                      },
            border = BorderStroke(3.dp, Color.Red),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)) {
            Text(
                stringResource(id = R.string.no),
                modifier = Modifier.padding(16.dp),
                fontSize = 24.sp,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Red
            )
        }
    }
    Row (
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.End
    ) {
        Button(
            onClick = {
                if(result in 1..33){
                    count += 1
                }
                else {count -= 1}
                result = (1..66).random()
                start = true
                      },
            border = BorderStroke(3.dp, Color.Green),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Green)) {
            Text(
                stringResource(id = R.string.yes),
                modifier = Modifier.padding(16.dp),
                fontSize = 24.sp,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Green
            )
        }
    }
}