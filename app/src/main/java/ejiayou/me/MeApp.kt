package ejiayou.me

import android.app.Application
import ejiayou.common.module.http.CorHttp

/**
 * @author:
 * @created on: 2022/7/11 16:28
 * @description:
 */
class MeApp : Application() {
    override fun onCreate() {
        super.onCreate()
        CorHttp.getInstance().init(this)
    }
}