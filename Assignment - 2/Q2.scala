import scala.io.StdIn.readInt

object Q2{
    
    def attendees(price:Int):Int = 120+(15-price)/5*20

    def revenue(price:Int):Int = attendees(price)*price

    def cost(price:Int):Int = 500+attendees(price)

    def profit(price:Int):Int = revenue(price)- cost(price)

    def main(args: Array[String])
    {
        var price=0
        printf("Enter price : ")
        price = readInt()
        do
        {
            printf("The profit for %d is %d\n",price,profit(price))
            printf("Enter price (-1 to exit) : ")
            price = readInt()
        }while(price!=(-1))
        
    }
}