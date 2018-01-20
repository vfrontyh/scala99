object P18 extends App{

  def slice(first_ind: Int, second_ind:Int, ls:List[Any]) : List[_] = {

    ls.dropRight(ls.length-second_ind).reverse.dropRight(first_ind).reverse
  }
  println(slice(2,5,List('a,'b,'c,'d,'b,'k)))
  println(slice(1,2,List(1,2,3,4,5,6)))
}

