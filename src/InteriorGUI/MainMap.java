/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InteriorGUI;

/**
 *
 * @author Arvy Enriquez
 */
import java.io.*;
import javax.swing.*;

public class MainMap extends javax.swing.JFrame {

    /**
     * Creates new form MainMap
     */
    
    public MainMap() {
        initComponents();
        File file = new File("db/temp.txt");
        String acc = "";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String data;
            String dat;
            while ((data = br.readLine()) != null) {
                dat = data;
                String [] datarr = dat.split(",");
                acc = dat;
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        String[] inf = acc.split(",");
        hungerBar.setValue(Integer.parseInt(inf[4]));
        staminaBar.setValue(Integer.parseInt(inf[3]));
        jLabel2.setText("Money: "+ inf[5]);
        jLabel1.setText("Account: " + inf[0]);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stadiumButton = new javax.swing.JLabel();
        myhouseButton = new javax.swing.JLabel();
        bankButton = new javax.swing.JLabel();
        foodButton = new javax.swing.JLabel();
        hungerBar = new javax.swing.JProgressBar();
        staminaBar = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        mainMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Jokerman", 0, 16)); // NOI18N
        jLabel1.setText("Account:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, -1, -1));

        jLabel2.setFont(new java.awt.Font("Jokerman", 0, 16)); // NOI18N
        jLabel2.setText("Money:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blookat-hppack.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 28, 30, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/candy3.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 7, 30, 20));

        stadiumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stadium_normal.png"))); // NOI18N
        stadiumButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stadiumButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stadiumButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stadiumButtonMouseReleased(evt);
            }
        });
        jPanel1.add(stadiumButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, -1, -1));

        myhouseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myhouse_normal.png"))); // NOI18N
        myhouseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myhouseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myhouseButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                myhouseButtonMouseReleased(evt);
            }
        });
        jPanel1.add(myhouseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 78, -1, -1));

        bankButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bank_normal.png"))); // NOI18N
        bankButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bankButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bankButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bankButtonMouseReleased(evt);
            }
        });
        jPanel1.add(bankButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 158, -1, -1));

        foodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food_normal.png"))); // NOI18N
        foodButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foodButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                foodButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                foodButtonMouseReleased(evt);
            }
        });
        jPanel1.add(foodButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 85, -1, -1));

        hungerBar.setToolTipText("Hunger Bar");
        jPanel1.add(hungerBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 120, -1));

        staminaBar.setToolTipText("Stamina Bar");
        jPanel1.add(staminaBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 120, -1));

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        mainMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/im the mapp.jpg"))); // NOI18N
        jPanel1.add(mainMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void foodButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodButtonMouseEntered
        foodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food_alpha.png")));
    }//GEN-LAST:event_foodButtonMouseEntered

    private void foodButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodButtonMouseExited
        foodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food_normal.png")));
    }//GEN-LAST:event_foodButtonMouseExited

    private void myhouseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myhouseButtonMouseEntered
        myhouseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myhouse_alpha.png")));
    }//GEN-LAST:event_myhouseButtonMouseEntered

    private void myhouseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myhouseButtonMouseExited
        myhouseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myhouse_normal.png")));
    }//GEN-LAST:event_myhouseButtonMouseExited

    private void bankButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankButtonMouseEntered
        bankButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bank_alpha.png")));
    }//GEN-LAST:event_bankButtonMouseEntered

    private void bankButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankButtonMouseExited
        bankButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bank_normal.png")));
    }//GEN-LAST:event_bankButtonMouseExited

    private void stadiumButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stadiumButtonMouseEntered
        stadiumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stadium_alpha.png")));
    }//GEN-LAST:event_stadiumButtonMouseEntered

    private void stadiumButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stadiumButtonMouseExited
        stadiumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stadium_normal.png")));
    }//GEN-LAST:event_stadiumButtonMouseExited

    private void stadiumButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stadiumButtonMouseReleased
        new Stadium().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stadiumButtonMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //logout
        File file_temp = new File("db/temp.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(file_temp, false))) {
            pw.println("");
        } catch (IOException ex) {
        }
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bankButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankButtonMouseReleased
        new Bank().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bankButtonMouseReleased

    private void myhouseButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myhouseButtonMouseReleased
        new House().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_myhouseButtonMouseReleased

    private void foodButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodButtonMouseReleased
        new FoodShop().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_foodButtonMouseReleased

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
            java.util.logging.Logger.getLogger(MainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankButton;
    private javax.swing.JLabel foodButton;
    private javax.swing.JProgressBar hungerBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainMap;
    private javax.swing.JLabel myhouseButton;
    private javax.swing.JLabel stadiumButton;
    private javax.swing.JProgressBar staminaBar;
    // End of variables declaration//GEN-END:variables
}
