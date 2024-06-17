package FP_Prac01

object Q2 {
  def main(args: Array[String]): Unit = {
    val temp=TempConversion(35)
    println("Temperature in Fahrenheit=" + temp)
  }

  def TempConversion(cel: Int): Double = {
    cel * 1.8000 + 32.00
  }
}
