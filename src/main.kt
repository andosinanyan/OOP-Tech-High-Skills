import java.util.*

fun main(){
    var human1 = createAHuman()
    var human2 = createAHuman()

}


fun createAHuman() : Human{
    val scanner = Scanner(System.`in`)

    println("Greq dzer anun@")
    val name: String = scanner.next()
    println("Greq dzer azganun@")
    val surname: String = scanner.next()
    println("Greq dzer tariqy@")
    val age: Int = scanner.nextInt()
    println("Greq dzer azgutyun@")
    val nationality = scanner.next()

    return Student(name,surname,age,nationality,"management",4,"UFAR",18)
}