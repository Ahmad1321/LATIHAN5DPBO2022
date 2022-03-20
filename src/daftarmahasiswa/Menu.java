package daftarmahasiswa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private Boolean isUpdate = false;
    private int selectedID = -1;
    private ArrayList<Mahasiswa> listMhs;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        listMhs = new ArrayList<>();
        //Dummy
        listMhs.add(new Mahasiswa("101", "Ali", "3","IPA"));
        listMhs.add(new Mahasiswa("102", "Ani", "3","IPB"));
        listMhs.add(new Mahasiswa("103", "Adi", "3","IPC"));
        // Set Table
        jTable1.setModel(setTable());
        // Hide Delete button
        jTombolDelete.setVisible(false);
    }

    public final DefaultTableModel setTable() {
        Object[] column = {"NIM", "Nama", "Nilai", "Jurusan"};
        DefaultTableModel dataTabel = new DefaultTableModel(null, column);
        for (int i = 0; i < listMhs.size(); i++) {
            Object[] row = new Object[4];
            row[0] = listMhs.get(i).getNim();
            row[1] = listMhs.get(i).getNama();
            row[2] = listMhs.get(i).getNilai();
            row[3] = listMhs.get(i).getJurusan();
            dataTabel.addRow(row);
        }
        return dataTabel;
    }

    public void insertData() {
        // Get Data
        String nim = jTextNIM.getText();
        String nama = jTextNama.getText();
        String nilai = jTextNilai.getText();
        String jurusan = jTextJur.getText();

        listMhs.add(new Mahasiswa(nim, nama, nilai, jurusan));
        //Update Table
        jTable1.setModel(setTable());

        JOptionPane.showMessageDialog(null, "Add Data");
    }

    public void updateData() {
        // Get Data
        String nim = jTextNIM.getText();
        String nama = jTextNama.getText();
        String nilai = jTextNilai.getText();
        String jurusan = jTextJur.getText();
        //System.out.println(nim + nama + nilai + jurusan);

        listMhs.get(selectedID).setNim(nim);
        listMhs.get(selectedID).setNama(nama);
        listMhs.get(selectedID).setNilai(nilai);
        listMhs.get(selectedID).setJurusan(jurusan);
        
        //Update Table
        jTable1.setModel(setTable());
        
        JOptionPane.showMessageDialog(null, "Update Data");
    }

    public void deleteData() {
        // delete table
        listMhs.get(selectedID).setNim("");
        listMhs.get(selectedID).setNama("");
        listMhs.get(selectedID).setNilai("");
        listMhs.get(selectedID).setJurusan("");
        
        for (int i = listMhs.size() - 1; i >= 0; i--) {
            if(listMhs.get(i).getNim().equals(""))
                listMhs.remove(i);
        }
        
        JOptionPane.showMessageDialog(null, "Delete Data");
        
        //Update Table
        jTable1.setModel(setTable());
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
        jJudul = new javax.swing.JLabel();
        jTextNIM = new javax.swing.JTextField();
        jLabelNIM = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jTextNama = new javax.swing.JTextField();
        jLabelNilai = new javax.swing.JLabel();
        jTextNilai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelJur = new javax.swing.JLabel();
        jTextJur = new javax.swing.JTextField();
        jTombolDelete = new javax.swing.JButton();
        jTombolCancel = new javax.swing.JButton();
        jTombolAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jJudul.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jJudul.setText("Daftar Mahasiswa");

        jTextNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNIMActionPerformed(evt);
            }
        });

        jLabelNIM.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNIM.setText("NIM");

        jLabelNama.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNama.setText("Nama");

        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });

        jLabelNilai.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNilai.setText("Nilai");

        jTextNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNilaiActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Nilai", "Jurusan"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabelJur.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelJur.setText("Jurusan");

        jTextJur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextJurActionPerformed(evt);
            }
        });

        jTombolDelete.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTombolDelete.setText("Delete");
        jTombolDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTombolDeleteActionPerformed(evt);
            }
        });

        jTombolCancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTombolCancel.setText("Cancel");
        jTombolCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTombolCancelActionPerformed(evt);
            }
        });

        jTombolAdd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTombolAdd.setText("Add");
        jTombolAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jTombolAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTombolAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jJudul)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelNama)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelNilai)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelJur)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextJur, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelNIM)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTombolAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTombolCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jTombolDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jJudul)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTombolAdd))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabelNIM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNama)
                    .addComponent(jTombolCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNilai)
                    .addComponent(jTombolDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJur, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextJur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTombolAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTombolAddActionPerformed
        // TODO add your handling code here:

        if (jTextNama.getText().equals("") || jTextNIM.getText().equals("") || jTextNilai.getText().equals("") || jTextJur.getText().equals(""))
        JOptionPane.showMessageDialog(null, "Tolong isi Field!");
        else
        if (isUpdate == false)
        insertData();
        else {
            updateData();
            jTombolAdd.setText("Add");
            jTombolDelete.setVisible(false);
            this.isUpdate = false;
        }
        //menghilangkan data field setelah di cancel
        jTextNama.setText("");
        jTextNIM.setText("");
        jTextNilai.setText("");
        jTextJur.setText("");
    }//GEN-LAST:event_jTombolAddActionPerformed

    private void jTombolCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTombolCancelActionPerformed
        // TODO add your handling code here:
        jTombolAdd.setText("Add");
        jTombolDelete.setVisible(false);
        this.isUpdate = false;

        //menghilangkan data field setelah di cancel
        jTextNama.setText("");
        jTextNIM.setText("");
        jTextNilai.setText("");
        jTextJur.setText("");
    }//GEN-LAST:event_jTombolCancelActionPerformed

    private void jTombolDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTombolDeleteActionPerformed
        // TODO add your handling code here:
        if (isUpdate == true) {
            deleteData();
            jTombolAdd.setText("Add");
            jTombolDelete.setVisible(false);
            this.isUpdate = false;

            //menghilangkan data field setelah di delete
            jTextNama.setText("");
            jTextNIM.setText("");
            jTextNilai.setText("");
            jTextJur.setText("");
        }

    }//GEN-LAST:event_jTombolDeleteActionPerformed

    private void jTextJurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextJurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextJurActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        this.isUpdate = true;

        //Get Selected Data
        int row = jTable1.getSelectedRow();
        String selectedNim = (jTable1.getModel().getValueAt(row, 0).toString());
        String selectedNama = (jTable1.getModel().getValueAt(row, 1).toString());
        String selectedNilai = (jTable1.getModel().getValueAt(row, 2).toString());
        String selectedJurusan = (jTable1.getModel().getValueAt(row, 3).toString());

        for (int i = 0; i < listMhs.size(); i++) {
            if (selectedNim.equals(listMhs.get(i).getNim())) {
                selectedID = i;
                break;
            }
        }

        //System.out.println(selectedID);
        jTextNIM.setText(selectedNim);
        jTextNama.setText(selectedNama);
        jTextNilai.setText(selectedNilai);
        jTextJur.setText(selectedJurusan);

        jTombolAdd.setText("Update");
        jTombolDelete.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNilaiActionPerformed

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaActionPerformed

    private void jTextNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNIMActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jJudul;
    private javax.swing.JLabel jLabelJur;
    private javax.swing.JLabel jLabelNIM;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNilai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextJur;
    private javax.swing.JTextField jTextNIM;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JTextField jTextNilai;
    private javax.swing.JButton jTombolAdd;
    private javax.swing.JButton jTombolCancel;
    private javax.swing.JButton jTombolDelete;
    // End of variables declaration//GEN-END:variables
}
