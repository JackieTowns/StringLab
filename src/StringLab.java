
public class StringLab {
	public static void main(String[] args) {
		capitalize("blaZes");
		capitalize("What else Can I SAY???");
		
		wheresWaldo("Striped Waldo!");
		wheresWaldo("Now is Waldo here?");
		
		
		firstThingsFirst("cat", "dog");
		firstThingsFirst("tree", "pine");
		firstThingsFirst("Zebra", "Apple");

		reverse("happy");

		soLong("bean", "pea");
		soLong("information", "tea");
		soLong("tart", "trap");
		soLong("car", "raw");
		
		afterMath("She aced the mathematics test!");
		afterMath("My floor mat is so keen!");

		letterize("Java");
		letterize("Nothing long I hope.");

	}
	
	public static void capitalize(String word) {
		String firstLetter = word.substring(0,1).toUpperCase(); 
		String restOfWord = word.substring(1).toLowerCase(); 
		System.out.println(firstLetter + restOfWord); 
	}
	
	public static void wheresWaldo(String phrase) {
		System.out.println(phrase.indexOf("W"));

	}

	public static void firstThingsFirst(String a, String b) {
		if (a.compareTo(b) > 0) {
			System.out.println(b + " " + a);
		} else if (a.compareTo(b) < 0)
			System.out.println(a + " " + b);
	}

	public static void reverse(String s) {
		String answer = new StringBuffer(s).reverse().toString();
		System.out.println(answer);

	}

	public static void soLong(String a, String b) {
		
		if (a.length() > b.length()) {
			System.out.println(a);
		} else if (a.length() < b.length()) {
			System.out.println(b);
		} else if (a.length() == b.length()) {
			System.out.println(a + " " + b);
		}

	}
	

	public static void afterMath(String phrase) {
		
		if (phrase.contains("math")) {
			System.out.println(phrase.substring(13, 30));
		} else {
			System.out.println("dud");
		}
	}


	public static void letterize(String word) {
		for (char answer : word.toCharArray()) {
			  System.out.println(answer);
			 } 
	}
}
		




