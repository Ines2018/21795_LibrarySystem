/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.Book;
import Model.Checkinout;
import Model.Client;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ineza
 */
public class CheckInOut extends javax.swing.JFrame {

    /**
     * Creates new form CheckInOut
     */
    public CheckInOut() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookidfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        useridfield = new javax.swing.JTextField();
        checkavailabilitybtn = new javax.swing.JButton();
        Checkoutbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        titlelabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        authorlabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bookidfield1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        useridfield1 = new javax.swing.JTextField();
        checkavailabilitybtn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        returnbookbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Book ID:");

        jLabel2.setText("User ID:");

        checkavailabilitybtn.setText("Check Availability");
        checkavailabilitybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkavailabilitybtnActionPerformed(evt);
            }
        });

        Checkoutbtn.setText("Check Out");
        Checkoutbtn.setEnabled(false);
        Checkoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutbtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Book Title:");

        titlelabel.setText("Check Availability first");

        jLabel11.setText("Book Author:");

        authorlabel.setText("Check Availability first");

        jLabel13.setText("Status:");

        jLabel14.setText("Check Availability first");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(useridfield, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(titlelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(authorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(69, 69, 69)
                        .addComponent(Checkoutbtn)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1))
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(bookidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkavailabilitybtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bookidfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkavailabilitybtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(useridfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(titlelabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(authorlabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Checkoutbtn)
                    .addComponent(jButton1))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Check Out Book", jPanel1);

        jLabel5.setText("Book ID:");

        jLabel6.setText("User ID:");

        checkavailabilitybtn1.setText("Check Availability");
        checkavailabilitybtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkavailabilitybtn1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Status:");

        jLabel8.setText("Check Availability first");

        returnbookbtn.setText("Return book");
        returnbookbtn.setEnabled(false);
        returnbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbookbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(69, 69, 69)
                        .addComponent(bookidfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkavailabilitybtn1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnbookbtn)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(useridfield1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bookidfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkavailabilitybtn1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(useridfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addComponent(returnbookbtn)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Return Book", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkavailabilitybtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkavailabilitybtn1ActionPerformed
        // TODO add your handling code here:
        
        // TODO add your handling code here:
        Checkinout book = new Checkinout();
        String sql = "FROM Checkinout WHERE bookid = " + parseInt(bookidfield1.getText()) + " ORDER BY id DESC";
        
        try{
        Session session = Utils.Connect.getSessionFactory().openSession();
        Query query = session.createQuery(sql);
        List<Checkinout> list = query.list();
        
        if (list.isEmpty()){
            
            jLabel8.setText("This book has not been rented out");
            returnbookbtn.setEnabled(false);
        } else {
        book = list.get(0);
        switch (book.getStatus()) {
            case "Available":
                jLabel8.setText("This book is not rented out");
                returnbookbtn.setEnabled(false);
                break;
            case "Rented":
                jLabel8.setText(book.getStatus());
                returnbookbtn.setEnabled(true);
                break;
            default:
                jLabel8.setText("This book is not rented out");
                returnbookbtn.setEnabled(false);
        }
        
        }
        } catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_checkavailabilitybtn1ActionPerformed

    private void returnbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbookbtnActionPerformed
        // TODO add your handling code here:
        
        Checkinout item = new Checkinout();
        Book book = new Book();
        book.setId(parseInt(bookidfield1.getText()));
        Client user = new Client();
        user.setId(parseInt(useridfield1.getText()));
        
        Date date = new Date();
        
        item.setBook(book);
        item.setClient(user);
        item.setStatus("Available");
        item.setDoneAt(date);
        
        
        try {
            Session session = Utils.Connect.getSessionFactory().openSession();
            Transaction transact = session.beginTransaction();
            
            session.save(item);
            transact.commit();
            session.close();
            JOptionPane.showMessageDialog(this,"Book returned successfully");
            
        } catch (Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_returnbookbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void CheckoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutbtnActionPerformed
        // TODO add your handling code here:

        Checkinout item = new Checkinout();
        Book book = new Book();
        book.setId(parseInt(bookidfield.getText()));
        Client user = new Client();
        user.setId(parseInt(useridfield.getText()));

        Date date = new Date();

        item.setBook(book);
        item.setClient(user);
        item.setStatus("Rented");
        item.setDoneAt(date);

        try {
            Session session = Utils.Connect.getSessionFactory().openSession();
            Transaction transact = session.beginTransaction();

            session.save(item);
            transact.commit();
            session.close();
            JOptionPane.showMessageDialog(this,"Book rented successfully");
            
        } catch (Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_CheckoutbtnActionPerformed

    private void checkavailabilitybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkavailabilitybtnActionPerformed
        // TODO add your handling code here:
        Checkinout book = new Checkinout();
        String sql = "FROM Checkinout WHERE bookid = " + parseInt(bookidfield.getText()) + " ORDER BY id DESC";
        String sql1 = "FROM Book WHERE id = " + parseInt(bookidfield.getText());

        try{
            Session session = Utils.Connect.getSessionFactory().openSession();
            Query query;
            query = session.createQuery(sql);
            List<Checkinout> list = query.list();
           
            if (list.isEmpty()){
                query = session.createQuery(sql1);
                Book boo = (Book)query.uniqueResult();
                titlelabel.setText(boo.getTitle());
                authorlabel.setText(boo.getAuthor());
                jLabel14.setText("Available");
                Checkoutbtn.setEnabled(true);
            } else {
                book = list.get(0);
                authorlabel.setText(book.getBook().getAuthor());
                titlelabel.setText(book.getBook().getTitle());
                System.out.println(book.getBook().getAuthor());
                switch (book.getStatus()) {
                    case "Available":
                    jLabel14.setText(book.getStatus());
                    Checkoutbtn.setEnabled(true);
                    break;
                    case "Rented":
                    jLabel14.setText(book.getStatus());
                    break;
                    default:
                    jLabel14.setText("Available");
                    Checkoutbtn.setEnabled(true);
                }

            }
        } catch(Exception e){
            System.out.println(e);
        }

       
    }//GEN-LAST:event_checkavailabilitybtnActionPerformed

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
            java.util.logging.Logger.getLogger(CheckInOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckInOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckInOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckInOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckInOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Checkoutbtn;
    private javax.swing.JLabel authorlabel;
    private javax.swing.JTextField bookidfield;
    private javax.swing.JTextField bookidfield1;
    private javax.swing.JButton checkavailabilitybtn;
    private javax.swing.JButton checkavailabilitybtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton returnbookbtn;
    private javax.swing.JLabel titlelabel;
    private javax.swing.JTextField useridfield;
    private javax.swing.JTextField useridfield1;
    // End of variables declaration//GEN-END:variables
}
