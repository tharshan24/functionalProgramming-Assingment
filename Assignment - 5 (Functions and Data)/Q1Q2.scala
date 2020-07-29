import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object Q1Q2{
    
    class Rational(x: Int, y: Int)
    {
        private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
        private def gcdf(a: Int, b:Int): Int =
        {
            var p=a
            var q=b

            if(p<0)
                p=p*(-1)
            if(q<0)
                q=q*(-1)
            return gcd(p,q)
        }
        private val g = gcdf(x, y)
        def numer = x / g
        def denom = y / g
        // def numer = x
        // def denom = y
        def sub(r:Rational) = new Rational(this.numer * r.denom - r.numer * this.denom, denom * r.denom)
        // def +(r:Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, denom * r.denom)
        // def mul(r: Rational) = new Rational(numer * r.numer, denom * r.denom)
        def neg = new Rational(-this.numer,this.denom)
        // def -(r:Rational) = this+r.neg
        def -(r:Rational) = this.sub(r)
        override def toString = numer + "/" + denom
    }

    def main(args: Array[String])
    {
        val x = new Rational(3,4)
        val y = new Rational(5,8)
        val z = new Rational(2,7)
        printf("\n\tNegation of x ( x.neg() ) : %s\n",x.neg.toString)
        printf("\n\tx-y-z : %s\n\n",(x-y-z).toString)
    }
}