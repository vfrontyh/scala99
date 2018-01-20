object P15 extends App{

  def duplicateN(dup_num: Int, ls:List[Any]) : List[_] = {
    var final_ls : List[Any] = List()
    ls.foreach{
      x=>
        final_ls = final_ls:::List.fill(dup_num)(x)
    }
    println(final_ls)
    final_ls
  }
  duplicateN(3,List('a,'b,'c,'d,'b,'a))

}

