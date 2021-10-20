open class Human(var name: String = "asa", val surname: String, val age: Int, val nationality: String) {
    var humanColor = "black"
   init{
       name = "poghos"
       println("Barev im anun@ $name ev azganuns ${surname}e\nEs ${age}-tarekan em")
       if(age < 50){
           println("es partadir kutakayin toshaki esim inch unem")
       }
   }

    open fun printMyName(){
        println(name)
    }

    open fun math(a : Int, b: Int): Int{
        return a + b;
    }
}