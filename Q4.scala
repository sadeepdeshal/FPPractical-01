package FP_Prac01

object Q4 {
  def main(args: Array[String]): Unit = {
    val temp = FinalPrice(60)
    println("Rs "+temp)
  }

  def FinalPrice(copies: Int): Double = {
    var shipping1:Double=0
    var shipping2:Double=0
    val price:Double=24.95
    val discount=0.4
    if(copies<=50 ){
      shipping1=copies*3
    }
    else{
      shipping1=50*3
      shipping2=(copies-50)*0.75

    }
    var FPrice=(shipping1+shipping2)+(price*(1-discount))*copies
    FPrice
  }
}
