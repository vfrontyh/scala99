object Questions extends App{

  def flatten (args : List[Any])  : List[Any] = args match{
    case Nil => { println("CASE 1 "); Nil }
    case (n:List[Any]) :: rest => { println("CASE 2 "); flatten(n) ::: flatten(rest) }
    case n :: rest => { println("CASE 3 "); n :: flatten(rest) }

    /*
        case n :: rest => if(n.instanceOf[Int]){
          n :: flatten(rest);
        }else if(n.instanceOf[List[Any]]){
          flatten(n.asInstanceOf[List[Any]]) ::: flatten(rest)
        }*/

  }



  println(flatten(List(1,List(2,3,4,5,List(3,4)))))



}

/*
def flatten (xs: List[Any]) : List[Any] = xs.head match {
  case x:List[_] => flatten(x) ::: flatten(xs.tail)
  case x => x :: flatten(xs.tail)
}
*/
