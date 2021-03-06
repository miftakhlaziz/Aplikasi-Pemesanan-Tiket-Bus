/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Administrator;

/**
 *
 * @author MiftakhulAziz
 */

import javax.swing.table.DefaultTableModel;   
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;

public class Database_Bus extends javax.swing.JFrame {

    /**
     * Creates new form Database_Bus
     */
    int xMouse;
    int yMouse;
    Connection conn = KonektorDatabase.Conn();
    Statement st;
    ResultSet rs;
    public Database_Bus() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    private void TampilData(){
       
       
        DefaultListModel model = new DefaultListModel();
        
        
        try {
            
            
            
           String sql = "select id_supir,nama from supir";
           
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            int no=0;
            
            while(rs.next()){
              
               String aku = rs.getString("id_supir");
              
               model.addElement(aku);
               
            } 
            jList1.setModel(model);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
    private void Tampil(){
       
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kd Bus");
        model.addColumn("Plat");
        model.addColumn("Kapasitas");
        model.addColumn("Kelas");
        model.addColumn("Tahun Produksi");
        model.addColumn("Kd Supir");
        
        try {
            String sql = "select * from bus";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            int no=0;
            
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                     rs.getString("id_bus"), rs.getString("plat"), rs.getString("kapasitas"), 
                     rs.getString("kelas"), rs.getString("tahun_produksi"),
                     rs.getString("id_supir")
                });
            } jTable1.setModel(model);
            jTable1.setShowGrid(true);
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
      
    private void clear(){
        tBus.setText("");
        tPlat.setText("");
        tKapasitas.setText("");
        tKelas.setText("");
        tProduksi.setText("");
        tSupir.setText("");
        tBus.setEditable(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupbutton = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tCari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tBus = new javax.swing.JTextField();
        tPlat = new javax.swing.JTextField();
        tKapasitas = new javax.swing.JTextField();
        tKelas = new javax.swing.JTextField();
        tProduksi = new javax.swing.JTextField();
        tSupir = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        Pilih = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<String>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 470));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setOpaque(false);

        jTable1.setBackground(new java.awt.Color(240, 240, 240));
        jTable1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kd Bus", "Plat", "Kapasitas", "Kelas", "Tahun Produksi", "Kd Supir"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 280, 200));

        tCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tCariMousePressed(evt);
            }
        });
        tCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCariActionPerformed(evt);
            }
        });
        jPanel1.add(tCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 340, 30));

        jButton1.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton1.setText("Cari");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, 30));

        jButton2.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 80, -1));

        jButton3.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tambah Daftar Tempat Duduk");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Plat");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kapasitas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kelas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tahun Produksi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kode Supir");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));
        jPanel1.add(tBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, 30));
        jPanel1.add(tPlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, 30));
        jPanel1.add(tKapasitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 170, 30));
        jPanel1.add(tKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 70, 30));
        jPanel1.add(tProduksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 70, 30));
        jPanel1.add(tSupir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 170, 30));

        jButton4.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton4.setText("Ubah");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 80, -1));

        jButton5.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 80, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Database Bus\n");

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Long_Arrow_Left_64px.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        exit1.setBackground(new java.awt.Color(255, 255, 255));
        exit1.setFont(new java.awt.Font("Meiryo UI", 1, 30)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit1.setText("X");
        exit1.setMaximumSize(new java.awt.Dimension(64, 64));
        exit1.setMinimumSize(new java.awt.Dimension(64, 64));
        exit1.setPreferredSize(new java.awt.Dimension(64, 64));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(575, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 120));

        Pilih.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        Pilih.setText("tambah daftar kursi");
        Pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihActionPerformed(evt);
            }
        });
        jPanel1.add(Pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 170, -1));

        jList1.setBackground(new java.awt.Color(240, 240, 240));
        jList1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 80, 250));

        jLabel9.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Kode Bus");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 80, 30));

        jComboBox2.setFont(new java.awt.Font("Ubuntu Condensed", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eksekutif", "Ekonomi", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 80, 30));

        jLabel10.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Daftar Kode Supir");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tambah Data Bus");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
        int baris = jTable1.getSelectedRow();
        tBus.setText(jTable1.getModel().getValueAt(baris, 0).toString());
        tPlat.setText(jTable1.getModel().getValueAt(baris, 1).toString());
        tKapasitas.setText(jTable1.getModel().getValueAt(baris, 2).toString());
        tKelas.setText(jTable1.getModel().getValueAt(baris, 3).toString());
        tProduksi.setText(jTable1.getModel().getValueAt(baris, 4).toString());
        tSupir.setText(jTable1.getModel().getValueAt(baris, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void tCariMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCariMousePressed
        // TODO add your handling code here:
        Tampil();
    }//GEN-LAST:event_tCariMousePressed

    private void tCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCariActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tCariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kd Bus");
        model.addColumn("Plat");
        model.addColumn("Kapasitas");
        model.addColumn("Kelas");
        model.addColumn("Tahun Produksi");
        model.addColumn("Kd Supir");

        try {
            String sql= "select * from bus where id_bus like '%"+tCari.getText()+"%' or plat like '%"+tCari.getText()+
            "%' or kapasitas like '%"+tCari.getText()+"%' or kelas like '%"+tCari.getText()+"%' or tahun_produksi like '%"+
            tCari.getText()+"%' or id_supir like '%"+tCari.getText()+"%'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int no=0;

            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                    rs.getString("id_bus"), rs.getString("plat"), rs.getString("kapasitas"),
                    rs.getString("kelas"), rs.getString("tahun_produksi"),
                    rs.getString("id_supir")
                });
            }
            jTable1.setModel(model);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //id_bus=tBus.getText().toString();
        
        
        try{
            
            
            String sql = "insert into bus values('"+tBus.getText()+"', '"+
            tPlat.getText()+"', '"+tKapasitas.getText()+"', '"+tKelas.getText()+
                    "', '"+tProduksi.getText()+"','"+
            tSupir.getText()+"')";

            st = conn.createStatement();
            st.executeUpdate(sql);
            Tampil();
            clear();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "delete from bus where id_bus='"+tBus.getText()+"'";
            st = conn.createStatement();
            st.executeUpdate(sql);
            Tampil();
            clear();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Tampil();
        TampilData();
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "update bus set id_bus= '"+tBus.getText()+
                    "', plat= '"+tPlat.getText()+
                    "', kapasitas= '"+tKapasitas.getText()+
                    "', kelas='"+tKelas.getText()+
                    "', tahun_produksi= '"+tProduksi.getText()+
                    "', id_supir= '"+tSupir.getText()+
                    "' where id_bus='"+tBus.getText()+"'";
            st = conn.createStatement();
            st.executeUpdate(sql);

            clear();
            Tampil();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void PilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihActionPerformed
       dispose();
       new Data_Kursi().setVisible(true);
        
    }//GEN-LAST:event_PilihActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        dispose();
        new Admin().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_backMousePressed

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit1MousePressed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        int baris = jList1.getSelectedIndex();
        tSupir.setText(jList1.getSelectedValue().toString());
    }//GEN-LAST:event_jList1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String tahun = (String)jComboBox1.getSelectedItem();
        tProduksi.setText(tahun); 
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String kelas = (String)jComboBox2.getSelectedItem();
        tKelas.setText(kelas); 
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(Database_Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Database_Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Database_Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Database_Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Database_Bus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pilih;
    private javax.swing.JLabel back;
    private javax.swing.JLabel exit1;
    private javax.swing.ButtonGroup grupbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tBus;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tKapasitas;
    private javax.swing.JTextField tKelas;
    private javax.swing.JTextField tPlat;
    private javax.swing.JTextField tProduksi;
    private javax.swing.JTextField tSupir;
    // End of variables declaration//GEN-END:variables
}
