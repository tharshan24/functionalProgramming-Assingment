import scala.io.StdIn.readInt

object Q1{
    def salary(full:Int, overtime:Int)={
        var normal=full-overtime
        val pph=150
        val otPph=75
        val tax=10.0
        var takeHome=((normal*pph)+(overtime*otPph))*((100-tax)/100)
        
        printf("Take Home Salary : %.2f",takeHome)
    }

    def main(args: Array[String])
    {
        printf("Enter working hours : ")
        var all=readInt()
        printf("Enter overtime hours : ")
        var ot=readInt()
        salary(50,10)
    }
}