package cau4_p2;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("===============================MENU==========================="+"\n");
			System.out.println("1.them mot luong hang len xe:");
			System.out.println("2.bot mot luong hang xuong xe:");
			System.out.println("3.do them mot luong xang:");
			System.out.println("4.chay mot quan duong:");
			System.out.println("5.kiem tra xang con hay khong?");
			System.out.println("6.cho biet luong xang trong xe con lai:");
			System.out.println("7.ket thuc chuong trinh:");
			System.out.println("===============================END============================="+"\n");
			int chon = scanner.nextInt();
			
			switch(chon)
			{
				case 1:
				{
					Xe xe = new XeMay(2,100,10,5,1,100);
					System.out.println("Khoi luong hang tren xe sau khi them la:"+xe.themmotluonghang());
					
					Xe xetai = new XeTai(20,1000,100,50,10,200);
					System.out.println("Khoi luong hang tren xe sau khi them la:"+xetai.themmotluonghang());
					break;
				}
				
				case 2:
				{
					Xe xe = new XeMay(2,100,10,5,1,100);
					System.out.println("Khoi luong hang tren xe sau khi bot di mot luong hang:"+xe.botmotluonghang());
					
					Xe xetai = new XeTai(20,1000,100,50,10,200);
					System.out.println("Khoi luong hang tren xe sau khi them la:"+xetai.botmotluonghang());
					break;
				}
				
				case 3:
				{
					Xe xe = new XeMay(2,100,10,5,1,100);
					System.out.println("So lit xang trong xe khi do them xang:"+xe.domotluongxang());
					
					Xe xetai = new XeTai(20,1000,100,50,10,200);
					System.out.println("Khoi luong hang tren xe sau khi them la:"+xetai.domotluongxang());
					break;
				}
				
				case 4:
				{
					Xe xe = new XeMay(2,100,10,5,1,100);
					System.out.println("Quan duong xe di duoc la:"+xe.choxechaymotdoanduong());
					
					Xe xetai = new XeTai(20,1000,100,50,10,200);
					System.out.println("Khoi luong hang tren xe sau khi them la:"+xetai.choxechaymotdoanduong());
					break;
				}
				
				case 5:
				{
					Xe xe = new XeMay(2,100,10,5,1,100);
					if(xe.kiemtraxang())
					{
						System.out.println("xe con xang:");
					}
					else 
					{
						System.out.println("xe het xang roi:");
					}
					
					Xe xetai = new XeTai(20,1000,100,50,10,200);
					if(xetai.kiemtraxang())
					{
						System.out.println("xe con xang:");
					}
					
					else 
					{
						System.out.println("xe het xang roi:");
					}
					break;
				}
				
				case 6:
				{
					Xe xe = new XeMay(2,100,10,5,1,100);
					System.out.println("Luong xang xe con lai:"+xe.luongxangconlai());
					
					Xe xetai = new XeTai(20,1000,100,50,10,200);
					System.out.println("Luong xang xe con lai:"+xetai.luongxangconlai());
					break;
				}
				
				case 7:
				{
					return ;
				}
			}
		}
	}
}

//Xe xetai = new XeTai(20,1000,100,50,10,200)







































