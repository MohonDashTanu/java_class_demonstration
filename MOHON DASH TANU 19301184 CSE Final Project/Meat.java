import java.util.Scanner ;
public class Meat extends Food{
Scanner sc=new Scanner (System.in);

 private  String n="Meat";
 
  void mathod1(){super.m1(n);}
   
   String getname(){return n;}
   void cn(){System.out.println("1:Chicken\n2:Beef\n3:Goat");
   int n=sc.nextInt();
   if(n==1){ int n11=150,n12=280,n13=400;
          System.out.println("Which one u like to buy \n1:Chicken 1KG \nprice:150TK\n\n2:Chicken 2KG\nprice:280TK\n\n3:Chicken 3KG\nprice:400Tk");
            int m1=sc.nextInt();
            System.out.println("please pay the bill");
             int b1=sc.nextInt();
             if(m1==1){buy(b1,n11);}  else if(m1==2){buy(b1,n12);} else if(m1==3){buy(b1,n13);} else {System.out.println("Wrong input");}
   }
   if(n==2){int n21=500,n22=950,n23=1400;
           System.out.println("Which one u like to buy \n1:Beef 1KG \nprice:500TK\n\n2:Beef 2KG\n price:950\n\n3:Beef 3KG\nprice:1400TK");
            int m2=sc.nextInt();
            System.out.println("please pay the bill");
             int b2=sc.nextInt();
              if(m2==1){buy(b2,n21);}            
            else if(m2==2){buy(b2,n22);}           
            else if(m2==3){buy(b2,n23);} else {System.out.println("Wrong input");}}
   
   if(n==3){int n31=610,n32=1210,n33=1600;
             System.out.println("Which one u like to buy \n1:GoatMeat 1KG\nprice:610Tk\n\n2:GoatMeat 2KG\n price:1210TK\n\n3:GoatMeat 3KG\nprice:1600TK");
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