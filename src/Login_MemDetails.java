
import Connector.*;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.CardLayout;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class Login_MemDetails extends javax.swing.JFrame {

    Connect c = new Connect();
    private ResultSet rs;
    private PreparedStatement prest2;
    private TableModel model2;

    public Login_MemDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisplayPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jText_LogID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_signUp = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxuser_type = new javax.swing.JComboBox();
        jButton_signIN = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jComboBox_Login_date = new javax.swing.JComboBox();
        jComboBox_Login_month = new javax.swing.JComboBox();
        jComboBox_Loginyear = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        Member_DetailsPanel = new javax.swing.JPanel();
        ResultPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel_setUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_issue = new javax.swing.JTable();
        jLabel_setLoginId = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_reserve = new javax.swing.JTable();
        jButton_search = new javax.swing.JButton();
        jButton_reserve = new javax.swing.JButton();
        jButton_Ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DisplayPanel.setBackground(new java.awt.Color(0, 51, 51));
        DisplayPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 204, 204))));
        DisplayPanel.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(51, 255, 204), new java.awt.Color(51, 255, 204)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204))));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Not a user yet, ");

        jButton_signUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_signUp.setText("SIGN UP");
        jButton_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signUpActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USER TYPE :");

        jComboBoxuser_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UnderGraduate", "PostGraduate", "ResearchScholars", "Faculty", "Clerk", "Librarian" }));

        jButton_signIN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_signIN.setText("SIGN IN");
        jButton_signIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signINActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 204));
        jLabel15.setText("LOGIN PANEL");

        jComboBox_Login_date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox_Login_date.setSelectedIndex(1);
        jComboBox_Login_date.setBorder(null);

        jComboBox_Login_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox_Login_month.setBorder(null);

        jComboBox_Loginyear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATE :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jText_LogID, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxuser_type, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboBox_Login_date, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(jComboBox_Login_month, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(jComboBox_Loginyear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_signIN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText_LogID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxuser_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Login_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Loginyear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Login_month, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton_signIN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DisplayPanel.add(LoginPanel, "Login_User");

        ResultPanel.setBackground(new java.awt.Color(0, 51, 51));
        ResultPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 204, 204))));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 255, 204));

        jLabel_setUserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_setUserName.setForeground(new java.awt.Color(0, 255, 204));

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

        jLabel_setLoginId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_setLoginId.setForeground(new java.awt.Color(0, 255, 204));

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

        jButton_Ok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Ok.setText("OK");
        jButton_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResultPanelLayout = new javax.swing.GroupLayout(ResultPanel);
        ResultPanel.setLayout(ResultPanelLayout);
        ResultPanelLayout.setHorizontalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
                                .addComponent(jLabel_setLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
                                .addComponent(jLabel_setUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163)))
                        .addComponent(jLabel16))))
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        ResultPanelLayout.setVerticalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_setUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel_setLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout Member_DetailsPanelLayout = new javax.swing.GroupLayout(Member_DetailsPanel);
        Member_DetailsPanel.setLayout(Member_DetailsPanelLayout);
        Member_DetailsPanelLayout.setHorizontalGroup(
            Member_DetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(Member_DetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Member_DetailsPanelLayout.createSequentialGroup()
                    .addComponent(ResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Member_DetailsPanelLayout.setVerticalGroup(
            Member_DetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(Member_DetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Member_DetailsPanelLayout.createSequentialGroup()
                    .addComponent(ResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        DisplayPanel.add(Member_DetailsPanel, "Mem_UserDetails");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private java.sql.Date formattor(String day, String month, String year) {

        String date_s;
        java.sql.Date date_sql = null;
        date_s = day;
        date_s = date_s.concat("-");
        date_s = date_s.concat(month);
        date_s = date_s.concat("-");
        date_s = date_s.concat(year);
        System.out.println(date_s);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        // Here was the change
        try {
            java.util.Date date = sdf1.parse(date_s);
            date_sql = new java.sql.Date(date.getTime());
            System.out.println(date_sql);

        } catch (ParseException ex) {
            System.out.println("exception in conversion");
            Logger.getLogger(IssueBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date_sql;

    }

    private double monthsBetween(java.util.Date d1, java.util.Date d2) {
        return (d2.getTime() - d1.getTime()) / AVERAGE_MILLIS_PER_MONTH;
    }
    private int check_login_type(String id, String u_type)
    {
        if(id.charAt(0)== 'U') 
        {
            if(u_type.equals("UnderGraduate"))
            {  
                return 1;
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Sorry! your user id does not match with your userType", " ! ERROR", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
            
        }
        if(id.charAt(0)== 'P') 
        {
            if(u_type.equals("PostGraduate"))
            {
                return 1;
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Sorry! your user id does not match with your userType", " ! ERROR", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
            
        }
        if(id.charAt(0)== 'R') 
        {
            if(u_type.equals("ResearchScholars"))
            { 
                return 1;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry! your user id does not match with your userType", " ! ERROR", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
            
        }
        if(id.charAt(0)== 'F') 
        {
            if(u_type.equals("Faculty"))
            {    
                return 1;
            }
            else{
                JOptionPane.showMessageDialog(null, "Sorry! your user id does not match with your userType", " ! ERROR", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
            
        }
        return 0;
       
    }
    private void check_login() throws SQLException {
        System.out.println("login succesful");
        id = jText_LogID.getText();
        pwd = new String(jPassword.getPassword());
        if (id.equals("CL") && pwd.equals("clerk")) {
                        this.dispose();
                        issue_class = new IssueBooks();
                        issue_class.run2();
                        i = 2;
                        return;
                    }
       
        //check_login_type(id, usertyp);
        date_today = formattor((String) jComboBox_Login_date.getSelectedItem(), (String) jComboBox_Login_month.getSelectedItem(), (String) jComboBox_Loginyear.getSelectedItem());
        sql = "SELECT * FROM issuedbooks WHERE Owner_LoginId= ?";
        prest = (PreparedStatement) c.conn.prepareStatement(sql);
        prest.setString(1, id);
        rs = prest.executeQuery();
        if (rs.next() != false) {       
            usertyp = (String) jComboBoxuser_type.getSelectedItem();
        } 
        int check = check_login_type(id, usertyp);
        if( check == 0 ) return ;
            switch (usertyp) {
                
                case "Librarian":
                    if (id.equals("LIB") && pwd.equals("Librarian")) {
                        this.dispose();

                        remove_class = new RemoveBook();
                        remove_class.run();
                        i = 3;
                        return;
                    }
                    break;
                case "UnderGraduate":

                    stmt = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM ugusers WHERE LoginIds = ?");

                    break;
                case "PostGraduate":

                    stmt = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM pgusers WHERE LoginIds = ?");
                    break;
                case "ResearchScholars":

                    stmt = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM rsusers WHERE LoginIds = ?");
                    break;
                case "Faculty":

                    stmt = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM facusers WHERE LoginIds = ?");
                    break;
            }
            System.out.println("Login sql");
            stmt.setString(1, id);
            pwd_check = stmt.executeQuery();
            if (pwd_check.next()) {
                get_pwd = pwd_check.getString(4);
                System.out.println("Login :" + id + " Password : " + get_pwd);
            }
            if (get_pwd.equals(pwd)) {
                System.out.println("login succesful");
            } else {
                System.out.println("incorrect username or password");
            }

    }
       
    

    public void setUser() {
        try {
            if (usertyp.equals("UnderGraduate")) {
                sql = "SELECT * FROM ugusers WHERE LoginIds = ?";
            }
            else if (usertyp.equals("PostGraduate")) {
                sql = "SELECT * FROM pgusers WHERE LoginIds = ?";
            }
            else if (usertyp.equals("ResearchScholars")) {
                sql = "SELECT * FROM rsusers WHERE LoginIds = ?";
            }
            else if (usertyp.equals("Faculty")) {
                sql = "SELECT * FROM facusers WHERE LoginIds = ?";
            }
            else{
                JOptionPane.showMessageDialog(null, "Sorry! You are a type of user we donot allow!Get Going man!", " ! ERROR", WIDTH);
                        
            }
            prest = c.conn.prepareStatement(sql);
            prest.setString(1, id);
            rs1 = prest.executeQuery();
            if (rs1.next() != false) {
                user_name = rs1.getString(1);
                user_id = rs1.getString(2);
                jLabel_setUserName.setText("USERNAME :  " + user_name);
                jLabel_setLoginId.setText("LOGIN ID  :  " + user_id);

            }
        } catch (SQLException ex) {
            Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String Date_to_String(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String text = df.format(date);
        System.out.println("The date is: " + text);
        return text;
    }

    private void get_users_issued_books() {
        try {
            String sql = "SELECT * FROM issuedbooks WHERE Owner_LoginId = ?";
            prest1 = c.conn.prepareStatement(sql);
            prest1.setString(1, id);
            ResultSet rs1 = prest1.executeQuery();
            if(rs1.next()== false )
            {
                check_issue = false;
                return;
            }
            while (rs1.next()) {
                issue_date = rs1.getDate(6);
                
                isbn_no=rs1.getDouble(2);
                isbn_num=(float)isbn_no;
                if (usertyp.equals("UnderGraduate")) {
                if (monthsBetween(issue_date, date_today) * 30 - 30 > 0) {
                    overdue = monthsBetween(issue_date, date_today) * 30 - 30;
                } else {
                    overdue = 0.0;
                }
            }
            if (usertyp.equals("PostGraduate")) {
                if (monthsBetween(issue_date, date_today) * 30 - 30 > 0) {
                    overdue = monthsBetween(issue_date, date_today) * 30 - 30;
                } else {
                    overdue = 0.0;
                }
            }
            if (usertyp.equals("ResearchScholars")) {
                if (monthsBetween(issue_date, date_today) * 30 - 90 > 0) {
                    overdue = monthsBetween(issue_date, date_today) * 30 - 30;
                } else {
                    overdue = 0.0;
                }


            }
            if (usertyp.equals("Faculty")) {
                if (monthsBetween(issue_date, date_today) * 30 - 180 > 0) {
                    overdue = monthsBetween(issue_date, date_today) * 30 - 30;
                } else {
                    overdue = 0.0;
                }
            }
            System.out.println(overdue);
            System.out.println(isbn_no);
            sql = "UPDATE issuedbooks SET Overdue=? WHERE ISBN=?";
                    prest2 = (PreparedStatement) c.conn.prepareStatement(sql);
                    prest2.setDouble(1, overdue);
                    prest2.setDouble(2, isbn_num);
                    prest2.executeUpdate();
              
                count++;
                String date = Date_to_String(rs1.getDate(6));
                set_issueTable(rs1.getString(1), rs1.getDouble(2), date, rs1.getDouble(8));
               // System.out.println(rs1.getString(1) + "\t- " + date + "\t- " + rs1.getFloat(2) + "\t- " + rs1.getString(5) + "\t- " + rs1.getInt(7));
        }
            System.out.println("count :" + count);
            rs1.last();
        }
    catch (SQLException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        
    }}
    private void get_users_reserved_books()
    {
        
        try {
            String sql1 = "SELECT * FROM reservebooks WHERE Owner_LoginId = ?";
            prest3 = c.conn.prepareStatement(sql1);
            prest3.setString(1, id);
            ResultSet rs2 = prest3.executeQuery();
            while (rs2.next()) {
                count2++;
                String date1 = Date_to_String(rs2.getDate(6));
                String date2 = Date_to_String(rs2.getDate(7));
                set_reserveTable(rs2.getString(1), rs2.getDouble(2), date1, date2);
                  System.out.println("count :" + count2);
                //System.out.println(rs1.getString(1) + "\t- " + date1 + "\t- " + rs1.getFloat(2) + "\t- " + rs1.getString(5) + "\t- " + rs1.getInt(7));
            }
          
            rs2.last();
        } catch (SQLException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void set_issueTable(String issued_book, double isbn, String issue_date, Double overdue) {
        model1 = jTable_issue.getModel();
        for (int i = 0; i < model1.getColumnCount(); i++) {
            if (i == 0) {

                model1.setValueAt(issued_book, count - 1, i);

            }
            if (i == 1) {
                model1.setValueAt(isbn, count - 1, i);
            }
            if (i == 2) {
                model1.setValueAt(issue_date, count - 1, i);
            }
            if (i == 3) {
                model1.setValueAt(overdue, count - 1, i);
            }
        }

    }
private void set_reserveTable(String issued_book, double isbn, String issue_date, String  retrn) {
        model2 = jTable_reserve.getModel();
        System.out.println("debug");
        for (int i = 0; i < model2.getColumnCount(); i++) {
            if (i == 0) {

                model2.setValueAt(issued_book, count2 - 1, i);

            }
            if (i == 1) {
                model2.setValueAt(isbn, count2 - 1, i);
            }
            if (i == 2) {
                model2.setValueAt(issue_date, count2 - 1, i);
            }
            if (i == 3) {
                model2.setValueAt(retrn, count2 - 1, i);
            }
        }

    }
    public void run1() {
        new Login_MemDetails().setVisible(true);
    }
    private void jButton_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signUpActionPerformed
        register = new SignUP();
        this.dispose();
        register.run2();
    }//GEN-LAST:event_jButton_signUpActionPerformed
 
    private void refresh()
{
    jText_LogID.setText(null);
    
}   
    private void jButton_signINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signINActionPerformed

        try {

            check_login();
            System.out.println("Login :" + id + " Password : " + get_pwd);
            CardLayout card = (CardLayout) DisplayPanel.getLayout();
            int check = check_login_type(id, usertyp);
            if(check == 0 )
            {
              card.show(DisplayPanel, "Login_User");
              refresh();
              return;
            }
            if(check == 1){
            if (i != 2 && i != 3 ) {
                
                if(check_issue == false )
                {
                   card.show(DisplayPanel, "Mem_UserDetails");
                   setUser(); 
                }
                else{
                card.show(DisplayPanel, "Mem_UserDetails");
                setUser();
                get_users_issued_books();
                get_users_reserved_books();
                }
            }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }



    }//GEN-LAST:event_jButton_signINActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        search = new SeachBooks();
        search.run4();

    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reserveActionPerformed
        // TODO add your handling code here:
        reserve = new ReserveBooks();
        reserve.run3();
    }//GEN-LAST:event_jButton_reserveActionPerformed

    private void jButton_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OkActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout) DisplayPanel.getLayout();
        card.show(DisplayPanel, "Login_User");
    }//GEN-LAST:event_jButton_OkActionPerformed

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
            java.util.logging.Logger.getLogger(Login_MemDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_MemDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_MemDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_MemDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_MemDetails().setVisible(true);
            }
        });
    }
    private double AVERAGE_MILLIS_PER_MONTH = 365.24 * 24 * 60 * 60 * 1000 / 12;
    private ReserveBooks reserve;
    private SeachBooks search;
    private int count = 0;
    private int count2 = 0;
    double overdue = 0;
    double isbn_no;
    float isbn_num;
    private int i = 0;
    private boolean check_issue = true;
    private IssueBooks issue_class;
    private RemoveBook remove_class;
    private TableModel model1;
    private SignUP register;
    public String id;
    private String pwd;
    private String get_pwd;
    private String table;
    private ResultSet pwd_check;
    public String usertyp;
    private PreparedStatement stmt = null;
    private String sql, user_name, user_id;
    private java.sql.PreparedStatement prest = null;
    private ResultSet rs1 = null;
    private java.sql.PreparedStatement prest1 = null;
    private java.sql.PreparedStatement prest3 = null;
    private java.sql.Date date_today, issue_date;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel Member_DetailsPanel;
    private javax.swing.JPanel ResultPanel;
    private javax.swing.JButton jButton_Ok;
    private javax.swing.JButton jButton_reserve;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_signIN;
    private javax.swing.JButton jButton_signUp;
    private javax.swing.JComboBox jComboBox_Login_date;
    private javax.swing.JComboBox jComboBox_Login_month;
    private javax.swing.JComboBox jComboBox_Loginyear;
    private javax.swing.JComboBox jComboBoxuser_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_setLoginId;
    private javax.swing.JLabel jLabel_setUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_issue;
    private javax.swing.JTable jTable_reserve;
    private javax.swing.JTextField jText_LogID;
    // End of variables declaration//GEN-END:variables
}
