
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WIN8
 */
public class AppForm1 extends javax.swing.JFrame {

    /**
     * Creates new form AppForm
     */
    User user;
    ShowMessage showmessage ;
    PutNotice putnotice;
    ListFiles listfile;
//    UploadFile uploadfile; 
     
    
    public AppForm1(User user1) {
        initComponents();
        user = user1;
        showmessage = new ShowMessage(user);
        putnotice = new PutNotice(user);
        listfile = new ListFiles(user);
//        uploadfile = new UploadFile(user);
//        Thread t1 = new Thread(new Runnable(){
//            @Override
//            public void run() {
//                showmessage = new ShowMessage(user); //To change body of generated methods, choose Tools | Templates.
//             showmessage.setVisible(true);
//            
//            }});
//        Thread t2 = new Thread(new Runnable(){
//            @Override
//            public void run() {
//                putnotice = new PutNotice(user);
////To change body of generated methods, choose Tools | Templates.
//putnotice.setVisible(true);
//            }
//        });
//                Thread t3 = new Thread(new Runnable(){
//            @Override
//            public void run() {
//               listfile = new ListFiles(user);//To change body of generated methods, choose Tools | Templates.
//            listfile.setVisible(true);
//            }
//                });
//                Thread t4 = new Thread(new Runnable(){
//            @Override
//            public void run() {
//                uploadfile =new UploadFile(user); //To change body of generated methods, choose Tools | Templates.
//                uploadfile.setVisible(true);    
//            }
//                });
//                        
//            t1.start();
//            t2.start();
//
//            t3.start();
//            t4.start();
       
        
  this.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
          //showDialog(this);
          System.out.println("exit");
         setVisible(false);
         // dispose();
      }
    });
       setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);                
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Download-icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 300, 150, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/msg2.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        jLabel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel3FocusGained(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 150, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/announcement-512.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(460, 10, 160, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email-upload.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 290, 160, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bck.jpg"))); // NOI18N
        jLabel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel1PropertyChange(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1PropertyChange

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
        //jpanel background 
    }//GEN-LAST:event_formWindowStateChanged

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel3MouseMoved

    private void jLabel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel3FocusGained

    }//GEN-LAST:event_jLabel3FocusGained

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
        showmessage.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        putnotice.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        listfile.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        listfile.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User user = new User("abin","abin");
                AppForm1 appform = new AppForm1(user);
                       appform.setVisible(true);
                       //appform.jLabel2.setVisible(false);
                       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
