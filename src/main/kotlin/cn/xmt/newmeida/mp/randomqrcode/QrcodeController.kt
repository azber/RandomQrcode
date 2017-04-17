package cn.xmt.newmeida.mp.randomqrcode

import me.chanjar.weixin.mp.api.WxMpService
import org.springframework.stereotype.Controller


@Controller
open class QrcodeController(var qrcodeService: IQrcodeService,
                            var wxMpService: WxMpService) {

    fun getQrcode(): String {

        wxMpService.oauth2getAccessToken()

        wxMpService.oauth2getUserInfo()
        qrcodeService.getQrcode()
    }
}