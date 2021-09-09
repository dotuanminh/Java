  
public class Department {
    int departmentID;
    String departmentName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int departmentID, String departmentName) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}
    
}