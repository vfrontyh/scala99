object P17 extends App{

  def split(split_num: Int, ls:List[Any]) : (List[_],List[_]) = {

    (ls.dropRight(ls.length-split_num),ls.reverse.dropRight(split_num).reverse)
  }
  println(split(2,List('a,'b,'c,'d,'b,'k)))

  println(split(0,List('a,'c,'d,'m,'k)))
}

