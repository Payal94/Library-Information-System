
import Connector.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MemberUser extends javax.swing.JFrame {

    Connect c = new Connect();
    public MemberUser() {
        initComponents();
        setUser();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        ResultPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_setUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_issue = new javax.swing.JTable();
        jLabel_setLoginId = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_reserve = new javax.swing.JTable();
        jButton_search = new javax.swing.JButton();
        jButton_reserve = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ResultPanel.setBackground(new java.awt.Color(0, 51, 51));
        ResultPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 204, 204))));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 204));

        jLabel_setUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_setUserName.setForeground(new java.awt.Color(255, 255, 255));

        jTable_issue.setBackground(new java.awt.Color(0, 51, 51));
        jTable_issue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 204, 204)));
        jTable_issue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_issue.setForeground(new java.awt.Color(255, 255, 255));
        jTable_issue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book Issued", "ISBN", "IssueDate", "Overdue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_issue.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_issue.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable_issue.setMaximumSize(new java.awt.Dimension(2147483647, 250));
        jTable_issue.setRowHeight(25);
        jScrollPane1.setViewportView(jTable_issue);

        jLabel_setLoginId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_setLoginId.setForeground(new java.awt.Color(255, 255, 255));

        jTable_reserve.setBackground(new java.awt.Color(0, 51, 51));
        jTable_reserve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 204, 204)));
        jTable_reserve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_reserve.setForeground(new java.awt.Color(255, 255, 255));
        jTable_reserve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book Reserved", "ISBN", "Reserved from:", "Reserved upto:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_reserve.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_reserve.setRowHeight(25);
        jScrollPane2.setViewportView(jTable_reserve);

        jButton_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_search.setText("SEARCH BOOK");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jButton_reserve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_reserve.setText("RESERVE BOOK");
        jButton_reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reserveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResultPanelLayout = new javax.swing.GroupLayout(ResultPanel);
        ResultPanel.setLayout(ResultPanelLayout);
        ResultPanelLayout.setHorizontalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(jButton_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 161, Short.MAX_VALUE))
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
                                .addComponent(jLabel_setUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
                                .addComponent(jLabel_setLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208)))
                        .addComponent(jLabel15))
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        ResultPanelLayout.setVerticalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_setUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_setLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ResultPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ResultPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed

        
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reserveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_reserveActionPerformed
   
    public void setUser() {
        try {
            if (mem_login.usertyp.equals("UnderGraduate")) {
                sql = "SELECT * FROM ugusers WHERE LoginIds = ?";
            }
            if (mem_login.usertyp.equals("PostGraduate")) {
                sql = "SELECT * FROM pgusers WHERE LoginIds = ?";
            }
            if (mem_login.usertyp.equals("ResearchScholars")) {
                sql = "SELECT * FROM rsusers WHERE LoginIds = ?";
            }
            if (mem_login.usertyp.equals("Faculty")) {
                sql = "SELECT * FROM facusers WHERE LoginIds = ?";
            }
            prest = c.conn.prepareStatement(sql);
            prest.setString(1, mem_login.id);
            rs1 = prest.executeQuery();
            if(rs1.next()!= false)
            {
                user_name = rs1.getString(1);
                user_id = rs1.getString(2);
                jLabel_setUserName.setText(user_name);
                jLabel_setLoginId.setText(user_id);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void run1() {
                new MemberUser().setVisible(true);
            }
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberUser().setVisible(true);
            }
        });
    }
    private Login mem_login = new Login();
    private String sql, user_name, user_id;
    private PreparedStatement prest = null;
    private ResultSet rs1 = null; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ResultPanel;
    private javax.swing.JButton jButton_reserve;
    private javax.swing.JButton jButton_search;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_setLoginId;
    private javax.swing.JLabel jLabel_setUserName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_issue;
    private javax.swing.JTable jTable_reserve;
    // End of variables declaration//GEN-END:variables
}
