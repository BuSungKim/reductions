package reductions

import java.util.concurrent._
import scala.collection._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import common._

import ParallelParenthesesBalancing._

@RunWith(classOf[JUnitRunner])
class ParallelParenthesesBalancingSuite extends FunSuite {

  test("balance should work for empty string") {
    def check(input: String, expected: Boolean) =
<<<<<<< HEAD
      assert(balance(input.toArray) == expected,
=======
      assert(parBalance(input.toArray, 4) == expected,
>>>>>>> 9959ec817f9e76adb3228dacf739fde409ce4d8a
        s"balance($input) should be $expected")

    check("", true)
  }

  test("balance should work for string of length 1") {
    def check(input: String, expected: Boolean) =
<<<<<<< HEAD
      assert(balance(input.toArray) == expected,
        s"balance($input) should be $expected")

    check("(", false)
    check(")", false)
=======
      assert(parBalance(input.toArray, 4) == expected,
        s"balance($input) should be $expected")

    check("((((((((((((((((((((((", false)
    check("))))))))))))", false)
>>>>>>> 9959ec817f9e76adb3228dacf739fde409ce4d8a
    check(".", true)
  }

  test("balance should work for string of length 2") {
    def check(input: String, expected: Boolean) =
<<<<<<< HEAD
      assert(parBalance(input.toArray, 1) == expected,
        s"balance($input) should be $expected")

    check("()", true)
    check(")(", false)
=======
      assert(parBalance(input.toArray, 4) == expected,
        s"balance($input) should be $expected")

    check("()()()()()()()()", true)
    check(")()()()()()(((((((()))))))))))))", false)
>>>>>>> 9959ec817f9e76adb3228dacf739fde409ce4d8a
    check("((", false)
    check("))", false)
    check(".)", false)
    check(".(", false)
    check("(.", false)
    check(").", false)
  }


}