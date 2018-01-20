object P11 extends App{

  import scala.collection.mutable.ListBuffer

  def encodeModified(ls : List[_]) : List[_] = {
    var final_ls:List[Any] = List()

    val lss = pack(ls)
    lss.foreach { x =>
      val len = x.length
      if(len!=1)
       final_ls= (x.length, x(0)) :: final_ls
      else
        final_ls =x(0)::final_ls

    }
    println(final_ls.reverse)
    final_ls.reverse

  }


  def pack(args : List[Any]) : List[List[Any]] = {
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


  packed_list.reverse

}
  encodeModified(List('a,'a,'a,'b,'c,'d,'d))

}