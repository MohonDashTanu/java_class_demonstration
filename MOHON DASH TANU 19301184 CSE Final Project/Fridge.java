import java.util.Scanner;
public final class Fridge extends Electronics implements offer{
 Scanner sc=new Scanner (System.in);
public Fridge(String x){super(x);}
 public  void offer(){}
 public void vat(){}

  void mathod1(){super.m1(n);}

void cn(){System.out.println("1:walton\n2:LG\n3:Samsung");
   int n=sc.nextInt();
   if(n==1){ int n11=28500,n12=48800,n13=60000;
             System.out.println("Which one u like to buy \n1:walton Small fridge \nprice:28,500\n\n2:walton medium fridge\n price48,800\n\n3:walton large fridge\nprice60,000");
             int m1=sc.nextInt();
             System.out.println("please pay the bill");
             int b1=sc.nextInt();
             if(m1==1){buy(b1,n11);}            
             else if(m1==2){buy(b1,n12);}           
             else if(m1==3){buy(b1,n13);}
             else {System.out.println("Wrong input");}    }
   if(n==2){int n21=30500,n22=58800,n23=70000;
           System.out.println("Which one u like to buy \n1:LG small fridge \nprice:30,500\n\n2:LG medium fridge   \nprice58,800\n\n3:LG large fridge \nprice70,000");
            int m2=sc.nextInt();
            System.out.println("please pay the bill");
             int b2=sc.nextInt();
             if(m2==1){buy(b2,n21);}            
             else if(m2==2){buy(b2,n22);}           
             else if(m2==3){buy(b2,n23);} 
             else {System.out.println("Wrong input");}     }
   
   if(n==3){int n31=35500,n32=44800,n33=60000;
            System.out.println("Which one u like to buy \n1:Samnsung small fridge \nprice:35,500\n\n2: Samnsung medium fridge\n price44,800\n\n3:Samnsung small fridge\npric\n60,000");
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