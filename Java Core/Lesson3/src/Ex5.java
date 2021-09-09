
public class Ex5 {
	public static void main(String[] args) {
		Department d1 = new Department(1,"Sale");
		Department d2 = new Department(2,"Marketing");
		Department d3 = new Department(3,"Dev");
//		Question1(d1); 
//		Question2(new Department[] {d1,d2,d3});
//		Question3(d1);
//		System.out.println(Question4(d1));
//		System.out.println(Question5(d1,d2));
//		Question6(new Department[] {d1,d2,d3});
//		Question7(new Department[] {d1,d2,d3});
	}

	private static void Question7(Department[] departments) {
		String[] words = new String[departments.length];
		for(int i=0; i<departments.length;++i) {
			String[] temp = departments[i].departmentName.split(" ") ;
			words[i] = temp[temp.length-1];
		}
		for(int i=0; i<departments.length-1;++i) {
			for(int j=i+1;j<departments.length;++j) {
				if(words[i].compareTo(words[j])>0) {
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}	
		}
		for (Department department : departments) {
			System.out.println(department.departmentName);
		}
	}

	private static void Question6(Department[] departments) {
		for (int i = 0; i < departments.length; ++i) {
			for (int j = 0; j < departments.length - 1;++j) {
				if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName) < 0) {
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
		}
		for (Department department : departments) {
			System.out.println(department.departmentName);
		}
		
	}

	private static boolean Question5(Department d1, Department d2) {
		if(d1.departmentName.equals(d2.departmentName)) return true;
		return false;
	}

	private static boolean Question4(Department d1) {
		if(d1.departmentName.equals("Phong A")) return true;
		return false;
	}

	private static void Question3(Department d1) {
		System.out.println(d1.hashCode());
		
	}

	private static void Question2(Department[] departments) {
		for(Department department:departments) {
			System.out.println(department.toString());
		}
		
	}

	private static void Question1(Department d) {
		System.out.println(d.toString());
	}
}
