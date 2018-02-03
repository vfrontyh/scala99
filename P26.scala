object P26 extends App{

  def combinations(num:Int, ls:List[_]) : List[List[_]] = {

    ls.toSet[Any].subsets.map(_.toList).toList.filter(_.length==num)

  }
  print(combinations(3,List(1,2,3,1,1,1,1,4)))

}






