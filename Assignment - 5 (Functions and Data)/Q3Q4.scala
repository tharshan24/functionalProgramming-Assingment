import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object Q3Q4{
    
    class Account(id:String,n: Int, b: Double)
    {
        val nic:String=id
        val acnumber: Int = n
        var balance: Double = b

        def withdraw(a:Double) = this.balance=this.balance-a
        def deposit(a:Double) = this.balance=this.balance+a
        //transfering
        def transfer(a:Account,b:Double)= {
            this.withdraw(b)
            a.deposit(b)
        }

        override def toString = "["+nic+":"+acnumber +":"+ balance+"]"
    }


    def main(args: Array[String])
    {
        var w= new Account("123123123",9900,100.00)
        var r= new Account("235453454",1324,-100.00)
        var q= new Account("654756547",5456,5465.70)
        var e= new Account("546456565",7456,124635.00)
        var t= new Account("928392793",8467,5000.00)
        var y= new Account("000323124",5500,-1000.00)
        var u= new Account("234235266",9345,200000.00)

        var bank:List[Account]=List(q,w,e,r,t,y,u)

        val overdraft=(b:List[Account])=> b.filter(_.balance<0)

        val balance=(b:List[Account])=> b.map(_.balance).sum

        val interest=(b:List[Account])=>b.map(x=>(if(x.balance>0)x.balance*1.05 else x.balance*1.1))
        
        println("\n\tNegative balance Accounts : "+overdraft(bank))
        println("\n\tTotal balance of Accounts : "+balance(bank))
        println("\n\tTotal balance of Accounts with Interest : "+interest(bank))


    }
}