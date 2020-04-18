package cau3_p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			int choose;
			System.out.println("===============================MENU===============================");
			System.out.println("1.Xuất thông tin của của từng robot trong đoàn và số năng lượng nó đã sử dụng");
			System.out.println("2.Cho biết loại robot tiêu thụ năng lượng nhiều nhất trong đoàn (tính theo tổng\r\n" + 
					"năng lượng của từng loại)");
			System.out.println("3.Ket thuc chuong trinh:");
			System.out.println("===============================END=================================="+"\n");
			
			System.out.println("Nhap vao su lua chon cua ban:");
			choose = scanner.nextInt();
			switch(choose)
			{
				case 1:
				{
					int a;
					System.out.println("nhap so luong a pedion");
					a = scanner.nextInt();
					
					int b;
					System.out.println("nhap so luong b Zattacker");
					b = scanner.nextInt();
					

					int c;
					System.out.println("nhap so luong c Carrier");
					c = scanner.nextInt();
					
					Pedion[] pe = new Pedion[a];
					
					List<RoBot>list =  new ArrayList<RoBot>();
					
					for(int i=0;i<pe.length;i++)
					{
						pe[i]=new Pedion(20,10);
						pe[i].getF();
						pe[i].tinhnangluon();
						list.add(pe[i]);
					}
					
					for (RoBot roBot : list)
					{
						System.out.println(roBot.toString());
					}
				
					Zattacker[]za = new Zattacker[b];
					
					List<RoBot>list1 = new ArrayList<RoBot>();
					for(int i=0;i<za.length;i++)
					{
						za[i]=new Zattacker(20,10);
						za[i].getP();
						za[i].tinhnangluon();
						list1.add(za[i]);
					}
					
					for (RoBot roBot : list1)
					{
						System.out.println(roBot.toString());
					}
					
					Carrier[] ca = new Carrier[c];
	
					List<RoBot>list2 = new ArrayList<RoBot>();
					for(int i=0;i<ca.length;i++)
					{
						ca[i]=new Carrier(20,10);
						ca[i].getE();
						ca[i].tinhnangluon();
						list2.add(ca[i]);
					}
					
					for (RoBot roBot : list2)
					{
						System.out.println(roBot.toString());
					}
					break;
				}
				
				case 2:
				{
					int a;
					System.out.println("nhap so luong a pedion");
					a = scanner.nextInt();
					
					int b;
					System.out.println("nhap so luong b Zattacker");
					b = scanner.nextInt();
					

					int c;
					System.out.println("nhap so luong c Carrier");
					c = scanner.nextInt();
					
					Pedion[] pe = new Pedion[a];
					
					List<RoBot>list =  new ArrayList<RoBot>();
					int tongnangluongpedion=0;
					for(int i=0;i<pe.length;i++)
					{
						pe[i]=new Pedion(20,10);
						pe[i].getF();
						tongnangluongpedion+= pe[i].tinhnangluon();
						list.add(pe[i]);
					}
					
					for (RoBot roBot : list)
					{
						System.out.println(roBot.toString());
					}
					System.out.println("tong nang luong cua robot Peidion="+tongnangluongpedion);
					
					Zattacker[]za = new Zattacker[b];
					
					List<RoBot>list1 = new ArrayList<RoBot>();
					int tongnangluongzattacker=0;
					for(int i=0;i<za.length;i++)
					{
						za[i]=new Zattacker(20,10);
						za[i].getP();
						tongnangluongzattacker+= za[i].tinhnangluon();
						list1.add(za[i]);
					}
					
					for (RoBot roBot : list1)
					{
						System.out.println(roBot.toString());
					}
					System.out.println("tong nang luong cua robot zattacker="+tongnangluongzattacker);
					
					Carrier[] ca = new Carrier[c];
	
					List<RoBot>list2 = new ArrayList<RoBot>();
					int tongnangluongcarrier=0;
					for(int i=0;i<ca.length;i++)
					{
						ca[i]=new Carrier(20,10);
						ca[i].getE();
						tongnangluongcarrier+= ca[i].tinhnangluon();
						list2.add(ca[i]);
					}
					
					
					for (RoBot roBot : list2)
					{
						System.out.println(roBot.toString());
					}
					
					System.out.println("tong nang luong cua robot carrier="+tongnangluongcarrier);
					
					List<Integer>list3 = new ArrayList<Integer>();
					list3.add(tongnangluongpedion);
					list3.add(tongnangluongzattacker);
					list3.add(tongnangluongcarrier);
					
					int max = list3.get(0);
					for(int i=0;i<list3.size();i++)
					{
						if(list3.get(i).compareTo(max)>0)
						{
							max=list3.get(i);
						}
					}
					System.out.println("Robot co nang luong lon nhat la:"+max);
				}
				
				case 3:
				{
					return ;
				}
			}
		}
	}
}





















