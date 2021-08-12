/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_ChuoiCuaHang;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class ChuoiCuaHang {
    String tenCuaHang;
    double doanhThu;
    int nhanvien;

    public ChuoiCuaHang(String tenCuaHang, double doanhThu, int nhanvien) {
        this.tenCuaHang = tenCuaHang;
        this.doanhThu = doanhThu;
        this.nhanvien = nhanvien;
    }

    ChuoiCuaHang() {
    }

    public String getTenCuaHang() {
        return tenCuaHang;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public double getNhanVien() {
        return nhanvien;
    }

    public void setTenCuaHang(String tenCuaHang) {
        this.tenCuaHang = tenCuaHang;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void setLuongNV(int luongNV) {
        this.nhanvien = nhanvien;
    }
    
    
    public double loiNhuan() {
        return doanhThu * 20/100 - 2000* nhanvien;
    }
    
}
