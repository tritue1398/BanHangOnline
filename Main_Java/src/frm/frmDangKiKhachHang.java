/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main_java.Main;

/**
 *
 * @author Tri Tue
 */
public class frmDangKiKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form frmDangKi
     */
    public frmDangKiKhachHang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        btDangKi = new javax.swing.JButton();
        btHuyDangKi = new javax.swing.JButton();
        pwKhachHang = new javax.swing.JPasswordField();
        pwKhachHangNhapLai = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng kí tài khoản");
        setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Họ và tên:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("ĐĂNG KÍ TÀI KHOẢN KHÁCH HÀNG");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên đăng nhập:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mật khẩu:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nhập lại mật khẩu: ");

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        btDangKi.setText("Đăng kí");
        btDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangKiActionPerformed(evt);
            }
        });

        btHuyDangKi.setText("Hủy");
        btHuyDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyDangKiActionPerformed(evt);
            }
        });

        pwKhachHangNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwKhachHangNhapLaiActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Số điện thoại:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Địa chỉ:");

        txtSdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtActionPerformed(evt);
            }
        });

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mã khách hàng:");

        txtMaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwKhachHangNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSdt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btHuyDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwKhachHangNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDangKi)
                    .addComponent(btHuyDangKi))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void btHuyDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyDangKiActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btHuyDangKiActionPerformed

    private void btDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangKiActionPerformed
        
        String MaKhachHang,HoTen,SDT,DiaChi,TenDangNhap, MatKhau,NhapLaiMatKhau;
        //int MaKhachHang;
      
          MaKhachHang=txtMaKhachHang.getText().trim();
          HoTen=txtHoTen.getText();
          SDT=txtSdt.getText();
          DiaChi=txtDiaChi.getText();
        TenDangNhap=txtTenDangNhap.getText();
        MatKhau=String.valueOf(pwKhachHang.getPassword()).trim();
        NhapLaiMatKhau=String.valueOf(pwKhachHang.getPassword());
        String cautruyvan = "select *from dangkitaikhoankhachhang ";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(cautruyvan);
         
        boolean kt = true;

        if (MaKhachHang.equals("")) {
            ThongBao(" Họ tên hàng không được để trống", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            if (TenDangNhap.length() < 6 || TenDangNhap.length() > 45) {
                ThongBao("Tên đăng nhập phải từ 6-45 ký tự", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
                
            } else if (MatKhau.length() < 6 || MatKhau.length() > 45) {
                ThongBao("Mật khẩu phải có 6 ký tự và ít hơn 45 ký tự", "Lỗi đăng ký", 2);
            }else if (HoTen.equals("")) {
                ThongBao("Họ và tên không được trống", "Lỗi đăng ký", 2);
            }else if (SDT.equals("")) {
                ThongBao("Số điện thoại không được trống", "Lỗi đăng ký", 2);
                 try {
                  int bien =Integer.valueOf(SDT);
              } catch (Exception e) {
                  //ThongBao+="Giá bán phải là số !\n";
                   ThongBao("Số điện thoại phải là số", "Lỗi đăng ký", 2);
              }   
            }else if (DiaChi.equals("")) {
                ThongBao("Địa chỉ của bạn không được trống", "Lỗi đăng ký", 2);
           
            } else if (!KiemTraChuaChuVaSo(MatKhau)) {
                ThongBao("Mật khẩu phải bao gồm chữ IN HOA, chữ thường và số", "Thông báo", 2);
            } else if (!MatKhau.equals(NhapLaiMatKhau)) {
                ThongBao("nhập lại mật khẩu không khớp", "Thông báo", 2);
            } else {
                  
                String cautruyvan2 = "select * from dangkitaikhoankhachhang where MaKhachHang= '" + MaKhachHang + "'";
                ResultSet rs2 = main_java.Main.connection.ExcuteQueryGetTable(cautruyvan2);
                try {
                    rs2.next();
                    if (rs.getString("MaKhachHang").equals(MaKhachHang)) {
                        kt = false;
                        ThongBao("tài khoản  của khách hàng có mã: " + MaKhachHang + " đã tồn tại", "Thông báo", 2);
                    }

                } catch (SQLException ex) {
                    System.out.println("Đăng kí tài khoản mới thành công");
                    kt = true;
                }
                if (kt == true) {
                 //String ctv = "insert into userkhachhang values(" + MaKhachHang
                //+ " ,'" + TenDangNhap + "' , '" + MatKhau+ ", N' ')";
                //'" + MaKhachHang + "',
                String ctv = "insert into dangkitaikhoankhachhang "
        + "values(N'" + MaKhachHang + "','" + HoTen + "','" + SDT + "','" + DiaChi + "','" + TenDangNhap + "','" + MatKhau + "')";
        System.out.println(cautruyvan);
            Main.connection.ExcuteQueryUpdateDB(ctv);
            JOptionPane.showMessageDialog(null,"Đã đăng kí thành công" );
            frmTrangChu frmTC=new frmTrangChu();
            frmTC.show();
            this.dispose();
           // System.out.println("Đã đăng kí thành công");
        } else {
                    JOptionPane.showMessageDialog(null,"Đăng kí thất bại" );
            //ThongBao("Không thể Thêm tài Khoản", "lỗi", 2);
                }
            }
        }
    }//GEN-LAST:event_btDangKiActionPerformed

    private void pwKhachHangNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwKhachHangNhapLaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwKhachHangNhapLaiActionPerformed

    private void txtSdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSdtActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtMaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKhachHangActionPerformed
 
    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
    
    private boolean KiemTraChuaChuVaSo(String chuoi) {
        boolean ketqua = false;
        Pattern p = Pattern.compile("[a-zA-Z][0-9]");
        Matcher m = p.matcher(chuoi);
        if (!(chuoi == chuoi.toLowerCase())) {
            ketqua = m.find();
        }
        return ketqua;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDangKiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangKiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangKiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangKiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangKiKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangKi;
    private javax.swing.JButton btHuyDangKi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pwKhachHang;
    private javax.swing.JPasswordField pwKhachHangNhapLai;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
