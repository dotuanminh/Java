import java.time.LocalDate;
import java.util.Scanner;

public class Ex4 {
	public static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
//		Question1();
//		Question2();
//		Question3(); 
//		Question4();
//		Question5();
//		Question6(); 
//		Question7(); 
//		Question8(); 
//		Question9(); 
	}

	private static void Question9() {
		Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Java Fresher";
        group1.createDate = LocalDate.of(2021, 9, 21);

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "DB Fresher";
        group2.createDate = LocalDate.of(2020, 5, 21);

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "C++ Fresher";
        group3.createDate = LocalDate.of(2020, 4, 16);
        
        Group[] groups= {group1,group2,group3};
        for(Group group:groups) {
        	if(group.groupName.equals("Java"))System.out.println(group.groupName);
        	else continue ;
        }
		
	}

	private static void Question8() {
		Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Java Fresher";
        group1.createDate = LocalDate.of(2021, 9, 21);

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "DB Fresher";
        group2.createDate = LocalDate.of(2020, 5, 21);

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "C++ Fresher";
        group3.createDate = LocalDate.of(2020, 4, 16);
        
        Group[] groups= {group1,group2,group3};
        for(Group group:groups) {
        	if(group.groupName.contains("Java"))System.out.println(group.groupName);
        	else continue ;
        }
	}

	private static void Question7() {
		String hoten= scanner.nextLine();
		hoten= hoten.trim();
		System.out.println(hoten);
		String[] words = hoten.split(" ");
		hoten = "";
		for (String word : words) {
			String firstCharacter = word.substring(0, 1).toUpperCase();
			String leftCharacter = word.substring(1);
			word = firstCharacter + leftCharacter;
			hoten += word + " ";
		}
		System.out.println( hoten);
		scanner.close();
		
	}

	private static void Question6() {
		String hoten = scanner.nextLine();
		hoten=hoten.trim();
		String[] words = hoten.split(" ");
		System.out.println("Ho la "+ words[0]);
		StringBuilder dem= new StringBuilder();
		for(int i=1; i<words.length-1;++i) {
			dem.append(words[i]).append(" ");
		}
		System.out.println("Dem la "+ dem);
		System.out.println("Ten la "+ words[words.length-1]);
		scanner.close();
	}

	private static void Question5() {
		System.out.println("Moi nhap vao ho: ");
		String ho = scanner.nextLine();
		System.out.println("Moi nhap vao ten: ");
		String ten = scanner.nextLine();
		System.out.println(ho+"\t"+ten);
		scanner.close();
	}

	private static void Question4() {
		String ten= scanner.nextLine(); 
		for(int i=0; i<ten.length();++i) {
			System.out.println("Ki tu thu "+(i+1)+ " la "+ten.charAt(i)  );
		}
		scanner.close();
	}

	private static void Question3() {
		  Scanner scanner = new Scanner(System.in) ;
		    String ex4 = "" ;
		    ex4= scanner.nextLine() ; 
		    String a1= ex4.substring(0,1).toUpperCase();
		    System.out.println(a1+ ex4.substring(1));
		    scanner.close();
	}

	private static void Question1() {
		// TODO Auto-generated method stub
		
	}

	private static void Question2() {
		 String s1 = "AB" ;
		    String s2= "CD" ; 
		    System.out.println(s1+ s2);
		    
		
	}
}
