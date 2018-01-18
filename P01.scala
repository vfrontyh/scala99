object Questions1 extends App{

  def last(ls : List[_]) : Any = {
    return ls.reverse.head

  }

  println(last(List(1,2,3,4,5,6,2,1,2)))



}
