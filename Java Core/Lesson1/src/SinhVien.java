
public class SinhVien extends Object implements Comparable<SinhVien> {
	// thuoc tinh
	String ten = "" ; 
	int tuoi;
	String queQuan ; 
	
	// phuong thuc 
	
	public void printName() {
		System.out.println("Hello "+ ten);
	}
	public void diemDanh() {
		System.out.println("Hoc sinh "+ ten + " di hoc day du");
	}
	public SinhVien(String ten, int tuoi, String queQuan) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", tuoi=" + tuoi + ", queQuan=" + queQuan + "]";
	}
	@Override
	public int compareTo(SinhVien sv) {
		if(this.ten.equals(sv.ten) && this.tuoi == sv.tuoi && this.queQuan.equals(sv.queQuan)) {
			return 1;
		}
		return 0;
	}
	
}
