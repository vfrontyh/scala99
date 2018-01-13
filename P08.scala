object P08 extends App{

  import scala.collection.mutable.ListBuffer

  def compress(args : List[Symbol]) : List[Symbol] = {
    var last_symbol:Symbol = null
    var symbolBuffer = new ListBuffer[Symbol]()
  //  var list:List[Symbol] = Nil
    for(i<-0 until args.length){
      if(last_symbol!=args(i))
        symbolBuffer+=args(i)

        last_symbol=args(i)
  }

  val list:List[Symbol] = symbolBuffer.toList
  println(list)
  return list

}
compress(List('a,'b,'b,'b,'c,'c,'c,'a,'b))
compress(Nil)
}