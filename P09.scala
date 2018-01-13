object P09 extends App{

  import scala.collection.mutable.ListBuffer

  def pack(args : List[Any]) : List[Any] = {
    var last_symbol:Any = null
    var packed_list:List[List[Any]] = List()
    var symbolBuffer = new ListBuffer[Any]()
  //  var list:List[Symbol] = Nil


    for(i<-0 until args.length){

      if(last_symbol==args(i))
        symbolBuffer+=args(i)
      else {
        if (last_symbol != null) {
          packed_list = symbolBuffer.toList :: packed_list
          symbolBuffer.clear()
        }
        symbolBuffer += args(i)
      }
      last_symbol=args(i)

      if(i==args.length-1) {
       packed_list = symbolBuffer.toList :: packed_list
      }
    }

  println(packed_list.reverse)
  return packed_list.reverse

}
  pack(List('a,'a,'a,'b,'c,'d,'d))
  pack(Nil)
}