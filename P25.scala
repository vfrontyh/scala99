object P25 extends App{

  import P23.randomSelect
  def randomPermute(ls:List[_]) : List[_] = {

      randomSelect(ls.length,ls)



  }

  print(randomPermute(List('a,'b,'c,'d,'e,'f)))

}






