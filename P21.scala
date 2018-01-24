object P21 extends App{

  def insertAt(insert_any: Any, pos:Int, ls:List[Any]) : (List[_]) = {

    val splitted_tuple = ls.splitAt(pos)
    splitted_tuple._1:::insert_any::splitted_tuple._2
  }


  println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
}

