package tka_task;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.println("hello world by Anuradha Sonawane");
	}

}

//2.two variable cost_price and selling_price and calculating loss and profit
class Loss_profit_cal{
	int cost_price=100;
	int selling_price=150;
	float profit;
	float loss;
	//mrthod to calculate profiit
	void Profit_Loss() {
	if (selling_price > cost_price) {
        profit = selling_price - cost_price;
        System.out.println("Profit = " + profit);
    }
    else if (cost_price > selling_price) {
        loss = cost_price - selling_price;
        System.out.println("Loss = " + loss);
    }
    else {
        System.out.println("No Profit, No Loss");
    }
}
	public static void main(String[] args) {
		
		Loss_profit_cal o1=new Loss_profit_cal();
		o1.Profit_Loss();
		
	}
}


//3.WAP to cheak whether a number is even or odd
class Even_odd{
	int no=12;
	void cheak_even_odd() {
		if(no==1) {
			System.out.println("No is not odd and not even");
		}
		if (no%2==0) {
			System.out.println("number is Even");
		}
		else {
			System.out.println("number is odd");
		}
	}
public static void main(String[] args) {
		
	Even_odd e1=new Even_odd();
	e1.cheak_even_odd();
	}
}

//4.WAP to cheak whether a age is valid or not for voting?
class Vote{
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter age:");
 int age=sc.nextInt();
 
 void Cheak_Valid(){
	 if(age>=18) {
		 System.out.println("Valid age for Voting");
	 }
	 else {
		 System.out.println("Not eligibale for voiting");
	 }
 }
public static void main(String[] args) {
 Vote v=new Vote();
 v.Cheak_Valid();
}
}

//5.WAP word1 and word 2 are anagram or not?
class Anagram {
          public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
            System.out.print("Enter first word: ");
           String word1 = sc.nextLine();

              System.out.print("Enter second word: ");
               String word2 = sc.nextLine();
                 char[] a = word1.toLowerCase().toCharArray();
                char[] b = word2.toLowerCase().toCharArray();
           Arrays.sort(a);
           Arrays.sort(b);
         if (Arrays.equals(a, b)) {
            System.out.println("Words are Anagram");
        } else {
            System.out.println("Words are not Anagram");
        }
        sc.close();
 }
}

