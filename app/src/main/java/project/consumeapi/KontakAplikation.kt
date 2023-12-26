package project.consumeapi

import android.app.Application
import project.consumeapi.repository.AppContainer
import project.consumeapi.repository.KontakContainer

class  KontakAplikation : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies*/
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}