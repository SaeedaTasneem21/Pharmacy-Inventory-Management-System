
package pharmacymanagement;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Medicine extends javax.swing.JFrame {

    
    public Medicine() {
        initComponents();
        SelectMed();
        GetCompany();
    }
Connection con = null;
Statement St = null;
Statement St1 = null;
ResultSet Rslt = null;
 ResultSet  Rslt1 = null;
java.util.Date MfgDate, expDate;
java.sql.Date MyMfgDate, MyexpDate;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_con = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        medid = new javax.swing.JTextField();
        medname = new javax.swing.JTextField();
        Medprice = new javax.swing.JTextField();
        MedQty = new javax.swing.JTextField();
        companyName = new javax.swing.JComboBox<>();
        Addbt = new javax.swing.JButton();
        updatebt = new javax.swing.JButton();
        deleteBT = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        clrBt = new javax.swing.JButton();
        MedMFG = new com.toedter.calendar.JDateChooser();
        MedExp = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        sale = new javax.swing.JLabel();
        agent = new javax.swing.JLabel();
        shut_win = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        panel_con.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MANAGE MEDICINE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("MED NAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("PRICE");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("COMPANY");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("QUANTITY");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MFG DATE");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("EXP DATE");

        medid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        medname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Medprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Medprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedpriceActionPerformed(evt);
            }
        });

        MedQty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        companyName.setBackground(new java.awt.Color(204, 204, 255));
        companyName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        companyName.setBorder(null);
        companyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameActionPerformed(evt);
            }
        });

        Addbt.setBackground(new java.awt.Color(51, 51, 255));
        Addbt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Addbt.setForeground(new java.awt.Color(255, 255, 255));
        Addbt.setText("ADD");
        Addbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtMouseClicked(evt);
            }
        });

        updatebt.setBackground(new java.awt.Color(51, 51, 255));
        updatebt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        updatebt.setForeground(new java.awt.Color(255, 255, 255));
        updatebt.setText("UPDATE");
        updatebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtMouseClicked(evt);
            }
        });

        deleteBT.setBackground(new java.awt.Color(51, 51, 255));
        deleteBT.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        deleteBT.setForeground(new java.awt.Color(255, 255, 255));
        deleteBT.setText("DELETE");
        deleteBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBTMouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(51, 51, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 51, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MEDICINE LIST");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MedicineTable.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MedicineTable.setForeground(new java.awt.Color(255, 153, 102));
        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MEDID", "MEDNAME", "MEDPRICE", "QUANTITY", "MFGDATE", "EXPDATE", "COMPANY"
            }
        ));
        MedicineTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MedicineTable.setGridColor(new java.awt.Color(0, 0, 0));
        MedicineTable.setRowHeight(25);
        MedicineTable.setSelectionBackground(new java.awt.Color(204, 102, 255));
        MedicineTable.setShowHorizontalLines(true);
        MedicineTable.setShowVerticalLines(true);
        MedicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MedicineTable);

        clrBt.setBackground(new java.awt.Color(255, 51, 51));
        clrBt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        clrBt.setForeground(new java.awt.Color(255, 255, 255));
        clrBt.setText("CLEAR");
        clrBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_conLayout = new javax.swing.GroupLayout(panel_con);
        panel_con.setLayout(panel_conLayout);
        panel_conLayout.setHorizontalGroup(
            panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_conLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_conLayout.createSequentialGroup()
                        .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_conLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Medprice, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_conLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MedQty, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_conLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(medname, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_conLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(medid, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(134, 134, 134)
                        .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(panel_conLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Addbt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(updatebt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(clrBt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_conLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_conLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_conLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_conLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_conLayout.createSequentialGroup()
                        .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MedMFG, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(MedExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(231, 231, 231))))
        );
        panel_conLayout.setVerticalGroup(
            panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_conLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedMFG, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_conLayout.createSequentialGroup()
                        .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_conLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(medname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Medprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_conLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(MedExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_conLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MedQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80)
                .addGroup(panel_conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clrBt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacymanagement/pic 4.jpg"))); // NOI18N

        sale.setBackground(new java.awt.Color(204, 102, 255));
        sale.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sale.setForeground(new java.awt.Color(255, 255, 255));
        sale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacymanagement/bill (1).png"))); // NOI18N
        sale.setText(" BILL");
        sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleMouseClicked(evt);
            }
        });

        agent.setBackground(new java.awt.Color(204, 102, 255));
        agent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        agent.setForeground(new java.awt.Color(255, 255, 255));
        agent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacymanagement/user.png"))); // NOI18N
        agent.setText(" AGENTS");
        agent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentMouseClicked(evt);
            }
        });

        shut_win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacymanagement/close-window-24.png"))); // NOI18N
        shut_win.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shut_win.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shut_winMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 102, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacymanagement/company.png"))); // NOI18N
        jLabel2.setText(" COMPANY");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(60, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(60, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setPreferredSize(new java.awt.Dimension(60, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(agent, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panel_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shut_win)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(shut_win, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agent, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     */
    private void SelectMed() {
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDatabase", "user1", "idontcare");
            St1 = con.createStatement();
            Rslt1 = St1.executeQuery("Select *  from user1.MEDICINETBL");
            MedicineTable.setModel(DbUtils.resultSetToTableModel(Rslt1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    private void GetCompany(){           
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDatabase", "user1", "idontcare");
            St1 = con.createStatement();
            String query = "Select *  from user1.COMPANYTBL";
            Rslt1 = St1.executeQuery(query);
            
            while(Rslt1.next()){
                String comp = Rslt1.getString("COMNAME");
                companyName.addItem(comp);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

    }
    
    
    private void MedpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedpriceActionPerformed

    private void companyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyNameActionPerformed

    private void AddbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtMouseClicked
        MfgDate = MedMFG.getDate();
        MyMfgDate = new java.sql.Date(MfgDate.getTime());
        expDate =  MedExp.getDate();
        MyexpDate = new java.sql.Date(expDate.getTime());
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDatabase","user1", "idontcare");
            PreparedStatement add = con.prepareStatement("Insert into MEDICINETBL values(?,?,?,?,?,?,?) ");
            add.setInt(1, Integer.valueOf(medid.getText()));
            add.setString(2, medname.getText());
            add.setInt(3, Integer.valueOf(Medprice.getText()));
            add.setInt(4, Integer.valueOf(MedQty.getText()));
            add.setDate(5, MyMfgDate);
             add.setDate(6, MyexpDate);
             add.setString(7, companyName.getSelectedItem().toString());
             int row = add.executeUpdate();
             JOptionPane.showMessageDialog(this, "Medicine has successfully Added");
             con.close();    
             SelectMed();
             
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddbtMouseClicked

    private void deleteBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBTMouseClicked
        if(medid.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter the medicine to be deleted");
        }
        else{
           try{
               con =DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDatabase","user1", "idontcare");
               String Id = medid.getText();
               String Query = "DELETE FROM user1.MEDICINETBL WHERE MEDTD= "+ Id;
               Statement Add = con.createStatement();
               Add.executeUpdate(Query);
               SelectMed();
                    JOptionPane.showMessageDialog(this, " Medicine has deleted successfully!");
           }catch(SQLException e){
               e.printStackTrace();
           }
        }
    }//GEN-LAST:event_deleteBTMouseClicked

    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)MedicineTable.getModel();
        int Myindex = MedicineTable.getSelectedRow();
        medid.setText(model.getValueAt(Myindex, 0).toString());
        medname.setText(model.getValueAt(Myindex, 1).toString());
        Medprice.setText(model.getValueAt(Myindex, 2).toString());
        MedQty.setText(model.getValueAt(Myindex, 3).toString());
               
    }//GEN-LAST:event_MedicineTableMouseClicked

    private void updatebtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtMouseClicked
        
        if(medid.getText().isEmpty( ) ||medname.getText().isEmpty()||Medprice.getText().isEmpty()|| MedQty.getText().isEmpty() )
        {
             JOptionPane.showMessageDialog(this, " Missing Information");
        }
        else{
            try{
                MfgDate = MedMFG.getDate();
                MyMfgDate = new java.sql.Date(MfgDate.getTime());
                expDate = MedExp.getDate();
                MyexpDate = new java.sql.Date(expDate.getTime());
                
                con= DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDatabase","user1", "idontcare");
                String UpdateQuery = "Update user1.MEDICINETBL set MEDNAME  =  ' "+medname.getText()+" ' "+",MEDPRICE  =  "+Medprice.getText()+""+",MEDQTY = "+MedQty.getText()+""+" ,MEDPRODUCTION =  '"+ MyMfgDate+" ' "+" ,MEDEXP = '"+MyexpDate+" ' "+  " ,MEDCOMP = ' "+companyName.getSelectedItem().toString()+" ' "+"where MEDTD = "+medid.getText();
                Statement Add = con.createStatement();
                Add.executeUpdate(UpdateQuery);
                     JOptionPane.showMessageDialog(this, "Medicine has updated successfully");
            }catch(SQLException e){
                 e.printStackTrace();
            }
          SelectMed();
        }
    
        
    }//GEN-LAST:event_updatebtMouseClicked

    private void clrBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrBtMouseClicked
        medid.setText(" ");
        medname.setText(" ");
        Medprice.setText(" ");
        MedQty.setText(" ");
    }//GEN-LAST:event_clrBtMouseClicked

    private void agentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentMouseClicked
        new AGENTS().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agentMouseClicked

    private void shut_winMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shut_winMouseClicked
        // TODO add your handling code here:

        System.exit(0);

    }//GEN-LAST:event_shut_winMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new ManageCompany().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void saleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleMouseClicked
        // TODO add your handling code here:
        new Billing().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_saleMouseClicked

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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Medicine().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbt;
    private com.toedter.calendar.JDateChooser MedExp;
    private com.toedter.calendar.JDateChooser MedMFG;
    private javax.swing.JTextField MedQty;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JTextField Medprice;
    private javax.swing.JLabel agent;
    private javax.swing.JButton clrBt;
    private javax.swing.JComboBox<String> companyName;
    private javax.swing.JButton deleteBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField medid;
    private javax.swing.JTextField medname;
    private javax.swing.JPanel panel_con;
    private javax.swing.JLabel sale;
    private javax.swing.JLabel shut_win;
    private javax.swing.JButton updatebt;
    // End of variables declaration//GEN-END:variables
}
