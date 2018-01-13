object Hey extends App{
  val ms = Map(1->"a", 2->"b", 3->"c")
  val ks = Map(2->"c", 3->"d")
  val ts = List(2,3,4)
  println(ms contains(1))
  println(ms)
  println(ms--ts)


  println(ms.keys)
  println(ms.keySet)
  println(ms.keysIterator)


  println(ms.values)

  // key에 대해서 필터
  println(ms filterKeys (_ < 2))

  // value에 대해서 필터
  println(ms mapValues (_.length()==1))

  val mms = scala.collection.mutable.Map(1->"a", 2->"b", 3->"c")
  mms(1) = "c"

  println(mms put (3,"d"))
  println(mms)

  // 있으면 반환 없으면 업데이트
  println(mms getOrElseUpdate(2,"b"))
  println(mms getOrElseUpdate(5,"d"))

  println(mms)


  mms -= 1
  println(mms)

  // map의 각 키 값에 맞는 값들을 제거한다.
  //mms-=(2,5,3)
  //println(mms)


  // key List로 제거 가능
  //mms --= List(1,2,3,4,5)
  //println(mms)

  //mms remove 3
  //println(mms)
  //
  //mms.retain()

  //mms.clear()
  //println(mms)


  mms retain((k,v) => k>2)
  println(mms)
  mms transform((k,v) => v.replace("d","yohan"))
  println(mms)

  var yodol = scala.collection.mutable.Map(1->"c")
  yodol = mms.clone()

  println(yodol)

  val c = Map("1"->1, "2"->2)
  println(c filterKeys Set("1"))


  def fibFrom(a: Int, b: Int) : Stream[Int] =
    a #:: fibFrom(b, a+b)


  val fibs = fibFrom(1,1).take(100)

  println(fibs.toList)
}
