package UI;

import DAO.ProductDAO;
import Model.Product;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AdminProduct extends javax.swing.JFrame {

    String Path = "";

    public AdminProduct() {
        initComponents();
        Table.getTableHeader().setOpaque(false);
        Table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Table.getTableHeader().setOpaque(false);
        Table.getTableHeader().setBackground(new Color(32, 136, 203));
        TextProductID.setText(createProductID());
        getListCategoryID();
    }
    // HIỆU ỨNG THANH BAR VÀ CÁC NÚT
    int MousexP, MouseyP;
    private int x, y;
    public void setUser(String id) {
        label_avatar1.setText(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Wrapper = new javax.swing.JPanel();
        Wrapper__HeadBar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        label_avatar1 = new javax.swing.JLabel();
        Wrapper__input = new javax.swing.JPanel();
        LabelCategoryID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LabelProductID = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TextProductID = new javax.swing.JTextField();
        LabelProductName = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        TextProductName = new javax.swing.JTextField();
        LabelPrice = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        TextProductPrice = new javax.swing.JTextField();
        LabelQuantity = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        TextProductQuantity = new javax.swing.JTextField();
        cateComboBox = new javax.swing.JComboBox<>();
        Wrapper__JScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Wrapper__VerticalBar = new javax.swing.JPanel();
        ReturnBtn = new javax.swing.JLabel();
        Wrapper__Image = new javax.swing.JPanel();
        PanelCha = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ImageBtn = new javax.swing.JButton();
        Wrapper__Buttons = new javax.swing.JPanel();
        MinusButton = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JLabel();
        AddButton = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        TextCategoryID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Wrapper.setBackground(new java.awt.Color(234, 252, 252));
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

        jLabel15.setFont(new java.awt.Font("Serif", 1, 8)); // NOI18N
        jLabel15.setText(" HANDCRAFTED LEATHER");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        jLabel17.setText("Quản lí sản phẩm");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lotus26px.png"))); // NOI18N

        cancel.setBackground(new java.awt.Color(255, 102, 51));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.png"))); // NOI18N
        cancel.setOpaque(true);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        label_avatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Administrator Male_1.png"))); // NOI18N
        label_avatar1.addMouseListener(new java.awt.event.MouseAdapter() {
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
                .addGap(292, 292, 292)
                .addComponent(label_avatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
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
                    .addComponent(cancel)
                    .addGroup(Wrapper__HeadBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addComponent(label_avatar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Wrapper.add(Wrapper__HeadBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1174, 60));

        Wrapper__input.setBackground(new java.awt.Color(255, 255, 255));
        Wrapper__input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelCategoryID.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelCategoryID.setText("ID loại hàng");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        LabelProductID.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductID.setText("ID sản phẩm");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TextProductID.setBackground(new java.awt.Color(250, 246, 246));
        TextProductID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextProductID.setBorder(null);

        LabelProductName.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelProductName.setText("Tên sản phẩm");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        TextProductName.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextProductName.setBorder(null);

        LabelPrice.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelPrice.setText("Giá");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        TextProductPrice.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextProductPrice.setBorder(null);

        LabelQuantity.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LabelQuantity.setText("Số lượng");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        TextProductQuantity.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextProductQuantity.setBorder(null);

        cateComboBox.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        cateComboBox.setOpaque(true);
        cateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectComboBox(evt);
            }
        });

        javax.swing.GroupLayout Wrapper__inputLayout = new javax.swing.GroupLayout(Wrapper__input);
        Wrapper__input.setLayout(Wrapper__inputLayout);
        Wrapper__inputLayout.setHorizontalGroup(
            Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__inputLayout.createSequentialGroup()
                .addGroup(Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Wrapper__inputLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Wrapper__inputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Wrapper__inputLayout.setVerticalGroup(
            Wrapper__inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__inputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCategoryID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(LabelProductID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(LabelProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(LabelPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        Wrapper.add(Wrapper__input, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 200, 330));

        Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Table.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID loại hàng", "ID sản phẩm", "Tên sản phẩm", "Số lượng", "Giá"
            }
        ));
        Table.setFillsViewportHeight(true);
        Table.setFocusable(false);
        Table.setGridColor(new java.awt.Color(51, 51, 51));
        Table.setRowHeight(28);
        Table.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Table.setShowGrid(true);
        Table.getTableHeader().setReorderingAllowed(false);
        Table.setUpdateSelectionOnSort(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                get_Data_From_Table_Add_To_TextField(evt);
            }
        });
        Wrapper__JScrollPane.setViewportView(Table);

        Wrapper.add(Wrapper__JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 900, 350));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Wrapper.add(Wrapper__VerticalBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 750));

        Wrapper__Image.setBackground(new java.awt.Color(234, 252, 252));

        PanelCha.setBackground(new java.awt.Color(255, 255, 255));
        PanelCha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCha.setPreferredSize(new java.awt.Dimension(145, 160));

        jLabel3.setText("No Image");

        javax.swing.GroupLayout PanelChaLayout = new javax.swing.GroupLayout(PanelCha);
        PanelCha.setLayout(PanelChaLayout);
        PanelChaLayout.setHorizontalGroup(
            PanelChaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        PanelChaLayout.setVerticalGroup(
            PanelChaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        ImageBtn.setBackground(new java.awt.Color(32, 136, 203));
        ImageBtn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        ImageBtn.setText("Chọn ảnh");
        ImageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImageBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Wrapper__ImageLayout = new javax.swing.GroupLayout(Wrapper__Image);
        Wrapper__Image.setLayout(Wrapper__ImageLayout);
        Wrapper__ImageLayout.setHorizontalGroup(
            Wrapper__ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wrapper__ImageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Wrapper__ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelCha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        Wrapper__ImageLayout.setVerticalGroup(
            Wrapper__ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__ImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ImageBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Wrapper.add(Wrapper__Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 190, 200));

        Wrapper__Buttons.setBackground(new java.awt.Color(234, 252, 252));

        MinusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalMinus.png"))); // NOI18N
        MinusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinusButtonminusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinusButtonminusNormal(evt);
            }
        });

        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalUpdate.png"))); // NOI18N
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateButtonupdateEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateButtonupdateNormal(evt);
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

        SearchBtn.setBackground(new java.awt.Color(6, 214, 160));
        SearchBtn.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        SearchBtn.setText("Tìm kiếm");
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonClicked(evt);
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

        javax.swing.GroupLayout Wrapper__ButtonsLayout = new javax.swing.GroupLayout(Wrapper__Buttons);
        Wrapper__Buttons.setLayout(Wrapper__ButtonsLayout);
        Wrapper__ButtonsLayout.setHorizontalGroup(
            Wrapper__ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(UpdateButton)
                .addGap(48, 48, 48)
                .addComponent(MinusButton))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wrapper__ButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Wrapper__ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        Wrapper__ButtonsLayout.setVerticalGroup(
            Wrapper__ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wrapper__ButtonsLayout.createSequentialGroup()
                .addGroup(Wrapper__ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Wrapper__ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AddButton)
                        .addComponent(MinusButton))
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        Wrapper.add(Wrapper__Buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 485, 270, 250));

        TextCategoryID.setBackground(new java.awt.Color(234, 252, 252));
        TextCategoryID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        TextCategoryID.setForeground(new java.awt.Color(234, 252, 252));
        TextCategoryID.setBorder(null);
        Wrapper.add(TextCategoryID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 750, 40, 10));

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
    // 
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cancelMouseClicked

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
        String ID = label_avatar1.getText();
        a.setUser(ID);
        a.setAuthorized(ID);
        a.setPositionForWin(x1, y1);
        dispose();
    }//GEN-LAST:event_ReturnBtnhome

    private void ReturnBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnMouseEntered
        URL iconURL = getClass().getResource("/icon/Vertical_Bar_Enter_Return.png");
        ImageIcon img = new ImageIcon(iconURL);
        ReturnBtn.setIcon(img);
    }//GEN-LAST:event_ReturnBtnMouseEntered

    private void AddButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonClicked
        String CategoryID = "", ProductID = "", ProductName = "", ProductImage = Path;
        int ProductQuantity = 0;
        double ProductPrice = 0;
        boolean check_full_filling = false;
        // Kiểm tra không được bỏ trống
        if (TextCategoryID.getText().equals("")) {
            TextCategoryID.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô mã loại hàng", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (TextProductID.getText().equals("")) {
            TextProductID.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô mã sản phẩm", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (TextProductName.getText().equals("")) {
            TextProductName.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô tên sản phẩm", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (TextProductQuantity.getText().equals("")) {
            TextProductQuantity.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô tồn kho", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (TextProductPrice.getText().equals("")) {
            TextProductPrice.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô giá", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else {
            check_full_filling = true;
        }
