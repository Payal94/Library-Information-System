
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SignUP extends javax.swing.JFrame {

    public SignUP() {
        initComponents();
        connect();
    }
    private void connect()
    {
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
   private void insertDatabase()
   {
       name = jTextField1_name.getText();
       usertyp = (String)jComboBox2_userType.getSelectedItem();
       Passwrd = new String(jPasswordField1.getPassword());
       confirm = new String(jPasswordField2_confirm.getPassword());
       if(Passwrd.equals(confirm))
       {}else JOptionPane.showMessageDialog(null,"Not Matches with Above Enetered Password","Error", JOptionPane.ERROR_MESSAGE);
       System.out.println("Creating statement...");
       int i = 1;
        try {
            stmt1 = conn.createStatement();
            if (usertyp.equals("UnderGraduate")) { 
                rs = stmt1.executeQuery("SELECT * FROM ugusers");
                while (rs.next()) {
                    i++;
                }
                System.out.println("no of rows : " + i);
                loginId = "UG";
                loginId = loginId.concat(Integer.toString(i++));
                System.out.print(loginId);
                stmt = conn.prepareStatement("INSERT INTO ugusers VALUES(?,?,?,?,?)");
                stmt.setString(1, name);
                stmt.setString(2, loginId);
                stmt.setString(3, usertyp);
                stmt.setString(4, Passwrd);
                stmt.setInt(5,0);
                stmt.executeUpdate();
           }
            if (usertyp.equals("PostGraduate")) {
                rs = stmt1.executeQuery("SELECT * FROM pgusers");
                while (rs.next()) {
                    i++;
                }
                System.out.println("no of rows : " + i);
                loginId = "PG";
                loginId = loginId.concat(Integer.toString(i++));
                System.out.print(loginId);
                stmt = conn.prepareStatement("INSERT INTO pgusers VALUES(?,?,?,?,?)");
                stmt.setString(1, name);
                stmt.setString(2, loginId);
                stmt.setString(3, usertyp);
                stmt.setString(4, Passwrd);
                stmt.setInt(5,0);
                stmt.execute();
                //JOptionPane.showMessageDialog(null,"The Member already exists !", "",JOptionPane.OK_OPTION);
            }
           if (usertyp.equals("ResearchScholars")) {
                rs = stmt1.executeQuery("SELECT * FROM rsusers");
                while (rs.next()) {
                    i++;
                }
                System.out.println("no of rows : "+i);
                loginId = "RS";
                loginId = loginId.concat(Integer.toString(i++));
                System.out.print(loginId);
                stmt = conn.prepareStatement("INSERT INTO rsusers VALUES(?,?,?,?,?)");
                stmt.setString(1, name);
                stmt.setString(2, loginId);
                stmt.setString(3, usertyp);
                stmt.setString(4, Passwrd);
                stmt.setInt(5,0);
                stmt.execute();
            }
           if (usertyp.equals("Faculty")) {
                rs = stmt1.executeQuery("SELECT * FROM facusers");
                while (rs.next()) {
                    i++;
                }
                System.out.println("no of rows : "+i);
                loginId = "FAC";
                loginId = loginId.concat(Integer.toString(i++));
                System.out.print(loginId);
                stmt = conn.prepareStatement("INSERT INTO facusers VALUES(?,?,?,?,?)");
                stmt.setString(1, name);
                stmt.setString(2, loginId);
                stmt.setString(3, usertyp);
                stmt.setString(4, Passwrd);
                stmt.setInt(5,0);
                stmt.execute();
            }
       } catch (SQLException ex) {
           Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
       }
            
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1_register = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2_userType = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2_confirm = new javax.swing.JPasswordField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(51, 255, 204), new java.awt.Color(0, 204, 204))));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USER TYPE :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ENTER PASSWORD :");

        jButton1_register.setBackground(new java.awt.Color(0, 204, 204));
        jButton1_register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_register.setText("REGISTER");
        jButton1_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_registerActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONFIRM PASSWORD :");

        jComboBox2_userType.setBackground(new java.awt.Color(0, 255, 204));
        jComboBox2_userType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UnderGraduate", "PostGraduate", "ResearchScholars", "Faculty" }));

        jPasswordField2_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2_confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1_name, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField2_confirm)
                            .addComponent(jComboBox2_userType, 0, 279, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton1_register, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2_userType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField2_confirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButton1_register, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_registerActionPerformed

        insertDatabase();
        JOptionPane.showMessageDialog(null, "Ting Tong !! :) Your LOgin ID is"+loginId, " ! ERROR", JOptionPane.OK_OPTION);
        log = new Login_MemDetails();
        this.dispose();
        log.run1();
    }//GEN-LAST:event_jButton1_registerActionPerformed

    private void jPasswordField2_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2_confirmActionPerformed

    public void run2()
    {
       new SignUP().setVisible(true);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUP().setVisible(true);
                
            }
        });
    }   
    private String name ;
    private String usertyp ;
    private String loginId ;
    private String Passwrd ;
    private String confirm ;
    private Login_MemDetails log;
    private String sql;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/myfirstdb";
    static final String USER = "root";
    static final String PASS = "";
    private PreparedStatement stmt = null;
    private Statement stmt1 = null;
    private Connection conn = null;
    private ResultSet rs = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_register;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2_userType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2_confirm;
    private javax.swing.JTextField jTextField1_name;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
