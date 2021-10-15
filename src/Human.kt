class Human(val name: String, val surname: String, val age: Int, val nationality: String) {
   init{
       println("Barev im anun@ $name ev azganuns ${surname}e\nEs ${age}-tarekan em")
       if(age < 50){
           println("es partadir kutakayin toshaki esim inch unem")
       }
   }
}