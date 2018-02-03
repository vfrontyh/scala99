object P27 extends App{

  import P26.combinations

  def group3(ls: List[_]): List[List[List[_]]] = {


    //    val a = combinations(2, ls)
    //    for(i<-a) {
    //      val diff_ls = ls diff i
    //      val b = combinations(3,diff_ls)
    //      for(j<-b) {
    //        val c = diff_ls diff j
    //      }
    //    }

    for (
      a <- combinations(2, ls);
      diff_ls = ls diff a;
      b <- combinations(3, diff_ls)
    ) yield List(a, b, diff_ls diff b)

    //  combinations(2,ls)
  }
    def group(n: List[Int], ls:List[_]):List[List[List[_]]] = n match{

      case Nil => Nil
      case _ =>    for(
                      a<-combinations(n(0),ls);
                      diff_ls = ls diff a;
                      b<-combinations(n(1),diff_ls)
                    )yield List(a, b, diff_ls diff b)
  }

  println(group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))
  println(group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))
  println(group(Nil, List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))

}







