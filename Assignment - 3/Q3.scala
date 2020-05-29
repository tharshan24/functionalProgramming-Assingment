import scala.io.StdIn.readInt

object Q3{
    
    def sum(n:Int):Int=
    {
        if (n<=0)    
            return 0
        
        return n+sum(n-1)
        
    }


    def main(args: Array[String])
    {
        printf("Enter Number : ")
        var number = readInt()
        do
        {
            printf("Sum is : %d",sum(number))
            printf("\n\nEnter Number (-1 to exit) : ")
            number = readInt()
        }while(number!=(-1))
        
    }
}