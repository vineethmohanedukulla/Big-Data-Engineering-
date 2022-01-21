val  nums = Array(-3,-5,-22,52,96,789,6369)

for(x <- nums if x >0) yield x*x

val msg = "hi my name is venu@gmail.com and your mail is satya@gmail.com and test@gmail.com"

msg.split(" ")

val emails = {for(x <- msg.split(" ") if x.contains("@")) yield x}

emails

val nums = 1 to 100 toArray

def isPrime(x : Int) =
  (x>1) && !(2 to scala.math.sqrt(x).toInt).exists(y=>x%y == 0)

isPrime(5)

def isEven(x:Int) = x%2==0

isEven(7)

scala.math.sqrt(9)

for(x <- nums) yield x match {
  case x if(x % 2 == 0) => x*x
  case x if(x %2!=0) => x*x*x
  case x if(isPrime(x)) => scala.math.sqrt(x)
}


