import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
import math.{sqrt, pow}

object case_class{
    
    case class Point(a:Int,b:Int)
    {
        def x:Int=a
        def y:Int=b

        def add(p:Point)=Point(this.x+p.x,this.y+p.y) 
        def move(dx: Int,dy: Int)=Point(this.x+dx, this.y+dy) 
        def invert(p:Point)=Point(p.y,p.x) 
        def distance(p: Point): Double = {sqrt(pow(this.x-p.x,2) + pow(this.y-p.y,2) )}
    }

    def main(args: Array[String])
    {
        val p1= Point(1,2)
        val p2= Point(4,5)

        println("Point pl:"+" "+p1) 
        println("Point p2:"+" "+p2)

        val added=p1.add(p2)

        println("\nAddition of 2 given points :"+" "+added)

        val moved_p1=p1.move(5,5)

        println("\nNew moved Coordinates of Point p1 (+5,+5) :"+" "+moved_p1) 

        val dis=p1.distance(p2)

        println("\nDistance between Point p1 and Point p2 : "+dis)

        val inverted_p1=p1.invert(p1) 

        println("\nInversion of Point p1:"+" "+inverted_p1) 
        
        
        
    }
}