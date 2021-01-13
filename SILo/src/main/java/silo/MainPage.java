/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    private DBHandler dbHandler;
    private ItemCtl itemCtl;
     private DeliveryNoteCtl deliveryNoteCtl;
    private InvoiceCtl invoiceCtl;
    private CardLayout cardLayout = new CardLayout();
    private JPanel cardPanel;
    private ItemList itemList;
    private DeliveryNoteList deliveryNoteList;
     private InvoiceList invoiceList;
    private NewItemForm lastNewItemForm;
    private EditItemForm lastEditItemForm;
   
    
    
    public MainPage() {
        setLayout(new BorderLayout());
        initComponents();
        initObjects();
    }

     public void initObjects() {
        dbHandler = new DBHandler();
        itemCtl = new ItemCtl(this);
        itemCtl.addDBHanlder(dbHandler);
        deliveryNoteCtl = new DeliveryNoteCtl(this);
        invoiceCtl.addDBHanlder(dbHandler);
        invoiceCtl = new InvoiceCtl(this);
        invoiceCtl.addDBHanlder(dbHandler);
        itemList = new ItemList(this);
        deliveryNoteList = new DeliveryNoteList(this);
        invoiceList = new InvoiceList(this);
        
        // Init JPanels
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        cardPanel.add(new JPanel(), "Empty Panel");
        cardPanel.add(itemList, "Item List");
        cardPanel.add(deliveryNoteList, "Delivery Note List");
        cardPanel.add(invoiceList, "Invoice List");
        setContentPane(cardPanel);
    }
     
         void showMainPage() {
        cardLayout.show(cardPanel, "Empty Panel");
    }

    // Start routes
    public void showItemList() {
        itemList.refresh();
        cardLayout.show(cardPanel, "Daftar Item");
    }

    public ArrayList<Item> getItems() {
        return itemCtl.getItems();
    }

    public ArrayList<Item> searchItem(String keyword) {
        return itemCtl.searchItem(keyword);
    }

    public void onShowNewItemForm() {
        itemCtl.showNewItemForm();
    }

    public void showNewItemForm() {
        if (lastNewItemForm != null) {
            cardPanel.remove(lastNewItemForm);
        }
        lastNewItemForm = new NewItemForm(this);
        cardPanel.add(lastNewItemForm, "Delivery Note Detail");
        cardLayout.show(cardPanel, "Delivery Note Detail");
    }
    
    public void failsToCreateNewItem() {
        itemCtl.showFailsToCreateNewItemDialog();
    }
    
    public void saveNewItem(String[] input) {
        itemCtl.saveNewItem(input);

        this.showItemList();
    }

    public void onShowEditItemForm(Item curItem) {
        itemCtl.showEditItemForm(curItem);
    }

    public void showEditItemForm(Item curItem) {
        if (lastEditItemForm != null) {
            cardPanel.remove(lastEditItemForm);
        }
        lastEditItemForm = new EditItemForm(this, curItem);
        cardPanel.add(lastEditItemForm, "Detail SJ");
        cardLayout.show(cardPanel, "Detail SJ");
    }

    public void saveEditedItem(String[] input) {
        itemCtl.saveEditedItem(input);

        this.showItemList();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        createDeliveryNoteButton = new javax.swing.JButton();
        invoiceButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        deliveryNoteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 709));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Sistem Informasi Logistik");

        createDeliveryNoteButton.setText("Buat Surat Jalan");

        invoiceButton.setText("Invoice");
        invoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deliveryNoteButton.setText("Surat Jalan");
        deliveryNoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryNoteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createDeliveryNoteButton)
                            .addComponent(deliveryNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addGap(136, 136, 136)
                .addComponent(deliveryNoteButton)
                .addGap(62, 62, 62)
                .addComponent(createDeliveryNoteButton)
                .addGap(58, 58, 58)
                .addComponent(invoiceButton)
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deliveryNoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryNoteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryNoteButtonActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createDeliveryNoteButton;
    private javax.swing.JButton deliveryNoteButton;
    private javax.swing.JButton invoiceButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
