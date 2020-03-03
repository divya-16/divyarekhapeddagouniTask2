package epam.com.Gifts;

import java.util.Comparator;

class Bycost implements Comparator <Sweet>{

	public int compare(Sweet a, Sweet b) {
		return a.cost-b.cost;
	}
	
}
class Byweight implements Comparator <Sweet>{

	public int compare(Sweet a, Sweet b) {
		return Float.compare(a.weight, b.weight);
	}
	
}
class Bycontent implements Comparator <Sweet>{

	public int compare(Sweet a, Sweet b) {
		return a.content-b.content;
	}
}
public class Sweet {
	String name;
	int cost;
	float weight;
	int content;
 Sweet(String name, int cost, float weight, int content) {
	this.name = name;
	this.cost = cost;
	this.weight = weight;
	this.content = content;

}

}
