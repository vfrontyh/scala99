object P23 extends App{

  def randomSelect(num:Int, ls:List[_]) : List[_] = {

      if(num<=0){
        Nil
      }else{
        val (left_ls, selected) = removeAt(scala.util.Random.nextInt(ls.length), ls)
        selected::randomSelect(num-1,left_ls)
      }




  }


  def removeAt(remove_num: Int, ls:List[Any]) : (List[_], Any) = {
    (ls.take(remove_num)++ls.reverse.dropRight(remove_num+1).reverse, ls.reverse.dropRight(remove_num).reverse.take(1)(0))
  }

  print(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))

}






