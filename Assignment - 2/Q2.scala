import scala.io.StdIn.readInt

object Q2{
    def findBest()={
        var best=0
        // val pps=500
        val p10=(10-3)*140
        val p15=(15-3)*120
        val p20=(20-3)*100

        if(p10>p15 && p10>p20)
        {
            best=10
        }
        else if(p15>p20)
        {
            best=15
        }
        else
        {
            best=20
        }

        printf("Best ticket price is : %d/=",best)
    }

    def main(args: Array[String])
    {
        findBest()
    }
}