/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import static java.lang.String.valueOf;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author imamah
 */
public class XPVpeac extends javax.swing.JFrame {
    String loggedIn;
    JFrame prev;
    /**
     * Creates new form ShoesAndBags
     */
    public XPVpeac(String email, JFrame p) {
         setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        this.loggedIn=email;  
        prev = p;

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
        back = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        Homepage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(176, 233, 225));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("Back");
        back.setOpaque(true);
        back.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backMouseMoved(evt);
            }
        });
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(619, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 660));

        jPanel4.setBackground(new java.awt.Color(36, 47, 55));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("FAW X-PV Standard");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 670, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 1060, 100));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("FAW Momentum Motors");

        p.setBackground(new java.awt.Color(255, 255, 255));
        p.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p.setText("Log Out");
        p.setOpaque(true);
        p.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pMouseMoved(evt);
            }
        });
        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pMouseExited(evt);
            }
        });

        Homepage.setBackground(new java.awt.Color(255, 255, 255));
        Homepage.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        Homepage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Homepage.setText("Homepage");
        Homepage.setOpaque(true);
        Homepage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HomepageMouseMoved(evt);
            }
        });
        Homepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomepageMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomepageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 721, Short.MAX_VALUE)
                .addComponent(Homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(Homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examples/xpvpesd.PNG"))); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 570, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examples/xpvpeacd.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 490, 340));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 490, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void pMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pMouseExited

    private void pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseClicked
        // TODO add your handling code here:
        signOutConfirmation c = new signOutConfirmation(this.loggedIn);
        dispose();
    }//GEN-LAST:event_pMouseClicked

    private void pMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pMouseMoved

    private void backMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseMoved

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        dispose();
        prev.setVisible(true);
        
    }//GEN-LAST:event_backMouseClicked

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseExited

    private void HomepageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomepageMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_HomepageMouseMoved

    private void HomepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomepageMouseClicked
        // TODO add your handling code here:
        dispose();
        HomePage h = new HomePage(this.loggedIn);
    }//GEN-LAST:event_HomepageMouseClicked

    private void HomepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomepageMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_HomepageMouseExited

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Homepage;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel p;
    // End of variables declaration//GEN-END:variables

    
}
