object Q3{
    def wholeSale(copy:Int)={
        val price=24.95
        val discount=40.0
        val shippingCost=3.00
        val extraShippingCost=0.75
        var cost=((100.0-discount)/100.00)*price*copy
        if (copy>50)
        {
            cost=cost+((50*shippingCost)+((copy-50)*extraShippingCost))
        }
        else
        {
            cost=cost+(copy*shippingCost)
        }
        print(cost)
    }

    def main(args: Array[String])
    {
        wholeSale(60)
    }
}