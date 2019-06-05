/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Getset;

/**
 *
 * @author Tri Tue
 */
public class DangKiKhachHang {
    private String ID;
    private String hoTen;
     private String tenDangNhap;
      private String matKhau;
       private String nhapLaiMatKhau;
       
       public DangKiKhachHang( String id,String hTen,String tDangNhap,String mKhau,String nLaiMatKhau ){
           this.ID=id;
       this.hoTen=hTen;
       this.tenDangNhap=tDangNhap;
       this.matKhau=mKhau;
       this.nhapLaiMatKhau=nLaiMatKhau;
       }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the tenDangNhap
     */
    public String getTenDangNhap() {
        return tenDangNhap;
    }

    /**
     * @param tenDangNhap the tenDangNhap to set
     */
    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    /**
     * @return the matKhau
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * @param matKhau the matKhau to set
     */
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    /**
     * @return the nhapLaiMatKhau
     */
    public String getNhapLaiMatKhau() {
        return nhapLaiMatKhau;
    }

    /**
     * @param nhapLaiMatKhau the nhapLaiMatKhau to set
     */
    public void setNhapLaiMatKhau(String nhapLaiMatKhau) {
        this.nhapLaiMatKhau = nhapLaiMatKhau;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
       
}


