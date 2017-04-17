package cn.xmt.newmeida.mp.randomqrcode

import org.springframework.stereotype.Service
import javax.xml.ws.ServiceMode

@Service
open class QrcodeService : IQrcodeService {
    override fun getQrcode(user_id: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun qrcodeCache(): List<Qrcode> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}