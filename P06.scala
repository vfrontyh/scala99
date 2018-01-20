object P06 extends App{
    def palindrome(ls : List[_]) : Boolean ={
      ls.reverse.equals(ls)
    }

    println(palindrome(List(1,2,3)))
    println(palindrome(List(1,2,3,2,1)))
    println(palindrome(Nil))


}