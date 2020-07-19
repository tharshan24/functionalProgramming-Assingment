import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object caesar_cipher{
    
    def decrypt(c:Char,key:Int)={
        ((c.toInt)-key).toChar
    }

    def encrypt(c:Char,key:Int)={
        ((c.toInt)+key).toChar
    }

    def main(args: Array[String])
    {
        var input=""
        var output=""
        printf("1 : Encryption\n2 : Decryption\nEnter Your Choice : ")
        var choice = readInt()
        do
        {
            if(choice==1)
            {
                input = readLine("Enter Text : ")
                output=input.map(encrypt(_,1))
                printf("\nEncrypted Text : %s",output)
            }
            else if(choice==2){
                input = readLine("Enter Text : ")
                output=input.map(decrypt(_,1))
                printf("\nDecrypted Text : %s",output)
            }
            printf("\n\n1 : Encryption\n2 : Decryption\nAny other values : Exit\nEnter Your Choice : ")
            choice = readInt()
        }while(choice == 1 || choice == 2)
    }
}