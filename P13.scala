object P13 extends App{

  import scala.collection.mutable.ListBuffer

  def encodeDirect(args : List[Any]) : List[Any] = {
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

    var final_ls:List[Any] = List()

    packed_list.reverse.foreach { x =>
      final_ls= (x.length, x(0)) :: final_ls
    }
    println(final_ls.reverse)
    final_ls.reverse



  }
  encodeDirect(List('a,'a,'a,'b,'c,'d,'d))
  encodeDirect(Nil)
}