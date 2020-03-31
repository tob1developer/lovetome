open class DSinhVien(private var SL:Int = 0 ){
    var DataSachMuon = arrayListOf<Sach>()
    fun addSachMuon(sach: Sach){
        if(sach.getSL()>0){
            DataSachMuon.add(sach)
            SL = SL +1
            sach.setSL()
            println("sach ban muon la ${sach.Name} so luong con lai la ${sach.getSL()}")
        }
        else{
            println("Sach da het xin vui long muon lai")
        }
    }
    fun getSL(): Int{
        return DataSachMuon.size
    }
    fun getListSach(){
        for(item in DataSachMuon){
            println("Ten sach muon: ${item.Name} , id sach:${item.MaSo} ")
        }
    }
}

class SinhVien(var Name: String, var MSV: Int, SL:Int = 0):DSinhVien(SL)
