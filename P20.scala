//object P20 extends App{
//
//  def removeAt(remove_num: Int, ls:List[Any]) : (List[_], Any) = {
//
//    ls.foldLeft(List[Any])((r,c)=>)
////    (ls.take(remove_num)++ls.reverse.dropRight(remove_num+1).reverse, ls.reverse.dropRight(remove_num).reverse.take(1)(0))
//  }
//
//
//  println(List(1,2,3,4,5).foldLeft(List[Int]())((r,c) => if(c>3) {r:::List(c)} else {r}))
//  println(List(1,2,3,4,5).foldRight(List[Int]())((r,c) => r::c))
//
//
//}

object P20 extends App{

  def removeAt(remove_num: Int, ls:List[Any]) : (List[_], Any) = {
    (ls.take(remove_num)++ls.reverse.dropRight(remove_num+1).reverse, ls.reverse.dropRight(remove_num).reverse.take(1)(0))
  }

  println(removeAt(3,List(1,2,3,4,5,6)))
  println(removeAt(2,List('a,'b,'c,'d)))

}
