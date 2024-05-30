package igor.second.colorsgames

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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import igor.second.colorsgames.ui.theme.ColorsGamesTheme
import kotlin.system.exitProcess

@Composable
fun WorkLayout(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val showMyDialog = remember { mutableStateOf(false) }
    var rounded by remember { mutableStateOf(false) }
    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.preview3),
            contentDescription = "preview3",
            contentScale = ContentScale.FillBounds
        )
    }
    Row (modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.End) {
        Button(onClick = { exitProcess(1) }) {
            Text(stringResource(id = R.string.exit),
                style = MaterialTheme.typography.displayMedium)
        }
    }
    Spacer(modifier = Modifier.padding(32.dp))
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        ) {
            Button(
                onClick = {
                    if (rounded) {
                        navController.navigate(Screens.LevelTwo.route)
                    } else {
                        navController.navigate(Screens.LevelOne.route)
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(
                    stringResource(id = R.string.levelOne),
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Button(
                onClick = {
                    if (rounded) {
                        navController.navigate(Screens.LevelFour.route)
                    } else {
                        navController.navigate(Screens.LevelThree.route)
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(
                    stringResource(id = R.string.levelTwo),
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Button(
                onClick = {
                    if (rounded) {
                        navController.navigate(Screens.LevelSix.route)
                    } else {
                        navController.navigate(Screens.LevelFive.route)
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(
                    stringResource(id = R.string.levelThree),
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Button(
                onClick = { showMyDialog.value = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(
                    stringResource(id = R.string.more),
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier.padding(8.dp)
                )
            }
            if(showMyDialog.value) {
                Dialog(onDismissRequest = { showMyDialog.value = false }) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(220.dp)
                            .padding(16.dp),
                        shape = RoundedCornerShape(topEnd = 16.dp, bottomStart = 16.dp),
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            Text(text = stringResource(R.string.thanks),
                                style = MaterialTheme.typography.displayMedium,
                            )
                            TextButton(
                                onClick = { showMyDialog.value = false },
                                modifier = Modifier
                                    .fillMaxSize()
                                    .wrapContentSize(Alignment.CenterEnd)
                            ) {
                                Text(stringResource(id = R.string.next))
                            }
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(32.dp))
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                stringResource(id = R.string.mode),
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(8.dp)
            )
            Switch(
                checked = rounded,
                onCheckedChange = { rounded = it },
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            )
        }
        Spacer(modifier = Modifier.padding(32.dp))
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center) {
            Banner(id = R.string.banner_Ad_Mob)
        }
        HyperLinkText()
    }
}

@Preview
@Composable
fun WorkLayoutPreview(){
    ColorsGamesTheme {
        WorkLayout(
            navController = rememberNavController())
    }
}