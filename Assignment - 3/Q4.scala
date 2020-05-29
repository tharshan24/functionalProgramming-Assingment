import scala.io.StdIn.readInt

object Q4{
    
    def even(n:Int):Int=
    {
        if(n==0)
            return 1
        else if(n==1)
            return 0
        else if(n<0)
            return even(-n)
        else
            return even(n-2)    
    }


    def main(args: Array[String])
    {
        printf("Enter Number : ")
        var number = readInt()
        do
        {
            if(even(number)==1)
                printf("Even Number")
            else
                printf("Odd Number")
            printf("\n\nEnter Number (-1 to exit) : ")
            number = readInt()
        }while(number!=(-1))
        
    }
}