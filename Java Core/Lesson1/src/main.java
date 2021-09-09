
public class main {
	public static void main(String[] args) {
//		int[] mangSo = new int[5] ;
//		mangSo[0] = 10;
//		mangSo[1] =20;
//		mangSo[2] = 30;
//		mangSo[3] = 40;
//		mangSo[4] = 50;
//		
//		for(int i: mangSo) {
//			System.out.println(i);
//		}
//		for(int i=0; i<mangSo.length; ++i) {
//			System.out.println(mangSo[i]);
//		}
// 
//		SinhVien[] mangSVien = new SinhVien[10] ;
//		for(int i=0 ; i<mangSVien.length; ++i) {
//			mangSVien[i]= new SinhVien(); 
//			mangSVien[i].ten = "Minh";
//		}
//		for (SinhVien i:mangSVien) {
//			System.out.println(i.ten);
//		}
		// so sanh so
//		int a=5;
//		int b=5; 
//		System.out.println(a==b);
//		System.out.println(a!= b);
//		System.out.println(a>b);
		
		// so sanh chuoi 
		String x= null;
		String y= "ABCDE";
		String z = new String("ABCDE");
		String t = new String("ABCDE");
//		//true
//		System.out.println(x==y);
//		//false
//		System.out.println(x==z);
//		// false
//		System.out.println(z==t);
		
		// so sanh chuoi
		System.out.println(z.equals(x));
		// null khong co phuong thuc equal
		
		
		SinhVien sva = new SinhVien("Quang",19,"HN") ;
		SinhVien svb = new SinhVien("Quang",19,"ND") ;
		
		String s= sva.compareTo(svb) ==1 ? "Giong nhau" : "Khac nhau";
		System.out.println(s);
		
		
	}
}
