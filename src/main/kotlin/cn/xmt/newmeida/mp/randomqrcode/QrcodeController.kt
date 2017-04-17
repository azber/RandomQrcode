package cn.xmt.newmeida.mp.randomqrcode

import org.springframework.stereotype.Controller


@Controller
open class QrcodeController(var qrcodeService: IQrcodeService,
                            var wxMpService:WxMpService) {

    fun getQrcode():String {
        qrcodeService.getQrcode()
    }
}