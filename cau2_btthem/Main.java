package cau2_btt;

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
			System.out.println("============================MENU=========================="+"\n");
			System.out.println("1.Nhập hàng hóa vào một mảng, việc nhập kết thúc khi ta nhập Mã hàng bằng rỗng\r\n" + 
					"và thêm thành công hàng hóa vào mảng khi mã hàng hóa không trùng");
			System.out.println("2.Xuất mức độ đánh giá của tất cả các hàng trong mảng hàng hóa. Thông tin gồm Mã\r\n" + 
					"hàng, tên hàng, số lượng tồn, mức độ đánh giá của hàng");
			System.out.println("3.Cho biết thương hiệu điện máy bán được. Thông tin gồm thương hiệu, tên hàng,\r\n" + 
					"loại hàng");
			System.out.println("4.Ket thuc chuong trinh:");
			System.out.println("==============================END==========================="+"\n");
			
			System.out.println("Moi ban chon menu:");
			int chon = scanner.nextInt();
			
			switch(chon)
			{
				case 1:
				{
					while(true)
					{
						System.out.println("====================menu=================="+"\n");
						System.out.println("1.Nhap hang dien may:");
						System.out.println("2.Nhap hang thuc pham:");
						System.out.println("3.Nhap hang gia dung:");
						System.out.println("4.Thoat:");
						System.out.println("=====================end=================="+"\n");
						
						System.out.println("nhap vao su lua chon:");
						int choose = scanner.nextInt();
						
						switch(choose)
						{
							case 1:
							{
								System.out.println("nhap vao so luong n hang hoa:");
								int n = scanner.nextInt();
								
								HangDienMay [] h = new HangDienMay[n];
								
								List<HangDienMay>hdm = new ArrayList<HangDienMay>();
								
								for(int i=0;i< h.length;i++)
								{
									h[i] = new HangDienMay();
									h[i].nhapthongtin();
									if(i==0)
									{
										continue;
									}
									
									if(h[i].kiemtra(h[i-1]))
									{
										hdm.add(h[i]);
										System.out.println("them thanh cong:");
									}
								}
								break;
							}
							
							case 2:
							{
								System.out.println("nhap vao so luong n hang hoa:");
								int n = scanner.nextInt();
								
								HangThucPham [] p = new HangThucPham[n];
								
								List<HangThucPham>htp = new ArrayList<HangThucPham>();
								
								for(int i=0;i< p.length;i++)
								{
									p[i] = new HangThucPham();
									p[i].nhapthongtin();
									if(i==0)
									{
										continue;
									}
									
									if(p[i].kiemtra(p[i-1]))
									{
										htp.add(p[i]);
										System.out.println("them thanh cong:");
									}
								}
								break;
							}
							
							case 3:
							{
								System.out.println("nhap vao so luong n hang hoa:");
								int n = scanner.nextInt();
								
								HangGiaDung [] d = new HangGiaDung[n];
								
								List<HangGiaDung>hgd = new ArrayList<HangGiaDung>();
								
								for(int i=0;i< d.length;i++)
								{
									d[i] = new HangGiaDung();
									d[i].nhapthongtin();
									if(i==0)
									{
										continue;
									}
									
									if(d[i].kiemtra(d[i-1]))
									{
										hgd.add(d[i]);
										System.out.println("them thanh cong:");
									}
								}
								break;
							}
							
							case 4:
							{
								break;
							}
						}
						break;
					}
				}
				
				case 2:
				{
					while(true)
					{
						System.out.println("====================menu=================="+"\n");
						System.out.println("1.Xuat muc do danh gia  hang dien may:");
						System.out.println("2.Xuat muc do danh gia  hang thuc pham:");
						System.out.println("3.Xuat muc do danh gia  hang gia dung:");
						System.out.println("4.Thoat:");
						System.out.println("=====================end=================="+"\n");
						
						System.out.println("nhap vao su lua chon:");
						int choose = scanner.nextInt();
						
						switch(choose)
						{
							case 1:
							{
								System.out.println("nhap vao so luong n hang hoa:");
								int n = scanner.nextInt();
								
								HangDienMay [] h = new HangDienMay[n];
								
								List<HangDienMay>hdm = new ArrayList<HangDienMay>();
								
								for(int i=0;i< h.length;i++)
								{
									h[i] = new HangDienMay();
									h[i].nhapthongtin();
									if(i==0)
									{
										continue;
									}
									
									if(h[i].kiemtra(h[i-1]))
									{
										hdm.add(h[i]);
										System.out.println("them thanh cong:");
									}
									
									h[i].danhgia();
								}
								break;
							}
							
							case 2:
							{
								System.out.println("nhap vao so luong n hang hoa:");
								int n = scanner.nextInt();
								
								HangThucPham [] p = new HangThucPham[n];
								
								List<HangThucPham>htp = new ArrayList<HangThucPham>();
								
								for(int i=0;i< p.length;i++)
								{
									p[i] = new HangThucPham();
									p[i].nhapthongtin();
									if(i==0)
									{
										continue;
									}
									
									if(p[i].kiemtra(p[i-1]))
									{
										htp.add(p[i]);
										System.out.println("them thanh cong:");
									}
									
									p[i].danhgia();
								}
								break;
							}
							
							case 3:
							{
								System.out.println("nhap vao so luong n hang hoa:");
								int n = scanner.nextInt();
								
								HangGiaDung [] d = new HangGiaDung[n];
								
								List<HangGiaDung>hgd = new ArrayList<HangGiaDung>();
								
								for(int i=0;i< d.length;i++)
								{
									d[i] = new HangGiaDung();
									d[i].nhapthongtin();
									if(i==0)
									{
										continue;
									}
									
									if(d[i].kiemtra(d[i-1]))
									{
										hgd.add(d[i]);
										System.out.println("them thanh cong:");
									}
									
									d[i].danhgia();
								}
								break;
							}
							
							case 4:
							{
								break;
							}
						}
						break;
					}
				}
					
				case 3:
				{
					System.out.println("nhap vao so luong n hang hoa:");
					int n = scanner.nextInt();
					
					HangDienMay [] h = new HangDienMay[n];
					
					List<HangDienMay>hdm = new ArrayList<HangDienMay>();
					
					for(int i=0;i< h.length;i++)
					{
						h[i] = new HangDienMay();
						h[i].nhapthongtin();
						if(i==0)
						{
							continue;
						}
						
						if(h[i].kiemtra(h[i-1]))
						{
							hdm.add(h[i]);
							System.out.println("them thanh cong:");
						}
						
						h[i].danhgia();
						h[i].getLoaimay();
						h[i].getThuonghieu();
						
					}
					break;
				}
	
				case 4:
				{
					return;
				}
			}
		}
	}
}

























