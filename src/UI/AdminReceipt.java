package UI;

import DAO.*;
import Model.*;
import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AdminReceipt extends javax.swing.JFrame {

    public AdminReceipt() {
        initComponents();
        Wrapper__JScroll__ProductImport.setVisible(false);
        Wrapper__input.setVisible(false);
        Wrapper__Buttons.setVisible(false);
    }

    int MousexP, MouseyP;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Wrapper = new javax.swing.JPanel();
        Wrapper__HeadBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        Wrapper__input = new javax.swing.JPanel();
        LabelCategoryID = new javax.swing.JLabel();
        TextReceiptID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        LabelProductID = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TextUserID = new javax.swing.JTextField();
        LabelProductName = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        TextReceiptCompany = new javax.swing.JTextField();
        LabelProductID1 = new javax.swing.JLabel();
        TextReceiptDate = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Wrapper__JScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Wrapper__VerticalBar = new javax.swing.JPanel();
        ReturnBtn = new javax.swing.JLabel();
        Wrapper__Buttons = new javax.swing.JPanel();
        MinusButton = new javax.swing.JLabel();
        AddButton = new javax.swing.JLabel();
        ImportProductBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelCategoryID1 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        Wrapper__JScroll__ProductImport = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        showReceiptBtn = new javax.swing.JButton();
        ImportBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Wrapper.setBackground(new java.awt.Color(234, 252, 252));
        Wrapper.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Wrapper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("ADMIN1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Administrator Male_1.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Serif", 1, 8)); // NOI18N
        jLabel15.setText(" HANDCRAFTED LEATHER");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        jLabel17.setText("Quản lí phiếu nhập");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lotus26px.png"))); // NOI18N

        cancel.setBackground(new java.awt.Color(255, 102, 51));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.png"))); // NOI18N
        cancel.setOpaque(true);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(332, 332, 332)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel)
                .addGap(0, 0, 0))
        );
        Wrapper__HeadBarLayout.setVerticalGroup(
            Wrapper__HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wrapper__HeadBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(33, 33, 33))
            .addGroup(Wrapper__HeadBarLayout.createSequentialGroup()
                .addGroup(Wrapper__HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Wrapper__HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(cancel)
                        .addComponent(jLabel4))
                    .addGroup(Wrapper__HeadBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Wrapper.add(Wrapper__HeadBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1174, 60));

        Wrapper__input.setBackground(new java.awt.Color(234, 252, 252));

        LabelCategoryID.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelCategoryID.setText("ID phiếu nhập");

        TextReceiptID.setEditable(false);
        TextReceiptID.setBackground(new java.awt.Color(245, 244, 244));
        TextReceiptID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextReceiptID.setBorder(null);
        TextReceiptID.setCaretColor(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        LabelProductID.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductID.setText("Người tạo phiếu");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TextUserID.setEditable(false);
        TextUserID.setBackground(new java.awt.Color(245, 244, 244));
        TextUserID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextUserID.setBorder(null);

        LabelProductName.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductName.setText("Nhà cung cấp");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        TextReceiptCompany.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextReceiptCompany.setBorder(null);

        LabelProductID1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductID1.setText("Ngày tạo phiếu");

        TextReceiptDate.setEditable(false);
        TextReceiptDate.setBackground(new java.awt.Color(245, 244, 244));
        TextReceiptDate.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextReceiptDate.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Wrapper__inputLayout = new javax.swing.GroupLayout(Wrapper__input);
        Wrapper__input.setLayout(Wrapper__inputLayout);
        Wrapper__inputLayout.setHorizontalGroup(
            Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__inputLayout.createSequentialGroup()
                .addGroup(Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(Wrapper__inputLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Wrapper__inputLayout.createSequentialGroup()
                                    .addComponent(LabelProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextReceiptCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Wrapper__inputLayout.createSequentialGroup()
                                    .addComponent(LabelCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(TextReceiptID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Wrapper__inputLayout.createSequentialGroup()
                                    .addComponent(LabelProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(Wrapper__inputLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(LabelProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextReceiptDate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        Wrapper__inputLayout.setVerticalGroup(
            Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__inputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCategoryID)
                    .addComponent(TextReceiptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProductID)
                    .addComponent(TextUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProductName)
                    .addComponent(TextReceiptCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProductID1)
                    .addComponent(TextReceiptDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        Wrapper.add(Wrapper__input, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 390, 230));

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

        Wrapper.add(Wrapper__JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 410, 370));

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

        Wrapper.add(Wrapper__VerticalBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, -1, 760));

        Wrapper__Buttons.setBackground(new java.awt.Color(234, 252, 252));

        MinusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalMinus.png"))); // NOI18N
        MinusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinusButtonminusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinusButtonminusNormal(evt);
            }
        });

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalAdd.png"))); // NOI18N
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButtonplusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButtonplusNormal(evt);
            }
        });

        ImportProductBtn.setBackground(new java.awt.Color(255, 102, 102));
        ImportProductBtn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        ImportProductBtn.setText("Nhập hàng");
        ImportProductBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhapHangClicked(evt);
            }
        });

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
                .addContainerGap(16, Short.MAX_VALUE)
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

        javax.swing.GroupLayout Wrapper__ButtonsLayout = new javax.swing.GroupLayout(Wrapper__Buttons);
        Wrapper__Buttons.setLayout(Wrapper__ButtonsLayout);
        Wrapper__ButtonsLayout.setHorizontalGroup(
            Wrapper__ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wrapper__ButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImportProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wrapper__ButtonsLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(MinusButton)
                .addGap(130, 130, 130))
            .addGroup(Wrapper__ButtonsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(AddButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Wrapper__ButtonsLayout.setVerticalGroup(
            Wrapper__ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__ButtonsLayout.createSequentialGroup()
                .addGroup(Wrapper__ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Wrapper__ButtonsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Wrapper__ButtonsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(MinusButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(AddButton)
                .addGap(50, 50, 50)
                .addComponent(ImportProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Wrapper.add(Wrapper__Buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 550, 270));

        Table1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Table1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID sản phẩm", "Số lượng nhập", "đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false
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
            Table1.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        Wrapper.add(Wrapper__JScroll__ProductImport, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 550, 370));

        jLabel19.setBackground(new java.awt.Color(51, 153, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel19.setText("   Kho hàng tồn ");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setOpaque(true);
        Wrapper.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, 40));

        showReceiptBtn.setBackground(new java.awt.Color(204, 204, 255));
        showReceiptBtn.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        showReceiptBtn.setText("Phiếu nhập");
        Wrapper.add(showReceiptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, -1, -1));

        ImportBtn.setBackground(new java.awt.Color(6, 214, 160));
        ImportBtn.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        ImportBtn.setText("    Kho hàng nhập ");
        ImportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImportBtnClicked(evt);
            }
        });
        Wrapper.add(ImportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Wrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void MinusButtonminusEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButtonminusEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterMinus.png");
        ImageIcon img = new ImageIcon(iconURL);
        MinusButton.setIcon(img);
    }//GEN-LAST:event_MinusButtonminusEnter

    private void MinusButtonminusNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButtonminusNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalMinus.png");
        ImageIcon img = new ImageIcon(iconURL);
        MinusButton.setIcon(img);
    }//GEN-LAST:event_MinusButtonminusNormal

    private void AddButtonplusEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonplusEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterAdd.png");
        ImageIcon img = new ImageIcon(iconURL);
        AddButton.setIcon(img);
    }//GEN-LAST:event_AddButtonplusEnter

    private void AddButtonplusNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonplusNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalAdd.png");
        ImageIcon img = new ImageIcon(iconURL);
        AddButton.setIcon(img);
    }//GEN-LAST:event_AddButtonplusNormal

    private void AddButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonClicked
        String ReceiptID = TextReceiptID.getText();
        String UserID = TextUserID.getText();
        String ReceiptCompany = TextReceiptCompany.getText();
        String ReceiptDate = TextReceiptDate.getText();
        boolean check_full_filling = true;
        if (ReceiptCompany.equals("")) {
            TextReceiptCompany.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống nhà cung cấp", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
            check_full_filling = false;
        } else {
            check_full_filling = true;
        }

        if (check_full_filling == true) {
            Receipt r = new Receipt(ReceiptID, ReceiptCompany, UserID, ReceiptDate);
            int i = ReceiptDAO.getInstance().add(r);
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Tạo thành công phôi đơn nhập", "SUCCESS ADD", JOptionPane.INFORMATION_MESSAGE);
                r.toString();
            }
        }
    }//GEN-LAST:event_AddButtonClicked

    private void Selected_Row_From_Left_Table(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Selected_Row_From_Left_Table
        // Lấy hàng và đổ giá trị vô mảng row
        int i = Table.getSelectedRow();
        TableModel model = Table.getModel();
        ArrayList<String> rowArr = new ArrayList<>();
        for (int j = 0; j < model.getColumnCount(); j++) {
            rowArr.add(model.getValueAt(i, j).toString());
        }
        int ReceiptQuantity = 0;
        String ReceiptID = TextReceiptID.getText();
        String ProductID = rowArr.get(0);
        String ProductName = rowArr.get(1);
        String quantity = num.getText();
        String price = rowArr.get(3);
        double ReceiptPrice = Double.valueOf(price);

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
                ReceiptQuantity = Integer.parseInt(quantity);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Nhập số", "SUCCESS ADD", JOptionPane.WARNING_MESSAGE);
                num.setText("");
                num.requestFocus();
            }
        }
        if (check_full_filling == true) {
            ReceiptDetail r = new ReceiptDetail(ReceiptID, ProductID, ReceiptQuantity, ReceiptPrice);
            int j = ReceiptDetailDAO.getInstance().add(r);
//            if (j == 0) {
//                JOptionPane.showMessageDialog(null, "Tạo thành công nội dung đơn con", "SUCCESS ADD", JOptionPane.INFORMATION_MESSAGE);
//                r.toString();
//            }
        }
        showDataRightTable();
    }//GEN-LAST:event_Selected_Row_From_Left_Table

    private void DeleteBtnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnClicked
        TableModel model = Table1.getModel();
        int i = Table1.getSelectedRow();
        String ProductID = model.getValueAt(i, 1).toString();
        System.out.println(ProductID);
        ReceiptDetailDAO.getInstance().delete(ProductID);
        showDataRightTable();

    }//GEN-LAST:event_DeleteBtnClicked

    private void NhapHangClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhapHangClicked
        // Xóa bảng phải
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        // xóa ô nội dung ô text
        num.setText("");
        TextReceiptCompany.setText("");

        // update kho
        String s = TextReceiptID.getText();
        ReceiptDetailDAO.getInstance().UpdateProduct(s);

        //show data bảng trái
        showDataLeftTable();

        // nhảy phôi mới
        showGreyText();

        JOptionPane.showMessageDialog(null, "Đã nhập kho", "SUCCESS ADD", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_NhapHangClicked

    private void ReturnBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnMouseExited
        URL iconURL = getClass().getResource("/icon/Vertical_Bar_Normal_Return.png");
        ImageIcon img = new ImageIcon(iconURL);
        ReturnBtn.setIcon(img);
    }//GEN-LAST:event_ReturnBtnMouseExited

    private void ImportBtnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImportBtnClicked
        Wrapper__JScroll__ProductImport.setVisible(true);
        Wrapper__input.setVisible(true);
        Wrapper__Buttons.setVisible(true);
    }//GEN-LAST:event_ImportBtnClicked

    public void showDataLeftTable() {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ArrayList<Product> list = ReceiptDAO.getInstance().getDataForLeftTable();
        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);
            model.addRow(new Object[]{p.getProductID(), p.getProductName(), p.getProductQuantity(), p.getPrice()});
        }
    }

    public void showDataRightTable() {
        System.out.println("right show ");
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        ArrayList<ReceiptDetail> list = ReceiptDetailDAO.getInstance().getDataForRightTable(TextReceiptID.getText());
        for (int i = 0; i < list.size(); i++) {
            ReceiptDetail r = list.get(i);
            model.addRow(new Object[]{(i + 1), r.getProductID(), r.getReceiptQuantity(), r.getReceiptPrice()});
        }
    }

    public void showGreyText() {
        //        điền ô xám
        String i = ReceiptDAO.getInstance().creatReceiptID();
        TextReceiptID.setText(i);
        TextUserID.setText("user1");
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);

        TextReceiptDate.setText(date.toString());
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminReceipt a = new AdminReceipt();
                a.setVisible(true);
                a.showDataLeftTable();
                a.showDataRightTable();
                a.showGreyText();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddButton;
    private javax.swing.JButton ImportBtn;
    private javax.swing.JButton ImportProductBtn;
    private javax.swing.JLabel LabelCategoryID;
    private javax.swing.JLabel LabelCategoryID1;
    private javax.swing.JLabel LabelProductID;
    private javax.swing.JLabel LabelProductID1;
    private javax.swing.JLabel LabelProductName;
    private javax.swing.JLabel MinusButton;
    private javax.swing.JLabel ReturnBtn;
    private javax.swing.JTable Table;
    private javax.swing.JTable Table1;
    private javax.swing.JTextField TextReceiptCompany;
    private javax.swing.JTextField TextReceiptDate;
    private javax.swing.JTextField TextReceiptID;
    private javax.swing.JTextField TextUserID;
    private javax.swing.JPanel Wrapper;
    private javax.swing.JPanel Wrapper__Buttons;
    private javax.swing.JPanel Wrapper__HeadBar;
    private javax.swing.JScrollPane Wrapper__JScrollPane;
    private javax.swing.JScrollPane Wrapper__JScroll__ProductImport;
    private javax.swing.JPanel Wrapper__VerticalBar;
    private javax.swing.JPanel Wrapper__input;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField num;
    private javax.swing.JButton showReceiptBtn;
    // End of variables declaration//GEN-END:variables
}
