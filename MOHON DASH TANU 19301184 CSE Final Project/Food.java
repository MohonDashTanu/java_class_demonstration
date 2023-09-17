public abstract class Food extends Supershop{
   public String  n;

 abstract void mathod1();
 
 void m1(String x){c++;
 System.out.println("which kind of "+getname()+" you want(just press the numbers)");
 cn();
 }
 String getname(){return n; }
 void cn(){} 
 
  void buy(){}
  void buy(int x,int y)
  {
   {if(x==y){System.out.println("Thank you");} if(x>y){System.out.println("Here is your "+(x-y)+"TK\nThank u");} if(x<y){System.out.println("please pay "+(y-x)+"TK more \nThank you");} }
              System.out.println("total visitors: "+c);
  }

}