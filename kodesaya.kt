class Animal(private var name:String, var berat:Double, var umur:Int){
    
    fun getName(): String {
        return name
    }
    
    fun setName(newName: String){
        name = newName
    }
    
    fun play(){
        println("$name sedang bermain bola")
    }
}

fun main() {
//     Panggil sebuah objek Animal
    val peliharaan = Animal("Kucing", 24.0, 3)
    
    println("Saya punya hewan peliharaan ${peliharaan.getName()}")
//     setter
    peliharaan.setName("Kelinci")
	println("Saya punya hewan peliharaan ${peliharaan.getName()}")


    
}