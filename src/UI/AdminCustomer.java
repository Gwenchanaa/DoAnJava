/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAL.DaoCustomer;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Customer;

public class AdminCustomer extends javax.swing.JFrame {
    
       private static JTable table;
    DaoCustomer dal = new DaoCustomer();
    int j;

    List<Customer> container = new ArrayList<>();

    public AdminCustomer() {
        initComponents();
         showData(dal.getAll());
    }
    
    public static boolean containsLetters(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public void showData(List<Customer> customer1) {
        List<Customer> ListCustomer = new ArrayList<>();
        ListCustomer = customer1;
        DefaultTableModel table = (DefaultTableModel) bang.getModel();
        table.setRowCount(0);
        ListCustomer.forEach((customer) -> {
            table.addRow(new Object[]{
                customer.getCustomerId(),
                customer.getCustomerName(),
                customer.getCustomerPhone(),
                customer.getCustomerAddress(),
      

            });

            container.add(customer);

        });

    }
    int MousepX, MousepY;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Verticalbar = new javax.swing.JPanel();
        ReturnBtn = new javax.swing.JLabel();
        HeadBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CustomerID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        CustomerName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        CustomerPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CustomerAddress = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        UpdateButton = new javax.swing.JLabel();
        MinusButton = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        AddButton = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(234, 252, 252));

        Verticalbar.setBackground(new java.awt.Color(198, 249, 249));

        ReturnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Vertical_Bar_Normal_Return.png"))); // NOI18N
        ReturnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backHome(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReturnBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout VerticalbarLayout = new javax.swing.GroupLayout(Verticalbar);
        Verticalbar.setLayout(VerticalbarLayout);
        VerticalbarLayout.setHorizontalGroup(
            VerticalbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerticalbarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ReturnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        VerticalbarLayout.setVerticalGroup(
            VerticalbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerticalbarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
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

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("ADMIN1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Administrator Male_1.png"))); // NOI18N

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
                .addGap(167, 167, 167)
                .addComponent(jLabel17)
                .addGap(91, 91, 91)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jLabel17)
                    .addComponent(cancel)
                    .addGroup(HeadBarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel9.setText("ID khách hàng");

        CustomerID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        CustomerID.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel13.setText("Họ và tên");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        CustomerName.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        CustomerName.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel16.setText("Số điện thoại");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        CustomerPhone.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        CustomerPhone.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Địa Chỉ");

        CustomerAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(CustomerPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(CustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(CustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerAddress))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(234, 252, 252));

        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalUpdate.png"))); // NOI18N
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateButtonupdateEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateButtonupdateNormal(evt);
            }
        });

        MinusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalMinus.png"))); // NOI18N
        MinusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinusButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinusButtonminusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinusButtonminusNormal(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateButton)
                .addGap(30, 30, 30)
                .addComponent(MinusButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        bang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bang.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID khách hàng", "Họ và Tên", "sđt", "Địa Chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bang.setFillsViewportHeight(true);
        bang.setGridColor(new java.awt.Color(51, 51, 51));
        bang.setRowHeight(40);
        bang.setRowMargin(2);
        bang.setRowSelectionAllowed(false);
        bang.setSelectionBackground(new java.awt.Color(255, 255, 255));
        bang.setSelectionForeground(new java.awt.Color(0, 255, 51));
        bang.setShowGrid(true);
        bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bang);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/showwwall.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalAdd.png"))); // NOI18N
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButtonplusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButtonplusNormal(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-search-100.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Verticalbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddButton)
                        .addGap(21, 21, 21)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(HeadBar, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(HeadBar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Verticalbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cancelMouseClicked

    private void home(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home

    }//GEN-LAST:event_home

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

    private void HeadBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - MousepX, y - MousepY);
    }//GEN-LAST:event_HeadBarMouseDragged

    private void HeadBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBarMousePressed
        MousepX = evt.getX();
        MousepY = evt.getY();
    }//GEN-LAST:event_HeadBarMousePressed

    private void backHome(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backHome
        AdminHome a = new AdminHome();
        a.setVisible(true);
        int x1 = this.getX(), y1 = this.getY();
        a.setPositionForWin(x1, y1);
        dispose();
    }//GEN-LAST:event_backHome

    private void ReturnBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnMouseEntered
        URL iconURL = getClass().getResource("/icon/Vertical_Bar_Enter_Return.png");
        ImageIcon img = new ImageIcon(iconURL);
        ReturnBtn.setIcon(img);
    }//GEN-LAST:event_ReturnBtnMouseEntered

    private void ReturnBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnMouseExited
        URL iconURL = getClass().getResource("/icon/Vertical_Bar_Normal_Return.png");
        ImageIcon img = new ImageIcon(iconURL);
        ReturnBtn.setIcon(img);    }//GEN-LAST:event_ReturnBtnMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showData(dal.getAll());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        
        boolean check = false;
        if (CustomerID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            CustomerID.requestFocus();
        } else if (CustomerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            CustomerName.requestFocus();
        } else if (CustomerPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            CustomerPhone.requestFocus();
        } else if (CustomerAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            CustomerAddress.requestFocus();
        }

        else {
            {
                check = true;
            }

            if (check == true) {
                Customer nv = new Customer();
                nv.setCustomerId(Integer.parseInt(CustomerID.getText()));
                nv.setCustomerName(CustomerName.getText());               
                if (containsLetters(CustomerPhone.getText()) ) {
                    JOptionPane.showMessageDialog(null, "phai nhap la so");
                    CustomerPhone.setText("");                   
                    CustomerPhone.requestFocus();
                } else {

                  nv.setCustomerPhone(CustomerPhone.getText());
                  nv.setCustomerAddress(CustomerAddress.getText());

              
                        j = dal.insert(nv);
                    

                    if (j == 0) {
                        JOptionPane.showMessageDialog(null, "insert sucssec");

                    }
                    if (j == 1) {
                        CustomerID.setText("");
                        CustomerID.requestFocus();
                        JOptionPane.showMessageDialog(null, "Không tồn tại ");
                    }
                    if (j == 2) {
                        JOptionPane.showMessageDialog(null, "trung id so" + nv.getCustomerId()+ "");
                        CustomerID.setText("");
                        CustomerID.requestFocus();
                    }
                    showData(dal.getAll());
                    System.out.println("kk");

                    CustomerID.setText("");
                    CustomerName.setText("");
                    CustomerPhone.setText("");
                    CustomerAddress.setText("");
     

                }
            }
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        // TODO add your handling code here:
          boolean check = false;
        if (CustomerID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            CustomerID.requestFocus();
        } else if (CustomerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            CustomerName.requestFocus();
        } else if (CustomerPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            CustomerPhone.requestFocus();
        } else if (CustomerAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "khong duoc bo trong");
            CustomerAddress.requestFocus();
        
        } else {
            check = true;
        }

        if (check == true) {
            Customer cus = new Customer();

            cus.setCustomerId(Integer.parseInt(CustomerID.getText()));
            cus.setCustomerName(CustomerName.getText());
          
            if (containsLetters(CustomerPhone.getText()) ) {
                JOptionPane.showMessageDialog(null, "phai nhap la so");
                CustomerPhone.requestFocus();
            } else {
                cus.setCustomerPhone(CustomerPhone.getText());
            cus.setCustomerAddress(CustomerAddress.getText());
               
                    dal.update(cus);
                
                JOptionPane.showMessageDialog(null, "UPDATE sucseccfull");
                showData(dal.getAll());
                CustomerID.setText("");
                CustomerName.setText("");
                CustomerPhone.setText("");
                CustomerAddress.setText("");
       
            }

        }
        
        
    }//GEN-LAST:event_UpdateButtonMouseClicked

    private void MinusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButtonMouseClicked
        // TODO add your handling code here:
        
          Customer cuss = new Customer();
            cuss.setCustomerId(Integer.parseInt(CustomerID.getText()));
            dal.delete(cuss);
            JOptionPane.showMessageDialog(null, "delete sucseccfull");
            showData(dal.getAll());
            CustomerID.setText("");
            CustomerName.setText("");
            CustomerPhone.setText("");
            CustomerAddress.setText("");
       
    }//GEN-LAST:event_MinusButtonMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
         Customer cuss = new Customer();
        cuss.setCustomerName(search.getText());

        showData(dal.finCustomersByName(cuss));
    }//GEN-LAST:event_jButton2MouseClicked

    private void bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bangMouseClicked
        // TODO add your handling code here:
        
          int count = bang.getSelectedRow();
        TableModel model = bang.getModel();
        CustomerID.setText(model.getValueAt(count, 0).toString());
        CustomerName.setText(model.getValueAt(count, 1).toString());
        CustomerPhone.setText(model.getValueAt(count, 2).toString());
        CustomerAddress.setText(model.getValueAt(count, 3).toString());
      
    }//GEN-LAST:event_bangMouseClicked
    public void setPositionForWin(int x, int y) {
        this.setLocation(x, y);
    }

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
            java.util.logging.Logger.getLogger(AdminCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminCustomer a = new AdminCustomer();
                a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddButton;
    private javax.swing.JTextField CustomerAddress;
    private javax.swing.JTextField CustomerID;
    private javax.swing.JTextField CustomerName;
    private javax.swing.JTextField CustomerPhone;
    private javax.swing.JPanel HeadBar;
    private javax.swing.JLabel MinusButton;
    private javax.swing.JLabel ReturnBtn;
    private javax.swing.JLabel UpdateButton;
    private javax.swing.JPanel Verticalbar;
    private javax.swing.JTable bang;
    private javax.swing.JLabel cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
