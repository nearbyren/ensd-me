package ejiayou.me.export.router.service

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

/**
 * @author: lr
 * @created on: 2022/7/16 4:03 下午
 * @description: 对外暴露服务功能
 */
interface IPayService : IProvider {

    fun getStation(): Int

    override fun init(context: Context?)
}