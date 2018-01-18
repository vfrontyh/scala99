object P08 extends App{

  import scala.collection.mutable.ListBuffer

  def compress(args : List[Any]) : List[Any] = {
    var last_symbol:Any = null
    var symbolBuffer = new ListBuffer[Any]()
  //  var list:List[Symbol] = Nil
    for(i<-0 until args.length){
      if(last_symbol!=args(i))
        symbolBuffer+=args(i)

        last_symbol=args(i)
  }

  val list:List[Any] = symbolBuffer.toList
  println(list)
  return list

}
  compress(List(1,2,1,1,1,2,3,4))
  compress(Nil)
}