//        System.out.println(check_full_filling);
        if (check_full_filling == true) {
            CategoryID = TextCategoryID.getText();
            ProductID = createProductID();
            ProductName = TextProductName.getText();
            String gia = TextProductPrice.getText();
            String sl = TextProductQuantity.getText();
            ProductImage = Path;
            boolean check_requisite = true;

            if (!TextProductQuantity.getText().equals("") && check_requisite == true) {
                try {
                    ProductQuantity = Integer.parseInt(sl);
                    check_requisite = true;
                } catch (Exception e) {
                    check_requisite = false;
                    TextProductQuantity.requestFocus();
                    TextProductQuantity.setText("");
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng !", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
                }
            }
            if (!TextProductPrice.getText().equals("") && check_requisite == true) {
                try {
                    ProductPrice = Double.valueOf(gia);
                    check_requisite = true;
                } catch (Exception e) {
                    check_requisite = false;
                    TextProductPrice.requestFocus();
                    TextProductPrice.setText("");
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập giá là con số !", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
                }
            }
            if (check_requisite == true) {
                Product p = new Product(CategoryID, ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage);
                p.toString();
                int j = ProductDAO.getInstance().add(p);
                if (j == 0) {
                    JOptionPane.showMessageDialog(null, "Tạo thành công sản phẩm", "WRONG INPUT", JOptionPane.INFORMATION_MESSAGE);
                }
                if (j == 1) {
                    TextCategoryID.setText("");
                    TextCategoryID.requestFocus();
                    JOptionPane.showMessageDialog(null, "Không tồn tại " + CategoryID, "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
                }
                if (j == 2) {
                    JOptionPane.showMessageDialog(null, ProductID + " đã tồn tại", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
                    TextProductID.setText("");
                    TextProductID.requestFocus();
                }
            }
        }

        showData();
    }//GEN-LAST:event_AddButtonClicked

    private String createProductID() {
        String id = ProductDAO.getInstance().createProductID();
//        System.out.println(id);
        return id;
    }

    private void getListCategoryID() {
        ArrayList<String> list = ProductDAO.getInstance().getCategories();
        for (String x : list) {
//            System.out.println(x);
            cateComboBox.addItem(x);
        }
    }


    private void ImageBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageBtnMouseClicked
        JLabel label = new JLabel();
        JPanel panelCon = new JPanel();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("D:\\04.PTTKhttt\\images"));
        int res = fc.showOpenDialog(null);

        panelCon.setBackground(Color.white);
        int x = PanelCha.getWidth();
        int y = PanelCha.getHeight();
        panelCon.setPreferredSize(new Dimension(x, y));
        panelCon.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.black));

        if (res == JFileChooser.APPROVE_OPTION) {
            PanelCha.removeAll();
            File f = fc.getSelectedFile();
            Path = f.getAbsolutePath();
//            System.out.println(Path);
            label.setIcon(convertPathToImage(Path));
            panelCon.add(label);
        }

        PanelCha.setLayout(new FlowLayout());
        PanelCha.add(panelCon);
        PanelCha.revalidate();
        PanelCha.repaint();
    }//GEN-LAST:event_ImageBtnMouseClicked

    private void get_Data_From_Table_Add_To_TextField(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_get_Data_From_Table_Add_To_TextField
        int i = Table.getSelectedRow();
        TableModel model = Table.getModel();
        PanelCha.removeAll();
        TextCategoryID.setText(model.getValueAt(i, 0).toString());
        TextProductID.setText(model.getValueAt(i, 1).toString());
        TextProductName.setText(model.getValueAt(i, 2).toString());
        TextProductQuantity.setText(model.getValueAt(i, 3).toString());
        TextProductPrice.setText(model.getValueAt(i, 4).toString());
        String h = ProductDAO.getInstance().getImagePath(TextProductID.getText());
//        System.out.println("h1 test"+h1);
//        String h = model.getValueAt(i, 5).toString();
        // Xử lý ảnh
        JLabel label = new JLabel();
        JPanel panelCon = new JPanel();
        panelCon.setBackground(Color.white);
        int x = PanelCha.getWidth();
        int y = PanelCha.getHeight();
        panelCon.setPreferredSize(new Dimension(x, y));
        panelCon.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.black));
        label.setIcon(convertPathToImage(h));
        Path = h;
        panelCon.add(label);
        PanelCha.setLayout(new FlowLayout());
        PanelCha.add(panelCon);
        PanelCha.revalidate();
        PanelCha.repaint();
    }//GEN-LAST:event_get_Data_From_Table_Add_To_TextField

    private void ResetBtnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnClicked
        showData();
        TextCategoryID.setText("");
        TextProductID.setText(createProductID());
        TextProductName.setText("");
        TextProductQuantity.setText("");
        TextProductPrice.setText("");
        PanelCha.removeAll();
        PanelCha.revalidate();
        PanelCha.repaint();
        Path = "";
    }//GEN-LAST:event_ResetBtnClicked

    private void DeleteButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonClicked
        SearchButtonClicked(evt);
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int rows = model.getRowCount();
        if (rows > 1) {
            JOptionPane.showMessageDialog(null, "Click chọn dòng muốn xóa hoặc cho thêm thông tin", "DELETE SELECT", JOptionPane.WARNING_MESSAGE);
        } else {
            String ProductID = TextProductID.getText();
            String CategoryID = TextCategoryID.getText();
            Product p = new Product(CategoryID, ProductID);
            ProductDAO.getInstance().delete(p);
            showData();
        }

    }//GEN-LAST:event_DeleteButtonClicked

    private void SearchButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonClicked
        String CategoryID = "", ProductID = "", ProductName = "", ProductImage = Path;
        String ProductQuantity = "";
        String ProductPrice = "";

        ArrayList<String> list = new ArrayList<>();

        list.add(CategoryID = TextCategoryID.getText());
        list.add(ProductID = TextProductID.getText());
        list.add(ProductName = TextProductName.getText());
        list.add(ProductQuantity = TextProductQuantity.getText());
        list.add(ProductPrice = TextProductPrice.getText());
        list.add(Path);

        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        // 
        ArrayList<Product> searchResult = ProductDAO.getInstance().searh(list);
        for (int i = 0; i < searchResult.size(); i++) {
            Product p = searchResult.get(i);
            model.addRow(new Object[]{p.getCategoryID(), p.getProductID(), p.getProductName(),
                p.getProductQuantity(), p.getPrice(), p.getProductImage()});
        }
    }//GEN-LAST:event_SearchButtonClicked

    private void UpdateButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonClicked
        String CategoryID = "", ProductID = "", ProductName = "", ProductImage = Path;
        int ProductQuantity = 0;
        double ProductPrice = 0;
        boolean check_full_filling = false;
        // Kiểm tra không được bỏ trống
        if (TextCategoryID.getText().equals("")) {
            String id = cateComboBox.getItemAt(0);
            TextCategoryID.setText(id);
//            TextCategoryID.requestFocus();
//            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô mã loại hàng", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (TextProductID.getText().equals("")) {
            TextProductID.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô mã sản phẩm", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (TextProductName.getText().equals("")) {
            TextProductName.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô tên sản phẩm", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (TextProductQuantity.getText().equals("")) {
            TextProductQuantity.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô tồn kho", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (TextProductPrice.getText().equals("")) {
            TextProductPrice.requestFocus();
            JOptionPane.showMessageDialog(null, "Không được bỏ trống ô giá", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else {
            check_full_filling = true;
        }
        if (check_full_filling == true) {
            CategoryID = TextCategoryID.getText();
            ProductID = TextProductID.getText();
            ProductName = TextProductName.getText();
            String gia = TextProductPrice.getText();
            String sl = TextProductQuantity.getText();
            ProductImage = Path;
            boolean check_requisite = true;

            if (!TextProductQuantity.getText().equals("") && check_requisite == true) {
                try {
                    ProductQuantity = Integer.parseInt(sl);
                    check_requisite = true;
                } catch (Exception e) {
                    check_requisite = false;
                    TextProductQuantity.requestFocus();
                    TextProductQuantity.setText("");
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng !", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
                }
            }
            if (!TextProductPrice.getText().equals("") && check_requisite == true) {
                try {
                    ProductPrice = Double.valueOf(gia);
                    check_requisite = true;
                } catch (Exception e) {
                    check_requisite = false;
                    TextProductPrice.requestFocus();
                    TextProductPrice.setText("");
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập giá là con số !", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
                }
            }
            SearchButtonClicked(evt);

            if (check_requisite == true) {
                Product p = new Product(CategoryID, ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage);
                int choice = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn sửa " + ProductID + " ?", "UPDATE CONFIRM", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    ProductDAO.getInstance().update(p);
                }
            }
            showData();
        }
    }//GEN-LAST:event_UpdateButtonClicked

    private void ReturnBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBtnMouseExited
        URL iconURL = getClass().getResource("/icon/Vertical_Bar_Normal_Return.png");
        ImageIcon img = new ImageIcon(iconURL);
        ReturnBtn.setIcon(img);
    }//GEN-LAST:event_ReturnBtnMouseExited

    private void selectComboBox(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectComboBox
        int i = cateComboBox.getSelectedIndex();
//        System.out.println(i);
        String s = cateComboBox.getItemAt(i);
        TextCategoryID.setText(s);
    }//GEN-LAST:event_selectComboBox

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

    private ImageIcon convertPathToImage(String Path) {
//        System.out.println(Path);
        ImageIcon icon = new ImageIcon(Path);
        Image img = icon.getImage();
        ImageIcon i = new ImageIcon(img);

        return i;
    }

    public void showData() {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ArrayList<Product> list = ProductDAO.getInstance().getDataFromTable();
        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);
            model.addRow(new Object[]{p.getCategoryID(), p.getProductID(), p.getProductName(), p.getProductQuantity(), p.getPrice()});
        }
    }

    public void setAuthorized(String a){

        if ("u".equals(a.substring(0, 1))) {
            System.out.println("user");
            UpdateButton.setVisible(false);
            MinusButton.setVisible(false);
        } else {
            System.out.println("admin");
        }
    }
    
    public void setPositionForWin(int x, int y) {
        this.setLocation(x, y);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminProduct a = new AdminProduct();
                a.setVisible(true);
                a.showData();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddButton;
    private javax.swing.JButton ImageBtn;
    private javax.swing.JLabel LabelCategoryID;
    private javax.swing.JLabel LabelPrice;
    private javax.swing.JLabel LabelProductID;
    private javax.swing.JLabel LabelProductName;
    private javax.swing.JLabel LabelQuantity;
    private javax.swing.JLabel MinusButton;
    private javax.swing.JPanel PanelCha;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel ReturnBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TextCategoryID;
    private javax.swing.JTextField TextProductID;
    private javax.swing.JTextField TextProductName;
    private javax.swing.JTextField TextProductPrice;
    private javax.swing.JTextField TextProductQuantity;
    private javax.swing.JLabel UpdateButton;
    private javax.swing.JPanel Wrapper;
    private javax.swing.JPanel Wrapper__Buttons;
    private javax.swing.JPanel Wrapper__HeadBar;
    private javax.swing.JPanel Wrapper__Image;
    private javax.swing.JScrollPane Wrapper__JScrollPane;
    private javax.swing.JPanel Wrapper__VerticalBar;
    private javax.swing.JPanel Wrapper__input;
    private javax.swing.JLabel cancel;
    private javax.swing.JComboBox<String> cateComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel label_avatar1;
    // End of variables declaration//GEN-END:variables
}
