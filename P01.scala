object P01 extends App{

  def last(ls : List[_]) : Any = ls match{
   // When list is empty, not sure what to return.. I just return null..
    case Nil => return null
    case _ => return ls.reverse.head


  }

  println(last(List(1,2,3,54,3)))



}
