/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.panel;

import Model.StatisticProduct;
import java.awt.Color;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class ReceiptStatisticPanel extends javax.swing.JPanel {

    /**
     * Creates new form Receiptpanel
     .getViewport().setBackground(Color.WHITE);*/
    public ReceiptStatisticPanel() {
        initComponents();
        this.setBackground(Color.WHITE);
        ScrollPane.getViewport().setBackground(Color.WHITE);
        ScrollPane1.getViewport().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();

        Table.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Sản phẩm", "Số lượng tồn kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setGridColor(new java.awt.Color(51, 51, 51));
        Table.setInheritsPopupMenu(true);
        Table.setRowHeight(50);
        Table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Table.setShowGrid(true);
        ScrollPane.setViewportView(Table);

        Table1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản phẩm", "Sản phẩm", "Số lượng tồn kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.setGridColor(new java.awt.Color(51, 51, 51));
        Table1.setInheritsPopupMenu(true);
        Table1.setRowHeight(50);
        Table1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Table1.setShowGrid(true);
        ScrollPane1.setViewportView(Table1);

        label1.setText("THỐNG KÊ KHO HÀNG");

        label2.setText("Danh sách sản phẩm đã hết :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
            .addComponent(ScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void loadStatisticReceipts(ArrayList<StatisticProduct> list1) {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        // Xóa tất cả các hàng trong model trước khi load dữ liệu mới
        model.setRowCount(0);

//        // Thêm dữ liệu từ ArrayList vào model
        for (StatisticProduct sp : list1) {
           Object[] rowData = { sp.getProduct().getProductID(),sp.getProduct().getProductName(),sp.getProduct().getProductQuantity()};
            model.addRow(rowData);
        }
    }
   public void load(ArrayList<StatisticProduct> list1) {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        // Xóa tất cả các hàng trong model trước khi load dữ liệu mới
        model.setRowCount(0);

//        // Thêm dữ liệu từ ArrayList vào model
        for (StatisticProduct sp : list1) {
            if(sp.getQuanity()==0){
           Object[] rowData = { sp.getProduct().getProductID(),sp.getProduct().getProductName(),sp.getProduct().getProductQuantity()};
            model.addRow(rowData);}
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JTable Table;
    private javax.swing.JTable Table1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
