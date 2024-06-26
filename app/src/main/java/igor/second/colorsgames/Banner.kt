package igor.second.colorsgames

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView

@Composable
fun Banner(id: Int){
    AndroidView(factory = {context ->
        AdView(context).apply {
            setAdSize(AdSize.BANNER)
            adUnitId = context.getString(id)
            val adRequest = AdRequest.Builder().build()
            loadAd(adRequest)
        }
    })
}