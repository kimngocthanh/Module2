package ss5.bai_tap.bai_tap_them;

import java.util.Date;

public class ThucPham {
    private String maHang = "1";
    private String tenHang = "mì gói";
    private int donGia = 5000;
    private int namSanXuat = 2021;
    private int thangSanXuat = 1;
    private int ngaySanXuat = 1;
    private int namHetHan = 2023;
    private int thangHetHan = 4;
    private int ngayHetHan = 7;


    public ThucPham(String maHang, String tenHang, int donGia, int ngaySanXuat, int thangSanXuat, int namSanXuat, int ngayHetHan, int thangHetHan, int namHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.thangSanXuat = thangSanXuat;
        this.namSanXuat = namSanXuat;
        this.ngayHetHan = ngayHetHan;
        this.thangHetHan = thangHetHan;
        this.namHetHan = namHetHan;

    }

    public ThucPham() {

    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getThangSanXuat() {
        return thangSanXuat;
    }

    public void setThangSanXuat(int thangSanXuat) {
        this.thangSanXuat = thangSanXuat;
    }

    public int getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(int ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public int getNamHetHan() {
        return namHetHan;
    }

    public void setNamHetHan(int namHetHan) {
        this.namHetHan = namHetHan;
    }

    public int getThangHetHan() {
        return thangHetHan;
    }

    public void setThangHetHan(int thangHetHan) {
        this.thangHetHan = thangHetHan;
    }

    public int getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(int ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public ThucPham(String maHang) {
        this.maHang = maHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public boolean kiemTraHan() {
        if (namHetHan - namSanXuat < 0) {
            return false;
        } else if (namHetHan - namSanXuat == 0) {
            if (thangHetHan - thangSanXuat < 0) {
                return false;
            } else if (thangHetHan - thangSanXuat > 0) {
                return true;
            } else {
                if (ngayHetHan - ngaySanXuat < 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public boolean kiemTraRong() {
        if (maHang.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (kiemTraHan() == true) {
            if (kiemTraRong() == true) {
                return "ThucPham{" +
                        "maHang=" + maHang +
                        ", tenHang='" + tenHang + '\'' +
                        ", donGia=" + donGia +
                        "ngày sản xuất " + ngaySanXuat + "/" + thangSanXuat + "/" + namSanXuat +
                        " ngày hết hạn " + ngayHetHan + "/" + thangHetHan + "/" + namHetHan +
                        '}';
            }
            return "Chưa có mã hàng";
        }
        return "Thực phẩm hết hạn";
    }
}
