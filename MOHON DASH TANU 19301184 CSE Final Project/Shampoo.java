import java.util.Scanner ;
public class Shampoo extends Beautyproducts{
  private  String n="Shampoo";
 Scanner sc=new Scanner (System.in);
 public  void offer(){}
 public void vat(){} 
 void mathod1(){super.m1(n);}
   
   String getname(){return n;}
   void cn(){System.out.println("1:Sunslik\n2:Clear\n3:L'Orel paris");
   int n=sc.nextInt();
   if(n==1){ int n11=3,n12=150,n13=250;
          System.out.println("Which one u like to buy \n1:Sunslik minipack \nprice:3TK\n\n2:Sunslik 100ml bottle\nprice:150TK\n\n3:Sunslik 200ml bottle\nprice250Tk");
            int m1=sc.nextInt();
            System.out.println("please pay the bill");
             int b1=sc.nextInt();
             if(m1==1){buy(b1,n11);}  else if(m1==2){buy(b1,n12);} else if(m1==3){buy(b1,n13);} else {System.out.println("Wrong input");}
   }
   if(n==2){int n21=5,n22=200,n23=350;
           System.out.println("Which one u like to buy \n1:Clear minipack \nprice:5TK\n\n2:Clear 100mlbottle \n price:200\n\n3:Clear 200ml bottle\nprice:350TK");
            int m2=sc.nextInt();
            System.out.println("please pay the bill");
             int b2=sc.nextInt();
              if(m2==1){buy(b2,n21);}            
            else if(m2==2){buy(b2,n22);}           
            else if(m2==3){buy(b2,n23);} else {System.out.println("Wrong input");}}
   
   if(n==3){int n31=350,n32=600,n33=999;
             System.out.println("Which one u like to buy \n1:L'Orel paris 100gm bottle\nprice:350Tk\n\n2:L'Orel paris 200gm bottle\n price:600TK\n\n3:L'Orel paris shampoo+all in one\nprice:999TK");
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