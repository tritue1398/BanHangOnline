/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main_java;
import frm.frmTrangChu;
import frm.frmDangNhap;
import frm.frmThemSanPham;
import java.sql.ResultSet;
/**
 *
 * @author Tri Tue
 */
public class Main {
    public static  frm.frmTrangChu frmCT=new frmTrangChu();
     public static DataBase.DAO connection = new DataBase.DAO();
   public static frm.frmThemSanPham frmTSP=new frmThemSanPham();
    public static void main(String[]args){
     
  // frmProduct frmP=new frmProduct();
  // frmP.show();
    //frmTrangChu frmCT=new frmTrangChu();
    //frmCT.setVisible(true);
      frmDangNhap frmDN=new frmDangNhap();
        frmDN.show();
    }

    public static ResultSet ExcuteQueryGetTable(String cautruyvan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
