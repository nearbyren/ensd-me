package ejiayou.order.module

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import ejiayou.common.module.base.BaseAppBVMFragment
import ejiayou.me.export.router.MeRouterTable
import ejiayou.me.module.R
import ejiayou.me.module.databinding.MeFragmentBinding

/**
 * @author:
 * @created on: 2022/7/21 10:29
 * @description:
 */
@Route(path = MeRouterTable.PATH_ME_UI_DETAIL)
class MeFragment : BaseAppBVMFragment<MeFragmentBinding, MeViewModel>() {

    override fun layoutRes(): Int {
        return R.layout.me_fragment
    }

    override fun layoutView(): View? {
        return null
    }

    override fun layoutViewGroup(): ViewGroup? {
        return null
    }

    override fun createViewModel(): MeViewModel {
        return MeViewModel()
    }

    override fun initialize(savedInstanceState: Bundle?) {
    }

}