object Ceaserciper{
      def Encryption(text:String,shift:Int):String = {
           
           text.map(char => {
               if (char.isLetter){
                    var begin = if (char.isUpper) 'A' else 'a'
                    ((char-begin+shift)%26 + begin).toChar;
               }else{
                    char
               }
               
           })

      }
      def Decryption(text:String,shift:Int):String = {
           Encryption(text,-shift);
      }

      def main(args:Array[String]):Unit = {
           println("Enter number you want:\n1.Encryption \n2.Decryption");
           var decision = scala.io.StdIn.readLine().toInt;
           if(decision == 1){
               println("Enter your text:");
               var text = scala.io.StdIn.readLine();
               println("Enter Shift:");
               var shift = scala.io.StdIn.readInt();
               var output = Encryption(text,shift);
               println(output);
           }else if(decision == 2){
               println("Enter your encrypted text:");
               var text = scala.io.StdIn.readLine();
               println("Enter Shift:");
               var shift = scala.io.StdIn.readInt();
               var output = Decryption(text,shift);
               println(output);
           }else{
               println("Enter valid number.");
           }
      }
}