import java.util.Scanner;
public final class Vagetables extends Food{
Scanner sc=new Scanner (System.in);
 private String n="Vagetables";
  
   void mathod1(){super.m1(n);}
   
   String getname(){return n;}
   void cn(){System.out.println("1:Potato\n2:Onion\n3:Vendi");
   int n=sc.nextInt();
   if(n==1){ int n11=25,n12=60,n13=90;
          System.out.println("Which one u like to buy \n1:Potato 1KG \nprice:25TK\n\n2:Potato 3KG\nprice:60TK\n\n3:Potato 5KG\nprice:90Tk");
            int m1=sc.nextInt();
            System.out.println("please pay the bill");
             int b1=sc.nextInt();
             if(m1==1){buy(b1,n11);}  else if(m1==2){buy(b1,n12);} else if(m1==3){buy(b1,n13);} else {System.out.println("Wrong input");}
   }
   if(n==2){int n21=250,n22=400,n23=600;
           System.out.println("Which one u like to buy \n1:Onion 1KG \nprice:250TK\n\n2:Onion 2KG\n price:400\n\n3:Onion 3KG\nprice:600TK");
            int m2=sc.nextInt();
            System.out.println("please pay the bill");
             int b2=sc.nextInt();
              if(m2==1){buy(b2,n21);}            
            else if(m2==2){buy(b2,n22);}           
            else if(m2==3){buy(b2,n23);} else {System.out.println("Wrong input");}}
   
   if(n==3){int n31=30,n32=50,n33=70;
             System.out.println("Which one u like to buy \n1:Vendi 1KG\nprice:30Tk\n\n2:Vendi 2KG\n price:50TK\n\n3:Vendi 3KG\nprice:70TK");
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