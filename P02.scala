object Questions2 extends App{

  def penultimate(ls : List[_]) : Any = {
   // When list is empty, not sure what to return.. I just return null..
    if(ls.length<2) return null
    else return ls.reverse.tail.head

  }

  println(penultimate(List(1,3,5,25,1)))



}
