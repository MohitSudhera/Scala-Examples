

class area {
  
  private var l = 0;
  private var b = 0;
  
     def valu ()
     {
       l = 10;
       b = 20;
     }  
     
     def curr ():Int = {l*b} // Use curly brackets or not, upto you 
}

object My_cls_test{
   def main(args: Array[String]):Unit = {
     var al:area = new area()
     al.valu()
  
     print (al.curr)
   }
}