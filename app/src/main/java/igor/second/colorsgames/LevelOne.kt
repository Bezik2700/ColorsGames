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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import igor.second.colorsgames.ui.theme.ColorsGamesTheme

@Composable
fun LevelOne(navController: NavController) {
    val showMyDialog = remember { mutableStateOf(false) }
    var result by remember { mutableIntStateOf(0) }
    var count by remember { mutableIntStateOf(0) }
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
        12 -> R.drawable.black
        13 -> R.drawable.blue
        14 -> R.drawable.orange
        15 -> R.drawable.green
        16 -> R.drawable.red
        17 -> R.drawable.pink
        18 -> R.drawable.purple
        19 -> R.drawable.brown
        20 -> R.drawable.gray
        21 -> R.drawable.yellow
        22 -> R.drawable.white
        23 -> R.drawable.black
        24 -> R.drawable.blue
        25 -> R.drawable.orange
        26 -> R.drawable.green
        27 -> R.drawable.red
        28 -> R.drawable.pink
        29 -> R.drawable.purple
        30 -> R.drawable.brown
        31 -> R.drawable.gray
        32 -> R.drawable.yellow
        33 -> R.drawable.white
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
        45 -> R.drawable.black
        46 -> R.drawable.blue
        47 -> R.drawable.orange
        48 -> R.drawable.green
        49 -> R.drawable.red
        50 -> R.drawable.pink
        51 -> R.drawable.purple
        52 -> R.drawable.brown
        53 -> R.drawable.gray
        54 -> R.drawable.yellow
        55 -> R.drawable.white
        56 -> R.drawable.black
        57 -> R.drawable.blue
        58 -> R.drawable.orange
        59 -> R.drawable.green
        60 -> R.drawable.red
        61 -> R.drawable.pink
        62 -> R.drawable.purple
        63 -> R.drawable.brown
        64 -> R.drawable.gray
        65 -> R.drawable.yellow
        66 -> R.drawable.white
        67 -> R.drawable.black
        68 -> R.drawable.blue
        69 -> R.drawable.orange
        70 -> R.drawable.green
        71 -> R.drawable.red
        72 -> R.drawable.pink
        73 -> R.drawable.purple
        74 -> R.drawable.brown
        75 -> R.drawable.gray
        76 -> R.drawable.yellow
        else -> R.drawable.pressimg
    }
    val counter = when (result){
        1 -> R.string.black
        2 -> R.string.orange
        3 -> R.string.orange
        4 -> R.string.red
        5 -> R.string.red
        6 -> R.string.purple
        7 -> R.string.purple
        8 -> R.string.gray
        9 -> R.string.gray
        10 -> R.string.white
        11 -> R.string.white
        12 -> R.string.blue
        13 -> R.string.blue
        14 -> R.string.green
        15 -> R.string.green
        16 -> R.string.pink
        17 -> R.string.pink
        18 -> R.string.brown
        19 -> R.string.brown
        20 -> R.string.yellow
        21 -> R.string.yellow
        22 -> R.string.black
        23 -> R.string.black
        24 -> R.string.orange
        25 -> R.string.orange
        26 -> R.string.red
        27 -> R.string.red
        28 -> R.string.purple
        29 -> R.string.purple
        30 -> R.string.gray
        31 -> R.string.gray
        32 -> R.string.white
        33 -> R.string.white
        34 -> R.string.blue
        35 -> R.string.blue
        36 -> R.string.green
        37 -> R.string.green
        38 -> R.string.pink
        39 -> R.string.pink
        40 -> R.string.brown
        41 -> R.string.brown
        42 -> R.string.yellow
        43 -> R.string.yellow
        44 -> R.string.black
        45 -> R.string.black
        46 -> R.string.orange
        47 -> R.string.orange
        48 -> R.string.red
        49 -> R.string.red
        50 -> R.string.purple
        51 -> R.string.purple
        52 -> R.string.gray
        53 -> R.string.gray
        54 -> R.string.white
        55 -> R.string.white
        56 -> R.string.blue
        57 -> R.string.blue
        58 -> R.string.green
        59 -> R.string.green
        60 -> R.string.pink
        61 -> R.string.pink
        62 -> R.string.brown
        63 -> R.string.brown
        64 -> R.string.yellow
        65 -> R.string.yellow
        66 -> R.string.black
        67 -> R.string.black
        68 -> R.string.orange
        69 -> R.string.orange
        70 -> R.string.red
        71 -> R.string.red
        72 -> R.string.purple
        73 -> R.string.purple
        74 -> R.string.gray
        75 -> R.string.gray
        76 -> R.string.white
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
            Text(
                stringResource(id = R.string.cansel),
                fontSize = 18.sp,
                style = MaterialTheme.typography.bodyMedium)
        }
    }
    Row (
        modifier = Modifier.padding(32.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        // Иконка информации об уровне
        IconButton(onClick = {showMyDialog.value = true}) {
                Icon(
                    Icons.Filled.Info,
                    contentDescription = "App information",
                    modifier = Modifier.size(64.dp),
                    tint = Color.Blue
                )
            }
        if(showMyDialog.value){
            Dialog(onDismissRequest = { showMyDialog.value = false }) {
                Card (modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp),
                    shape = RoundedCornerShape(16.dp),
                ) {
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)){
                        Text(text = stringResource(R.string.textDescription1))
                        TextButton(onClick = {showMyDialog.value = false},
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
                if(result % 2 == 0){
                    count += 1
                }
                else {count -= 1}
                result = (1..78).random()},
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
                if(result % 2 != 0){
                    count += 1
                }
                else {count -= 1}
                result = (1..78).random()},
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

@Preview
@Composable
fun LevelOnePreview(){
    ColorsGamesTheme {
        LevelOne(
            navController = rememberNavController()
        )
    }
}
