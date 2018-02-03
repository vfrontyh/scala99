object P24 extends App{

  def lotto(pick_num:Int, max_num:Int) : List[Int] = {



    var index_set:Set[Int] = Set()

    while(index_set.toList.length<pick_num){
      val random_num = scala.util.Random.nextInt(max_num)+1
      if(!index_set.contains(random_num)) index_set+=random_num
    }

    index_set.toList


  }

  print(lotto(6,49))

}






