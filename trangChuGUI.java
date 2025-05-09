
package trangchu;

import java.awt.CardLayout;

public class trangChuGUI extends javax.swing.JFrame {


    public trangChuGUI() {
        initComponents();
        jPanelContent.add(panelTrangChu, "trangChu");
        jPanelContent.add(panelNhanVien,"nhanVien");
        jPanelContent.add(panelPhongBan,"phongBan");


    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnPhongBan = new javax.swing.JButton();
        btnChamCong = new javax.swing.JButton();
        btnDanhGia = new javax.swing.JButton();
        panelAnhDaiDien = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();
        panelTrangChu = new javax.swing.JPanel();
        panelTongNhanVien = new javax.swing.JPanel();
        labelTongNhanVien = new javax.swing.JLabel();
        panelNhanVienCoMat = new javax.swing.JPanel();
        labelNhanVienCoMat = new javax.swing.JLabel();
        panelNhanVienDiMuon = new javax.swing.JPanel();
        labelNhanVienDiMuon = new javax.swing.JLabel();
        panelNhanVienVangMat = new javax.swing.JPanel();
        labelNhanVienVangMat = new javax.swing.JLabel();
        panelDanhSachChamCong = new javax.swing.JPanel();
        labelDanhSachChamCong = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableTrangChu = new javax.swing.JTable();
        panelNhanVien = new javax.swing.JPanel();
        panelNhanVien1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        btnTimkiempanelNhanVien = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        panelNhanVien2 = new javax.swing.JPanel();
        panelAnhDaiDienNhanVien2 = new javax.swing.JPanel();
        btnThayAnh = new javax.swing.JButton();
        labelHo = new javax.swing.JLabel();
        textHo = new javax.swing.JTextField();
        labelTen = new javax.swing.JLabel();
        textTen = new javax.swing.JTextField();
        LabelID = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        labelGioiTinh = new javax.swing.JLabel();
        labelDiaChi = new javax.swing.JLabel();
        textDiaChi = new javax.swing.JTextField();
        labelSDT = new javax.swing.JLabel();
        textSDT = new javax.swing.JTextField();
        labelChucVu = new javax.swing.JLabel();
        labelPhongBan = new javax.swing.JLabel();
        labelNgaySinh = new javax.swing.JLabel();
        comboNam = new javax.swing.JComboBox<>();
        comboGioiTinh = new javax.swing.JComboBox<>();
        btnclear = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        bthCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        comboChucVu = new javax.swing.JComboBox<>();
        comboPhongban = new javax.swing.JComboBox<>();
        comboNgaySinh = new javax.swing.JComboBox<>();
        comboThangSinh = new javax.swing.JComboBox<>();
        panelChamCong = new javax.swing.JPanel();
        labelChamCong = new javax.swing.JLabel();
        tabChamCong = new javax.swing.JTabbedPane();
        chamCongTab1 = new javax.swing.JPanel();
        labelChamCongTab1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        bangChamCong = new javax.swing.JTable();
        panelChamCongHienThiThoiGian = new javax.swing.JPanel();
        panelHienThiThongTinCaNhan = new javax.swing.JPanel();
        panelAnhDaiDientab1 = new javax.swing.JPanel();
        labelPhongBantab1 = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSDTtab1 = new javax.swing.JLabel();
        LabelHoTen = new javax.swing.JLabel();
        labelVaiTro = new javax.swing.JLabel();
        btnXemChiTiet = new javax.swing.JButton();
        LabelTrangThai = new javax.swing.JLabel();
        chamCongTab2 = new javax.swing.JPanel();
        panelGhiNhanChamCong = new javax.swing.JPanel();
        labelTieuDe1 = new javax.swing.JLabel();
        labelNhanVien = new javax.swing.JLabel();
        comboNhanVien = new javax.swing.JComboBox<>();
        labelNgayChamCong = new javax.swing.JLabel();
        ComboNam = new javax.swing.JComboBox<>();
        comboNgay = new javax.swing.JComboBox<>();
        comboThang = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        comboGiovao = new javax.swing.JComboBox<>();
        comboPhutVao = new javax.swing.JComboBox<>();
        comboSangChieuVao = new javax.swing.JComboBox<>();
        btnGhiNhanChamCong = new javax.swing.JButton();
        comboGioRa = new javax.swing.JComboBox<>();
        comboPhutRa = new javax.swing.JComboBox<>();
        ComboSangChieuRa = new javax.swing.JComboBox<>();
        panelThongTinChamCong = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        panelPhongBan = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(30);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        panelQuyMoTrungBinh = new javax.swing.JPanel();
        panelTongSoPhongBan1 = new javax.swing.JPanel();
        panelTongSoPhongBan2 = new javax.swing.JPanel();
        panelTongSoPhongBan3 = new javax.swing.JPanel();
        panelTongSoPhongBan4 = new javax.swing.JPanel();
        panelTongSoPhongBan5 = new javax.swing.JPanel();
        panelTongSoPhongBan6 = new javax.swing.JPanel();
        panelTongSoPhongBan7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelTongSoPhongBan = new javax.swing.JPanel();
        panelTongSoPhongBan9 = new javax.swing.JPanel();
        panelTongSoPhongBan10 = new javax.swing.JPanel();
        panelTongSoPhongBan11 = new javax.swing.JPanel();
        panelTongSoPhongBan12 = new javax.swing.JPanel();
        panelTongSoPhongBan13 = new javax.swing.JPanel();
        panelTongSoPhongBan14 = new javax.swing.JPanel();
        panelTongSoPhongBan15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelTongSoNhanVien = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        panelHeader.setBackground(new java.awt.Color(102, 204, 255));
        panelHeader.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HMRSYTEM");
        panelHeader.add(jLabel1);
        jLabel1.setBounds(20, 5, 150, 28);

        jPanel1.add(panelHeader);
        panelHeader.setBounds(0, 0, 1100, 40);

        panelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelMenu.setLayout(null);

        btnTrangChu.setText("Trang chủ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });
        panelMenu.add(btnTrangChu);
        btnTrangChu.setBounds(5, 220, 150, 23);

        btnNhanVien.setText("Nhân viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        panelMenu.add(btnNhanVien);
        btnNhanVien.setBounds(5, 270, 150, 23);

        btnPhongBan.setText("Phòng ban");
        btnPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongBanActionPerformed(evt);
            }
        });
        panelMenu.add(btnPhongBan);
        btnPhongBan.setBounds(5, 320, 150, 23);

