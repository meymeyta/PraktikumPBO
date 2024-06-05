/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

//NAMA : MEYTA RIZKI KHAIRUNISA
//NIM : 24060122130085

package com.mycompany.project1;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author meyta
 */
public class Gui extends javax.swing.JFrame {

    DefaultListModel<String> Listt;
    List<String> items = new ArrayList<>();
    private Map<Integer, String> dataMap = new HashMap<>();
    private Set<String> dataSet = new HashSet<>();
    String[] datas = {"ayam", "kucing", "kodok"};
    
    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
        this.Listt = new DefaultListModel<>();
        this.ListItem.setModel(Listt);
        
        for (String data : datas) {
        Listt.addElement(data);
        updateJumlahDataTersimpan();
        }
    }
    
    private void updateJumlahDataTersimpan() {
        LabelDataTersimpan.setText("Data Tersimpan = " + Listt.size());
        LabelDataTersimpan1.setText("Data Tersimpan = " + dataSet.size());
    LabelDataTersimpan2.setText("Data Tersimpan = " + dataMap.size());
    }
    
    private void addItem(String namaItem) {
        Listt.addElement(namaItem);
        updateJumlahDataTersimpan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListItem = new javax.swing.JList<>();
        NamaItem = new javax.swing.JLabel();
        IsiItem = new javax.swing.JTextField();
        insertdatalist = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clearall = new javax.swing.JButton();
        LabelDataTersimpan = new javax.swing.JLabel();
        savedatalist = new javax.swing.JButton();
        savedataset = new javax.swing.JButton();
        LabelDataTersimpan1 = new javax.swing.JLabel();
        inserttoset = new javax.swing.JButton();
        inserttomap = new javax.swing.JButton();
        savetomap = new javax.swing.JButton();
        LabelDataTersimpan2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListItem);

        NamaItem.setText("Nama Item:");

        IsiItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiItemActionPerformed(evt);
            }
        });

        insertdatalist.setText("<- insert to list");
        insertdatalist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertdatalistActionPerformed(evt);
            }
        });

        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clearall.setText("clear all");
        clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearallActionPerformed(evt);
            }
        });

        LabelDataTersimpan.setText("Data Tersimpan =");

        savedatalist.setText("save to list ->");
        savedatalist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedatalistActionPerformed(evt);
            }
        });

        savedataset.setText("save to set ->");
        savedataset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedatasetActionPerformed(evt);
            }
        });

        LabelDataTersimpan1.setText("Data Tersimpan =");

        inserttoset.setText("<- insert to set");
        inserttoset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserttosetActionPerformed(evt);
            }
        });

        inserttomap.setText("<- insert to map");
        inserttomap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserttomapActionPerformed(evt);
            }
        });

        savetomap.setText("save to map ->");
        savetomap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savetomapActionPerformed(evt);
            }
        });

        LabelDataTersimpan2.setText("Data Tersimpan =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearall, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IsiItem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(update)
                                        .addGap(18, 18, 18)
                                        .addComponent(delete)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(savedatalist, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LabelDataTersimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                                    .addComponent(inserttoset))
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(savedataset, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelDataTersimpan2, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertdatalist)
                            .addComponent(inserttomap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(savetomap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(LabelDataTersimpan1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savedatalist)
                            .addComponent(LabelDataTersimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertdatalist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savedataset)
                            .addComponent(LabelDataTersimpan2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inserttoset)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savetomap)
                            .addComponent(LabelDataTersimpan1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inserttomap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(NamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IsiItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearall)
                    .addComponent(jButton1)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addItem(IsiItem.getText());
        
        IsiItem.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IsiItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsiItemActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int index = ListItem.getSelectedIndex();
        Listt.removeElementAt(index);
        
        IsiItem.setText("");
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_deleteActionPerformed

    private void clearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearallActionPerformed
        Listt.clear();
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_clearallActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int index = ListItem.getSelectedIndex();
        String selected = IsiItem.getText();
        Listt.setElementAt(selected, index);
        
        IsiItem.setText("");
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_updateActionPerformed

    private void insertdatalistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertdatalistActionPerformed
        
        for (String item : items) {
        Listt.addElement(item);}
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_insertdatalistActionPerformed

    private void savedatalistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedatalistActionPerformed
        
        for (int i = 0; i < Listt.getSize(); i++) {
        items.add(Listt.getElementAt(i));
                }
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_savedatalistActionPerformed

    private void savedatasetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedatasetActionPerformed
        for (int i = 0; i < Listt.getSize(); i++) {
            items.add(Listt.getElementAt(i));
        }
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_savedatasetActionPerformed

    private void savetomapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savetomapActionPerformed
     
    for (int i = 0; i < Listt.getSize(); i++) {
        dataMap.put(i, Listt.getElementAt(i));
    }
    updateJumlahDataTersimpan();
    }//GEN-LAST:event_savetomapActionPerformed

    private void inserttosetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserttosetActionPerformed
        for (String item : items) {
            Listt.addElement(item);
        }
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_inserttosetActionPerformed

    private void inserttomapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserttomapActionPerformed
        
    for (Map.Entry<Integer, String> entry : dataMap.entrySet()) {
        Listt.addElement(entry.getValue());
    }
    updateJumlahDataTersimpan();
    }//GEN-LAST:event_inserttomapActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IsiItem;
    private javax.swing.JLabel LabelDataTersimpan;
    private javax.swing.JLabel LabelDataTersimpan1;
    private javax.swing.JLabel LabelDataTersimpan2;
    private javax.swing.JList<String> ListItem;
    private javax.swing.JLabel NamaItem;
    private javax.swing.JButton clearall;
    private javax.swing.JButton delete;
    private javax.swing.JButton insertdatalist;
    private javax.swing.JButton inserttomap;
    private javax.swing.JButton inserttoset;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savedatalist;
    private javax.swing.JButton savedataset;
    private javax.swing.JButton savetomap;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}