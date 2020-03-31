fun main(){
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
}


