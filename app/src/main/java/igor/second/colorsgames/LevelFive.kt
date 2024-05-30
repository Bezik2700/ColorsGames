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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController

@Composable
fun LevelFive(navController: NavController) {
    val showMyDialog = remember { mutableStateOf(false) }
    var result by remember { mutableIntStateOf(0) }
    var count by remember { mutableIntStateOf(0) }
    val imageResource = when (result){
        1 -> R.drawable.blackbanan
        2 -> R.drawable.bluebanan
        3 -> R.drawable.orangebanan
        4 -> R.drawable.greenbanan
        5 -> R.drawable.redbanan
        6 -> R.drawable.pinkbanan
        7 -> R.drawable.purplebanan
        8 -> R.drawable.brownbanan
        9 -> R.drawable.graybanan
        10 -> R.drawable.yellowbanan
        11 -> R.drawable.whitebanan
        12 -> R.drawable.blackstrawberry
        13 -> R.drawable.bluestrawberry
        14 -> R.drawable.orangestrawberry
        15 -> R.drawable.greenstrawberry
        16 -> R.drawable.redstrawberry
        17 -> R.drawable.pinkstrawberry
        18 -> R.drawable.purplestrawberry
        19 -> R.drawable.brownstrawberry
        20 -> R.drawable.graystrawberry
        21 -> R.drawable.yellowstrawberry
        22 -> R.drawable.whitestrawberry
        23 -> R.drawable.blacklemon
        24 -> R.drawable.bluelemon
        25 -> R.drawable.orangelemon
        26 -> R.drawable.greenlemon
        27 -> R.drawable.redlemon
        28 -> R.drawable.pinklemon
        29 -> R.drawable.purplelemon
        30 -> R.drawable.brownlemon
        31 -> R.drawable.graylemon
        32 -> R.drawable.yellowlemon
        33 -> R.drawable.whitelemon
        34 -> R.drawable.blackwatermelon
        35 -> R.drawable.bluewatermelon
        36 -> R.drawable.orangewatermelon
        37 -> R.drawable.greenwatermelon
        38 -> R.drawable.redwatermelon
        39 -> R.drawable.pinkwatermelon
        40 -> R.drawable.purplewatermelon
        41 -> R.drawable.brownwatermelon
        42 -> R.drawable.graywatermelon
        43 -> R.drawable.yellowwatermelon
        44 -> R.drawable.whitewatermelon
        45 -> R.drawable.blackkivi
        46 -> R.drawable.bluekivi
        47 -> R.drawable.orangekivi
        48 -> R.drawable.greenkivi
        49 -> R.drawable.redkivi
        50 -> R.drawable.pinkkivi
        51 -> R.drawable.purplekivi
        52 -> R.drawable.brownkivi
        53 -> R.drawable.graykivi
        54 -> R.drawable.yellowkivi
        55 -> R.drawable.whitekivi
        56 -> R.drawable.blackgrape
        57 -> R.drawable.bluegrape
        58 -> R.drawable.orangegrape
        59 -> R.drawable.greengrape
        60 -> R.drawable.redgrape
        61 -> R.drawable.pinkgrape
        62 -> R.drawable.purplegrape
        63 -> R.drawable.browngrape
        64 -> R.drawable.graygrape
        65 -> R.drawable.yellowgrape
        66 -> R.drawable.whitegrape
        67 -> R.drawable.blackbanan
        68 -> R.drawable.bluebanan
        69 -> R.drawable.orangebanan
        70 -> R.drawable.greenbanan
        71 -> R.drawable.redbanan
        72 -> R.drawable.pinkbanan
        73 -> R.drawable.purplebanan
        74 -> R.drawable.brownbanan
        75 -> R.drawable.graybanan
        76 -> R.drawable.yellowbanan
        77 -> R.drawable.whitebanan
        78 -> R.drawable.blackstrawberry
        79 -> R.drawable.bluestrawberry
        80 -> R.drawable.orangestrawberry
        81 -> R.drawable.greenstrawberry
        82 -> R.drawable.redstrawberry
        83 -> R.drawable.pinkstrawberry
        84 -> R.drawable.purplestrawberry
        85 -> R.drawable.brownstrawberry
        86 -> R.drawable.graystrawberry
        87 -> R.drawable.yellowstrawberry
        88 -> R.drawable.whitestrawberry
        89 -> R.drawable.blacklemon
        90 -> R.drawable.bluelemon
        91 -> R.drawable.orangelemon
        92 -> R.drawable.greenlemon
        93 -> R.drawable.redlemon
        94 -> R.drawable.pinklemon
        95 -> R.drawable.purplelemon
        96 -> R.drawable.brownlemon
        97 -> R.drawable.graylemon
        98 -> R.drawable.yellowlemon
        99 -> R.drawable.whitelemon
        100 -> R.drawable.blackwatermelon
        101 -> R.drawable.bluewatermelon
        102 -> R.drawable.orangewatermelon
        103 -> R.drawable.greenwatermelon
        104 -> R.drawable.redwatermelon
        105 -> R.drawable.pinkwatermelon
        106 -> R.drawable.purplewatermelon
        107 -> R.drawable.brownwatermelon
        108 -> R.drawable.graywatermelon
        109 -> R.drawable.yellowwatermelon
        110 -> R.drawable.whitewatermelon
        111 -> R.drawable.blackkivi
        112 -> R.drawable.bluekivi
        113 -> R.drawable.orangekivi
        114 -> R.drawable.greenkivi
        115 -> R.drawable.redkivi
        116 -> R.drawable.pinkkivi
        117 -> R.drawable.purplekivi
        118 -> R.drawable.brownkivi
        119 -> R.drawable.graykivi
        120 -> R.drawable.yellowkivi
        121 -> R.drawable.whitekivi
        122 -> R.drawable.blackgrape
        123 -> R.drawable.bluegrape
        124 -> R.drawable.orangegrape
        125 -> R.drawable.greengrape
        126 -> R.drawable.redgrape
        127 -> R.drawable.pinkgrape
        128 -> R.drawable.purplegrape
        129 -> R.drawable.browngrape
        130 -> R.drawable.graygrape
        131 -> R.drawable.yellowgrape
        132 -> R.drawable.whitegrape
        else -> R.drawable.pressimg
    }
    val counter = when (result){
        1 -> R.string.blackBanana
        2 -> R.string.blueBanana
        3 -> R.string.orangeBanana
        4 -> R.string.greenBanana
        5 -> R.string.redBanana
        6 -> R.string.pinkBanana
        7 -> R.string.purpleBanana
        8 -> R.string.brownBanana
        9 -> R.string.grayBanana
        10 -> R.string.yellowBanana
        11 -> R.string.whiteBanana
        12 -> R.string.blackStrawberry
        13 -> R.string.blueStrawberry
        14 -> R.string.orangeStrawberry
        15 -> R.string.greenStrawberry
        16 -> R.string.redStrawberry
        17 -> R.string.pinkStrawberry
        18 -> R.string.purpleStrawberry
        19 -> R.string.brownStrawberry
        20 -> R.string.grayStrawberry
        21 -> R.string.yellowStrawberry
        22 -> R.string.whiteStrawberry
        23 -> R.string.blackLemon
        24 -> R.string.blueLemon
        25 -> R.string.orangeLemon
        26 -> R.string.greenLemon
        27 -> R.string.redLemon
        28 -> R.string.pinkLemon
        29 -> R.string.purpleLemon
        30 -> R.string.brownLemon
        31 -> R.string.grayLemon
        32 -> R.string.yellowLemon
        33 -> R.string.whiteLemon
        34 -> R.string.blackWatermelon
        35 -> R.string.blueWatermelon
        36 -> R.string.orangeWatermelon
        37 -> R.string.greenWatermelon
        38 -> R.string.redWatermelon
        39 -> R.string.pinkWatermelon
        40 -> R.string.purpleWatermelon
        41 -> R.string.brownWatermelon
        42 -> R.string.grayWatermelon
        43 -> R.string.yellowWatermelon
        44 -> R.string.whiteWatermelon
        45 -> R.string.blackKiwi
        46 -> R.string.blueKiwi
        47 -> R.string.orangeKiwi
        48 -> R.string.greenKiwi
        49 -> R.string.redKiwi
        50 -> R.string.pinkKiwi
        51 -> R.string.purpleKiwi
        52 -> R.string.brownKiwi
        53 -> R.string.grayKiwi
        54 -> R.string.yellowKiwi
        55 -> R.string.whiteKiwi
        56 -> R.string.blackGrapes
        57 -> R.string.blueGrapes
        58 -> R.string.orangeGrapes
        59 -> R.string.greenGrapes
        60 -> R.string.redGrapes
        61 -> R.string.pinkGrapes
        62 -> R.string.purpleGrapes
        63 -> R.string.brownGrapes
        64 -> R.string.grayGrapes
        65 -> R.string.yellowGrapes
        66 -> R.string.whiteGrapes
        67 -> R.string.whiteGrapes
        68 -> R.string.yellowGrapes
        69 -> R.string.grayGrapes
        70 -> R.string.brownGrapes
        71 -> R.string.purpleGrapes
        72 -> R.string.pinkGrapes
        73 -> R.string.redGrapes
        74 -> R.string.greenGrapes
        75 -> R.string.orangeGrapes
        76 -> R.string.blueGrapes
        77 -> R.string.blackGrapes
        78 -> R.string.whiteKiwi
        79 -> R.string.yellowKiwi
        80 -> R.string.grayKiwi
        81 -> R.string.brownKiwi
        82 -> R.string.purpleKiwi
        83 -> R.string.pinkKiwi
        84 -> R.string.redKiwi
        85 -> R.string.greenKiwi
        86 -> R.string.orangeKiwi
        87 -> R.string.blueKiwi
        88 -> R.string.blackKiwi
        89 -> R.string.whiteWatermelon
        90 -> R.string.yellowWatermelon
        91 -> R.string.grayWatermelon
        92 -> R.string.brownWatermelon
        93 -> R.string.purpleWatermelon
        94 -> R.string.pinkWatermelon
        95 -> R.string.redWatermelon
        96 -> R.string.greenWatermelon
        97 -> R.string.orangeWatermelon
        98 -> R.string.blueWatermelon
        99 -> R.string.blackWatermelon
        100 -> R.string.whiteLemon
        101 -> R.string.yellowLemon
        102 -> R.string.grayLemon
        103 -> R.string.brownLemon
        104 -> R.string.purpleLemon
        105 -> R.string.pinkLemon
        106 -> R.string.redLemon
        107 -> R.string.greenLemon
        108 -> R.string.orangeLemon
        109 -> R.string.blueLemon
        110 -> R.string.blackLemon
        111 -> R.string.redStrawberry
        112 -> R.string.whiteStrawberry
        113 -> R.string.yellowStrawberry
        114 -> R.string.grayStrawberry
        115 -> R.string.brownStrawberry
        116 -> R.string.purpleStrawberry
        117 -> R.string.pinkStrawberry
        118 -> R.string.greenStrawberry
        119 -> R.string.orangeStrawberry
        120 -> R.string.blueStrawberry
        121 -> R.string.blackStrawberry
        122 -> R.string.whiteBanana
        123 -> R.string.yellowBanana
        124 -> R.string.grayBanana
        125 -> R.string.brownBanana
        126 -> R.string.purpleBanana
        127 -> R.string.pinkBanana
        128 -> R.string.redBanana
        129 -> R.string.greenBanana
        130 -> R.string.orangeBanana
        131 -> R.string.blueBanana
        132 -> R.string.blackBanana
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
                        Text(text = stringResource(R.string.textDescription5))
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
                if(result in 67..132){
                    count += 1
                }
                else {count -= 1}
                result = (1..132).random()},
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
                if(result in 1..66){
                    count += 1
                }
                else {count -= 1}
                result = (1..132).random()},
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