package cau2_p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so luong cac chuyen xe:");
		int n = scanner.nextInt();
		
		ChuyenXe []cx = new ChuyenXe[n];
		
		double tongdoanhthu =0;
		
		System.out.println("nhap so luong cac chuyen xe ngoai thanh:");
		int x=0;
		x = scanner.nextInt();
		//ChuyenXeNgoaiThanh []cxngt=null;
		ChuyenXeNgoaiThanh []cxngt = new ChuyenXeNgoaiThanh[x];
		
		ChuyenXeNoiThanh []cxnt = new ChuyenXeNoiThanh[n-x];
		
		List<ChuyenXe>list = new ArrayList<ChuyenXe>(20);
		
		double tongdtngthanh=0;
		double maxngoaithanh =0;
		for(int i=0;i<cxngt.length;i++)
		{
			cxngt[i] = new ChuyenXeNgoaiThanh();
			cxngt[i].nhapthongtin();
			tongdtngthanh+=cxngt[i].tinhdoanhthu();
			list.add(cxngt[i]);
		}
		
		for (ChuyenXe chuyenXe : list)
		{
			if(chuyenXe.tinhdoanhthu() >maxngoaithanh)
			{
				maxngoaithanh=chuyenXe.tinhdoanhthu();
				
			}
			
		}
		System.out.println("doanh thu lon nhan cua xe ngoai thanh"+maxngoaithanh);
		
		tongdoanhthu+=tongdtngthanh;
		
		double tongdtnthanh=0;
		double maxnoithanh=0;
		for(int j=0;j<cxnt.length;j++)
		{
			cxnt[j] = new ChuyenXeNoiThanh();
			cxnt[j].nhapthongtin();
			tongdtnthanh+=cxnt[j].tinhdoanhthu();
			list.add(cxnt[j]);
		}
		
		
		for (ChuyenXe chuyenXe : list)
		{
			if(chuyenXe.tinhdoanhthu() >maxnoithanh)
			{
				maxnoithanh=chuyenXe.tinhdoanhthu();
			}
			
		}
		System.out.println("doanh thu lon nhan cua xe ngoai thanh"+maxnoithanh);
		
		tongdoanhthu+=tongdtnthanh;
		for (ChuyenXe chuyenXe : list) 
		{
			System.out.println("chuyen xe "+chuyenXe.toString());
		}
		
		
		System.out.println("Tong doanh thu cua ca hai loai phuong tien:"+tongdoanhthu);
		
	}
}
















