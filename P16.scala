object P16 extends App{

  def drop(drop_num: Int, ls:List[Any]) : List[_] = {
    var final_ls : List[Any] = List()
    var counter = 1
    if(drop_num==0)
      final_ls=ls.reverse
    else
      ls.foreach{
      x=>
        if(counter%drop_num!=0) {
          final_ls = x :: final_ls
        }
        counter+=1
      }
    println(final_ls.reverse)
    final_ls.reverse
  }
  drop(2,List('a,'b,'c,'d,'b,'a))

}

