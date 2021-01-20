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
        emailBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        preparingBtn = new javax.swing.JButton();
        signBtn = new javax.swing.JButton();
        pendingBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        invoiceNumberLbl = new javax.swing.JLabel();
        deliveryNoteNumberLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customerNameLbl = new javax.swing.JLabel();
        orderDateLbl = new javax.swing.JLabel();
        deliveryDateLbl = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        emailBtn.setBackground(new java.awt.Color(153, 153, 255));
        emailBtn.setText("Email");
        emailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailBtnMouseClicked(evt);
            }
        });

        printBtn.setBackground(new java.awt.Color(153, 153, 255));
        printBtn.setText("Print");
        printBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printBtnMouseClicked(evt);
            }
        });

        preparingBtn.setBackground(new java.awt.Color(153, 153, 255));
        preparingBtn.setText("preparing");
        preparingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preparingBtnMouseClicked(evt);
            }
        });

        signBtn.setBackground(new java.awt.Color(153, 153, 255));
        signBtn.setText("sign");
        signBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signBtnMouseClicked(evt);
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

        customerNameLbl.setText("jLabel7");

        orderDateLbl.setText("jLabel7");

        deliveryDateLbl.setText("jLabel7");

        statusLbl.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel8.setText("SISTEM INFORMASI LOGISTIK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(invoiceNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveryNoteNumberLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(customerNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(orderDateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deliveryDateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(statusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel8)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pendingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(preparingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(signBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(invoiceNumberLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(deliveryNoteNumberLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(orderDateLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deliveryDateLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(statusLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printBtn)
                    .addComponent(emailBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preparingBtn)
                    .addComponent(signBtn)
                    .addComponent(pendingBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailBtnMouseClicked
        sendingForm.setVisible(true); //show sending form
        sendingForm.setSendingForm(invoiceNumberLbl.getText(), deliveryDateLbl.getText(), customerNameLbl.getText(),orderDateLbl.getText(), deliveryDateLbl.getText(), statusLbl.getText());
    }//GEN-LAST:event_emailBtnMouseClicked

    private void printBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseClicked
        printDialog.setVisible(true);
    }//GEN-LAST:event_printBtnMouseClicked

    private void pendingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingBtnMouseClicked
        deliveryNoteCtl.requestChangeStatus("pending", deliveryNoteNumberLbl.getText());
    }//GEN-LAST:event_pendingBtnMouseClicked

    private void preparingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preparingBtnMouseClicked
        deliveryNoteCtl.requestChangeStatus("preparing", deliveryNoteNumberLbl.getText());
    }//GEN-LAST:event_preparingBtnMouseClicked

    private void signBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signBtnMouseClicked
        deliveryNoteCtl.requestChangeStatus("completed", deliveryNoteNumberLbl.getText());
    }//GEN-LAST:event_signBtnMouseClicked

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
        invoiceNumberLbl.setText(String.valueOf(dn.getInvoiceNumber()));
        deliveryNoteNumberLbl.setText(String.valueOf(dn.getDeliveryNoteNumber()));
        customerNameLbl.setText(dn.getCustomerName());
        orderDateLbl.setText(dn.getOrderDateString());
        deliveryDateLbl.setText(dn.getDeliveryDateString());
        statusLbl.setText(dn.getStatus());
    }
    
    private DeliveryNoteCtl deliveryNoteCtl;
    private SendingForm sendingForm;
    private PrintDialog printDialog;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerNameLbl;
    private javax.swing.JLabel deliveryDateLbl;
    private javax.swing.JLabel deliveryNoteNumberLbl;
    private javax.swing.JButton emailBtn;
    private javax.swing.JLabel invoiceNumberLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel orderDateLbl;
    private javax.swing.JButton pendingBtn;
    private javax.swing.JButton preparingBtn;
    private javax.swing.JButton printBtn;
    private javax.swing.JButton signBtn;
    private javax.swing.JLabel statusLbl;
    // End of variables declaration//GEN-END:variables
}
