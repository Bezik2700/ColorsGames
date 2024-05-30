package igor.second.colorsgames

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.android.gms.ads.MobileAds
import igor.second.colorsgames.ui.theme.ColorsGamesTheme
import io.appmetrica.analytics.AppMetrica
import io.appmetrica.analytics.AppMetricaConfig

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val API_KEY = "f04f54e1-0b75-4bc7-aab7-da219e8003af"
        val config = AppMetricaConfig.newConfigBuilder(API_KEY).build()
        AppMetrica.activate(this, config)
        setContent {
            ColorsGamesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                ) {
                    val navController = rememberNavController()
                    NavigationWork(navController = navController)
                    MobileAds.initialize(this){}
                }
            }
        }
    }
}

@Composable
fun HyperLinkText(){
    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW,
        Uri.parse("https://www.termsfeed.com/live/d6f3f321-08fa-44d4-927c-f75181bd0ad9")) }
    TextButton(onClick = { context.startActivity(intent) }) {
        Text(stringResource(id = R.string.privacy),
            style = MaterialTheme.typography.labelSmall)
    }
}

sealed class Screens(val route: String) {
    object LevelOne: Screens("LevelOne")
    object LevelTwo: Screens("LevelTwo")
    object LevelThree: Screens("LevelThree")
    object LevelFour: Screens("LevelFour")
    object LevelFive: Screens("LevelFive")
    object LevelSix: Screens("LevelSix")
    object WorkLayout: Screens("WorkLayout")
}

@Composable
fun NavigationWork(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.WorkLayout.route)
    {
        composable(route = Screens.WorkLayout.route){
            WorkLayout(navController)
        }
        composable(route = Screens.LevelOne.route){
            LevelOne(navController)
        }
        composable(route = Screens.LevelTwo.route){
            LevelTwo(navController)
        }
        composable(route = Screens.LevelThree.route){
            LevelThree(navController)
        }
        composable(route = Screens.LevelFour.route){
            LevelFour(navController)
        }
        composable(route = Screens.LevelFive.route){
            LevelFive(navController)
        }
        composable(route = Screens.LevelSix.route){
            LevelSix(navController)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun WorkActivityPreview() {
    ColorsGamesTheme {
        WorkLayout(navController = rememberNavController())
    }
}