package ejiayou.me.export.router

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.launcher.ARouter
import ejiayou.me.export.router.service.IPayService

/**
 * @author: lr
 * @created on: 2022/7/16 4:26 下午
 * @description: 提供启动activity  service 等动作
 */
open class MeServiceUtil {


    companion object {

        fun initService(): IPayService? {
            var service = ARouter.getInstance().build(MeRouterTable.PATH_SERVICE_ME).navigation()
            if (service is IPayService)
                return service
            return null
        }


        fun navigateMePage(): Fragment {
            return ARouter.getInstance().build(MeRouterTable.PATH_ME_UI_DETAIL)
                    .navigation() as Fragment

        }
        fun navigateMeTestPage() {
            ARouter.getInstance().build(MeRouterTable.PATH_ME_UI_TEST)
                .withString("key1", "哈哈1")
                .withString("key2", "哈哈2")
                .navigation()

        }
    }
}