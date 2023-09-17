public abstract class Electronics extends Supershop implements offer{
 protected String  n;
 public Electronics(){}
 public Electronics(String x){n=x;}
 public  void offer(int a){discount(a);}
 public void vat(int a){if(a>50000)System.out.println("you have to pay 5,000TK vat!!!!");}
 abstract void mathod1();
 
 void m1(String x){c++;
 System.out.println("which comapany "+n+" you want?(just press the numbers)");
 cn();
 }
 String getname(){return n; }
 void cn(){} 
 
 void buy(){}
  void buy(int x,int y)
  { offer(y); vat(y);
   {if(x==y){System.out.println("Thank you");} if(x>y){System.out.println("Here is your "+(x-y)+"TK\nThank u");} if(x<y){System.out.println("please pay "+(y-x)+"TK more \nThank you");} }
              System.out.println("total visitors: "+c);
  }
  
  void discount(int a){
    if(a>50000){System.out.println("congratulations u have got 5,000TK Discount!!!");}
  }

 }