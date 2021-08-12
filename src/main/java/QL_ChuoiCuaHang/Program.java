/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_ChuoiCuaHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    ArrayList<ChuoiCuaHang> ds = new ArrayList<ChuoiCuaHang>();

    public void insert() {
        Scanner sc = new Scanner(System.in);
        ChuoiCuaHang cch = new ChuoiCuaHang();
        System.out.println("Nhập Tên Cửa Hàng :");
        cch.tenCuaHang = sc.nextLine();
        System.out.println("Nhập Doanh Thu :");
        cch.doanhThu = sc.nextDouble();
        System.out.println("Nhập Số Lượng Nhân Viên :");
        cch.nhanvien = sc.nextInt();
        ds.add(cch);
    }

    public void sxDoanhThu() {
        double dthu = 0;
        int vitri = 0;
        for (int i = 0; i < ds.size(); i++) {
            for (int j = i + 1; j < ds.size(); j++) {
                if (ds.get(i).doanhThu < ds.get(j).doanhThu) {
                    double temp = ds.get(j).doanhThu;
                    ds.get(j).doanhThu = ds.get(i).doanhThu;
                    ds.get(i).doanhThu = temp;
                }
            }

        }
        System.out.println("=====");
        System.out.println(ds);
    }

    public void chLo() {

        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).loiNhuan() < 0) {
                System.out.println("Cua Hang " + ds.get(i).tenCuaHang + "Bi Lo : ");
            }
        }
    }

    public void tongLoiNhuan() {
        double tong = 0;
        for (int i = 0; i < ds.size(); i++) {
            tong = tong + ds.get(i).loiNhuan();

        }
        System.out.println("Tổng lợi nhuận của tất cả cửa hàng :" + tong);
    }

    public void menu() {
        System.out.println("1. Nhập thông tin cửa hàng :");
        System.out.println("2. Sắp xếp doanh thu cửa hàng :");
        System.out.println("3. Những cửa hàng bị lỗ :");
        System.out.println("4. Tổng lợi nhuận của chuỗi cửa hàng :");
    }

    public void run() {
        while (true) {

            menu();
            Scanner sc = new Scanner(System.in);
            int nhap = sc.nextInt();
            if (nhap == 1) {
                insert();
            } else if (nhap == 2) {
                sxDoanhThu();
            } else if (nhap == 3) {
                chLo();
            } else if (nhap == 4) {
                tongLoiNhuan();
            } else {
                break;
            }
        }
    }
}
