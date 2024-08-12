object Multiple{
      def main(args:Array[String]):Unit = {
           println("Enter the number you want:");

           var num = scala.io.StdIn.readInt().toInt;

            val output: Int => String = input =>
            if (input % 3 == 0 && input % 5 == 0) "Multiple of Both Three and Five"
            else if (input % 3 == 0) "Multiple of Three"
            else if (input % 5 == 0) "Multiple of Five"
            else "Not a Multiple of Three or Five"

            println(output(num))
      }
}