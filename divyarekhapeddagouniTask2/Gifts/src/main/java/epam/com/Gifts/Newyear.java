package epam.com.Gifts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Newyear {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        List<Sweet> ls = new ArrayList<Sweet>();
	        
	ls.add(new Gulabjamun("BreadgualbJamun",50,10.2f,20));
	ls.add(new Gulabjamun("Kala Jamun",80,10.5f,20));
	ls.add(new Gulabjamun("Gulab Jamun Desert",100,8.5f,25));
	ls.add(new Candy("cadbury",80,10.2f,10));
	ls.add(new Candy("Fazar",90,10.2f,10));
	ls.add(new Candy("Nestle",90,15.2f,10));
	ls.add(new DairyMilk("DairyMilk silk",70,5.1f,25));
	ls.add(new DairyMilk("DairyMilk Bouble",90,5.1f,20));
	ls.add(new DairyMilk("DairyMilk oreo",100,5.1f,30));
	        List<Sweet> dairymilk = new ArrayList<Sweet>();
	        float totalWeight = 0;
	        for(Sweet s: ls)
	            totalWeight+=s.weight;
	        System.out.println("\nTotal Weight of the Gift is : "+totalWeight);
	        for(Sweet s: ls){
	            if(s instanceof DairyMilk)
	                dairymilk.add(s);
	        }
	        System.out.println("\n sorting......\n");
	        System.out.println("Enter your choice to sort based on :\n");
	        System.out.println("1.Cost\n2.Weight\n3.Content\n");
	        int op = sc.nextInt();
	        if(op == 1)Collections.sort(dairymilk,new Bycost());
	        else if(op == 2)Collections.sort(dairymilk,new Byweight());
	        else Collections.sort(dairymilk,new Bycontent());
	        System.out.println("Chocolates Present in the Gift:");
	for(Sweet s:dairymilk){
	System.out.println(s.name+" "+s.cost+" "+s.weight+" "+s.content);
	}
	System.out.println("Do you Want List of candies(y/n)");
	char c=sc.next().charAt(0);
	if(c=='y'){
	System.out.print("Enter the Option :\n1.Cost\n2.Weight\n3Content\n");
	op=sc.nextInt();
	System.out.println("Enter  Range");
	int min=sc.nextInt();
	int max=sc.nextInt();
	if(op==1) {
	for(Sweet s1:ls) {
	if(s1 instanceof Candy && s1.cost>=min && s1.cost<=max){
	System.out.println(s1.name+" "+s1.cost+" "+s1.weight+" "+s1.content);
	}
	}
	}
	else if(op==2) {
	for(Sweet s1:ls) {

	if(s1 instanceof Candy && s1.weight>=min && s1.weight<=max){
	System.out.println(s1.name+" "+s1.cost+" "+s1.weight+" "+s1.content);
	}
	}
	}
	else {
	for(Sweet s1:ls) {

	if(s1 instanceof Candy && s1.content>=min && s1.content<=max){
	System.out.println(s1.name+" "+s1.cost+" "+s1.weight+" "+s1.content);
	}
	}
	}
	}
}
}
