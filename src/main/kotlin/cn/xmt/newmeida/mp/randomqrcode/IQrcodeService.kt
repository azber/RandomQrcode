package cn.xmt.newmeida.mp.randomqrcode

interface IQrcodeService {

    fun getQrcode(user_id: String): String

    fun qrcodeCache(): List<Qrcode>
}