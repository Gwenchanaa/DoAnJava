package UI;

import DAO.*;
import Model.*;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AdminOrder extends javax.swing.JFrame {

    public AdminOrder() {
        initComponents();
        Wrapper__JScroll__ProductImport.setVisible(false);
        Wrapper__input.setVisible(false);
        Wrapper__Buttons.setVisible(false);
        PhieuNhapPanel.setVisible(false);
        showDataLeftTable();
        showDataRightTable();
        showDataOrder();
    }
    private int x, y;
    int MousexP, MouseyP;

    public void setUser(String id) {
        label_avatar.setText(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Wrapper = new javax.swing.JPanel();
        PhieuNhapPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table4 = new javax.swing.JTable();
        TextCustomer = new javax.swing.JTextField();
        TextID = new javax.swing.JTextField();
        TextUser = new javax.swing.JTextField();
        TextMoney = new javax.swing.JTextField();
        TextDate = new javax.swing.JTextField();
        Wrapper__HeadBar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        label_avatar = new javax.swing.JLabel();
        Wrapper__input = new javax.swing.JPanel();
        LabelCategoryID = new javax.swing.JLabel();
        TextOrderID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        LabelProductID = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TextUserID = new javax.swing.JTextField();
        LabelProductName = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        TextCustomerID = new javax.swing.JTextField();
        LabelProductID1 = new javax.swing.JLabel();
        TextOrderDate = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        CreateOrderBtn = new javax.swing.JButton();
        Wrapper__JScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Wrapper__VerticalBar = new javax.swing.JPanel();
        ReturnBtn = new javax.swing.JLabel();
        Wrapper__Buttons = new javax.swing.JPanel();
        ImportProductBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelCategoryID1 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        LabelCategoryID3 = new javax.swing.JLabel();
        TextTotalPrice = new javax.swing.JTextField();
        ImportProductBtn1 = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        Wrapper__JScroll__ProductImport = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        showReceiptBtn = new javax.swing.JButton();
        ImportBtn = new javax.swing.JButton();
        Wrapper__JScroll__Order = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        Wrapper__Buttons1 = new javax.swing.JPanel();
        MinusButton1 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        Wrapper__input1 = new javax.swing.JPanel();
        LabelCategoryID2 = new javax.swing.JLabel();
        TextCustomerID2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        LabelProductID2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        TextUserID2 = new javax.swing.JTextField();
        LabelProductName1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        TextOrderDate2 = new javax.swing.JTextField();
        HoaDonDaLap = new javax.swing.JButton();
        HoaDonDaXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Wrapper.setBackground(new java.awt.Color(234, 252, 252));
        Wrapper.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Wrapper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WrapperMouseClicked(evt);
            }
        });
        Wrapper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Hóa đơn");

        jLabel5.setText("Khách hàng :");

        jLabel6.setText("Tổng tiền : ");

        jLabel7.setText("Người tạo đơn :");

        jLabel8.setText("Ngày :");

        Table4.setBackground(new java.awt.Color(242, 242, 242));
        Table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Số lượng", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table4.setGridColor(new java.awt.Color(242, 242, 242));
        jScrollPane1.setViewportView(Table4);
        if (Table4.getColumnModel().getColumnCount() > 0) {
            Table4.getColumnModel().getColumn(0).setResizable(false);
            Table4.getColumnModel().getColumn(1).setResizable(false);
            Table4.getColumnModel().getColumn(2).setResizable(false);
        }

        TextCustomer.setBackground(new java.awt.Color(242, 242, 242));
        TextCustomer.setBorder(null);

        TextID.setBackground(new java.awt.Color(242, 242, 242));
        TextID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TextID.setBorder(null);

        TextUser.setBackground(new java.awt.Color(242, 242, 242));
        TextUser.setBorder(null);

        TextMoney.setBackground(new java.awt.Color(242, 242, 242));
        TextMoney.setBorder(null);

        TextDate.setBackground(new java.awt.Color(242, 242, 242));
        TextDate.setBorder(null);

        javax.swing.GroupLayout PhieuNhapPanelLayout = new javax.swing.GroupLayout(PhieuNhapPanel);
        PhieuNhapPanel.setLayout(PhieuNhapPanelLayout);
        PhieuNhapPanelLayout.setHorizontalGroup(
            PhieuNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhieuNhapPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PhieuNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PhieuNhapPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PhieuNhapPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(PhieuNhapPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhieuNhapPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(PhieuNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhieuNhapPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(TextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhieuNhapPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        PhieuNhapPanelLayout.setVerticalGroup(
            PhieuNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhieuNhapPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PhieuNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PhieuNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PhieuNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PhieuNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        Wrapper.add(PhieuNhapPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        Wrapper__HeadBar.setBackground(new java.awt.Color(255, 255, 255));
        Wrapper__HeadBar.setPreferredSize(new java.awt.Dimension(762, 75));
        Wrapper__HeadBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Wrapper__HeadBarMouseDragged(evt);
            }
        });
        Wrapper__HeadBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Wrapper__HeadBarMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Serif", 1, 8)); // NOI18N
        jLabel15.setText(" HANDCRAFTED LEATHER");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        jLabel17.setText("Quản lí hóa đơn");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lotus26px.png"))); // NOI18N

        cancel.setBackground(new java.awt.Color(255, 102, 51));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.png"))); // NOI18N
        cancel.setOpaque(true);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        label_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Administrator Male_1.png"))); // NOI18N
        label_avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_avatarSignOut(evt);
            }
        });

        javax.swing.GroupLayout Wrapper__HeadBarLayout = new javax.swing.GroupLayout(Wrapper__HeadBar);
        Wrapper__HeadBar.setLayout(Wrapper__HeadBarLayout);
        Wrapper__HeadBarLayout.setHorizontalGroup(
            Wrapper__HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wrapper__HeadBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Wrapper__HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(Wrapper__HeadBarLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(316, 316, 316)
                .addComponent(label_avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(cancel)
                .addGap(0, 0, 0))
        );
        Wrapper__HeadBarLayout.setVerticalGroup(
            Wrapper__HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wrapper__HeadBarLayout.createSequentialGroup()
                .addGroup(Wrapper__HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Wrapper__HeadBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17))
                    .addGroup(Wrapper__HeadBarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addGap(33, 33, 33))
            .addGroup(Wrapper__HeadBarLayout.createSequentialGroup()
                .addGroup(Wrapper__HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addComponent(label_avatar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Wrapper.add(Wrapper__HeadBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1174, 70));

        Wrapper__input.setBackground(new java.awt.Color(234, 252, 252));
        Wrapper__input.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCategoryID.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelCategoryID.setText("ID hóa đơn");
        Wrapper__input.add(LabelCategoryID, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 7, 107, -1));

        TextOrderID.setEditable(false);
        TextOrderID.setBackground(new java.awt.Color(245, 244, 244));
        TextOrderID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextOrderID.setBorder(null);
        TextOrderID.setCaretColor(new java.awt.Color(255, 255, 255));
        Wrapper__input.add(TextOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 6, 190, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Wrapper__input.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 32, 190, -1));

        LabelProductID.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductID.setText("ID người tạo");
        Wrapper__input.add(LabelProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 71, 106, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Wrapper__input.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 96, 190, -1));

        TextUserID.setEditable(false);
        TextUserID.setBackground(new java.awt.Color(245, 244, 244));
        TextUserID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextUserID.setBorder(null);
        Wrapper__input.add(TextUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 70, 190, -1));

        LabelProductName.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductName.setText("ID khách hàng");
        Wrapper__input.add(LabelProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 135, 93, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        Wrapper__input.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 160, 190, -1));

        TextCustomerID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextCustomerID.setBorder(null);
        Wrapper__input.add(TextCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 134, 190, -1));

        LabelProductID1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductID1.setText("Ngày tạo phiếu");
        Wrapper__input.add(LabelProductID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 200, 106, -1));

        TextOrderDate.setEditable(false);
        TextOrderDate.setBackground(new java.awt.Color(245, 244, 244));
        TextOrderDate.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextOrderDate.setBorder(null);
        Wrapper__input.add(TextOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 199, 190, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        Wrapper__input.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 225, 190, -1));

        CreateOrderBtn.setBackground(new java.awt.Color(51, 153, 255));
        CreateOrderBtn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        CreateOrderBtn.setText("Tạo hóa đơn");
        CreateOrderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateOrderBtnMouseClicked(evt);
            }
        });
        Wrapper__input.add(CreateOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        Wrapper.add(Wrapper__input, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 400, 340));

        Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Table.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID sản phẩm", "Tên sản phẩm", "Số lượng", "Giá"
            }
        ));
        Table.setFillsViewportHeight(true);
        Table.setFocusable(false);
        Table.setGridColor(new java.awt.Color(51, 51, 51));
        Table.setRowHeight(28);
        Table.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Table.setShowGrid(true);
        Table.getTableHeader().setReorderingAllowed(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Selected_Row_From_Left_Table(evt);
            }
        });
        Wrapper__JScrollPane.setViewportView(Table);

        Wrapper.add(Wrapper__JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 410, 340));

        Wrapper__VerticalBar.setBackground(new java.awt.Color(198, 249, 249));

        ReturnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Vertical_Bar_Normal_Return.png"))); // NOI18N
        ReturnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnBtnhome(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReturnBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Wrapper__VerticalBarLayout = new javax.swing.GroupLayout(Wrapper__VerticalBar);
        Wrapper__VerticalBar.setLayout(Wrapper__VerticalBarLayout);
        Wrapper__VerticalBarLayout.setHorizontalGroup(
            Wrapper__VerticalBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__VerticalBarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ReturnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );
        Wrapper__VerticalBarLayout.setVerticalGroup(
            Wrapper__VerticalBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__VerticalBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(682, Short.MAX_VALUE))
        );

        Wrapper.add(Wrapper__VerticalBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 760));

        Wrapper__Buttons.setBackground(new java.awt.Color(234, 252, 252));
        Wrapper__Buttons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImportProductBtn.setBackground(new java.awt.Color(51, 153, 255));
        ImportProductBtn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        ImportProductBtn.setText("Xuất hóa đơn");
        ImportProductBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XuatHangClicked(evt);
            }
        });
        Wrapper__Buttons.add(ImportProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 150, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        LabelCategoryID1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelCategoryID1.setText("Số lượng");

        num.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        num.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(LabelCategoryID1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(num, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addComponent(LabelCategoryID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Wrapper__Buttons.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 28, -1, -1));

        jPanel2.setBackground(new java.awt.Color(6, 214, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelCategoryID3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelCategoryID3.setText("Thành tiền");

        TextTotalPrice.setBackground(new java.awt.Color(249, 246, 246));
        TextTotalPrice.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextTotalPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTotalPrice.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(LabelCategoryID3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TextTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addComponent(LabelCategoryID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Wrapper__Buttons.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 6, -1, -1));

        ImportProductBtn1.setBackground(new java.awt.Color(255, 102, 102));
        ImportProductBtn1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        ImportProductBtn1.setText("Xóa chi tiết");
        ImportProductBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteItem(evt);
            }
        });
        Wrapper__Buttons.add(ImportProductBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 110, 30));

        updateBtn.setBackground(new java.awt.Color(6, 214, 160));
        updateBtn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        updateBtn.setText("Sửa chi tiết");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateItem(evt);
            }
        });
        Wrapper__Buttons.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 110, -1));

        Wrapper.add(Wrapper__Buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 580, 320));

        Table1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Table1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Số lượng nhập", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.setFillsViewportHeight(true);
        Table1.setFocusable(false);
        Table1.setGridColor(new java.awt.Color(51, 51, 51));
        Table1.setRowHeight(28);
        Table1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Table1.setShowGrid(true);
        Table1.getTableHeader().setReorderingAllowed(false);
        Wrapper__JScroll__ProductImport.setViewportView(Table1);
        if (Table1.getColumnModel().getColumnCount() > 0) {
            Table1.getColumnModel().getColumn(0).setResizable(false);
            Table1.getColumnModel().getColumn(0).setPreferredWidth(0);
            Table1.getColumnModel().getColumn(1).setResizable(false);
            Table1.getColumnModel().getColumn(1).setPreferredWidth(0);
            Table1.getColumnModel().getColumn(2).setResizable(false);
            Table1.getColumnModel().getColumn(3).setResizable(false);
            Table1.getColumnModel().getColumn(3).setPreferredWidth(0);
            Table1.getColumnModel().getColumn(4).setResizable(false);
            Table1.getColumnModel().getColumn(4).setPreferredWidth(0);
        }

        Wrapper.add(Wrapper__JScroll__ProductImport, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 550, 340));

        jLabel19.setBackground(new java.awt.Color(51, 153, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel19.setText("   Kho hàng tồn ");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setOpaque(true);
        Wrapper.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, 40));

        showReceiptBtn.setBackground(new java.awt.Color(204, 204, 255));
        showReceiptBtn.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        showReceiptBtn.setText("Hóa đơn");
        showReceiptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReceiptBtnClicked(evt);
            }
        });
        Wrapper.add(showReceiptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, 150, -1));

        ImportBtn.setBackground(new java.awt.Color(6, 214, 160));
        ImportBtn.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        ImportBtn.setText("Tạo hóa đơn");
        ImportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImportBtnClicked(evt);
            }
        });
        Wrapper.add(ImportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 220, -1));

        Table2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Table2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã người tạo", "Mã khách hàng", "Ngày tạo đơn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table2.setFillsViewportHeight(true);
        Table2.setFocusable(false);
        Table2.setGridColor(new java.awt.Color(51, 51, 51));
        Table2.setRowHeight(28);
        Table2.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Table2.setShowGrid(true);
        Table2.getTableHeader().setReorderingAllowed(false);
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RowSelectedTable2(evt);
            }
        });
        Wrapper__JScroll__Order.setViewportView(Table2);
        if (Table2.getColumnModel().getColumnCount() > 0) {
            Table2.getColumnModel().getColumn(0).setResizable(false);
            Table2.getColumnModel().getColumn(0).setPreferredWidth(0);
            Table2.getColumnModel().getColumn(1).setResizable(false);
            Table2.getColumnModel().getColumn(2).setResizable(false);
            Table2.getColumnModel().getColumn(2).setPreferredWidth(0);
            Table2.getColumnModel().getColumn(3).setResizable(false);
        }

        Wrapper.add(Wrapper__JScroll__Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 550, 370));

        Wrapper__Buttons1.setBackground(new java.awt.Color(234, 252, 252));
        Wrapper__Buttons1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MinusButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalMinus.png"))); // NOI18N
        MinusButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinusButton1minusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinusButton1minusNormal(evt);
            }
        });
        Wrapper__Buttons1.add(MinusButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 0, -1, -1));

        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalUpdate.png"))); // NOI18N
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnReceipt(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateButtonupdateEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateButtonupdateNormal(evt);
            }
        });
        Wrapper__Buttons1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 0, -1, -1));

        SearchBtn.setBackground(new java.awt.Color(6, 214, 160));
        SearchBtn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        SearchBtn.setText("xem chi hóa đơn");
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewReceiptDetailsClicked(evt);
            }
        });
        Wrapper__Buttons1.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 150, 30));

        Wrapper__input1.setBackground(new java.awt.Color(255, 255, 255));
        Wrapper__input1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Wrapper__input1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCategoryID2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelCategoryID2.setText("ID khách hàng");
        Wrapper__input1.add(LabelCategoryID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 7, 107, -1));

        TextCustomerID2.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextCustomerID2.setBorder(null);
        Wrapper__input1.add(TextCustomerID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 32, 190, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        Wrapper__input1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 58, 190, -1));

        LabelProductID2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductID2.setText("Người tạo hóa đơn");
        Wrapper__input1.add(LabelProductID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 71, 120, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        Wrapper__input1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 122, 190, -1));

        TextUserID2.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextUserID2.setBorder(null);
        Wrapper__input1.add(TextUserID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 96, 190, -1));

        LabelProductName1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductName1.setText("Ngày nhập");
        Wrapper__input1.add(LabelProductName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 135, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        Wrapper__input1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 186, 190, -1));

        TextOrderDate2.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextOrderDate2.setBorder(null);
        Wrapper__input1.add(TextOrderDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 160, 190, -1));

        Wrapper__Buttons1.add(Wrapper__input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 210));

        HoaDonDaLap.setBackground(new java.awt.Color(6, 214, 160));
        HoaDonDaLap.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        HoaDonDaLap.setText("Hóa đơn đã lập");
        HoaDonDaLap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoaDonDaLapdeletedReceipt(evt);
            }
        });
        Wrapper__Buttons1.add(HoaDonDaLap, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 150, 30));

        HoaDonDaXoa.setBackground(new java.awt.Color(255, 102, 102));
        HoaDonDaXoa.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        HoaDonDaXoa.setText("Phiếu nhập đã hủy");
        HoaDonDaXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoaDonDaXoadeletedReceipt(evt);
            }
        });
        Wrapper__Buttons1.add(HoaDonDaXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 150, 30));

        Wrapper.add(Wrapper__Buttons1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 550, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Wrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPositionForWin(int x, int y) {
        this.setLocation(x, y);
    }
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cancelMouseClicked

    private void Wrapper__HeadBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Wrapper__HeadBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - MousexP, y - MouseyP);
    }//GEN-LAST:event_Wrapper__HeadBarMouseDragged

    private void Wrapper__HeadBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Wrapper__HeadBarMousePressed
        MousexP = evt.getX();
        MouseyP = evt.getY();
    }//GEN-LAST:event_Wrapper__HeadBarMousePressed

    private void ReturnBtnhome(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnhome
        AdminHome a = new AdminHome();
        String ID = label_avatar.getText();
        a.setUser(ID);
        a.setAuthorized(ID);
        a.setVisible(true);
        int x1 = this.getX(), y1 = this.getY();
        a.setPositionForWin(x1, y1);
        dispose();
    }//GEN-LAST:event_ReturnBtnhome

    private void ReturnBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnMouseEntered
        URL iconURL = getClass().getResource("/icon/Vertical_Bar_Enter_Return.png");
        ImageIcon img = new ImageIcon(iconURL);
        ReturnBtn.setIcon(img);
    }//GEN-LAST:event_ReturnBtnMouseEntered

    private void Selected_Row_From_Left_Table(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Selected_Row_From_Left_Table
        // Lấy hàng và đổ giá trị vô mảng row
        int i = Table.getSelectedRow();
        TableModel model = Table.getModel();
        ArrayList<String> rowArr = new ArrayList<>();
        for (int j = 0; j < model.getColumnCount(); j++) {
            rowArr.add(model.getValueAt(i, j).toString());
        }
        int ProductQuantity = (int) model.getValueAt(i, 2);
        int OrderQuantity = 0;
        String OrderID = TextOrderID.getText();
        String ProductID = rowArr.get(0);
        String ProductName = rowArr.get(1);
        String quantity = num.getText();
        String price = rowArr.get(3);
        double OrderPrice = Double.valueOf(price);

        boolean check_full_filling = true;
        if (quantity.equals("")) {
            check_full_filling = false;
            num.requestFocus();
            JOptionPane.showMessageDialog(null, "Không bỏ trống ô số lượng nhập", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else {
            check_full_filling = true;
        }
        if (!quantity.equals("") && check_full_filling == true) {
            try {
                OrderQuantity = Integer.parseInt(quantity);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Nhập số", "SUCCESS ADD", JOptionPane.WARNING_MESSAGE);
                num.setText("");
                num.requestFocus();
            }
        }
        if (check_full_filling == true) {
            if (OrderQuantity <= ProductQuantity) {
                OrderDetail r = new OrderDetail(OrderID, ProductID, OrderPrice, OrderQuantity);
                OrderDetailDAO.getInstance().add(r);
            } else {
                JOptionPane.showMessageDialog(null, "Không đủ hàng", "ADD FAIL", JOptionPane.WARNING_MESSAGE);
            }
        }
        showDataRightTable();
        TotalPrice();
    }//GEN-LAST:event_Selected_Row_From_Left_Table

    public void TotalPrice() {
        double total = 0;
        TableModel model = Table1.getModel();
        int rows = model.getRowCount();
        System.out.println(rows);
        for (int i = 0; i < rows; i++) {
            String priceStr = model.getValueAt(i, 4).toString();
            String timeString = model.getValueAt(i, 3).toString();
            int time = Integer.parseInt(timeString);
            Double price = Double.valueOf(priceStr);

            total = total + price * time;
        }
        System.out.println("tong tien " + total);

        TextTotalPrice.setText(String.valueOf(total) + " Đ");
    }

    private void XuatHangClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XuatHangClicked
        // Thêm giá tổng vào Order
        String totalStr = TextTotalPrice.getText();
        totalStr = totalStr.substring(0, totalStr.length() - 2);
        Double total = Double.valueOf(totalStr);
        String OrderID = TextOrderID.getText();

        OrderDAO.getInstance().updateOrderTotalPrice(OrderID, total);
        // Xóa bảng phải
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        // xóa tổng tiền
        TextTotalPrice.setText("");

        // xóa ô nội dung ô text
        num.setText("");
        TextCustomerID.setText("");

        // update kho
        String s = TextOrderID.getText();
        OrderDetailDAO.getInstance().UpdateProduct(s);

        //show data bảng trái
        showDataLeftTable();

        // nhảy phôi mới
        showGreyText();

        // show data Hóa đơn nhập
        showDataOrder();
        JOptionPane.showMessageDialog(null, "Đã xuất kho", "SUCCESS ADD", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_XuatHangClicked

    private void ReturnBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnMouseExited
        URL iconURL = getClass().getResource("/icon/Vertical_Bar_Normal_Return.png");
        ImageIcon img = new ImageIcon(iconURL);
        ReturnBtn.setIcon(img);
    }//GEN-LAST:event_ReturnBtnMouseExited

    private void ImportBtnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImportBtnClicked
        Wrapper__JScroll__ProductImport.setVisible(true);
        Wrapper__input.setVisible(true);
        Wrapper__Buttons.setVisible(true);
        Wrapper__JScroll__Order.setVisible(false);
        Wrapper__Buttons1.setVisible(false);
        showGreyText();
    }//GEN-LAST:event_ImportBtnClicked

    private void ReceiptBtnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceiptBtnClicked
        Wrapper__JScroll__ProductImport.setVisible(false);
        Wrapper__input.setVisible(false);
        Wrapper__Buttons.setVisible(false);
        Wrapper__JScroll__Order.setVisible(true);
        Wrapper__Buttons1.setVisible(true);
    }//GEN-LAST:event_ReceiptBtnClicked

    private void MinusButton1minusEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButton1minusEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterMinus.png");
        ImageIcon img = new ImageIcon(iconURL);
        MinusButton1.setIcon(img);
    }//GEN-LAST:event_MinusButton1minusEnter

    private void MinusButton1minusNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButton1minusNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalMinus.png");
        ImageIcon img = new ImageIcon(iconURL);
        MinusButton1.setIcon(img);
    }//GEN-LAST:event_MinusButton1minusNormal

    private void UpdateButtonupdateEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonupdateEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterUpdate.png");
        ImageIcon img = new ImageIcon(iconURL);
        UpdateButton.setIcon(img);
    }//GEN-LAST:event_UpdateButtonupdateEnter

    private void UpdateButtonupdateNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonupdateNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalUpdate.png");
        ImageIcon img = new ImageIcon(iconURL);
        UpdateButton.setIcon(img);
    }//GEN-LAST:event_UpdateButtonupdateNormal

    String a = "";
    private void RowSelectedTable2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RowSelectedTable2
        TableModel model = Table2.getModel();
        int i = Table2.getSelectedRow();
        a = model.getValueAt(i, 0).toString();
        TextID.setText(a);
        TextCustomerID2.setText(model.getValueAt(i, 2).toString());
        TextCustomer.setText(CustomerDAO.getInstance().getNameCustomer( model.getValueAt(i, 2).toString()));
        TextUserID2.setText(model.getValueAt(i, 1).toString());
        TextUser.setText(UserDAO.getInstance().getNameUser(model.getValueAt(i, 1).toString()));
        TextOrderDate2.setText(model.getValueAt(i, 3).toString());
        TextDate.setText(model.getValueAt(i, 3).toString());
        TextMoney.setText(OrderDAO.getInstance().DisplayBillOrder(a));

        DefaultTableModel model4 = (DefaultTableModel) Table4.getModel();
        int rows = Table4.getRowCount();
        for (int j = rows - 1; j >= 0; j--) {
            model4.removeRow(j);
        }
        int hang = 0;
        ArrayList<Object[]> data = OrderDetailDAO.getInstance().BillHoaDon(TextID.getText());
        for (Object[] objArray : data) {
            String stringValue = (String) objArray[0];
            int intValue = (int) objArray[1];
            double doubleValue = (double) objArray[2];

            model4.addRow(new Object[]{stringValue, intValue, doubleValue});
            hang++;
        }

    }//GEN-LAST:event_RowSelectedTable2

    private void UpdateBtnReceipt(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnReceipt
        String OrderID = a;
        String CustomerID = TextCustomerID2.getText();
        String UserID = TextUserID2.getText();
        String OrderDate = TextOrderDate2.getText();

        Order r = new Order(OrderID, UserID, CustomerID, OrderDate);
        OrderDAO.getInstance().update(r);
        System.out.println(r);
        showDataOrder();
    }//GEN-LAST:event_UpdateBtnReceipt

    private void DeleteBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtn2MouseClicked
        String OrderID = a;
        String CustomerID = TextCustomerID2.getText();
        String UserID = TextUserID2.getText();
        String OrderDate = TextOrderDate2.getText();

        Order r = new Order(OrderID, UserID, CustomerID, OrderDate);
        int i1 = OrderDetailDAO.getInstance().deleteHoaDon(OrderID);
        int i = 1;
        if (i1 == 0) {
            i = OrderDetailDAO.getInstance().delete(a);
        }
        if (i == 0) {
            OrderDAO.getInstance().delete(r);
        }
        showDataLeftTable();
        showDataOrder();
    }//GEN-LAST:event_DeleteBtn2MouseClicked

    private void CreateOrderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateOrderBtnMouseClicked
        String OrderID = TextOrderID.getText();
        String UserID = TextUserID.getText();
        String CustomerID = TextCustomerID.getText();
        String OrderDate = TextOrderDate.getText();
        boolean check_full_filling = true;
        if (CustomerID.equals("")) {
            TextCustomerID.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống khách hàng", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
            check_full_filling = false;
        } else {
            check_full_filling = true;
        }

        if (check_full_filling == true) {
            Order r = new Order(OrderID, UserID, CustomerID, OrderDate);
            int i = OrderDAO.getInstance().add(r);
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Tạo thành công hóa đơn", "ADD SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                r.toString();
            }
        }
    }//GEN-LAST:event_CreateOrderBtnMouseClicked

    private void ViewReceiptDetailsClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewReceiptDetailsClicked
        PhieuNhapPanel.setVisible(true);
    }//GEN-LAST:event_ViewReceiptDetailsClicked

    private void WrapperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WrapperMouseClicked
        PhieuNhapPanel.setVisible(false);
    }//GEN-LAST:event_WrapperMouseClicked

    private void deleteItem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteItem
        TableModel model = Table1.getModel();
        int i = Table1.getSelectedRow();
        String ProductID = model.getValueAt(i, 1).toString();
        System.out.println(ProductID);
        OrderDetailDAO.getInstance().deleteTable1(ProductID);
        showDataRightTable();
        TotalPrice();
        showDataRightTable();
    }//GEN-LAST:event_deleteItem

    private void updateItem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateItem
        String n = String.valueOf(num.getText());
        TableModel model = Table1.getModel();
        int i = Table1.getSelectedRow();
        String ProductID = model.getValueAt(i, 1).toString();
        System.out.println(ProductID);
        OrderDetailDAO.getInstance().updateTable1(ProductID, n);
        showDataRightTable();
        TotalPrice();
        showDataRightTable();
    }//GEN-LAST:event_updateItem

    private void HoaDonDaLapdeletedReceipt(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonDaLapdeletedReceipt
        showDataOrder();
    }//GEN-LAST:event_HoaDonDaLapdeletedReceipt

    private void HoaDonDaXoadeletedReceipt(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonDaXoadeletedReceipt
        DefaultTableModel model = (DefaultTableModel) Table2.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ArrayList<Order> list = OrderDAO.getInstance().getDataForTableOrder(1);
        for (int i = 0; i < list.size(); i++) {
            Order r = list.get(i);
            model.addRow(new Object[]{r.getOrderID(), r.getUserID(), r.getCustomerID(), r.getOrderDate()});
        }
    }//GEN-LAST:event_HoaDonDaXoadeletedReceipt

    private void label_avatarSignOut(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_avatarSignOut
        int choice = JOptionPane.showConfirmDialog(null, "Đăng xuất ?", "SIGN OUT", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            Login a = new Login();
            a.setVisible(true);
            x = this.getX();
            y = this.getY();
            a.setPositionForWin(x, y);
            dispose();
        }
    }//GEN-LAST:event_label_avatarSignOut

    public void showDataLeftTable() {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ArrayList<Product> list = OrderDAO.getInstance().getDataForLeftTable();
        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);
            model.addRow(new Object[]{p.getProductID(), p.getProductName(), p.getProductQuantity(), p.getPrice()});
        }
    }

    public void showDataRightTable() {
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        ArrayList<OrderDetail> list = OrderDetailDAO.getInstance().getDataForRightTable(TextOrderID.getText());
        for (int i = 0; i < list.size(); i++) {
            OrderDetail r = list.get(i);
            model.addRow(new Object[]{(i + 1), r.getProductID(), ProductDAO.getInstance().getNameProductFromID(r.getProductID()), r.getOrderQuantity(), r.getOrderPrice()});
        }
    }

    public void showGreyText() {
        //        điền ô xám
        String i = OrderDAO.getInstance().creatOrderID();
        String text = label_avatar.getText();
        TextOrderID.setText(i);
        TextUserID.setText(text);
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        TextOrderDate.setText(date.toString());
    }

    public void showDataOrder() {
        DefaultTableModel model = (DefaultTableModel) Table2.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ArrayList<Order> list = OrderDAO.getInstance().getDataForTableOrder(0);
        for (int i = 0; i < list.size(); i++) {
            Order r = list.get(i);
            model.addRow(new Object[]{r.getOrderID(), r.getUserID(), r.getCustomerID(), r.getOrderDate()});
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminOrder a = new AdminOrder();
                a.setVisible(true);
                a.showDataLeftTable();
                a.showDataRightTable();
                a.showGreyText();
                a.showDataOrder();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateOrderBtn;
    private javax.swing.JButton HoaDonDaLap;
    private javax.swing.JButton HoaDonDaXoa;
    private javax.swing.JButton ImportBtn;
    private javax.swing.JButton ImportProductBtn;
    private javax.swing.JButton ImportProductBtn1;
    private javax.swing.JLabel LabelCategoryID;
    private javax.swing.JLabel LabelCategoryID1;
    private javax.swing.JLabel LabelCategoryID2;
    private javax.swing.JLabel LabelCategoryID3;
    private javax.swing.JLabel LabelProductID;
    private javax.swing.JLabel LabelProductID1;
    private javax.swing.JLabel LabelProductID2;
    private javax.swing.JLabel LabelProductName;
    private javax.swing.JLabel LabelProductName1;
    private javax.swing.JLabel MinusButton1;
    private javax.swing.JPanel PhieuNhapPanel;
    private javax.swing.JLabel ReturnBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTable Table;
    private javax.swing.JTable Table1;
    private javax.swing.JTable Table2;
    private javax.swing.JTable Table4;
    private javax.swing.JTextField TextCustomer;
    private javax.swing.JTextField TextCustomerID;
    private javax.swing.JTextField TextCustomerID2;
    private javax.swing.JTextField TextDate;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextMoney;
    private javax.swing.JTextField TextOrderDate;
    private javax.swing.JTextField TextOrderDate2;
    private javax.swing.JTextField TextOrderID;
    private javax.swing.JTextField TextTotalPrice;
    private javax.swing.JTextField TextUser;
    private javax.swing.JTextField TextUserID;
    private javax.swing.JTextField TextUserID2;
    private javax.swing.JLabel UpdateButton;
    private javax.swing.JPanel Wrapper;
    private javax.swing.JPanel Wrapper__Buttons;
    private javax.swing.JPanel Wrapper__Buttons1;
    private javax.swing.JPanel Wrapper__HeadBar;
    private javax.swing.JScrollPane Wrapper__JScrollPane;
    private javax.swing.JScrollPane Wrapper__JScroll__Order;
    private javax.swing.JScrollPane Wrapper__JScroll__ProductImport;
    private javax.swing.JPanel Wrapper__VerticalBar;
    private javax.swing.JPanel Wrapper__input;
    private javax.swing.JPanel Wrapper__input1;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel label_avatar;
    private javax.swing.JTextField num;
    private javax.swing.JButton showReceiptBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
