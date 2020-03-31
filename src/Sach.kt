open class DSach(private  var SL:Int = 1){
    var ListSach = arrayListOf<SinhVien>()

    fun muonSach(sinhVien: SinhVien) {
        if(SL>0){
            ListSach.add(sinhVien)
//            SL = SL - 1
            println("${sinhVien.Name} vua muon sach ")
        }
        else{
            println("Khong muon duoc sach!")
        }
    }
    fun getSL(): Int{
        return  SL
    }
    fun setSL(){
       SL--
    }
}

class Sach( val Name :String, val ChuDe:String, val MaSo: Int, SL:Int = 1):DSach(SL)