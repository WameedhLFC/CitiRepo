package example

object patternMatching extends App {
    def newMatch (x: Int): Unit = {
        val number1 = x 
        number1 match {
            case s if (s >= 10 & s < 20) => println(s"$s is greater than 10 but less than 20")
            case s if (s >= 20) => println(s"$s i greater than 20")
            case _ => println("Not sure what the number is!!")
        }
    }
    newMatch (11)
}