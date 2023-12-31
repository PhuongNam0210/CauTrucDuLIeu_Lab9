package task2;

import java.util.ArrayList;
import java.util.List;

public class DanhSachAnPhamTest {
	public static void main(String[] args) {
		ChuongSach c1 = new ChuongSach("Chuong 1", 10);
		ChuongSach c2 = new ChuongSach("Chuong 2", 20);
		ChuongSach c3 = new ChuongSach("Chuong 3", 30);
		ChuongSach c4 = new ChuongSach("Chuong 4", 40);
		ChuongSach c5 = new ChuongSach("Chuong 5", 50);
		
		List<ChuongSach> dsChuongSach1 = new ArrayList<>();
		dsChuongSach1.add(c1);
		dsChuongSach1.add(c2);
		dsChuongSach1.add(c3);
		dsChuongSach1.add(c4);
		dsChuongSach1.add(c5);
		
		List<ChuongSach> dsChuongSach2 = new ArrayList<>();
		dsChuongSach2.add(c1);
		dsChuongSach2.add(c2);
		dsChuongSach2.add(c3);
		
		List<ChuongSach> dsChuongSach3 = new ArrayList<>();
		dsChuongSach3.add(c1);
		dsChuongSach3.add(c2);
		dsChuongSach3.add(c3);
		dsChuongSach3.add(c4);
		
		AnPham a1 = new TapChi("TapChi1", 20, 2022, "TacGia1", 20000, "TapChi1");
		AnPham a2 = new TapChi("TapChi2", 30, 2011, "TacGia2", 25000, "TapChi2");
		AnPham a3 = new TapChi("TapChi3", 40, 2022, "TacGia3", 20000, "TapChi3");
		AnPham a4 = new TapChi("TapChi4", 50, 2004, "TacGia1", 30000, "TapChi4");
		AnPham a5 = new TapChi("TapChi5", 60, 2015, "TacGia5", 15000, "TapChi5");
		AnPham a6 = new TapChi("TapChi6", 70, 2004, "TacGia2", 11000, "TapChi6");
		AnPham a7 = new SachThamKhao("SachThamKhao1", 200, 2018, "TacGia1", 22000, "LinhVuc1", dsChuongSach1);
		AnPham a8 = new SachThamKhao("SachThamKhao2", 840, 2015, "TacGia1", 26000, "LinhVuc2", dsChuongSach2);
		AnPham a9 = new SachThamKhao("SachThamKhao3", 1024, 2018, "TacGia1", 30000, "LinhVuc3", dsChuongSach3);
		AnPham a10 = new SachThamKhao("SachThamKhao4", 653, 2005, "TacGia1", 20000, "LinhVuc4", dsChuongSach2);
		AnPham a11 = new SachThamKhao("SachThamKhao5", 345, 2018, "TacGia1", 20000, "LinhVuc5", dsChuongSach2);
		
		List<AnPham> dsAnPham = new ArrayList<>();
		dsAnPham.add(a1);
		dsAnPham.add(a2);
		dsAnPham.add(a3);
		dsAnPham.add(a4);
		dsAnPham.add(a5);
		dsAnPham.add(a6);
		dsAnPham.add(a7);
		dsAnPham.add(a8);
		dsAnPham.add(a9);
		dsAnPham.add(a10);
		dsAnPham.add(a11);
		
		DanhSachAnPham d1 = new DanhSachAnPham(dsAnPham);
		System.out.println(d1.xacDinhLoaiDinhAnPham(a3));
		System.out.println(d1.xacDinhLoaiDinhAnPham(a11));
		System.out.println("---------------------------------------");
		System.out.println(d1.xacDinhTapChi10Nam(a1));
		System.out.println(d1.xacDinhTapChi10Nam(a4));
		System.out.println("---------------------------------------");
		System.out.println(d1.checkCungLoaiCungAuthor(a11, a2));
		System.out.println(d1.checkCungLoaiCungAuthor(a1, a2));
		System.out.println(d1.checkCungLoaiCungAuthor(a1, a4));
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println(d1.findSachThamKhaoNhieuTrangNhat());
		System.out.println("---------------------------------------");
		System.out.println(d1.findTapChi(a5));
		System.out.println(d1.findTapChi(a1));
		System.out.println("---------------------------------------");
		System.out.println(d1.getAnPhamNamChoTruoc(2004));
		System.out.println("---------------------------------------");
		System.out.println(d1.sortAnPham());
		System.out.println("---------------------------------------");
		System.out.println(d1.statisticAnPham());
		System.out.println("---------------------------------------");
	}
}