        btnChamCong.setText("Chấm công");
        panelMenu.add(btnChamCong);
        btnChamCong.setBounds(5, 370, 150, 23);

        btnDanhGia.setText("Đánh giá");
        btnDanhGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhGiaActionPerformed(evt);
            }
        });
        panelMenu.add(btnDanhGia);
        btnDanhGia.setBounds(5, 420, 150, 23);

        panelAnhDaiDien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelAnhDaiDienLayout = new javax.swing.GroupLayout(panelAnhDaiDien);
        panelAnhDaiDien.setLayout(panelAnhDaiDienLayout);
        panelAnhDaiDienLayout.setHorizontalGroup(
            panelAnhDaiDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        panelAnhDaiDienLayout.setVerticalGroup(
            panelAnhDaiDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        panelMenu.add(panelAnhDaiDien);
        panelAnhDaiDien.setBounds(20, 10, 120, 130);

        jPanel1.add(panelMenu);
        panelMenu.setBounds(0, 40, 160, 560);

        jPanelContent.setLayout(new java.awt.CardLayout());

        panelTrangChu.setBackground(new java.awt.Color(204, 204, 204));
        panelTrangChu.setLayout(null);

        panelTongNhanVien.setLayout(null);

        labelTongNhanVien.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTongNhanVien.setText("Tổng nhân viên ");
        panelTongNhanVien.add(labelTongNhanVien);
        labelTongNhanVien.setBounds(40, 20, 160, 17);

        panelTrangChu.add(panelTongNhanVien);
        panelTongNhanVien.setBounds(20, 10, 190, 130);

        panelNhanVienCoMat.setLayout(null);

        labelNhanVienCoMat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNhanVienCoMat.setText("Nhân viên có mặt ");
        panelNhanVienCoMat.add(labelNhanVienCoMat);
        labelNhanVienCoMat.setBounds(40, 20, 160, 17);

        panelTrangChu.add(panelNhanVienCoMat);
        panelNhanVienCoMat.setBounds(260, 10, 190, 130);

        panelNhanVienDiMuon.setLayout(null);

        labelNhanVienDiMuon.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNhanVienDiMuon.setText("Nhân viên đi muộn");
        panelNhanVienDiMuon.add(labelNhanVienDiMuon);
        labelNhanVienDiMuon.setBounds(30, 20, 150, 17);

        panelTrangChu.add(panelNhanVienDiMuon);
        panelNhanVienDiMuon.setBounds(500, 10, 190, 130);

        panelNhanVienVangMat.setLayout(null);

        labelNhanVienVangMat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNhanVienVangMat.setText("Nhân viên vắng mặt");
        panelNhanVienVangMat.add(labelNhanVienVangMat);
        labelNhanVienVangMat.setBounds(30, 20, 140, 17);

        panelTrangChu.add(panelNhanVienVangMat);
        panelNhanVienVangMat.setBounds(730, 10, 190, 130);

        panelDanhSachChamCong.setLayout(null);

        labelDanhSachChamCong.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labelDanhSachChamCong.setText("DANH SÁCH CHẤM CÔNG");
        panelDanhSachChamCong.add(labelDanhSachChamCong);
        labelDanhSachChamCong.setBounds(6, 6, 320, 24);

        tableTrangChu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ngày", "Nhân viên ", "Giờ vào", "Giờ ra", "Trạng thái ", "Ghi chú"
            }
        ));
        jScrollPane6.setViewportView(tableTrangChu);

        panelDanhSachChamCong.add(jScrollPane6);
        jScrollPane6.setBounds(0, 40, 900, 360);

        panelTrangChu.add(panelDanhSachChamCong);
        panelDanhSachChamCong.setBounds(20, 150, 900, 400);

        jPanelContent.add(panelTrangChu, "card2");

        panelNhanVien.setBackground(new java.awt.Color(204, 204, 204));
        panelNhanVien.setLayout(null);

        panelNhanVien1.setLayout(null);

        jTextField2.setText("Nhập thông tin tìm kiếm");
        panelNhanVien1.add(jTextField2);
        jTextField2.setBounds(6, 6, 337, 31);

        btnTimkiempanelNhanVien.setBackground(new java.awt.Color(51, 255, 255));
        btnTimkiempanelNhanVien.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTimkiempanelNhanVien.setText("Tìm kiếm");
        panelNhanVien1.add(btnTimkiempanelNhanVien);
        btnTimkiempanelNhanVien.setBounds(349, 6, 100, 31);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Ảnh", "Họ ", "Tên", "Giới tính", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Chức vụ", "Phòng ban"
            }
        ));
        jScrollPane2.setViewportView(jTable5);

        panelNhanVien1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 40, 920, 250);

        panelNhanVien.add(panelNhanVien1);
        panelNhanVien1.setBounds(10, 10, 920, 290);

        panelNhanVien2.setLayout(null);

        panelAnhDaiDienNhanVien2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelAnhDaiDienNhanVien2Layout = new javax.swing.GroupLayout(panelAnhDaiDienNhanVien2);
        panelAnhDaiDienNhanVien2.setLayout(panelAnhDaiDienNhanVien2Layout);
        panelAnhDaiDienNhanVien2Layout.setHorizontalGroup(
            panelAnhDaiDienNhanVien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        panelAnhDaiDienNhanVien2Layout.setVerticalGroup(
            panelAnhDaiDienNhanVien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        panelNhanVien2.add(panelAnhDaiDienNhanVien2);
        panelAnhDaiDienNhanVien2.setBounds(792, 25, 100, 114);

        btnThayAnh.setText("Thay ảnh");
        panelNhanVien2.add(btnThayAnh);
        btnThayAnh.setBounds(797, 150, 90, 23);

        labelHo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelHo.setText("Họ:");
        panelNhanVien2.add(labelHo);
        labelHo.setBounds(60, 70, 40, 14);

        textHo.setText("jTextField3");
        panelNhanVien2.add(textHo);
        textHo.setBounds(160, 70, 190, 22);

        labelTen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTen.setText("Tên:");
        panelNhanVien2.add(labelTen);
        labelTen.setBounds(60, 110, 40, 14);

        textTen.setText("jTextField3");
        panelNhanVien2.add(textTen);
        textTen.setBounds(160, 110, 190, 22);

        LabelID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelID.setText("ID:");
        panelNhanVien2.add(LabelID);
        LabelID.setBounds(60, 30, 40, 14);

        textID.setText("jTextField3");
        panelNhanVien2.add(textID);
        textID.setBounds(160, 30, 190, 22);

        labelGioiTinh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelGioiTinh.setText("Giới tính:");
        panelNhanVien2.add(labelGioiTinh);
        labelGioiTinh.setBounds(60, 150, 70, 14);

        labelDiaChi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelDiaChi.setText("Địa chỉ:");
        panelNhanVien2.add(labelDiaChi);
        labelDiaChi.setBounds(380, 30, 60, 14);

        textDiaChi.setText("jTextField3");
        panelNhanVien2.add(textDiaChi);
        textDiaChi.setBounds(480, 30, 190, 22);

        labelSDT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelSDT.setText("Số điện thoại:");
        panelNhanVien2.add(labelSDT);
        labelSDT.setBounds(380, 70, 90, 14);

        textSDT.setText("jTextField3");
        panelNhanVien2.add(textSDT);
        textSDT.setBounds(480, 70, 190, 22);

        labelChucVu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelChucVu.setText("Chức vụ:");
        panelNhanVien2.add(labelChucVu);
        labelChucVu.setBounds(380, 110, 60, 14);

        labelPhongBan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelPhongBan.setText("Phòng ban:");
        panelNhanVien2.add(labelPhongBan);
        labelPhongBan.setBounds(380, 150, 70, 14);

        labelNgaySinh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNgaySinh.setText("Ngày sinh: ");
        panelNhanVien2.add(labelNgaySinh);
        labelNgaySinh.setBounds(60, 190, 70, 14);

        panelNhanVien2.add(comboNam);
        comboNam.setBounds(300, 190, 50, 22);

        comboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam ", "Nữ", " " }));
        panelNhanVien2.add(comboGioiTinh);
        comboGioiTinh.setBounds(160, 150, 190, 22);

        btnclear.setBackground(new java.awt.Color(153, 0, 153));
        btnclear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        panelNhanVien2.add(btnclear);
        btnclear.setBounds(460, 200, 100, 30);

        btnThem.setBackground(new java.awt.Color(0, 255, 255));
        btnThem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        panelNhanVien2.add(btnThem);
        btnThem.setBounds(791, 200, 100, 30);

        bthCapNhat.setBackground(new java.awt.Color(102, 255, 0));
        bthCapNhat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bthCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        bthCapNhat.setText("Cập nhật");
        panelNhanVien2.add(bthCapNhat);
        bthCapNhat.setBounds(680, 200, 100, 30);

        btnXoa.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        panelNhanVien2.add(btnXoa);
        btnXoa.setBounds(570, 200, 100, 30);

        panelNhanVien2.add(comboChucVu);
        comboChucVu.setBounds(480, 110, 190, 22);

        panelNhanVien2.add(comboPhongban);
        comboPhongban.setBounds(480, 150, 190, 22);

        panelNhanVien2.add(comboNgaySinh);
        comboNgaySinh.setBounds(160, 190, 50, 22);

        panelNhanVien2.add(comboThangSinh);
        comboThangSinh.setBounds(230, 190, 50, 22);

        panelNhanVien.add(panelNhanVien2);
        panelNhanVien2.setBounds(10, 310, 920, 240);

        jPanelContent.add(panelNhanVien, "card4");

        panelChamCong.setBackground(new java.awt.Color(255, 255, 255));
        panelChamCong.setLayout(null);

        labelChamCong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelChamCong.setText("QUẢN LÝ CHẤM CÔNG");
        panelChamCong.add(labelChamCong);
        labelChamCong.setBounds(10, 10, 290, 40);

        tabChamCong.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        chamCongTab1.setLayout(null);

        labelChamCongTab1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelChamCongTab1.setText("DANH SÁCH CHẤM CÔNG");
        chamCongTab1.add(labelChamCongTab1);
        labelChamCongTab1.setBounds(10, 10, 340, 28);

        bangChamCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ngày ", "Nhân viên", "Giờ vào ", "Giờ ra", "Trạng thái", "Ghi chú "
            }
        ));
        jScrollPane7.setViewportView(bangChamCong);

        chamCongTab1.add(jScrollPane7);
        jScrollPane7.setBounds(10, 50, 560, 420);

        panelChamCongHienThiThoiGian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout panelChamCongHienThiThoiGianLayout = new javax.swing.GroupLayout(panelChamCongHienThiThoiGian);
        panelChamCongHienThiThoiGian.setLayout(panelChamCongHienThiThoiGianLayout);
        panelChamCongHienThiThoiGianLayout.setHorizontalGroup(
            panelChamCongHienThiThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        panelChamCongHienThiThoiGianLayout.setVerticalGroup(
            panelChamCongHienThiThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        chamCongTab1.add(panelChamCongHienThiThoiGian);
        panelChamCongHienThiThoiGian.setBounds(770, 10, 150, 30);

        panelHienThiThongTinCaNhan.setBackground(new java.awt.Color(255, 255, 255));
        panelHienThiThongTinCaNhan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelHienThiThongTinCaNhan.setLayout(null);

        panelAnhDaiDientab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelAnhDaiDientab1Layout = new javax.swing.GroupLayout(panelAnhDaiDientab1);
        panelAnhDaiDientab1.setLayout(panelAnhDaiDientab1Layout);
        panelAnhDaiDientab1Layout.setHorizontalGroup(
            panelAnhDaiDientab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        panelAnhDaiDientab1Layout.setVerticalGroup(
            panelAnhDaiDientab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        panelHienThiThongTinCaNhan.add(panelAnhDaiDientab1);
        panelAnhDaiDientab1.setBounds(113, 19, 120, 140);

        labelPhongBantab1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelPhongBantab1.setText("Phòng ban:");
        panelHienThiThongTinCaNhan.add(labelPhongBantab1);
        labelPhongBantab1.setBounds(20, 250, 120, 17);

        labelEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelEmail.setText("Email:");
        panelHienThiThongTinCaNhan.add(labelEmail);
        labelEmail.setBounds(60, 280, 41, 17);

        labelSDTtab1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelSDTtab1.setText("SĐT:");
        panelHienThiThongTinCaNhan.add(labelSDTtab1);
        labelSDTtab1.setBounds(70, 310, 60, 17);

        LabelHoTen.setText("Họ tên ");
        panelHienThiThongTinCaNhan.add(LabelHoTen);
        LabelHoTen.setBounds(150, 170, 39, 16);

        labelVaiTro.setText("Vai trò");
        panelHienThiThongTinCaNhan.add(labelVaiTro);
        labelVaiTro.setBounds(150, 190, 70, 16);

        btnXemChiTiet.setBackground(new java.awt.Color(0, 153, 255));
        btnXemChiTiet.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnXemChiTiet.setForeground(new java.awt.Color(255, 255, 255));
        btnXemChiTiet.setText("Xem chi tiết ");
        panelHienThiThongTinCaNhan.add(btnXemChiTiet);
        btnXemChiTiet.setBounds(90, 340, 160, 29);

        LabelTrangThai.setText("Trạng thái");
        panelHienThiThongTinCaNhan.add(LabelTrangThai);
        LabelTrangThai.setBounds(150, 210, 60, 16);

        chamCongTab1.add(panelHienThiThongTinCaNhan);
        panelHienThiThongTinCaNhan.setBounds(580, 50, 340, 420);

        tabChamCong.addTab("Chấm công hằng ngày", chamCongTab1);

        chamCongTab2.setLayout(null);

        panelGhiNhanChamCong.setBackground(new java.awt.Color(255, 255, 255));
        panelGhiNhanChamCong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGhiNhanChamCong.setLayout(null);

        labelTieuDe1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTieuDe1.setText("Ghi nhận chấm công");
        panelGhiNhanChamCong.add(labelTieuDe1);
        labelTieuDe1.setBounds(10, 20, 260, 28);

        labelNhanVien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelNhanVien.setText("Nhân viên:");
        panelGhiNhanChamCong.add(labelNhanVien);
        labelNhanVien.setBounds(10, 80, 260, 22);

        comboNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn nhân viên" }));
        panelGhiNhanChamCong.add(comboNhanVien);
        comboNhanVien.setBounds(10, 110, 320, 30);

        labelNgayChamCong.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelNgayChamCong.setText("Ngày:");
        panelGhiNhanChamCong.add(labelNgayChamCong);
        labelNgayChamCong.setBounds(10, 170, 260, 22);

        ComboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm" }));
        panelGhiNhanChamCong.add(ComboNam);
        ComboNam.setBounds(190, 200, 72, 40);

        comboNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày" }));
        comboNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNgayActionPerformed(evt);
            }
        });
        panelGhiNhanChamCong.add(comboNgay);
        comboNgay.setBounds(10, 200, 72, 40);

        comboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng" }));
        panelGhiNhanChamCong.add(comboThang);
        comboThang.setBounds(100, 200, 72, 40);

        jLabel67.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel67.setText("Giờ vào:");
        panelGhiNhanChamCong.add(jLabel67);
        jLabel67.setBounds(10, 280, 90, 22);

        jLabel68.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel68.setText("Giờ ra:");
        panelGhiNhanChamCong.add(jLabel68);
        jLabel68.setBounds(180, 280, 100, 22);

        comboGiovao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giờ" }));
        comboGiovao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGiovaoActionPerformed(evt);
            }
        });
        panelGhiNhanChamCong.add(comboGiovao);
        comboGiovao.setBounds(10, 310, 50, 40);

        comboPhutVao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phút'" }));
        comboPhutVao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPhutVaoActionPerformed(evt);
            }
        });
        panelGhiNhanChamCong.add(comboPhutVao);
        comboPhutVao.setBounds(60, 310, 50, 40);

        comboSangChieuVao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        panelGhiNhanChamCong.add(comboSangChieuVao);
        comboSangChieuVao.setBounds(110, 310, 50, 40);

        btnGhiNhanChamCong.setBackground(new java.awt.Color(51, 153, 255));
        btnGhiNhanChamCong.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGhiNhanChamCong.setForeground(new java.awt.Color(255, 255, 255));
        btnGhiNhanChamCong.setText("Ghi nhận chấm công");
        panelGhiNhanChamCong.add(btnGhiNhanChamCong);
        btnGhiNhanChamCong.setBounds(15, 380, 310, 40);

        comboGioRa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giờ" }));
        comboGioRa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGioRaActionPerformed(evt);
            }
        });
        panelGhiNhanChamCong.add(comboGioRa);
        comboGioRa.setBounds(180, 310, 50, 40);

        comboPhutRa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phút'" }));
        comboPhutRa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPhutRaActionPerformed(evt);
            }
        });
        panelGhiNhanChamCong.add(comboPhutRa);
        comboPhutRa.setBounds(230, 310, 50, 40);

        ComboSangChieuRa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        panelGhiNhanChamCong.add(ComboSangChieuRa);
        ComboSangChieuRa.setBounds(280, 310, 50, 40);

        chamCongTab2.add(panelGhiNhanChamCong);
        panelGhiNhanChamCong.setBounds(10, 20, 340, 440);

        panelThongTinChamCong.setBackground(new java.awt.Color(255, 255, 255));
        panelThongTinChamCong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelThongTinChamCong.setLayout(null);

        jLabel53.setText("Hướng dẫn ghi nhận chấm công nhân viên");
        panelThongTinChamCong.add(jLabel53);
        jLabel53.setBounds(20, 50, 300, 16);

        jLabel55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel55.setText("+ Giờ vào tiêu chuẩn: 08:00");
        panelThongTinChamCong.add(jLabel55);
        jLabel55.setBounds(20, 110, 480, 17);

        jLabel56.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel56.setText("+ Giờ ra tiêu chuẩn: 17:00");
        panelThongTinChamCong.add(jLabel56);
        jLabel56.setBounds(20, 140, 164, 17);

        jLabel57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel57.setText("+ Đi muộn: Check-in sau 08:00");
        panelThongTinChamCong.add(jLabel57);
        jLabel57.setBounds(20, 170, 192, 17);

        jLabel58.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel58.setText("+ Nửa buổi: Làm việc dưới 6 tiếng");
        panelThongTinChamCong.add(jLabel58);
        jLabel58.setBounds(20, 200, 213, 17);

        jLabel59.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel59.setText("+ Vắng mặt: Không check-in và check-out");
        panelThongTinChamCong.add(jLabel59);
        jLabel59.setBounds(20, 230, 257, 17);

        jLabel61.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel61.setText("1. Chọn nhân viên cần ghi nhận chấm công");
        panelThongTinChamCong.add(jLabel61);
        jLabel61.setBounds(20, 300, 267, 17);

        jLabel62.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel62.setText("2. Chọn ngày cần ghi nhận (mặc định là hôm nay)");
        panelThongTinChamCong.add(jLabel62);
        jLabel62.setBounds(20, 330, 306, 17);

        jLabel63.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel63.setText("3. Nhập giờ vào và/hoặc giờ ra");
        panelThongTinChamCong.add(jLabel63);
        jLabel63.setBounds(20, 360, 194, 17);

        jLabel64.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel64.setText("4. Nhấn \"Ghi nhận chấm công\" để lưu thông tin");
        panelThongTinChamCong.add(jLabel64);
        jLabel64.setBounds(20, 390, 288, 17);

        jLabel65.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel65.setText("Thông tin chấm công");
        panelThongTinChamCong.add(jLabel65);
        jLabel65.setBounds(20, 20, 440, 28);

        jLabel66.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel66.setText("Quy định chấm công:");
        panelThongTinChamCong.add(jLabel66);
        jLabel66.setBounds(20, 80, 510, 22);

        jLabel69.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel69.setText("Cách thức ghi nhận:");
        panelThongTinChamCong.add(jLabel69);
        jLabel69.setBounds(20, 260, 260, 22);

        chamCongTab2.add(panelThongTinChamCong);
        panelThongTinChamCong.setBounds(370, 20, 560, 440);

        tabChamCong.addTab("Ghi nhận chấm công", chamCongTab2);

        panelChamCong.add(tabChamCong);
        tabChamCong.setBounds(0, 50, 940, 520);

        jPanelContent.add(panelChamCong, "card6");

        panelPhongBan.setBackground(new java.awt.Color(255, 255, 255));
        panelPhongBan.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUẢN LÝ PHÒNG BAN ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 290, 28);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tổ chức cơ cấu công ty và phân bố nhân sự hiệu quả ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 40, 410, 17);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(710, 20, 180, 50);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("+ Thêm phòng ban mới ");
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 63, 210, 30);

        panelPhongBan.add(jPanel2);
        jPanel2.setBounds(16, 6, 910, 100);

        panelQuyMoTrungBinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelQuyMoTrungBinh.setLayout(null);

        panelTongSoPhongBan1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan1.setLayout(null);
        panelQuyMoTrungBinh.add(panelTongSoPhongBan1);
        panelTongSoPhongBan1.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan2.setLayout(null);

        panelTongSoPhongBan3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan3.setLayout(null);
        panelTongSoPhongBan2.add(panelTongSoPhongBan3);
        panelTongSoPhongBan3.setBounds(20, 120, 280, 120);

        panelQuyMoTrungBinh.add(panelTongSoPhongBan2);
        panelTongSoPhongBan2.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan4.setLayout(null);

        panelTongSoPhongBan5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan5.setLayout(null);
        panelTongSoPhongBan4.add(panelTongSoPhongBan5);
        panelTongSoPhongBan5.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan6.setLayout(null);

        panelTongSoPhongBan7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan7.setLayout(null);
        panelTongSoPhongBan6.add(panelTongSoPhongBan7);
        panelTongSoPhongBan7.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan4.add(panelTongSoPhongBan6);
        panelTongSoPhongBan6.setBounds(20, 120, 280, 120);

        panelQuyMoTrungBinh.add(panelTongSoPhongBan4);
        panelTongSoPhongBan4.setBounds(20, 120, 280, 120);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Quy mô trùng bình ");
        panelQuyMoTrungBinh.add(jLabel6);
        jLabel6.setBounds(70, 10, 190, 22);

        panelPhongBan.add(panelQuyMoTrungBinh);
        panelQuyMoTrungBinh.setBounds(640, 120, 280, 90);

        panelTongSoPhongBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan.setLayout(null);

        panelTongSoPhongBan9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan9.setLayout(null);
        panelTongSoPhongBan.add(panelTongSoPhongBan9);
        panelTongSoPhongBan9.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan10.setLayout(null);

        panelTongSoPhongBan11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan11.setLayout(null);
        panelTongSoPhongBan10.add(panelTongSoPhongBan11);
        panelTongSoPhongBan11.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan.add(panelTongSoPhongBan10);
        panelTongSoPhongBan10.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan12.setLayout(null);

        panelTongSoPhongBan13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan13.setLayout(null);
        panelTongSoPhongBan12.add(panelTongSoPhongBan13);
        panelTongSoPhongBan13.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan14.setLayout(null);

        panelTongSoPhongBan15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoPhongBan15.setLayout(null);
        panelTongSoPhongBan14.add(panelTongSoPhongBan15);
        panelTongSoPhongBan15.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan12.add(panelTongSoPhongBan14);
        panelTongSoPhongBan14.setBounds(20, 120, 280, 120);

        panelTongSoPhongBan.add(panelTongSoPhongBan12);
        panelTongSoPhongBan12.setBounds(20, 120, 280, 120);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Tổng số phòng ban ");
        panelTongSoPhongBan.add(jLabel4);
        jLabel4.setBounds(40, 10, 210, 30);

        panelPhongBan.add(panelTongSoPhongBan);
        panelTongSoPhongBan.setBounds(20, 120, 280, 90);

        panelTongSoNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelTongSoNhanVien.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Tổng số nhân viên");
        panelTongSoNhanVien.add(jLabel5);
        jLabel5.setBounds(60, 10, 220, 30);

        panelPhongBan.add(panelTongSoNhanVien);
        panelTongSoNhanVien.setBounds(330, 120, 280, 90);

        jPanelContent.add(panelPhongBan, "card5");

        jPanel1.add(jPanelContent);
        jPanelContent.setBounds(160, 40, 940, 560);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        CardLayout layout = (CardLayout) jPanelContent.getLayout();
        layout.show(jPanelContent,"trangChu");
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
       CardLayout layout = (CardLayout) jPanelContent.getLayout();
       layout.show(jPanelContent,"nhanVien");        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongBanActionPerformed
       CardLayout layout = (CardLayout) jPanelContent.getLayout();
       layout.show(jPanelContent,"phongBan");       
    }//GEN-LAST:event_btnPhongBanActionPerformed

    private void btnDanhGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDanhGiaActionPerformed

    private void comboNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNgayActionPerformed

    private void comboGiovaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGiovaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGiovaoActionPerformed

    private void comboPhutVaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPhutVaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPhutVaoActionPerformed

    private void comboGioRaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGioRaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGioRaActionPerformed

    private void comboPhutRaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPhutRaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPhutRaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new trangChuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboNam;
    private javax.swing.JComboBox<String> ComboSangChieuRa;
    private javax.swing.JLabel LabelHoTen;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelTrangThai;
    private javax.swing.JTable bangChamCong;
    private javax.swing.JButton bthCapNhat;
    private javax.swing.JButton btnChamCong;
    private javax.swing.JButton btnDanhGia;
    private javax.swing.JButton btnGhiNhanChamCong;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhongBan;
    private javax.swing.JButton btnThayAnh;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiempanelNhanVien;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnclear;
    private javax.swing.JPanel chamCongTab1;
    private javax.swing.JPanel chamCongTab2;
    private javax.swing.JComboBox<String> comboChucVu;
    private javax.swing.JComboBox<String> comboGioRa;
    private javax.swing.JComboBox<String> comboGioiTinh;
    private javax.swing.JComboBox<String> comboGiovao;
    private javax.swing.JComboBox<String> comboNam;
    private javax.swing.JComboBox<String> comboNgay;
    private javax.swing.JComboBox<String> comboNgaySinh;
    private javax.swing.JComboBox<String> comboNhanVien;
    private javax.swing.JComboBox<String> comboPhongban;
    private javax.swing.JComboBox<String> comboPhutRa;
    private javax.swing.JComboBox<String> comboPhutVao;
    private javax.swing.JComboBox<String> comboSangChieuVao;
    private javax.swing.JComboBox<String> comboThang;
    private javax.swing.JComboBox<String> comboThangSinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelChamCong;
    private javax.swing.JLabel labelChamCongTab1;
    private javax.swing.JLabel labelChucVu;
    private javax.swing.JLabel labelDanhSachChamCong;
    private javax.swing.JLabel labelDiaChi;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelGioiTinh;
    private javax.swing.JLabel labelHo;
    private javax.swing.JLabel labelNgayChamCong;
    private javax.swing.JLabel labelNgaySinh;
    private javax.swing.JLabel labelNhanVien;
    private javax.swing.JLabel labelNhanVienCoMat;
    private javax.swing.JLabel labelNhanVienDiMuon;
    private javax.swing.JLabel labelNhanVienVangMat;
    private javax.swing.JLabel labelPhongBan;
    private javax.swing.JLabel labelPhongBantab1;
    private javax.swing.JLabel labelSDT;
    private javax.swing.JLabel labelSDTtab1;
    private javax.swing.JLabel labelTen;
    private javax.swing.JLabel labelTieuDe1;
    private javax.swing.JLabel labelTongNhanVien;
    private javax.swing.JLabel labelVaiTro;
    private javax.swing.JPanel panelAnhDaiDien;
    private javax.swing.JPanel panelAnhDaiDienNhanVien2;
    private javax.swing.JPanel panelAnhDaiDientab1;
    private javax.swing.JPanel panelChamCong;
    private javax.swing.JPanel panelChamCongHienThiThoiGian;
    private javax.swing.JPanel panelDanhSachChamCong;
    private javax.swing.JPanel panelGhiNhanChamCong;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelHienThiThongTinCaNhan;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNhanVien;
    private javax.swing.JPanel panelNhanVien1;
    private javax.swing.JPanel panelNhanVien2;
    private javax.swing.JPanel panelNhanVienCoMat;
    private javax.swing.JPanel panelNhanVienDiMuon;
    private javax.swing.JPanel panelNhanVienVangMat;
    private javax.swing.JPanel panelPhongBan;
    private javax.swing.JPanel panelQuyMoTrungBinh;
    private javax.swing.JPanel panelThongTinChamCong;
    private javax.swing.JPanel panelTongNhanVien;
    private javax.swing.JPanel panelTongSoNhanVien;
    private javax.swing.JPanel panelTongSoPhongBan;
    private javax.swing.JPanel panelTongSoPhongBan1;
    private javax.swing.JPanel panelTongSoPhongBan10;
    private javax.swing.JPanel panelTongSoPhongBan11;
    private javax.swing.JPanel panelTongSoPhongBan12;
    private javax.swing.JPanel panelTongSoPhongBan13;
    private javax.swing.JPanel panelTongSoPhongBan14;
    private javax.swing.JPanel panelTongSoPhongBan15;
    private javax.swing.JPanel panelTongSoPhongBan2;
    private javax.swing.JPanel panelTongSoPhongBan3;
    private javax.swing.JPanel panelTongSoPhongBan4;
    private javax.swing.JPanel panelTongSoPhongBan5;
    private javax.swing.JPanel panelTongSoPhongBan6;
    private javax.swing.JPanel panelTongSoPhongBan7;
    private javax.swing.JPanel panelTongSoPhongBan9;
    private javax.swing.JPanel panelTrangChu;
    private javax.swing.JTabbedPane tabChamCong;
    private javax.swing.JTable tableTrangChu;
    private javax.swing.JTextField textDiaChi;
    private javax.swing.JTextField textHo;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textSDT;
    private javax.swing.JTextField textTen;
    // End of variables declaration//GEN-END:variables

}
