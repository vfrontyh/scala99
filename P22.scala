object P22 extends App{

  def range(start_num:Int, end_num:Int) : (List[_]) = {

    Range(start_num,end_num+1).toList
  }


  println(range(5,7))
}

