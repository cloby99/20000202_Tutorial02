object Tute_Q04 extends App{

  def Attendees(ticket:Int):Int= 120+(15-ticket)/5*20
  def Revenue(ticket:Int):Int= Attendees(ticket)*ticket
  def Cost(ticket:Int):Int = 500 + 3 * Attendees(ticket)
  def Profit (ticket:Int):Int = Revenue(ticket)-Cost(ticket)

  println("ticket prize:5, profit: " +Profit(5))
  println("ticket prize:10, profit: "+Profit(10))
  println("ticket prize:15, profit: "+Profit(15))
  println("ticket prize:20, profit: "+Profit(20))
  println("ticket prize:25, profit: "+Profit(25))
  println("ticket prize:30, profit: "+Profit(30))
  println("ticket prize:35, profit: "+Profit(35))
  println("ticket prize:40, profit: "+Profit(40))


}
