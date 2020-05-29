import scala.io.StdIn.readInt

object Q5{
    
    def sum(n:Int):Int=
    {
        if (n<=0)    
            return 0

        if(n%2==1)
           return sum(n-1)
        
        return n+sum(n-2)
        
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