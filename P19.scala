object P19 extends App{

  def rotate(rotate_num: Int, ls:List[Any]) : List[_] = {
    var final_ls:List[_] = List()
    if(rotate_num<0){
      val temp_num = rotate_num * -1
      final_ls = ls.reverse.dropRight(ls.length-temp_num).reverse:::ls.dropRight(temp_num)
    }else if(rotate_num==0){
      final_ls = ls
    }else{
      final_ls=ls.reverse.dropRight(rotate_num).reverse:::ls.dropRight(ls.length-rotate_num)
    }

    final_ls
  }
  println(rotate(3,List('a,'b,'c,'d,'b,'k)))
  println(rotate(-2,List(1,2,3,4,5,6)))
}

