import java.util.Scanner;
public class Simple_Pos_Machiene{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the amount the customer need to pay(Taka)");
    int bill = input.nextInt(); 
    System.out.println(" ");
    System.out.print("Enter the amount, customer gave(Taka)");
    int paid = input.nextInt(); 
    int due , back , note_100 , note_50 , note_20 , note_10 , coin_5, coin_2, coin_1 ;
    if(paid<=bill){
      if(paid==bill){
        System.out.println("Thank your bill is clear .");
      }
      else{
        due= bill - paid ;
        System.out.println("Please pay "+ due +" taka more.");
      }
      }
    else{
    back = paid - bill ;
    System.out.print("the returned amount is "+ back + " taka.");
    note_100 = back/100;
    back=back%100;
    note_50 = back/50;
    back=back%50;
    note_20 = back/20;
    back=back%20;
    note_10 = back/10;
    back=back%10;
    coin_5=back/5;
    back=back%5;
    coin_2=back/2;
    back=back%2;
    coin_1=back/1;
      
    System.out.println(" ");
    System.out.println(" 100 taka note: "+ note_100+ " \n 50 taka note: "+ note_50+" \n 20 taka note: "+ note_20+" \n 10 taka note: "+ note_10+" \n 5 taka coin : "+ coin_5+" \n 2 taka coin : "+ coin_2+" \n 1 taka coin : "+ coin_1);

    }
    
  }
}