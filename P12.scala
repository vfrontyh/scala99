object P12 extends App{

  def decode(ls:List[(Int,Any)]) : List[_] = {
    var final_ls : List[Any] = List()
    ls.foreach{
      x=>
        final_ls = final_ls:::List.fill(x._1)(x._2)
    }
    println(final_ls)
    final_ls
  }
  decode(List((1,'a),(5,'b),(4,'c)))

}