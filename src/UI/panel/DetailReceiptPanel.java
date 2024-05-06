
package UI.panel;

import Model.StatisticProduct;
import Model.StatisticReceipt;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class DetailReceiptPanel extends javax.swing.JPanel {

    /**
     * Creates new form DetailReceiptPanel
     */
    public DetailReceiptPanel() {
        initComponents();
         this.setBackground(Color.WHITE);
    }
 public void loadStatisticReceipt(ArrayList<StatisticReceipt> list2) {
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        // Xóa tất cả các hàng trong model trước khi load dữ liệu mới
        model.setRowCount(0);

//        // Thêm dữ liệu từ ArrayList vào model
        for (StatisticReceipt re : list2) {
            Object[] rowData = {re.getProduct().getProductID(),re.getProduct().getProductName(),re.getRsquanity(),re.getInventory()};
            model.addRow(rowData);
        }
    }
 public void loadSum(ArrayList<StatisticReceipt> list2) {
       
        float S = 0;
        for (StatisticReceipt re : list2) {
          S += re.getInventory();
           
        }
        sum1.setText(String.format("%.2f vnd", S));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        sum = new java.awt.Label();
        sum1 = new java.awt.Label();

        Table1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Sản phẩm", "Số lượng", "Tiền nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
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

        sum.setText("Tổng chi tiêu :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
            .addComponent(ScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JTable Table1;
    private java.awt.Label sum;
    private java.awt.Label sum1;
    // End of variables declaration//GEN-END:variables
}
