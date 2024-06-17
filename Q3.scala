package FP_Prac01

object Q3 {
  def main(args: Array[String]): Unit = {
    val temp = SphereVolume(5)
    println("Volume of a sphere=" + temp)
  }

  def SphereVolume(radius: Int): Double = {
    (math.Pi * radius * radius * radius) * 4/3
  }
}
