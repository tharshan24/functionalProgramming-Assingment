import scala.io.StdIn.readInt

object Q6{
    
    def fib(n:Int):Int=
    {
        if (n <= 1) 
            return n
        return fib(n-1) + fib(n-2)
    }

    def fibSeq(s:Int, n:Int):Unit=
    {
        if(s<=n){
            printf("%d ",fib(s))
            fibSeq(s+1,n)
        }
        
    }


    def main(args: Array[String])
    {
        printf("Enter Number : ")
        var number = readInt()
        do
        {
            fibSeq(1,number)
            printf("\n\nEnter Number (-1 to exit) : ")
            number = readInt()
        }while(number!=(-1))
        
    }
}