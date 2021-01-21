/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

/**
 *
 * @author ASUS
 */
public class DeliveryNoteDetailPage extends javax.swing.JFrame {

    /**
     * Creates new form DeliveryNoteDetailPage
     */
    //public DBHandler dbHandler;
    
    public DeliveryNoteDetailPage() {
        initComponents();
        
        sendingForm = new SendingForm(this);
        printDialog = new PrintDialog(this);
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
        emailButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        preparingButton = new javax.swing.JButton();
        signButton = new javax.swing.JButton();
        pendingBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        invoiceNumberLabel = new javax.swing.JLabel();
        deliveryNoteNumberLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        orderDateLabel = new javax.swing.JLabel();
        deliveryDateLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        emailButton.setBackground(new java.awt.Color(153, 153, 255));
        emailButton.setText("Email");
        emailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailButtonMouseClicked(evt);
            }
        });

        printButton.setBackground(new java.awt.Color(153, 153, 255));
        printButton.setText("Print");
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printButtonMouseClicked(evt);
            }
        });

        preparingButton.setBackground(new java.awt.Color(153, 153, 255));
        preparingButton.setText("preparing");
        preparingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preparingButtonMouseClicked(evt);
            }
        });

        signButton.setBackground(new java.awt.Color(153, 153, 255));
        signButton.setText("sign");
        signButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signButtonMouseClicked(evt);
            }
        });

        pendingBtn.setBackground(new java.awt.Color(153, 153, 255));
        pendingBtn.setText("pending");
        pendingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingBtnMouseClicked(evt);
            }
        });

        jLabel1.setText("invoice number :");

        jLabel2.setText("delivery note number :");

        jLabel3.setText("customer name :");

        jLabel4.setText("order date : ");

        jLabel5.setText("delivery date :");

        jLabel6.setText("status :");

        customerNameLabel.setText("jLabel7");

        orderDateLabel.setText("jLabel7");

        deliveryDateLabel.setText("jLabel7");

        statusLabel.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel8.setText("SISTEM INFORMASI LOGISTIK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pendingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(preparingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(invoiceNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(customerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(orderDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(deliveryDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deliveryNoteNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deliveryNoteNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(orderDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deliveryDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(statusLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printButton)
                    .addComponent(emailButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preparingButton)
                    .addComponent(signButton)
                    .addComponent(pendingBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void emailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailButtonMouseClicked
        sendingForm.setVisible(true); //show sending form
        sendingForm.setSendingForm(invoiceNumberLabel.getText(), deliveryDateLabel.getText(), customerNameLabel.getText(),orderDateLabel.getText(), deliveryDateLabel.getText(), statusLabel.getText());
    }//GEN-LAST:event_emailButtonMouseClicked

    private void printButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseClicked
        printDialog.setVisible(true);
    }//GEN-LAST:event_printButtonMouseClicked

    private void pendingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingBtnMouseClicked
        deliveryNoteCtl.requestChangeStatus("pending", deliveryNoteNumberLabel.getText());
    }//GEN-LAST:event_pendingBtnMouseClicked

    private void preparingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preparingButtonMouseClicked
        deliveryNoteCtl.requestChangeStatus("preparing", deliveryNoteNumberLabel.getText());
    }//GEN-LAST:event_preparingButtonMouseClicked

    private void signButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signButtonMouseClicked
        deliveryNoteCtl.requestChangeStatus("completed", deliveryNoteNumberLabel.getText());
    }//GEN-LAST:event_signButtonMouseClicked

    /**
     * @param args the command line arguments
     */


    public void setController(DeliveryNoteCtl deliveryNoteCtl){
        this.deliveryNoteCtl = deliveryNoteCtl;
    }
    
    public void sendSoftCopyDone(){
        //berhasil dikirim
        sendingForm.setVisible(false);
        deliveryNoteCtl.SendSoftcopy();
    }
    
    public void requestPrint(){
        printDialog.setVisible(false);
        
        deliveryNoteCtl.requestPrint();
        
    }
    
    public void setCurrentDeliveryNote(DeliveryNote dn){
        invoiceNumberLabel.setText(String.valueOf(dn.getInvoiceNumber()));
        deliveryNoteNumberLabel.setText(String.valueOf(dn.getDeliveryNoteNumber()));
        customerNameLabel.setText(dn.getCustomerName());
        orderDateLabel.setText(dn.getOrderDateString());
        deliveryDateLabel.setText(dn.getDeliveryDateString());
        statusLabel.setText(dn.getStatus());
    }
    
    private DeliveryNoteCtl deliveryNoteCtl;
    private SendingForm sendingForm;
    private PrintDialog printDialog;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel deliveryDateLabel;
    private javax.swing.JLabel deliveryNoteNumberLabel;
    private javax.swing.JButton emailButton;
    private javax.swing.JLabel invoiceNumberLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel orderDateLabel;
    private javax.swing.JButton pendingBtn;
    private javax.swing.JButton preparingButton;
    private javax.swing.JButton printButton;
    private javax.swing.JButton signButton;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
