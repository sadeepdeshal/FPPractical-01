package FP_Prac01

object Q1 {
  def main(args:Array[String]): Unit = {
    val temp=DiskArea(5)
    println("Area of the Disk="+temp)
  }

  def DiskArea(radius:Int):Double= {
    math.Pi*radius*radius
  }
}
