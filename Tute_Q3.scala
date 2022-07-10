object Tute_Q3 extends App{

  var n_hours:Int = 35
  var ot_hours:Int = 25

  def normal(n_hours:Int):Int=n_hours*250
  def OT(ot_hours:Int):Int=ot_hours*85
  def income(h1:Int,h2:Int):Int=normal(h1)+OT(h2)
  def tax(income:Int):Double=income*.12
  def takeHome(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2))

  println("Take home salary of the employee : Rs."+takeHome(n_hours,ot_hours))

}
