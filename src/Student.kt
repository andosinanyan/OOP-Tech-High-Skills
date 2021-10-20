class Student(name: String, surname: String, age: Int, nationality: String,
              var faculty: String, var year: Int, var university: String) : Human(name,surname,age, nationality) {

                  init {
                      humanColor
                      println(name + this.surname);
                      math(15,98)
                      println("hELLO ");
                  }

    constructor(name: String, surname: String, age: Int, nationality: String,
                 faculty: String, year: Int, university: String, knowlage: Int) : this(name, surname, age, nationality,
                                                                                        faculty, year, university){
                     println("Secondary");
                 }

    override fun math(a: Int, b: Int): Int {
        var a = super.math(a, b)
        return a * (a + b);
    }


}