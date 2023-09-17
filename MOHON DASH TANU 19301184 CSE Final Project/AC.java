import java.util.Scanner ;
public final class AC extends Electronics {
  Scanner sc=new Scanner (System.in);

  public AC(String x){super(x);}
  public void offer(){}
 public void vat(){}
 
  
  void mathod1(){super.m1(n);}
   
  void cn(){System.out.println("1:walton\n2:LG\n3:Hitachi");
   int n=sc.nextInt();;
   if(n==1){ int n11=38500,n12=58800,n13=70000;
          System.out.println("Which one u like to buy \n1:walton ac 1.5 ton \nprice:38,500\n\n2:walton ac 2 ton\n price58,800\n\n3:walton ac3 ton\nprice70,000");
            int m1=sc.nextInt();
            System.out.println("please pay the bill");
             int b1=sc.nextInt();
             if(m1==1){buy(b1,n11);}  else if(m1==2){buy(b1,n12);} else if(m1==3){buy(b1,n13);} else {System.out.println("Wrong input");}
   }
   if(n==2){int n21=48500,n22=68800,n23=80000;
           System.out.println("Which one u like to buy \n1:lG ac 1.5 ton \nprice:48,500\n\n2:LG ac 2 ton\n price68,800\n\n3:LG ac3 ton\nprice80,000");
            int m2=sc.nextInt();
            System.out.println("please pay the bill");
             int b2=sc.nextInt();
              if(m2==1){buy(b2,n21);}            
            else if(m2==2){buy(b2,n22);}           
            else if(m2==3){buy(b2,n23);} else {System.out.println("Wrong input");}}
   
   if(n==3){int n31=45500,n32=64800,n33=75000;
             System.out.println("Which one u like to buy \n1:Hitachi ac 1.5 ton \nprice:45,500\n\n2:Hitachi ac 2 ton\n price64,800\n\n3:Hitachi ac3 ton\npric\n75,000");
            int m3=sc.nextInt();
            System.out.println("please pay the bill here");
            int b3=sc.nextInt();
             if(m3==1){buy(b3,n31);}            
             else if(m3==2){buy(b3,n32);}           
              else if(m3==3){buy(b3,n33);}
               else {System.out.println("Wrong input");}
   }
    
   
 
 }

}