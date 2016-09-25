

class Myclass {
    private var value = 0
    
    def incr()
    {
      value+=1
    }
  
    def curr() = value+1+2+3
 
}

object My_cls_test{
   def main(args: Array[String]): Unit = {
     var al:Myclass = new Myclass()
     al.incr()
     al.incr()
     print (al.curr)
   }
}

