package UI;

import BUS.function;
import DAO.CustomerDAO;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Customer;

public class AdminCustomer extends javax.swing.JFrame {

    List<Customer> container = new ArrayList<>();

    public AdminCustomer() {
        initComponents();
        Table.getTableHeader().setOpaque(false);
        Table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Table.getTableHeader().setOpaque(false);
        Table.getTableHeader().setBackground(new Color(32, 136, 203));
        createCustomerID();
        showData();
    }

    int MousepX, MousepY;
    private int x, y;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        VerticalBar = new javax.swing.JPanel();
        ReturnBtn = new javax.swing.JLabel();
        HeadBar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        label_avatar = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TextCustomerID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TextCustomerName = new javax.swing.JTextField();
        TextCustomerAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TextCustomerPhone = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        MinusButton = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JLabel();
        AddButton = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(234, 252, 252));

        VerticalBar.setBackground(new java.awt.Color(198, 249, 249));

        ReturnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Vertical_Bar_Normal_Return.png"))); // NOI18N
        ReturnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReturnBtnExited(evt);
            }
        });

        javax.swing.GroupLayout VerticalBarLayout = new javax.swing.GroupLayout(VerticalBar);
        VerticalBar.setLayout(VerticalBarLayout);
        VerticalBarLayout.setHorizontalGroup(
            VerticalBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerticalBarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ReturnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );
        VerticalBarLayout.setVerticalGroup(
            VerticalBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerticalBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HeadBar.setBackground(new java.awt.Color(255, 255, 255));
        HeadBar.setPreferredSize(new java.awt.Dimension(762, 75));
        HeadBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeadBarMouseDragged(evt);
            }
        });
        HeadBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeadBarMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Serif", 1, 8)); // NOI18N
        jLabel15.setText(" HANDCRAFTED LEATHER");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        jLabel17.setText("Quản lí khách hàng");

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

        javax.swing.GroupLayout HeadBarLayout = new javax.swing.GroupLayout(HeadBar);
        HeadBar.setLayout(HeadBarLayout);
        HeadBarLayout.setHorizontalGroup(
            HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(HeadBarLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(222, 222, 222)
                .addComponent(label_avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(cancel))
        );
        HeadBarLayout.setVerticalGroup(
            HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(33, 33, 33))
            .addGroup(HeadBarLayout.createSequentialGroup()
                .addGroup(HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addGroup(HeadBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addComponent(label_avatar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel9.setText("ID khách hàng");

        TextCustomerID.setBackground(new java.awt.Color(246, 241, 241));
        TextCustomerID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextCustomerID.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel13.setText("Họ tên");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TextCustomerName.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextCustomerName.setBorder(null);

        TextCustomerAddress.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextCustomerAddress.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel14.setText("Số điện thoại");

        TextCustomerPhone.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextCustomerPhone.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel16.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel16.setText("Địa chỉ");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Table.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID khách hàng", "Họ tên", "Số điện thoại", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setFillsViewportHeight(true);
        Table.setFocusable(false);
        Table.setGridColor(new java.awt.Color(51, 51, 51));
        Table.setRowHeight(28);
        Table.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Table.setShowGrid(true);
        Table.setUpdateSelectionOnSort(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel8.setBackground(new java.awt.Color(234, 252, 252));

        MinusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalMinus.png"))); // NOI18N
        MinusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinusButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusNormal(evt);
            }
        });

        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalUpdate.png"))); // NOI18N
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateNormal(evt);
            }
        });

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalAdd.png"))); // NOI18N
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plusNormal(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(AddButton)
                .addGap(63, 63, 63)
                .addComponent(UpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(MinusButton)
                .addGap(15, 15, 15))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddButton)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinusButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        SearchBtn.setBackground(new java.awt.Color(6, 214, 160));
        SearchBtn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        SearchBtn.setText("Tìm kiếm");
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnSearchButtonClicked(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(6, 214, 160));
        ResetBtn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        ResetBtn.setText("Reload");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(VerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(109, 109, 109))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
            .addComponent(HeadBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(HeadBar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerticalBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cancelMouseClicked

    public void setUser(String id) {
        label_avatar.setText(id);
    }
    
    private void home(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home
        AdminHome a = new AdminHome();
        a.setVisible(true);
        int x1 = this.getX(), y1 = this.getY();
        String ID = label_avatar.getText();
        a.setUser(ID);
        a.setPositionForWin(x1, y1);
        dispose();
    }//GEN-LAST:event_home

    private void plusEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterAdd.png");
        ImageIcon img = new ImageIcon(iconURL);
        AddButton.setIcon(img);
    }//GEN-LAST:event_plusEnter

    private void plusNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalAdd.png");
        ImageIcon img = new ImageIcon(iconURL);
        AddButton.setIcon(img);
    }//GEN-LAST:event_plusNormal

    private void updateEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterUpdate.png");
        ImageIcon img = new ImageIcon(iconURL);
        UpdateButton.setIcon(img);
    }//GEN-LAST:event_updateEnter

    private void updateNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalUpdate.png");
        ImageIcon img = new ImageIcon(iconURL);
        UpdateButton.setIcon(img);
    }//GEN-LAST:event_updateNormal

    private void minusEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterMinus.png");
        ImageIcon img = new ImageIcon(iconURL);
        MinusButton.setIcon(img);
    }//GEN-LAST:event_minusEnter

    private void minusNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalMinus.png");
        ImageIcon img = new ImageIcon(iconURL);
        MinusButton.setIcon(img);
    }//GEN-LAST:event_minusNormal

    private void HeadBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - MousepX, y - MousepY);
    }//GEN-LAST:event_HeadBarMouseDragged

    private void HeadBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBarMousePressed
        MousepX = evt.getX();
        MousepY = evt.getY();
    }//GEN-LAST:event_HeadBarMousePressed

    private void ReturnBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnMouseEntered
        URL iconURL = getClass().getResource("/icon/Vertical_Bar_Enter_Return.png");
        ImageIcon img = new ImageIcon(iconURL);
        ReturnBtn.setIcon(img);
    }//GEN-LAST:event_ReturnBtnMouseEntered

    private void ReturnBtnExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnExited
        URL iconURL = getClass().getResource("/icon/Vertical_Bar_Normal_Return.png");
        ImageIcon img = new ImageIcon(iconURL);
        ReturnBtn.setIcon(img);
    }//GEN-LAST:event_ReturnBtnExited

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        boolean check = false;
        if (TextCustomerID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không bỏ trống");
            TextCustomerID.requestFocus();
        } else if (TextCustomerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không bỏ trống");
            TextCustomerName.requestFocus();
        } else if (TextCustomerPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không bỏ trống");
            TextCustomerPhone.requestFocus();
        } else if (TextCustomerAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không bỏ trống");
            TextCustomerAddress.requestFocus();
        } else if (!TextCustomerPhone.getText().isEmpty()) {
            String phone = TextCustomerPhone.getText();
            if (function.checkPhone(phone) == false) {
                JOptionPane.showMessageDialog(null, "Nhập đúng sđt");
                TextCustomerPhone.requestFocus();
            } else {
                check = true;
            }
        } else {
            check = true;
        }

        if (check == true) {
            String CustomerID = TextCustomerID.getText();
            String CustomerName = TextCustomerName.getText();
            String CustomerPhone = TextCustomerPhone.getText();
            String CustomerAddress = TextCustomerAddress.getText();

            Customer c = new Customer(CustomerID, CustomerName, CustomerPhone, CustomerAddress);
            CustomerDAO.getInstance().insert(c);
        }
        showData();
    }//GEN-LAST:event_AddButtonMouseClicked

    public void createCustomerID() {
        String id = CustomerDAO.getInstance().createCustomerID();
        TextCustomerID.setText(id);
    }

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        boolean check = false;
        if (TextCustomerID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không bỏ trống");
            TextCustomerID.requestFocus();
        } else if (TextCustomerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không bỏ trống");
            TextCustomerName.requestFocus();
        } else if (TextCustomerPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không bỏ trống");
            TextCustomerPhone.requestFocus();
        } else if (TextCustomerAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không bỏ trống");
            TextCustomerAddress.requestFocus();
        } else if (!TextCustomerPhone.getText().isEmpty()) {
            String phone = TextCustomerPhone.getText();
            if (function.checkPhone(phone) == false) {
                JOptionPane.showMessageDialog(null, "Nhập đúng sđt");
                TextCustomerPhone.requestFocus();
            } else {
                check = true;
            }
        } else {
            check = true;
        }

        if (check == true) {

            String CustomerID = TextCustomerID.getText();
            String CustomerName = TextCustomerName.getText();
            String CustomerPhone = TextCustomerPhone.getText();
            String CustomerAddress = TextCustomerAddress.getText();

            Customer c = new Customer(CustomerID, CustomerName, CustomerPhone, CustomerAddress);
            CustomerDAO.getInstance().update(c);
            showData();
        }
    }//GEN-LAST:event_UpdateButtonMouseClicked

    private void MinusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButtonMouseClicked
        String CustomerID = TextCustomerID.getText();
        String CustomerName = TextCustomerName.getText();
        String CustomerPhone = TextCustomerPhone.getText();
        String CustomerAddress = TextCustomerAddress.getText();
        Customer c = new Customer(CustomerID, CustomerName, CustomerPhone, CustomerAddress);
        CustomerDAO.getInstance().delete(c);
        showData();
        TextCustomerName.setText("");
    }//GEN-LAST:event_MinusButtonMouseClicked

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int count = Table.getSelectedRow();
        TableModel model = Table.getModel();
        TextCustomerID.setText(model.getValueAt(count, 0).toString());
        TextCustomerName.setText(model.getValueAt(count, 1).toString());
        TextCustomerPhone.setText(model.getValueAt(count, 2).toString());
        TextCustomerAddress.setText(model.getValueAt(count, 3).toString());
    }//GEN-LAST:event_TableMouseClicked

    private void SearchBtnSearchButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnSearchButtonClicked
        String CustomerID = TextCustomerID.getText();
        String CustomerName = TextCustomerName.getText();
        String CustomerPhone = TextCustomerPhone.getText();
        String CustomerAddress = TextCustomerAddress.getText();
        Customer c = new Customer(CustomerID, CustomerName, CustomerPhone, CustomerAddress);

        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        // làm sạch bảng 
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        // lấy danh sách mới đổ vào bảng
        ArrayList<Customer> list = CustomerDAO.getInstance().findCustomer(c);
        for (int i = 0; i < list.size(); i++) {
            Customer c1 = list.get(i);
            model.addRow(new Object[]{c1.getCustomerID(), c1.getCustomerName(), c1.getCustomerPhone(), c1.getCustomerAddress()});
        }
    }//GEN-LAST:event_SearchBtnSearchButtonClicked

    private void ResetBtnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnClicked
        showData();
        createCustomerID();
        TextCustomerName.setText("");
        TextCustomerPhone.setText("");
        TextCustomerAddress.setText("");
    }//GEN-LAST:event_ResetBtnClicked

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

    public void showData() {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        // làm sạch bảng 
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        ArrayList<Customer> list = CustomerDAO.getInstance().getAll();
        for (int i = 0; i < list.size(); i++) {
            Customer c = list.get(i);
            model.addRow(new Object[]{c.getCustomerID(), c.getCustomerName(), c.getCustomerPhone(), c.getCustomerAddress()});
        }
    }

    public void setPositionForWin(int x, int y) {
        this.setLocation(x, y);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminCustomer a = new AdminCustomer();
                a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddButton;
    private javax.swing.JPanel HeadBar;
    private javax.swing.JLabel MinusButton;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel ReturnBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TextCustomerAddress;
    private javax.swing.JTextField TextCustomerID;
    private javax.swing.JTextField TextCustomerName;
    private javax.swing.JTextField TextCustomerPhone;
    private javax.swing.JLabel UpdateButton;
    private javax.swing.JPanel VerticalBar;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel label_avatar;
    // End of variables declaration//GEN-END:variables
}
