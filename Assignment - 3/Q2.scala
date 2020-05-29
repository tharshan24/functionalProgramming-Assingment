import scala.io.StdIn.readInt

object Q2{
    
    def GCD(a:Int,b:Int):Int=b match
    {
        case 0 => a
        case x if x>a => GCD(x,a)
        case x => GCD(x,a%x)
    }

    def prime(p:Int,n:Int=1):Boolean= n match
    {
        case x if(x==p && x==1) => false
        case x if(x==p) => true
        case x if GCD(p,x)>1 => false
        case x => prime(p,x+1)
    }

    def primeSeq(s:Int, n:Int):Unit=
    {
        if (prime(s) && s<=n)    
            printf("%d ",s)
        if(s<=n) 
            primeSeq(s+1,n)
        
    }


    def main(args: Array[String])
    {
        printf("Enter Number : ")
        var number = readInt()
        do
        {
            primeSeq(2,number)
            printf("\n\nEnter Number (-1 to exit) : ")
            number = readInt()
        }while(number!=(-1))
        
    }
}