package QuanLyBG.view;


//import QuanLyBG.BUS.NhanVienBUS;
import QuanLyBG.controller.SanPhamController;
import QuanLyBG.model.CTPhieuNhap;
import QuanLyBG.model.SanPham;
import MyCustom.MyDialog;
import MyCustom.MyTable;
import QuanLyBG.controller.CTPhieuNhapController;
import QuanLyBG.controller.PhieuNhapController;
import QuanLyBG.model.PhieuNhap;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class PnQuanLyNhapHangView extends javax.swing.JPanel {

    public PnQuanLyNhapHangView() {
        initComponents();
        customControls();
        loadDataTableKho();
        loadDataTablePhieuNhap();
       // loadDataTableCTPhieuNhap();
    }

    private SanPhamController sanPhamBUS = new SanPhamController();
   // private NhanVienBUS nhanVienBUS = new NhanVienBUS();
    private PhieuNhapController phieuNhapBUS = new PhieuNhapController();
    private CTPhieuNhapController ctPhieuNhapBUS = new CTPhieuNhapController();
    private DefaultTableModel dtmKho, dtmGioNhap, dtmPhieuNhap/*, dtmCTPhieuNhap*/;

    private void customControls() {
        dtmKho = new DefaultTableModel();
        dtmKho.addColumn("Mã SP");
        dtmKho.addColumn("Tên SP");
        dtmKho.addColumn("Tồn kho");
        tblKho.setModel(dtmKho);

        dtmGioNhap = new DefaultTableModel();
        dtmGioNhap.addColumn("Mã SP");
        dtmGioNhap.addColumn("Tên SP");
        dtmGioNhap.addColumn("Số lượng");
        dtmGioNhap.addColumn("Đơn giá");
        dtmGioNhap.addColumn("Thành tiền");
        tblGioNhap.setModel(dtmGioNhap);

        tblKho.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblKho.getColumnModel().getColumn(1).setPreferredWidth(440);
        tblKho.getColumnModel().getColumn(2).setPreferredWidth(67);

        tblGioNhap.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblGioNhap.getColumnModel().getColumn(1).setPreferredWidth(225);
        tblGioNhap.getColumnModel().getColumn(2).setPreferredWidth(42);
        tblGioNhap.getColumnModel().getColumn(3).setPreferredWidth(78);
        tblGioNhap.getColumnModel().getColumn(4).setPreferredWidth(77);

        /*txtTimKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                btnTimKiem.doClick();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                btnTimKiem.doClick();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                btnTimKiem.doClick();
            }
        });
        btnTimKiem.setVisible(false);
*/
        //====================================================================
        //====================================================================
        //====================================================================
        //====================================================================
        //====================================================================
        dtmPhieuNhap = new DefaultTableModel();
        dtmPhieuNhap.addColumn("Mã PN");
        dtmPhieuNhap.addColumn("Ngày lập");
        dtmPhieuNhap.addColumn("Tổng tiền");
        //tblPhieuNhap.setModel(dtmPhieuNhap);
       // tblPhieuNhap.getColumnModel().getColumn(0).setPreferredWidth(20);

        /*dtmCTPhieuNhap = new DefaultTableModel();
        dtmCTPhieuNhap.addColumn("Mã SP");
        dtmCTPhieuNhap.addColumn("Số lượng");
        dtmCTPhieuNhap.addColumn("Đơn giá");
        dtmCTPhieuNhap.addColumn("Thành tiền");
*/
       // tblCTPhieuNhap.setModel(dtmCTPhieuNhap);

        //=========================================================
        //================CENTER CÁC CELL CỦA TABLE================
        //=========================================================
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < dtmKho.getColumnCount(); i++) {
            tblKho.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < dtmGioNhap.getColumnCount(); i++) {
            tblGioNhap.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < dtmPhieuNhap.getColumnCount(); i++) {
          //  tblPhieuNhap.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        //for (int i = 0; i < dtmCTPhieuNhap.getColumnCount(); i++) {
           // tblCTPhieuNhap.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
       // }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        tabNhapHang = new javax.swing.JTabbedPane();
        //pnCTPhieuNhap = new javax.swing.JPanel();
        pnNhapHang = new javax.swing.JPanel();
        pnTable = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrTblKho = new javax.swing.JScrollPane();
        tblKho = new MyTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scrTblGioNhap = new javax.swing.JScrollPane();
        tblGioNhap = new MyTable();
        pnThongTin = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        btnThemVaoGio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnXoaKhoiGio = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNhaCungCap = new javax.swing.JTextField();
        btnChonNhaCungCap = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(1033, 844));
        setMinimumSize(new java.awt.Dimension(1033, 844));
        setPreferredSize(new java.awt.Dimension(1033, 844));

        tabNhapHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        //pnCTPhieuNhap.setLayout(new java.awt.BorderLayout());
        //tabNhapHang.addTab("Xem lại phiếu nhập", pnCTPhieuNhap);

        pnTable.setPreferredSize(new java.awt.Dimension(1033, 844));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Kho hàng");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 44));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 44));
        jPanel2.add(jLabel1);

        tblKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoMouseClicked(evt);
            }
        });
        scrTblKho.setViewportView(tblKho);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Hàng chờ nhập");
        jPanel3.add(jLabel2);

        tblGioNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblGioNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioNhapMouseClicked(evt);
            }
        });
        scrTblGioNhap.setViewportView(tblGioNhap);

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTableLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(pnTableLayout.createSequentialGroup()
                        .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrTblGioNhap)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrTblKho, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrTblKho, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrTblGioNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Thông tin sản phẩm");
        jPanel5.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Đơn giá nhập");
        jLabel4.setPreferredSize(new java.awt.Dimension(116, 22));
        jPanel6.add(jLabel4);

        txtDonGia.setColumns(15);
        txtDonGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDonGia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(txtDonGia);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Thông tin phiếu nhập");
        jPanel4.add(jLabel7);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnThemVaoGio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThemVaoGio.setText("Chọn nhập");
        btnThemVaoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioActionPerformed(evt);
            }
        });
        jPanel11.add(btnThemVaoGio);

        btnXoaKhoiGio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoaKhoiGio.setText("Xoá");
        btnXoaKhoiGio.setPreferredSize(new java.awt.Dimension(141, 41));
        btnXoaKhoiGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhoiGioActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoaKhoiGio);

        btnXacNhan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.setPreferredSize(new java.awt.Dimension(141, 41));
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        jPanel1.add(btnXacNhan);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Nhà cung cấp");

        txtNhaCungCap.setEditable(false);
        txtNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnChonNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChonNhaCungCap.setText("...");
        btnChonNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonNhaCungCapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtNhaCungCap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChonNhaCungCap))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel10)
                        .addGap(0, 224, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChonNhaCungCap))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Số lượng nhập");
        jPanel9.add(jLabel8);

        txtSoLuong.setColumns(15);
        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel9.add(txtSoLuong);

        javax.swing.GroupLayout pnThongTinLayout = new javax.swing.GroupLayout(pnThongTin);
        pnThongTin.setLayout(pnThongTinLayout);
        pnThongTinLayout.setHorizontalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnThongTinLayout.setVerticalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnNhapHangLayout = new javax.swing.GroupLayout(pnNhapHang);
        pnNhapHang.setLayout(pnNhapHangLayout);
        pnNhapHangLayout.setHorizontalGroup(
            pnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapHangLayout.createSequentialGroup()
                .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 364, Short.MAX_VALUE))
            .addGroup(pnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNhapHangLayout.createSequentialGroup()
                    .addGap(0, 684, Short.MAX_VALUE)
                    .addComponent(pnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnNhapHangLayout.setVerticalGroup(
            pnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapHangLayout.createSequentialGroup()
                .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 162, Short.MAX_VALUE))
            .addGroup(pnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnNhapHangLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE)))
        );

        tabNhapHang.addTab("Nhập hàng", pnNhapHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>  
    
    private void btnChonNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        DlgChonNhaCungCap dlg = new DlgChonNhaCungCap();
        dlg.setVisible(true);

        if (dlg.getNhaCungCap() != null) {
            txtNhaCungCap.setText(dlg.getNhaCungCap().getMaNCC() + " - " + dlg.getNhaCungCap().getTenNCC());
        } else {
            txtNhaCungCap.setText("");
        }
    }                                                 

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int row = tblGioNhap.getRowCount();
        if (row < 1) {
            new MyDialog("Chưa có gì để nhập!", MyDialog.ERROR_DIALOG);
            return;
        }

        String nhaCungCap = txtNhaCungCap.getText();
        //String nhanVien = cmbNhanVien.getSelectedItem() + "";

        if (nhaCungCap.equals("")) {
            new MyDialog("Hãy chọn nhà cung cấp!", MyDialog.ERROR_DIALOG);
            return;
        }

        ArrayList<CTPhieuNhap> dsct = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            int maSP = Integer.parseInt(tblGioNhap.getValueAt(i, 0) + "");
            int soLuong = Integer.parseInt(tblGioNhap.getValueAt(i, 2) + "");
            int donGia = Integer.parseInt(tblGioNhap.getValueAt(i, 3) + "");
            int thanhTien = Integer.parseInt(tblGioNhap.getValueAt(i, 4) + "");
            CTPhieuNhap ctpn = new CTPhieuNhap(0, maSP, soLuong, donGia, thanhTien);
            dsct.add(ctpn);
        }
        XuatPhieuNhapView xuatPhieuNhap = new XuatPhieuNhapView(nhaCungCap/*, nhanVien*/, dsct);
        xuatPhieuNhap.setVisible(true);
        if (xuatPhieuNhap.getCheckNhap()) {
            dtmGioNhap.setRowCount(0);
            sanPhamBUS.docListSanPham();
            loadDataTableKho();
        }
    }                                          

    private void btnXoaKhoiGioActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int row = tblGioNhap.getSelectedRow();

        if (row > -1) {
            dtmGioNhap.removeRow(row);
        } else {
            new MyDialog("Chưa chọn gì để xoá!", MyDialog.ERROR_DIALOG);
        }
    }                                             

    private void btnThemVaoGioActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int soLuong = 0;
        int donGia = 0;
        try {
            soLuong = Integer.parseInt(txtSoLuong.getText());
            donGia = Integer.parseInt(txtDonGia.getText());
        } catch (Exception e) {
            new MyDialog("Phải có số lượng và đơn giá nhập!", MyDialog.ERROR_DIALOG);
            return;
        }

        int row = tblKho.getSelectedRow();
        if (row > -1) {
            String maSP = tblKho.getValueAt(row, 0) + "";
            for (int i = 0; i < tblGioNhap.getRowCount(); i++) {
                if (maSP.equals(tblGioNhap.getValueAt(i, 0))) {
                    int soLuongCu = Integer.parseInt(tblGioNhap.getValueAt(i, 2) + "");
                    soLuong += soLuongCu;
                    int thanhTien = soLuong * donGia;
                    tblGioNhap.setValueAt(soLuong, i, 2);
                    tblGioNhap.setValueAt(donGia, i, 3);
                    tblGioNhap.setValueAt(thanhTien, i, 4);
                    return;
                }
            }
            String tenSP = tblKho.getValueAt(row, 1) + "";
            int thanhTien = soLuong * donGia;
            Vector vec = new Vector();
            vec.add(maSP);
            vec.add(tenSP);
            vec.add(soLuong);
            vec.add(donGia);
            vec.add(thanhTien);
            dtmGioNhap.addRow(vec);
        } else {
            new MyDialog("Chưa chọn sản phẩm để nhập!", MyDialog.ERROR_DIALOG);
        }
    }                                             

    private void tblGioNhapMouseClicked(java.awt.event.MouseEvent evt) {                                        
        tblKho.clearSelection();
        int row = tblGioNhap.getSelectedRow();
        if (row > -1) {
            txtSoLuong.setText(tblGioNhap.getValueAt(row, 2) + "");
            txtDonGia.setText(tblGioNhap.getValueAt(row, 3) + "");
        }
    }                                       

    private void tblKhoMouseClicked(java.awt.event.MouseEvent evt) {                                    
        txtDonGia.setText("1");
        txtSoLuong.setText("1");
        tblGioNhap.clearSelection();
    }                                   

    private void loadDataTableKho() {
        dtmKho.setRowCount(0);
        ArrayList<SanPham> dssp = sanPhamBUS.getListSanPham();
        for (SanPham sp : dssp) {
            //if (sp.getMaLoai() != 1) {
                Vector vec = new Vector();
                vec.add(sp.getMaSP());
                vec.add(sp.getTenSP());
                vec.add(sp.getSoLuong());
                dtmKho.addRow(vec);
            //}
        }
    }

    private void loadDataTableKho(String tuKhoa) {
        dtmKho.setRowCount(0);
        ArrayList<SanPham> dssp = sanPhamBUS.getSanPhamTheoTen(tuKhoa);
        for (SanPham sp : dssp) {
           // if (sp.getMaLoai() != 1) {
                Vector vec = new Vector();
                vec.add(sp.getMaSP());
                vec.add(sp.getTenSP());
                vec.add(sp.getSoLuong());
                dtmKho.addRow(vec);
            //}
        }
    }

   
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
    DecimalFormat dcf = new DecimalFormat("###,###");

    private void loadDataTablePhieuNhap() {
        phieuNhapBUS.docDanhSach();
        ArrayList<PhieuNhap> dspn = phieuNhapBUS.getListPhieuNhap();
        duaDataVaoTablePhieuNhap(dspn);
    }

    private void duaDataVaoTablePhieuNhap(ArrayList<PhieuNhap> dspn) {
        if (dspn != null) {
            dtmPhieuNhap.setRowCount(0);
            for (PhieuNhap pn : dspn) {
                Vector vec = new Vector();
                vec.add(pn.getMaPN());
                vec.add(sdf.format(pn.getNgayLap()));
                vec.add(dcf.format(pn.getTongTien()));
                dtmPhieuNhap.addRow(vec);
            }
        }
    }

    private void loadDataTablePhieuNhapTheoGia(String giaThap, String giaCao) {
        phieuNhapBUS.docDanhSach();
        ArrayList<PhieuNhap> dspn = phieuNhapBUS.getListPhieuNhapTheoGia(giaThap, giaCao);
        duaDataVaoTablePhieuNhap(dspn);
    }

    private void loadDataTablePhieuNhapTheoNgay(String tuNgay, String denNgay) {
        phieuNhapBUS.docDanhSach();
        ArrayList<PhieuNhap> dspn = phieuNhapBUS.getListPhieuNhapTheoNgay(tuNgay, denNgay);
        duaDataVaoTablePhieuNhap(dspn);
    }

   /* private void loadDataTableCTPhieuNhap() {
        dtmCTPhieuNhap.setRowCount(0);
        ArrayList<CTPhieuNhap> dsct = ctPhieuNhapBUS.getListPhieuNhap();
        if (dsct != null) {
            for (CTPhieuNhap ct : dsct) {
                Vector vec = new Vector();
                vec.add(ct.getMaSP());
                vec.add(dcf.format(ct.getSoLuong()));
                vec.add(dcf.format(ct.getDonGia()));
                vec.add(dcf.format(ct.getThanhTien()));
                dtmCTPhieuNhap.addRow(vec);
            }
        }
    }

    private void loadDataTableCTPhieuNhap(String maPN) {
        dtmCTPhieuNhap.setRowCount(0);
        ArrayList<CTPhieuNhap> dsct = ctPhieuNhapBUS.getListPhieuNhap(maPN);
        if (dsct != null) {
            for (CTPhieuNhap ct : dsct) {
                Vector vec = new Vector();
                vec.add(ct.getMaSP());
                vec.add(dcf.format(ct.getSoLuong()));
                vec.add(dcf.format(ct.getDonGia()));
                vec.add(dcf.format(ct.getThanhTien()));
                dtmCTPhieuNhap.addRow(vec);
            }
        }
    }
*/
// <editor-fold defaultstate="collapsed" desc="Variable">
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnChonNhaCungCap;
    private javax.swing.JButton btnThemVaoGio;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXoaKhoiGio;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnCTPhieuNhap;
    private javax.swing.JPanel pnNhapHang;
    private javax.swing.JPanel pnTable;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JScrollPane scrTblGioNhap;
    private javax.swing.JScrollPane scrTblKho;
    private javax.swing.JTabbedPane tabNhapHang;
    private javax.swing.JTable tblGioNhap;
    private javax.swing.JTable tblKho;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtNhaCungCap;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration                   
    //</editor-fold>

}
