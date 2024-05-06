package UI;

import DAO.UserDAO;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.User;

public class AdminUser extends javax.swing.JFrame {

    List<User> container = new ArrayList<>();

    public AdminUser() {
        initComponents();
        Table.getTableHeader().setOpaque(false);
        Table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Table.getTableHeader().setOpaque(false);
        Table.getTableHeader().setBackground(new Color(32, 136, 203));
        showData();
        checkBoxUser.setSelected(true);
        createUserID();
    }

    int MousepX, MousepY;
    private int x, y;
    public void setUser(String id) {
        label_avatar.setText(id);
    }

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
        TextUserID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TextUserName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TextUserPassword = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        MinusButton = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JLabel();
        AddButton = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        checkBoxAdmin = new javax.swing.JCheckBox();
        checkBoxUser = new javax.swing.JCheckBox();

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
        jLabel17.setText("Quản lí nhân viên");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(283, 283, 283)
                .addComponent(label_avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
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
        jLabel9.setText("ID nhân viên");

        TextUserID.setEditable(false);
        TextUserID.setBackground(new java.awt.Color(246, 241, 241));
        TextUserID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextUserID.setBorder(null);
        TextUserID.setFocusable(false);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel13.setText("Tên nhân viên");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TextUserName.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextUserName.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel14.setText("Mật khẩu");

        TextUserPassword.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextUserPassword.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(3, 3, 3)
                .addComponent(TextUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Table.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID nhân viên", "Tên nhân viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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

        jPanel1.setBackground(new java.awt.Color(234, 252, 252));

        checkBoxAdmin.setBackground(new java.awt.Color(234, 252, 252));
        checkBoxAdmin.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        checkBoxAdmin.setText("admin");
        checkBoxAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAdminActionPerformed(evt);
            }
        });

        checkBoxUser.setBackground(new java.awt.Color(234, 252, 252));
        checkBoxUser.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        checkBoxUser.setText("user");
        checkBoxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBoxUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxAdmin)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(VerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addComponent(HeadBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(HeadBar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerticalBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cancelMouseClicked

    private void home(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home
        AdminHome a = new AdminHome();
        a.setVisible(true);
        int x1 = this.getX(), y1 = this.getY();
        String ID = label_avatar.getText();
        a.setUser(ID);
        a.setAuthorized(ID);
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
        if (TextUserID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            TextUserID.requestFocus();
        } else if (TextUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            TextUserName.requestFocus();
        } else if (TextUserPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            TextUserPassword.requestFocus();
        } else {
            check = true;
        }

        if (check == true) {
            String UserID = TextUserID.getText();
            String UserName = TextUserName.getText();
            String UserPassword = TextUserPassword.getText();

            User c = new User(UserID, UserName, UserPassword);
            UserDAO.getInstance().insert(c);
        }
        showData();
    }//GEN-LAST:event_AddButtonMouseClicked

    public void createUserID() {
        String a = "";
        if (checkBoxUser.isSelected()) {
            a = "user";
        } else {
            a = "admin";
        }
        String id = UserDAO.getInstance().createUserID(a);
        TextUserID.setText(id);
    }

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        boolean check = false;
        if (TextUserID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            TextUserID.requestFocus();
        } else if (TextUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            TextUserName.requestFocus();
        } else {
            check = true;
        }

        if (check == true) {

            String UserID = TextUserID.getText();
            String UserName = TextUserName.getText();
            User cate = new User(UserID, UserName);

            UserDAO.getInstance().update(cate);
            showData();
        }
    }//GEN-LAST:event_UpdateButtonMouseClicked

    private void MinusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButtonMouseClicked
        String UserID = TextUserID.getText();
        String UserName = TextUserName.getText();
        User c = new User(UserID, UserName);
        UserDAO.getInstance().delete(c);
        showData();
        TextUserName.setText("");
    }//GEN-LAST:event_MinusButtonMouseClicked

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int count = Table.getSelectedRow();
        TableModel model = Table.getModel();
        TextUserID.setText(model.getValueAt(count, 0).toString());
        TextUserName.setText(model.getValueAt(count, 1).toString());
        TextUserPassword.setText("************");
        TextUserPassword.setBackground(new Color(246, 241, 241, 255));
        TextUserPassword.setEditable(false);
        TextUserPassword.setFocusable(false);
    }//GEN-LAST:event_TableMouseClicked

    private void SearchBtnSearchButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnSearchButtonClicked
        String UserID = TextUserID.getText();
        String UserName = TextUserName.getText();
        User c = new User(UserID, UserName);

        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        // làm sạch bảng 
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        // lấy danh sách mới đổ vào bảng
        ArrayList<User> list = UserDAO.getInstance().findUser(c);
        for (int i = 0; i < list.size(); i++) {
            User cate = list.get(i);
            model.addRow(new Object[]{cate.getUserID(), cate.getUserName()});
        }
        TextUserPassword.setText("************");
        TextUserPassword.setBackground(new Color(246, 241, 241, 255));
        TextUserPassword.setEditable(false);
    }//GEN-LAST:event_SearchBtnSearchButtonClicked

    private void checkBox() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(checkBoxAdmin);
        buttonGroup.add(checkBoxUser);
//        System.out.println(checkBoxAdmin.isSelected());
//        System.out.println(checkBoxUser.isSelected());
    }

    private void ResetBtnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnClicked
        showData();
        createUserID();
        TextUserName.setText("");
        TextUserPassword.setText("");
        TextUserPassword.setEditable(true);
        TextUserPassword.setBackground(Color.white);
        TextUserPassword.setFocusable(true);
        checkBoxUser.setSelected(true);
        checkBoxAdmin.setSelected(false);
    }//GEN-LAST:event_ResetBtnClicked

    private void checkBoxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxUserActionPerformed
        checkBox();
        createUserID();
    }//GEN-LAST:event_checkBoxUserActionPerformed

    private void checkBoxAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAdminActionPerformed
        checkBox();
        createUserID();
    }//GEN-LAST:event_checkBoxAdminActionPerformed

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

        ArrayList<User> list = UserDAO.getInstance().getAll();
        for (int i = 0; i < list.size(); i++) {
            User c = list.get(i);
            model.addRow(new Object[]{c.getUserID(), c.getUserName()});
        }
    }
    
    public void setPositionForWin(int x, int y) {
        this.setLocation(x, y);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminUser a = new AdminUser();
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
    private javax.swing.JTextField TextUserID;
    private javax.swing.JTextField TextUserName;
    private javax.swing.JTextField TextUserPassword;
    private javax.swing.JLabel UpdateButton;
    private javax.swing.JPanel VerticalBar;
    private javax.swing.JLabel cancel;
    private javax.swing.JCheckBox checkBoxAdmin;
    private javax.swing.JCheckBox checkBoxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label_avatar;
    // End of variables declaration//GEN-END:variables
}
