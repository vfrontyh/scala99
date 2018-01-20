object Questions3 extends App{


  def nth(pos: Int,ls : List[Any]) : Any = {
    if(ls.length<pos+1) throw new NoSuchElementException
    else ls.take(pos+1).reverse.head
  }



  println(nth(2,List(1,3,5,25,1)))
  println(nth(1,List(1,2,3,5,6,66)))

}