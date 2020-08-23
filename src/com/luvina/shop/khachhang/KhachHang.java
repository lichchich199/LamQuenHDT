package com.luvina.shop.khachhang;

import com.luvina.shop.giohang.GioHang;
import com.luvina.shop.sanpham.Ao;
import com.luvina.shop.sanpham.GianHang;
import com.luvina.shop.sanpham.Quan;

public class KhachHang {
	private String ten;
	private int sDT;
	private String diaChi;
	private String eMail;
	private GioHang giohang;
	
	public void nhapTT(String ten, int sDT, String diaChi,String eMail, GioHang giohang) {
		//ndpt
	}
	public void inTT() {
		//ndpt
	}
	public void xemDsSanPham(GioHang gioHang) {
		//ndpt
	}
	public Ao[] timKiemTheoTen(String ten) {
		Ao[] ketqua = null;
		return ketqua;
	}
	public Ao[] timKiemTheoLoaiAo(GianHang gioHang, String loai) {
		Ao[] ketqua = null;
		return ketqua;
	}
	public Quan[] timKiemTheoLoaiQuan(GianHang gioHang, String loai) {
		Quan[] ketqua = null;
		return ketqua;
	}
}
