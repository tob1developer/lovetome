import com.google.gson.Gson
import java.net.URL

fun main(){
    println("BT_SO_1")
    var Huong = SinhVien("Huong",1)
    var Kiet = SinhVien("Kiet",2)
    var CTDL = Sach("CTDLGT","CNTT",111,2)
    var TKT = Sach("Toan Ki thuat","Toan chuyen nghanh",123,1)
    TKT.muonSach(Huong)
    Huong.addSachMuon(TKT)
    CTDL.muonSach(Huong)
    Huong.addSachMuon(CTDL)
    Huong.getListSach()
    println(Huong.getSL())

    println("BT_SO_2")

    val gson = Gson()
    val url = URL("https://corona.lmao.ninja/countries").readText()
    val data = gson.fromJson(url,Array<Corona>::class.java)
    for(x in 0 until data.size){
        if(data[x].Country == "Vietnam"){
            //val Country: String, val cases:Int, val todayCases:Int, val Deaths:Int,val TodayDeaths: Int, val recovered: Int)
            println("${data[x].Country} có ${data[x].Cases} dương tính với Corona, hôm nay có ${data[x].TodayCases} người bị nhiễm bệnh" +
                    " hiện tại có  ${data[x].Deaths} người tử vong vì Corona, ${data[x].TodayDeaths} người hôm nay tử vong " +
                    " số ca hồi phục là ${data[x].Recovered} người! ")
        }

    }

}


