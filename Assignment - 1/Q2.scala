object Q2{
    def volumeOfSphere(r:Double)={
        val v=(4.0/3.0)*math.Pi*r*r*r
        print(v)
    }

    def main(args: Array[String])
    {
        volumeOfSphere(5.0)
    }
}