class Basics {

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val firstNum:Int=1
    val secondNum:Int=2
    println(addInt(firstNum,secondNum))

    def addInt(firstNum:Int,secondNum:Int):Int={
            firstNum+secondNum
    }
  }

}
