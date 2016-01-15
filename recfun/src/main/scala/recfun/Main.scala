package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1 
    else pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(res: Int, theL: List[Char]): Boolean = {
      if (res < 0) false
      else if (theL.isEmpty && res == 0) true
      else if (theL.isEmpty && res != 0) false
      else if (theL.head.equals('(')) loop(res+1, theL.tail)
      else if (theL.head.equals(')')) loop(res-1, theL.tail)
      else loop(res, theL.tail)
    }
   loop(0, chars) 
  }
  

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0) 0
    else if (money == 0) 1
    else if (coins.isEmpty) 0
    else countChange(money-coins.head, coins) + countChange(money, coins.tail)
  }
}
