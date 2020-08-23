package com.luvina.shop.sanpham;

import com.luvina.shop.giohang.GioHang;

public class Ao extends SanPham {
	private String daiTay;
	private int vongNguc;
	private int vongEo;
	private int vongMong;
	
	public void nhapTT(String maSanPham, String loaiSanPham, String tenSanPham, String moTa, int giaTien, int soLuong,int size,String daiTay,int vongNguc,int vongEo, int vongMong) {
		// ndpt
	}
	@Override
	public void nhapTT(String maSanPham, String loaiSanPham, String tenSanPham, String moTa, int giaTien, int soLuong,
			int size) {
		super.nhapTT(maSanPham, loaiSanPham, tenSanPham, moTa, giaTien, soLuong, size);
	}
	
}
