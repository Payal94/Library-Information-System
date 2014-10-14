
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Connector.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class ReturnBooks extends javax.swing.JFrame {

    Connect c = new Connect();

    /** Creates new form ReturnBooks */
    public ReturnBooks() {
        initComponents();
    }

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

    private double monthsBetween(Date d1, Date d2) {
        return (d2.getTime() - d1.getTime()) / AVERAGE_MILLIS_PER_MONTH;
    }

    public void return_book() {
        try {
            name = jTextField_userName.getText();
            user_id = jTextField_userId.getText();
            return_date = formattor((String) jComboBox_issuedate.getSelectedItem(), (String) jComboBox_issue_month.getSelectedItem(), (String) jComboBox_issue_year.getSelectedItem());

            user_typ = (String) jComboBox_userTyp.getSelectedItem();
            book_name = jTextField_Book_Name.getText();
            isbn = Float.parseFloat(jTextField_isbn.getText());

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
            prest = (PreparedStatement) c.conn.prepareStatement(sql);
            prest.setString(1, user_id);
            rs = prest.executeQuery();
            if (rs.next() != false) {
                num_issued = rs.getInt(5);
                if (name.equals(rs.getString(1))) {
                } else {
                    JOptionPane.showMessageDialog(null, "Write Correct username with Login ID", " ! ERROR", WIDTH);
                }
            }



            sql = "SELECT * FROM issuedbooks WHERE ISBN= ?";
            prest = (PreparedStatement) c.conn.prepareStatement(sql);
            prest.setDouble(1, isbn);
            rs = prest.executeQuery();
            if (rs.next() != false) {
                owner_id = rs.getString(4);
                reserved = rs.getBoolean(7);
                issue_date = rs.getDate(6);
                if (user_id.equals(owner_id)) {


                    if (reserved) {
                        System.out.println("Your time starts now.Go issue it!!");
                        sql = "DELETE FROM issuedbooks WHERE ISBN=?";
                        prest2 = (PreparedStatement) c.conn.prepareStatement(sql);
                        prest2.setFloat(1, isbn);
                        prest2.executeUpdate();
                        --num_issued;
                        JOptionPane.showMessageDialog(null,"Book returned Successfully ", "! Deleted",JOptionPane.OK_OPTION);
                        
                        sql = "UPDATE reserved SET Return_Date=? WHERE ISBN= ?";
                        prest.setDate(1, return_date);
                        prest.setDouble(2, isbn);



                    }
                    else{
                    sql = "INSERT INTO books VALUES(?,?,?)";
                    prest2 = (PreparedStatement) c.conn.prepareStatement(sql);
                    prest2.setString(1, book_name);
                    prest2.setFloat(2, isbn);
                    int rack = (int) Math.floor(isbn);
                    prest2.setInt(3, rack);
                    prest2.executeUpdate();
                    sql = "DELETE FROM issuedbooks WHERE ISBN=?";
                    prest2 = (PreparedStatement) c.conn.prepareStatement(sql);
                    prest2.setFloat(1, isbn);
                    prest2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Book returned Successfully ", "! Deleted",JOptionPane.OK_OPTION);
                    }
                    --num_issued;
                    if (user_typ.equals("UnderGraduate")) {
                        sql = "UPDATE ugusers SET Num_Issued_Books=? WHERE LoginIds= ?";
                       
                    }
                    if (user_typ.equals("PostGraduate")) {
                        sql = "UPDATE pgusers SET Num_Issued_Books=? WHERE LoginIds= ?";
                        
                    }
                    if (user_typ.equals("ResearchScholars")) {
                        sql = "UPDATE rsusers SET Num_Issued_Books=? WHERE LoginIds= ?";
                       


                    }
                    if (user_typ.equals("Faculty")) {
                        sql = "UPDATE facusers SET Num_Issued_Books=? WHERE LoginIds= ?";
                       
                    }
                    prest = (PreparedStatement) c.conn.prepareStatement(sql);

                    prest.setInt(1, num_issued);
                    prest.setString(2, user_id);
                    prest.executeUpdate();
                    

                } else {
                    JOptionPane.showMessageDialog(null, "You had not issued this book.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No such book exists!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReserveBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Book_Name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_isbn = new javax.swing.JTextField();
        jTextField_userName = new javax.swing.JTextField();
        jTextField_userId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_userTyp = new javax.swing.JComboBox();
        jButton_reserve = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBox_issuedate = new javax.swing.JComboBox();
        jComboBox_issue_month = new javax.swing.JComboBox();
        jComboBox_issue_year = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("WELCOME TO IIT KHARAGPUR LIBRARY");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        jLabel4.setText("RETURN BOOKS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAME OF THE BOOK :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ISBN :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("USER NAME :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("USER ID :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("USER TYPE :");

        jComboBox_userTyp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UnderGraduate", "PostGraduate", "ResearchScholars", "Faculty" }));

        jButton_reserve.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton_reserve.setText("RETURN");
        jButton_reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reserveActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DATE OF RETURN:");

        jComboBox_issuedate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox_issuedate.setBorder(null);

        jComboBox_issue_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox_issue_month.setSelectedItem(12);
        jComboBox_issue_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_issue_monthActionPerformed(evt);
            }
        });

        jComboBox_issue_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));
        jComboBox_issue_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_issue_yearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Book_Name)
                            .addComponent(jTextField_isbn)
                            .addComponent(jComboBox_userTyp, 0, 308, Short.MAX_VALUE)
                            .addComponent(jTextField_userId)
                            .addComponent(jTextField_userName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jComboBox_issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_issue_month, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_issue_year, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addComponent(jButton_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Book_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_userId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_userTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_issue_month, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_issue_year, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jButton_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton_reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reserveActionPerformed
    return_book();
    this.dispose();
}//GEN-LAST:event_jButton_reserveActionPerformed

private void jComboBox_issue_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_issue_monthActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jComboBox_issue_monthActionPerformed

private void jComboBox_issue_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_issue_yearActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jComboBox_issue_yearActionPerformed

    public void run5() {
                new ReturnBooks().setVisible(true);
            }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ReturnBooks().setVisible(true);
            }
        });
    }
    private String name, date, owner_id, login, user_typ, book_name, user_id, sql;
    private int num_issued;
    private float isbn;
    private boolean reserved;
    private PreparedStatement prest = null;
    private ResultSet rs = null;
    private PreparedStatement prest2 = null;
    private java.sql.Date return_date, issue_date;
    private double AVERAGE_MILLIS_PER_MONTH = 365.24 * 24 * 60 * 60 * 1000 / 12;
    private double overdue = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_reserve;
    private javax.swing.JComboBox jComboBox_issue_month;
    private javax.swing.JComboBox jComboBox_issue_year;
    private javax.swing.JComboBox jComboBox_issuedate;
    private javax.swing.JComboBox jComboBox_userTyp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Book_Name;
    private javax.swing.JTextField jTextField_isbn;
    private javax.swing.JTextField jTextField_userId;
    private javax.swing.JTextField jTextField_userName;
    // End of variables declaration//GEN-END:variables
}
