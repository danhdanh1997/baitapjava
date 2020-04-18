package cau3_th;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args) 
	{
		List<SinhVien>sv = new ArrayList<SinhVien>();
		
		SinhVien sv1 = new SinhVien();
		sv1.nhapthongtin();
		
		SinhVien sv2 = new SinhVien();
		sv2.nhapthongtin();
		
		SinhVien sv3 = new SinhVien();
		sv3.nhapthongtin();
		
		sv.add(sv1);
		sv.add(sv2);
		sv.add(sv3);
		
		for (SinhVien sinhVien : sv) 
		{
			System.out.println("thong tin cua sinh vien"+sinhVien.toString());
		}
	}
}





















