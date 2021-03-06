/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main_java.Main;

/**
 *
 * @author Tri Tue
 */
public class frmThemSanPham extends javax.swing.JFrame {

    /**
     * Creates new form frmThemSanPham
     */
    public frmThemSanPham() {
        initComponents();
        LayDuLieuSanPham("1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        lbMaSanPham = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        lbGiaSanPham = new javax.swing.JLabel();
        btXoa = new javax.swing.JButton();
        lbTenSanPham = new javax.swing.JLabel();
        btSua = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        lbMoTa = new javax.swing.JLabel();
        lbTenSanPham1 = new javax.swing.JLabel();
        btVeMacDinh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btLuu = new javax.swing.JButton();
        txtMaSanPham = new javax.swing.JTextField();
        txtTenSanPham = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        txtGiaSanPham = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        btQuayLaiTrangChu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm sản phẩm");

        lbMaSanPham.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMaSanPham.setText("Mã sản phẩm:");

        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        lbGiaSanPham.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbGiaSanPham.setText("Giá sản phẩm:");

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        lbTenSanPham.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTenSanPham.setText("Tên sản phẩm:");

        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tool.png"))); // NOI18N
        btSua.setText("Sửa");
        btSua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSua.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Size", "Giá sản phẩm", "Mô tả"
            }
        ));
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tbSanPham);

        lbMoTa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMoTa.setText("Mô tả:");

        lbTenSanPham1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTenSanPham1.setText("Size:");

        btVeMacDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Update.png"))); // NOI18N
        btVeMacDinh.setText("Về mặc định");
        btVeMacDinh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btVeMacDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeMacDinhActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("THÊM MỚI SẢN PHẨM");

        btLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ok.png"))); // NOI18N
        btLuu.setText("Lưu");
        btLuu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btLuu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        txtMaSanPham.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtTenSanPham.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtSize.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtGiaSanPham.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtMoTa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMoTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoTaActionPerformed(evt);
            }
        });

        btQuayLaiTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        btQuayLaiTrangChu.setText("Quay lại trang chủ");
        btQuayLaiTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuayLaiTrangChuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 69, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbMaSanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbTenSanPham1)
                        .addGap(18, 18, 18)
                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbMoTa)
                        .addGap(33, 33, 33)
                        .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbTenSanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbGiaSanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGiaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(btThem)
                        .addGap(26, 26, 26)
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(btVeMacDinh)
                        .addGap(203, 203, 203)
                        .addComponent(btQuayLaiTrangChu)
                        .addGap(35, 35, 35))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaSanPham)
                            .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenSanPham)
                            .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenSanPham1)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGiaSanPham))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLuu)
                            .addComponent(btSua)
                            .addComponent(btXoa)
                            .addComponent(btThem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQuayLaiTrangChu)
                            .addComponent(btVeMacDinh)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String MaSanPham, TenSanPham,Size,GiaSanPham, MoTaSanPham;
        MaSanPham = txtMaSanPham.getText();
        TenSanPham = txtTenSanPham.getText();
        Size=txtSize.getText();
        GiaSanPham = txtGiaSanPham.getText();
      
        MoTaSanPham=txtMoTa.getText();
        String cautruyvan = "insert into product "
        + "values(N'" + MaSanPham + "','" + TenSanPham + "','" + Size + "','" + GiaSanPham + "','" + MoTaSanPham+ "')";
        System.out.println(cautruyvan);
        boolean kiemtra = KiemTraNhapSanPham(0);
        if (kiemtra) {
            Main.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
        } else {
            System.out.println("Thất Bại");
        }
        LayDuLieuSanPham("1");
    }//GEN-LAST:event_btThemActionPerformed
   
      public void LayDuLieuSanPham(String TrangThai) {
      String cautruyvan = "";
        cautruyvan = "select * from product ";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{
            "Mã sản phẩm", "Tên sản phẩm","Size","Giá sản phẩm","Mô tả"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tbSanPham.setModel(tableModel);
       
        try {
            while (rs.next()) {
            
                Object[] item = new Object[5];
               
                item[0] = rs.getInt("MaSanPham");
                item[1] = rs.getString("TenSanPham");
                item[2] = rs.getString("Size");
                item[3] = rs.getInt("GiaSanPham");
               // item[5] = rs.getDate("Ngay");
                item[4] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            
            
            System.out.println(ex.toString());
        }

    }
    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Bạn xác nhận xóa");

        String MaSanPham=txtMaSanPham.getText();
        String cautruyvan = "delete from product where MaSanPham = "+ MaSanPham;
        main_java.Main.connection.ExcuteQueryUpdateDB(cautruyvan);

        System.out.println("Đã xóa thành công");
        LayDuLieuSanPham("1");
        ClearSanPham();
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        btThem.setEnabled(false);
        btXoa.setEnabled(false);
        btVeMacDinh.setEnabled(false);
    }//GEN-LAST:event_btSuaActionPerformed
     public void ClearSanPham(){
        btThem.setEnabled(true);
        btXoa.setEnabled(false);
        btSua.setEnabled(false);
        btLuu.setEnabled(false);
        txtMaSanPham.setText("");
        txtTenSanPham.setText("");
        txtSize.setText("");
        txtGiaSanPham.setText("");
        txtMoTa.setText("");
   }
    public boolean KiemTraNhapSanPham(int ts){
     String masp, tensp,giasp,motasp,size;
     
      masp = txtMaSanPham.getText();
     tensp = txtTenSanPham.getText();
      giasp = txtGiaSanPham.getText();
      motasp=txtMoTa.getText();
      size=txtSize.getText();
      boolean kiemtra = false;
      String  ThongBao = "";
      if (masp.equals("") && ts == 1) {
            ThongBao += "bạn chưa nhập mã sản phẩm\n";
            txtMaSanPham.setForeground(Color.red);
        }
        if (tensp.equals("")) {
            ThongBao += "bạn chưa nhập tên sản phẩm\n";
            txtTenSanPham.setForeground(Color.red);
        }     
        if (size.equals("")) {
            txtGiaSanPham.setForeground(Color.red);
            ThongBao += "bạn chưa Size sản phẩm\n";
        }
         if (giasp.equals("")) {
            txtGiaSanPham.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Giá Bán\n";
        }
                try {
                  int bien =Integer.valueOf(giasp);
              } catch (Exception e) {
                  ThongBao+="Giá bán phải là số !\n";
              }   
        if (motasp.equals("")) {
            txtMoTa.setForeground(Color.red);
            ThongBao += "bạn chưa nhập mô tả sản phẩm \n";
        }
                                        
      
        if (ThongBao.equals("")) {
            kiemtra = true;
            txtTenSanPham.setForeground(Color.black);
             txtSize.setForeground(Color.black);
            txtMaSanPham.setForeground(Color.black);
            txtGiaSanPham.setForeground(Color.black);
            txtMoTa.setForeground(Color.black);
            
        } else {
            kiemtra = false;
            ThongBao(ThongBao, "lỗi nhập liệu", 2);
        }
        return kiemtra;
     }
    
    
     public void ThongBao(String noiDungThongBao,  String tieuDeThongBao, int icon ){
        JOptionPane.showMessageDialog( new JFrame(), noiDungThongBao,
                    tieuDeThongBao, icon );
    }
    private void tbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseClicked
        // TODO add your handling code here:

        btThem.setEnabled(true);
        btXoa.setEnabled(true);
        btSua.setEnabled(true);
        btLuu.setEnabled(true);
        btVeMacDinh.setEnabled(true);
        int Vitri=tbSanPham.getSelectedRow();
        txtMaSanPham.setText(tbSanPham.getValueAt(Vitri, 0).toString());
        txtTenSanPham.setText(tbSanPham.getValueAt(Vitri, 1).toString());
        txtSize.setText(tbSanPham.getValueAt(Vitri, 2).toString());
        txtGiaSanPham.setText(tbSanPham.getValueAt(Vitri, 3).toString());
        //jdtNgay.setDateFormatString((String) tbSanPham.getValueAt(Vitri,5));
        //String ngay=tbSanPham.getValueAt(Vitri, 5).toString();
        txtMoTa.setText(tbSanPham.getValueAt(Vitri, 4).toString());

        /*String strngay, strthang, strnam;
        strngay = ngay.substring(8, 10);
        strthang = ngay.substring(5, 7);
        strnam = ngay.substring(0, 4);
        int ngaysp, thangsp, namsp;
        ngaysp = Integer.valueOf(strngay);
        thangsp = Integer.valueOf(strthang);
        namsp = Integer.valueOf(strnam);
        cbbNgay.setSelectedItem(String.valueOf(ngaysp));
        cbbThang.setSelectedItem(String.valueOf(thangsp));
        cbbNam.setSelectedItem(String.valueOf(namsp));
        */

    }//GEN-LAST:event_tbSanPhamMouseClicked

    private void btVeMacDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeMacDinhActionPerformed
        // TODO add your handling code here:
        ClearSanPham();
        //cbbNgay.setSelectedIndex(1);
        // cbbThang.setSelectedIndex(1);
        // cbbNam.setSelectedIndex(2017);

    }//GEN-LAST:event_btVeMacDinhActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        btThem.setEnabled(true);
        btXoa.setEnabled(true);
        btVeMacDinh.setEnabled(true);
        String MaSanPham, TenSanPham,Size,GiaSanPham, NgaySanPham, MoTaSanPham;
        //String ngay,thang,nam;
        MaSanPham = txtMaSanPham.getText();
        TenSanPham = txtTenSanPham.getText();
        Size=txtSize.getText();
        GiaSanPham = txtGiaSanPham.getText();
        // ngay = cbbNgay.getSelectedItem().toString();
        //thang = cbbThang.getSelectedItem().toString();
        //nam = cbbNam.getSelectedItem().toString();
        // NgaySanPham = nam + "-" + thang + "-" + ngay;
        // NgaySanPham=jdtNgay.toString();
        MoTaSanPham=txtMoTa.getText();
        String cautruyvan = "update product set MaSanPham=" + "N'" + MaSanPham
        + "',TenSanPham='" + TenSanPham + "',Size='" + Size + "',GiaSanPham='" + GiaSanPham +
        "'where MaSanPham=" + MaSanPham;
        System.out.println(cautruyvan);
        boolean kiemtra = KiemTraNhapSanPham(0);
        if (kiemtra) {
            Main.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Sửa Thành Công");
        } else {
            System.out.println("Thất Bại");
        }
        JOptionPane.showMessageDialog(null, "Sửa thành công!");
        LayDuLieuSanPham("1");
    }//GEN-LAST:event_btLuuActionPerformed

    private void txtMoTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoTaActionPerformed

    private void btQuayLaiTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuayLaiTrangChuActionPerformed
        // TODO add your handling code here:
        main_java.Main.frmCT.show();
        this.dispose();
    }//GEN-LAST:event_btQuayLaiTrangChuActionPerformed

    private void tbSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSanPhamMouseEntered

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
            java.util.logging.Logger.getLogger(frmThemSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmThemSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmThemSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmThemSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmThemSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btQuayLaiTrangChu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btVeMacDinh;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbGiaSanPham;
    private javax.swing.JLabel lbMaSanPham;
    private javax.swing.JLabel lbMoTa;
    private javax.swing.JLabel lbTenSanPham;
    private javax.swing.JLabel lbTenSanPham1;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtGiaSanPham;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}
