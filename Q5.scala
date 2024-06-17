package FP_Prac01

object Q5 {
  def main(args: Array[String]): Unit = {
    var temp=TotalTime()
    println("Total minutes = "+temp)
  }

  def TotalTime(): Int = {
    var EasypaceTime=8
    var TempoTime=7
    var EasyDistance1=2
    var EasyDistance2=2
    var TempoDistance=3

    var TotalMinutes=((EasyDistance1+EasyDistance2)*EasypaceTime) + TempoDistance*TempoTime
    TotalMinutes
  }
}
