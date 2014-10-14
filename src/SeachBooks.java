
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeachBooks extends javax.swing.JFrame {

    public SeachBooks() {
        initComponents();
        connect();
    }

    private void connect() {
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    private void searchBook() {
        try {
            name = jTextField_name.getText();
            String sql = "SELECT * FROM books WHERE Name = ?";
            prest = conn.prepareStatement(sql);
            prest.setString(1, name);
            ResultSet rs1 = prest.executeQuery();
            if (rs1.next() == false) {
                System.out.println("This book does not exist");
                jLabel_bookName.setText(" NOT AVAILABLE  ");
            } else {
                System.out.println(rs1.getString(1) + " - " + rs1.getString(2) + " - " + rs1.getString(3));
                jLabel_bookName.setText("Name of Book :  " + rs1.getString(1));

                String s1 = Float.toString(rs1.getFloat(2));
                jLabel_isbn.setText("The ISBN Number :  " + s1);

                String s2 = Integer.toString(rs1.getInt(3));
                jLabel_rackNum.setText("Rack Number :  " + s2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_signIN = new javax.swing.JButton();
        DisplayPanel = new javax.swing.JPanel();
        SearchPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jButton_ok = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        ResultPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_bookName = new javax.swing.JLabel();
        jLabel_isbn = new javax.swing.JLabel();
        jLabel_rackNum = new javax.swing.JLabel();
        jButton_resultok = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("ISSUE BOOKS");

        jButton_signIN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_signIN.setText("SIGN IN");
        jButton_signIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signINActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        DisplayPanel.setLayout(new java.awt.CardLayout());

        SearchPanel.setBackground(new java.awt.Color(0, 51, 51));
        SearchPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 204, 204))));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Please enter the exact name of the book ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 204));
        jLabel11.setText("SEARCH BOOKS");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NAME OF BOOK:");

        jButton_ok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_ok.setText("OK");
        jButton_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_okActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchPanelLayout.createSequentialGroup()
                                .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField_name))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchPanelLayout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(66, 66, 66))
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        DisplayPanel.add(SearchPanel, "search");

        ResultPanel.setBackground(new java.awt.Color(0, 51, 51));
        ResultPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 204, 204))));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 204));
        jLabel15.setText("SEARCH BOOKS RESULT");

        jLabel_bookName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_bookName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_isbn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_isbn.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_rackNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_rackNum.setForeground(new java.awt.Color(255, 255, 255));

        jButton_resultok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_resultok.setText("OK");
        jButton_resultok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resultokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResultPanelLayout = new javax.swing.GroupLayout(ResultPanel);
        ResultPanel.setLayout(ResultPanelLayout);
        ResultPanelLayout.setHorizontalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel15))
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel14)))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_bookName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_isbn, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addComponent(jLabel_rackNum, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jButton_resultok, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ResultPanelLayout.setVerticalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_rackNum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_resultok, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        DisplayPanel.add(ResultPanel, "result");

        getContentPane().add(DisplayPanel, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_signINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signINActionPerformed
    }//GEN-LAST:event_jButton_signINActionPerformed

    private void jButton_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_okActionPerformed

        CardLayout card = (CardLayout) DisplayPanel.getLayout();
        card.show(DisplayPanel, "result");
        searchBook();

    }//GEN-LAST:event_jButton_okActionPerformed

    private void jButton_resultokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resultokActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton_resultokActionPerformed
    public void run4() {
        new SeachBooks().setVisible(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeachBooks().setVisible(true);
            }
        });
    }
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/myfirstdb";
    static final String USER = "root";
    static final String PASS = "";
    private Connection conn = null;
    private String name;
    private java.sql.PreparedStatement prest = null;
    private java.sql.PreparedStatement prest2 = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JPanel ResultPanel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton jButton_ok;
    private javax.swing.JButton jButton_resultok;
    private javax.swing.JButton jButton_signIN;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_bookName;
    private javax.swing.JLabel jLabel_isbn;
    private javax.swing.JLabel jLabel_rackNum;
    private javax.swing.JTextField jTextField_name;
    // End of variables declaration//GEN-END:variables
}
