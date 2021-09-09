import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    int groupID;
    String groupName;
    LocalDate createDate;
    Account[] accounts;
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Group(int groupID, String groupName, LocalDate createDate, Account[] accounts) {
		this.groupID = groupID;
		this.groupName = groupName;
		this.createDate = createDate;
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", createDate=" + createDate + ", accounts="
				+ Arrays.toString(accounts) + "]";
	}
}    