object P14 extends App{

  def duplicate(ls:List[Any]) : List[_] = {
    var final_ls : List[Any] = List()
    ls.foreach{
      x=>
        final_ls = final_ls:::List.fill(2)(x)
    }
    println(final_ls)
    final_ls
  }
  duplicate(List('a,'b,'c,'d,'b,'a))

}

