import java.util.Scanner;
public  final class TV extends Electronics{
 Scanner sc=new  Scanner (System.in);
 
 public TV(String x){super(x);}
 
 
 public void vat(){}
  public void offer(){}
 void mathod1(){super.m1(n);}
   
 void cn(){System.out.println("1:Sony\n2:LG\n3:Vizio");
   int n=sc.nextInt();
   if(n==1){ int n11=28500,n12=46800,n13=66000;
          System.out.println("Which one u like to buy \n1:Sony 32' \nprice:28,500\n\n2:Sony 55'\n price46,800\n\n3:Sony 80'\nprice66,000");
            int m1=sc.nextInt();
            System.out.println("please pay the bill");
             int b1=sc.nextInt();
              if(m1==1){buy(b1,n11);}            
             else if(m1==2){buy(b1,n12);}           
             else if(m1==3){buy(b1,n13);} 
             else {System.out.println("Wrong input");} }
   if(n==2){int n21=28500,n22=48800,n23=70000;
           System.out.println("Which one u like to buy \n1:lG 32'\nprice:28,500\n\n2:LG 52'\n price48,800\n\n3:LG 80'\nprice70,000");
            int m2=sc.nextInt();
            System.out.println("please pay the bill");
             int b2=sc.nextInt();
             if(m2==1){buy(b2,n21);}            
             else if(m2==2){buy(b2,n22);}           
             else if(m2==3){buy(b2,n23);} 
             else {System.out.println("Wrong input");}    }
   
   if(n==3){int n31=45500,n32=64800,n33=75000;
             System.out.println("Which one u like to buy \n1:Vizio 32'\nprice:45,500\n\n2:Vizio 55'\n price64,800\n\n3:Vizio 80'\nprice:75,000");
            int m3=sc.nextInt();
            System.out.println("please pay the bill here");
            int b3=sc.nextInt();
             if(m3==1){buy(b3,n31);}            
             else  if(m3==2){buy(b3,n32);}           
             else if(m3==3){buy(b3,n33);}
             else {System.out.println("Wrong input");}  }
 
 } 


}