
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class IssueBooks extends javax.swing.JFrame {

    public IssueBooks() {
        initComponents();
        connect();
    }
private void refresh()
{
    jTextField_bookName.setText(null);
    jTextField_isbn.setText(null);
    jTextField_name.setText(null);
    jTextField_loginId.setText(null);
    jComboBox_userTyp.setSelectedItem("UnderGraduate");
}   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_loginId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_bookName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_isbn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_copy_num = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox_issuedate = new javax.swing.JComboBox();
        jComboBox_issue_month = new javax.swing.JComboBox();
        jComboBox_issue_year = new javax.swing.JComboBox();
        jComboBox_userTyp = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jButton_search = new javax.swing.JButton();
        jButton_refresh = new javax.swing.JButton();
        jButton_return_book = new javax.swing.JButton();
        jButton_addBooks = new javax.swing.JButton();
        jButton_remove = new javax.swing.JButton();
        jButton_ok = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME :");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(51, 255, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 204, 204))));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("ISSUE BOOKS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NAME :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOGIN ID :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USER TYPE :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BOOK NAME:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ISBN :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COPY :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ISSUE DATE:");

        jComboBox_issuedate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox_issuedate.setBorder(null);

        jComboBox_issue_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox_issue_month.setSelectedItem(12);

        jComboBox_issue_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));

        jComboBox_userTyp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UnderGraduate", "PostGraduate", "ResearchScholars", "Faculty" }));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jButton_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_search.setText("SEARCH");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jButton_refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_refresh.setText("REFRESH");
        jButton_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refreshActionPerformed(evt);
            }
        });

        jButton_return_book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_return_book.setText("RETURN BOOK");
        jButton_return_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_return_bookActionPerformed(evt);
            }
        });

        jButton_addBooks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_addBooks.setText("ADD BOOKS");
        jButton_addBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addBooksActionPerformed(evt);
            }
        });

        jButton_remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_remove.setText("REMOVE BOOKS");
        jButton_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_remove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jButton_addBooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_return_book, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton_return_book, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton_addBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jButton_ok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_ok.setText("OK");
        jButton_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox_issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jComboBox_issue_month, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jComboBox_issue_year, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField_isbn)
                                    .addComponent(jTextField_bookName)
                                    .addComponent(jComboBox_userTyp, 0, 264, Short.MAX_VALUE)
                                    .addComponent(jTextField_loginId)
                                    .addComponent(jTextField_name)
                                    .addComponent(jTextField_copy_num)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_loginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_userTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_copy_num, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox_issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_issue_month, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_issue_year, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refreshActionPerformed
    
        refresh();
        
    }//GEN-LAST:event_jButton_refreshActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed

      search = new SeachBooks();
      search.run4();
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_return_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_return_bookActionPerformed
        // TODO add your handling code here:
        retrn = new ReturnBooks();
        retrn.run5();
    }//GEN-LAST:event_jButton_return_bookActionPerformed

    private void jButton_addBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addBooksActionPerformed
       
        add = new AddBooks();
        add.run();
        
    }//GEN-LAST:event_jButton_addBooksActionPerformed

    private void jButton_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_removeActionPerformed

    private void jButton_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_okActionPerformed
        // TODO add your handling code here:
        issueBook();
    }//GEN-LAST:event_jButton_okActionPerformed
    private void connect()
    {
       try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");            
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }  
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
    private java.sql.Date formattor(String day, String  month, String year)
    {
       
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
    private  double monthsBetween(Date d1, Date d2) {
        return (d2.getTime() - d1.getTime()) / AVERAGE_MILLIS_PER_MONTH;
    }
    private void add_issued_book_count()
    {
        try {
            if (user_typ.equals("UnderGraduate")) {
                sql3 = "UPDATE ugusers SET Num_Issued_Books=? WHERE LoginIds = ?";
            }
            if (user_typ.equals("PostGraduate")) {
                sql3 = "UPDATE pgusers SET Num_Issued_Books=? WHERE LoginIds = ?";
            }
            if (user_typ.equals("ResearchScholars")) {
                sql3 = "UPDATE rsusers SET Num_Issued_Books=? WHERE LoginIds = ?";
            }
            if (user_typ.equals("Faculty")) {
                sql3 = "UPDATE facusers SET Num_Issued_Books=? WHERE LoginIds = ?";
            }
            prest3 = conn.prepareStatement(sql3);
            if (user_typ.equals("UnderGraduate")) {
               if((rs1.getInt(5)+1) > 2 ) {
                    JOptionPane.showMessageDialog(null, "You cannot issue more than 2 books ", " ! ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (user_typ.equals("PostGraduate")) {
                if((rs1.getInt(5)+1) > 4 ) {
                    JOptionPane.showMessageDialog(null, "You cannot issue more than 4 books ", " ! ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (user_typ.equals("ResearchScholars")) {
                if((rs1.getInt(5)+1) > 6 ) {
                    JOptionPane.showMessageDialog(null, "You cannot issue more than 6 books", " ! ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (user_typ.equals("Faculty")) {
                if((rs1.getInt(5)+1) > 10 ) {
                    JOptionPane.showMessageDialog(null, "You cannot issue more than 10 books", " ! ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            prest3.setInt(1,(rs1.getInt(5)+1)); 
            prest3.setString(2,login);    
            prest3.executeUpdate();
            prest3.close();
        } catch (SQLException ex) {
            Logger.getLogger(IssueBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void issueBook() {
        name = jTextField_name.getText();
        login = jTextField_loginId.getText();
        user_typ = (String) jComboBox_userTyp.getSelectedItem();
        book_name = jTextField_bookName.getText();
         check_login_type(login, user_typ);
        isbn = Float.parseFloat(jTextField_isbn.getText());
        issue = formattor((String) jComboBox_issuedate.getSelectedItem(), (String) jComboBox_issue_month.getSelectedItem(), (String) jComboBox_issue_year.getSelectedItem());
        try {
            if (user_typ.equals("UnderGraduate")) {
                sql = "SELECT * FROM ugusers WHERE LoginIds = ?";
            }
            if (user_typ.equals("PostGraduate")) {
                sql = "SELECT * FROM pgusers WHERE LoginIds = ?";
            }
            if (user_typ.equals("ResearchScholars")) {
                sql = "SELECT * FROM rsusers WHERE LoginIds = ?";
            }
            if (user_typ.equals("Faculty")) {
                sql = "SELECT * FROM facusers WHERE LoginIds = ?";
            }
            prest = conn.prepareStatement(sql);
            prest.setString(1, login);
            rs1 = prest.executeQuery();
            if (rs1.next() != false) {
                if (name.equals(rs1.getString(1))) {
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Write Correct username with Login ID", " ! ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            
            sql1 = "SELECT * FROM books WHERE ISBN = ? ";
            prest1 = conn.prepareStatement(sql1);
            prest1.setDouble(1, isbn);
            //prest1.setFloat(2, isbn);
            rs2 = prest1.executeQuery();
            if (rs2.next() != false) {

                sql2 = "INSERT INTO issuedbooks VALUES(?,?,?,?,?,?,?,?)";
                prest2 = conn.prepareStatement(sql2);
                prest2.setString(1, book_name);
                prest2.setFloat(2, isbn);
                prest2.setString(3, rs1.getString(1));
                prest2.setString(4, rs1.getString(2));
                prest2.setString(5, rs1.getString(3));
                prest2.setDate(6,issue);
                prest2.setBoolean(7, false);
                prest2.setDouble(8,0.0);
                prest2.executeUpdate();
                String sql = "DELETE FROM books WHERE ISBN = ?";
                prest3 = conn.prepareStatement(sql);
                System.out.println(isbn);
                prest3.setDouble(1, isbn);
                int del = prest3.executeUpdate();
                System.out.println("Number of deleted records: " + del);
                add_issued_book_count();
                System.out.println("Book issued ");
                conn.close();
               
                
            } else {
                JOptionPane.showMessageDialog(null, "This book is Not available", " ! ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void run2() {
                new IssueBooks().setVisible(true);
            }
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBooks().setVisible(true);
            }
        });
    }
    private ReturnBooks retrn ;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/myfirstdb";
    static final String USER = "root";
    static final String PASS = "";
    private Connection conn = null;
    private PreparedStatement prest = null;
    private PreparedStatement prest1 = null;
    private PreparedStatement prest2 = null;
    private PreparedStatement prest3 = null;
    private PreparedStatement prest4 = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ResultSet rs1 = null;
    private ResultSet rs2 = null;
    private String sql,sql1,sql2,sql3,name,login,user_typ,book_name, issue_date, due_date ;
    private float isbn;
    private int copy_num;
    private AddBooks add;
    private SeachBooks search;
    private DateFormat formatter;
    private java.sql.Date issue, due;
    private int book_count = 0;
    private double AVERAGE_MILLIS_PER_MONTH = 365.24 * 24 * 60 * 60 * 1000 / 12;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addBooks;
    private javax.swing.JButton jButton_ok;
    private javax.swing.JButton jButton_refresh;
    private javax.swing.JButton jButton_remove;
    private javax.swing.JButton jButton_return_book;
    private javax.swing.JButton jButton_search;
    private javax.swing.JComboBox jComboBox_issue_month;
    private javax.swing.JComboBox jComboBox_issue_year;
    private javax.swing.JComboBox jComboBox_issuedate;
    private javax.swing.JComboBox jComboBox_userTyp;
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
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_bookName;
    private javax.swing.JTextField jTextField_copy_num;
    private javax.swing.JTextField jTextField_isbn;
    private javax.swing.JTextField jTextField_loginId;
    private javax.swing.JTextField jTextField_name;
    // End of variables declaration//GEN-END:variables
}
