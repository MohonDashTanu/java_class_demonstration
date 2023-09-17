import java.util.Scanner;
public class testsupershop{
public static void main (String[]args)
{Scanner sc=new Scanner (System.in);
  
  Supershop s=new Supershop();
  
Electronics s11=new TV("TV");
Electronics s12= new Fridge("Fridge");
Electronics s13= new AC("AC");

Food f11=new Fruits();
Food f12= new Vagetables();
Food f13= new Meat();

Beautyproducts b11=new Shampoo();
Beautyproducts b12=new Cream();
Beautyproducts b13=new Perfume();

for(int i=0; ;i++){
System.out.println("\n\nWelcome to the shop.. :)\nwhat product you want?\npress 1 for Electronics\npress 2 for food items\npress 3 for Beatyproducts");
int x=sc.nextInt();
if(x==1){
  System.out.println("what kind of Electronics you want\npress 1 for TV\npress 2 for Fridge\npress 3 for AC");
  int y=sc.nextInt();
  if(y==1){s11.mathod1();}
  else if(y==2){s12.mathod1();}
  else if(y==3){s13.mathod1();}
  else {System.out.println("Sorry wrong input");}
  }
else if(x==2){
  System.out.println("what kind of Fooditems you want?\npress 1 for fruits \npress 2 for Vegetables \npress 3 for Meat ");
  int y=sc.nextInt();
  if(y==1){f11.mathod1();}
  else if(y==2){f12.mathod1();}
  else if(y==3){f13.mathod1();}
  else {System.out.println("Sorry wrong input");}
}
else if(x==3){
  System.out.println("what kind of beautyproducts you want?\npress 1 for Shampoo\npress 2 for Fairness cream\npress 3 for Perfume");
  int y=sc.nextInt();
  if(y==1){b11.mathod1();}
  else if(y==2){b12.mathod1();}
  else if(y==3){b13.mathod1();}
  else {System.out.println("Sorry wrong input");}
  }
else {System.out.println("Sorry wrong input");}

 }
}}