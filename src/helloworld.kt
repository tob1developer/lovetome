fun main(){
    data class person(var name:String, var age:Int, var phone : String)
    class NguoiIu(private var name: String, private var age: Int, private var phone: String)
    val Kiet: person = person("Ngo Tuan Kiet",20,"0336391269")
        //get
    println(Kiet.name)
    println(Kiet.age)
    println(Kiet.phone)
    println(Kiet)
    println(Kiet.component1())
    println(Kiet.component2())
    println(Kiet.component3())

        //set
    Kiet.name = "Love you du du du"
    println(Kiet.name)

        //private
    var banNaoDo: NguoiIu = NguoiIu(":v lam gi co",20,"nope")
    println(banNaoDo)

        //copy
    val betterKiet = Kiet.copy(name = "love you so much")
    println(betterKiet.name)
        //
}