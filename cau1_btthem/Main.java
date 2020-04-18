package cau1_btt;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true)	
		{
			System.out.println("==============================MENU========================"+"\n");
			System.out.println("1.Nhập khách hàng sử dụng điện với loại điện sử dụng vào một mảng, việc nhập\r\n" + 
					"kết thúc khi ta nhập Mã khách hàng bằng rỗng; mã khách hàng và tên khách hàng\r\n" + 
					"giống nhau thì phải cùng loại điện sử dụng, nhưng khác nhau ngày hóa đơn");
			System.out.println("2.Xuất hóa đơn tiền điện của các khách hàng với tháng và năm hóa đơn nhập từ bàn\r\n" + 
					"phím. Thông tin gồm Mã khách hàng, tên khách hàng, số lượng điện và thành tiền");
			System.out.println("3.ket thuc chuong trinh:");
			System.out.println("==============================END==========================+"+"\n");
			System.out.println("nhap vao su lua chon cua ban:");
			int chon = scanner.nextInt();
			
			switch(chon)
			{
				case 1:
				{
					int n;
					System.out.println("nhap vao n khach hang:");
					n = scanner.nextInt();
					
					ABC [] a = new ABC[n];
					
					for(int i=0;i<a.length;i++)
					{
						a[i] = new KinhDoanh();
						a[i].nhapthongtin();
						if(i==0)
						{
							continue;
						}
						if(a[i].kiemtra(a[i-1]))
						{
							System.out.println("phai dung chung loai dien:");
						}
					}
					break;
				}
				
				
				case 2:
				{
					ABC abc = new KinhDoanh("01","abc",12,100,2000);
					
					ABC ab = new LoaiSanXuat("02","ab",12,100,2000,2);
					
					ABC a = new SinhHoat("03","a",12,100,2000,10);
					
					System.out.println("nhap thang :");
					int thang = scanner.nextInt();
					
					System.out.println("nhap nam:");
					int nam = scanner.nextInt();
					
					System.out.println("thong tin hoa don su dung dien kinh doanh:"+abc.toString());
					
					System.out.println("thong tin hoa don su dung dien loai san xuat:"+ab.toString());
					
					System.out.println("thong tin hoa don su dung dien sinh hoat:"+a.toString());
					break;
				}
				
				case 3:
				{
					return;
				}
			}
			
		}
	}
}














