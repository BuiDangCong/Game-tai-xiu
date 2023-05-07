/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Taixiu {

    public static void main(String[] args) {
        double taiKhoanNguoichoi = 5000000.99;
        Scanner sc = new Scanner(System.in);
        Locale lc = new Locale("vi", "VN");
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(lc);

        int luaChon = 1;

        do {
            System.out.println("------------------moi ban lua chon---------------");
            System.out.println("Chon (1) de tiep tuc choi.");
            System.out.println("Chon (phim bat ki) de thoat. ");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("*** BAT DAU CHOI ***");
                // Đặt cược
                System.out.println("****** TAI KHOAN CUA BAN*****" + nf.format(taiKhoanNguoichoi) + " Ban muon cuoc bao nhieu");
                double datCuoc;
                do {
                    System.out.println("***Dat cuoc (0 <so Tien Cuoc <= " + taiKhoanNguoichoi + ":");
                    datCuoc = sc.nextDouble();
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoichoi);
                // chọn tài xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("********** Chon : 1 <-> tai hoac 2 <-> xiu : ");
                    luaChonTaiXiu = sc.nextInt();
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
                // tung xúc sắc lên :
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();
                int giaTri1 = xucXac1.nextInt(5) + 1;
                int giaTri2 = xucXac2.nextInt(5) + 1;
                int giaTri3 = xucXac3.nextInt(5) + 1;
                // tính toán kết quả
                int Tong = giaTri1 + giaTri2 + giaTri3;
                System.out.println("ket qua : " + giaTri1 + "-" + giaTri2 + "-" + giaTri3);
                if (Tong == 3 || Tong == 18) {
                    taiKhoanNguoichoi -= datCuoc;
                    System.out.println("tong là : " + Tong + "nha cai an het ban da thua ! :");
                    System.out.println("tai khoan cua ban con lai la :" + taiKhoanNguoichoi);
                } else if (Tong >= 4 || Tong <= 10) {
                    System.out.println("tong là : " + Tong + "=> xiu");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("Ban da thang ");
                        taiKhoanNguoichoi -= datCuoc;
                        System.out.println("tai khoan cua ban con lai la :" + taiKhoanNguoichoi);
                    } else {
                        System.out.println("ban da thua cuoc ");
                        taiKhoanNguoichoi -= datCuoc;
                        System.out.println("tai khoan cua ban la " + taiKhoanNguoichoi);
                    }
                } else {
                    System.out.println("tong là : " + Tong + "=> tai");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("Ban da thang ");
                        taiKhoanNguoichoi -= datCuoc;
                        System.out.println("tai khoan cua ban con lai la :" + taiKhoanNguoichoi);
                    } else {
                        System.out.println("ban da thua cuoc ");
                        taiKhoanNguoichoi -= datCuoc;
                        System.out.println("tai khoan cua ban la " + taiKhoanNguoichoi);
                    }

                }
            }
        } while (luaChon == 1);

    }

}
