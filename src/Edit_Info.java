/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Edit_Info extends javax.swing.JDialog {

        public Edit_Info(java.awt.Frame parent, boolean modal) {
                super(parent, modal);
                initComponents();
        }

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                addmember = new javax.swing.JButton();
                back = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                update = new javax.swing.JButton();
                Reset = new javax.swing.JButton();
                address = new javax.swing.JTextField();
                jobdescription = new javax.swing.JTextField();
                email_address = new javax.swing.JTextField();
                mobileno = new javax.swing.JTextField();
                age = new javax.swing.JTextField();
                fathername = new javax.swing.JTextField();
                name = new javax.swing.JTextField();
                memberid = new javax.swing.JTextField();
                Delete = new javax.swing.JButton();
                search = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 36));
                jLabel1.setForeground(new java.awt.Color(51, 51, 51));
                jLabel1.setText("Address");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel3.setText(
                                "---------------------------------------------------------------------------------------------------------------------------------------");

                jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 2, 36));
                jLabel13.setForeground(new java.awt.Color(204, 0, 204));
                jLabel13.setText("Book ");

                addmember.setBackground(new java.awt.Color(153, 0, 153));
                addmember.setFont(new java.awt.Font("Segoe UI", 2, 24));
                addmember.setForeground(new java.awt.Color(255, 255, 255));
                addmember.setText("Add Member ");
                addmember.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                addmember.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addmemberActionPerformed(evt);
                        }
                });

                back.setBackground(new java.awt.Color(153, 0, 153));
                back.setFont(new java.awt.Font("Segoe UI", 2, 24));
                back.setForeground(new java.awt.Color(255, 255, 255));
                back.setText("Back");
                back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                back.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 2, 24));
                jLabel2.setForeground(new java.awt.Color(204, 0, 204));
                jLabel2.setText("Member Information");

                jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel11.setText("Member_ID");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jLabel4.setText("Not editable !!");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel5.setText("Name");

                jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel8.setText("Father Name");

                jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel10.setText("Age");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel6.setText("Mobile No.");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel7.setText("Email Address ");

                jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel9.setText("Job Description ");

                jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel12.setText("Address");

                update.setBackground(new java.awt.Color(153, 0, 153));
                update.setFont(new java.awt.Font("Segoe UI", 2, 22));
                update.setForeground(new java.awt.Color(255, 255, 255));
                update.setText("Update");
                update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                update.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                updateActionPerformed(evt);
                        }
                });

                Reset.setBackground(new java.awt.Color(153, 0, 153));
                Reset.setFont(new java.awt.Font("Segoe UI", 2, 22));
                Reset.setForeground(new java.awt.Color(255, 255, 255));
                Reset.setText("Reset");
                Reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                Reset.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ResetActionPerformed(evt);
                        }
                });

                name.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameActionPerformed(evt);
                        }

                        private void nameActionPerformed(ActionEvent evt) {
                        }
                });

                memberid.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                memberidActionPerformed(evt);
                        }

                        private void memberidActionPerformed(ActionEvent evt) {
                        }
                });

                Delete.setBackground(new java.awt.Color(153, 0, 153));
                Delete.setFont(new java.awt.Font("Segoe UI", 2, 22));
                Delete.setForeground(new java.awt.Color(255, 255, 255));
                Delete.setText("Delete");
                Delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                Delete.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                DeleteActionPerformed(evt);
                        }
                });

                search.setBackground(new java.awt.Color(153, 0, 153));
                search.setFont(new java.awt.Font("Segoe UI", 2, 22));
                search.setForeground(new java.awt.Color(255, 255, 255));
                search.setText("Search");
                search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                search.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                searchActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(85, 85, 85)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                141,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel13,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                99,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(203, 203, 203)
                                                                                                .addComponent(addmember,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                177,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(40, 40, 40)
                                                                                                .addComponent(back,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                125,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(223, 223, 223)
                                                                                                .addComponent(jLabel4))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(131, 131, 131)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                231,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                false)
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                .addComponent(jLabel12)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(address,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                140,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                .addComponent(jLabel9)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(jobdescription,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                140,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                .addComponent(jLabel7)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(email_address,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                140,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                .addComponent(jLabel6)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(mobileno,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                140,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                .addComponent(jLabel10)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(age,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                140,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(fathername,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                140,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(name,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                140,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel11)
                                                                                                                                                                .addGap(285, 285,
                                                                                                                                                                                285)
                                                                                                                                                                .addComponent(memberid,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                140,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(search,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                115,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(update,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                115,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(Delete,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                115,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(Reset,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                115,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(19, 19, 19))))
                                                                                .addComponent(jLabel3))
                                                                .addContainerGap(56, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jLabel13)
                                                                                .addComponent(addmember)
                                                                                .addComponent(back))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel2)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel11)
                                                                                                                .addComponent(memberid,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(20, 20, 20)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addComponent(name,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(search))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(26, 26, 26)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                .addComponent(fathername,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                32,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(34, 34, 34)
                                                                                                                                .addComponent(jLabel10))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(56, 56, 56)
                                                                                                                                .addComponent(update))))
                                                                                .addComponent(age,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(43, 43, 43)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel6)
                                                                                                                .addComponent(mobileno,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(50, 50, 50)
                                                                                                .addComponent(Delete)))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(email_address,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel9)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jobdescription,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                32,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(Reset)))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel12)
                                                                                .addComponent(address,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(89, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(32, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(21, Short.MAX_VALUE)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(20, 20, 20)));

                pack();
        }

        private void searchActionPerformed(java.awt.event.ActionEvent evt) {
                int id = Integer.parseInt((memberid.getText()));
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://localhost:3306/Address_Book", "root",
                                        "2412");
                        String query2 = "Select * from member_detail where S_no ="
                                        + id;
                        PreparedStatement pst = con.prepareStatement(query2);
                        ResultSet r = pst.executeQuery(query2);
                        while (r.next()) {
                                memberid.setText(r.getString(1));
                                name.setText(r.getString(2));
                                fathername.setText(r.getString(3));
                                age.setText(r.getString(4));
                                mobileno.setText(r.getString(5));
                                email_address.setText(r.getString(6));
                                jobdescription.setText(r.getString(7));
                                address.setText(r.getString(8));
                        }

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e, null, 0);
                }

        }

        private void updateActionPerformed(java.awt.event.ActionEvent evt) {
                int id = Integer.parseInt((memberid.getText()));
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        java.sql.Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://localhost:3306/Address_Book",
                                        "root", "2412");
                        String sql = "Update member_detail set S_No = ?, Name = ? , fname = ? , age = ? , mobile_no = ? , Email= ? , Job_description= ?, Address = ? where S_no = "
                                        + id;
                        PreparedStatement pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, memberid.getText());
                        pstmt.setString(2, name.getText());
                        pstmt.setString(3, fathername.getText());
                        pstmt.setInt(4, Integer.parseInt(age.getText()));
                        pstmt.setString(5, mobileno.getText());
                        pstmt.setString(6, email_address.getText());
                        pstmt.setString(7, jobdescription.getText());
                        pstmt.setString(8, address.getText());
                        pstmt.executeUpdate();
                        name.setText(null);
                        fathername.setText(null);
                        age.setText(null);
                        mobileno.setText(null);
                        jobdescription.setText(null);
                        email_address.setText(null);
                        address.setText(null);
                        memberid.setText(null);
                        JOptionPane.showMessageDialog(null, "Update Successfull");
                        con.close();
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e, null, 0);
                }

        }

        private void ResetActionPerformed(java.awt.event.ActionEvent evt) {
                name.setText(null);
                fathername.setText(null);
                age.setText(null);
                mobileno.setText(null);
                jobdescription.setText(null);
                email_address.setText(null);
                address.setText(null);
                memberid.setText(null);
        }

        private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {
                int id = Integer.parseInt((memberid.getText()));
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://localhost:3306/Address_Book", "root",
                                        "2412");
                        String query2 = "Delete from member_detail where S_no ="
                                        + id;
                        PreparedStatement pst = con.prepareStatement(query2);
                        pst.executeUpdate();
                        name.setText(null);
                        fathername.setText(null);
                        age.setText(null);
                        mobileno.setText(null);
                        jobdescription.setText(null);
                        email_address.setText(null);
                        address.setText(null);
                        memberid.setText(null);
                        JOptionPane.showMessageDialog(null, "Delete Successfully");
                        con.close();
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e, null, 0);
                }
        }

        private void addmemberActionPerformed(java.awt.event.ActionEvent evt) {
                new New_Info();
                dispose();
        }

        private void backActionPerformed(java.awt.event.ActionEvent evt) {
                new Dashboard();
                dispose();
        }

        public Edit_Info() {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Edit_Info.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Edit_Info.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Edit_Info.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Edit_Info.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                Edit_Info dialog = new Edit_Info(new javax.swing.JFrame(), true);
                                dialog.setLocation(470, 110);
                                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                        @Override
                                        public void windowClosing(java.awt.event.WindowEvent e) {
                                                System.exit(0);
                                        }
                                });
                                dialog.setVisible(true);
                        }
                });
        }

        private javax.swing.JButton Delete;
        private javax.swing.JButton Reset;
        private javax.swing.JButton addmember;
        private javax.swing.JTextField address;
        private javax.swing.JTextField age;
        private javax.swing.JButton back;
        private javax.swing.JTextField email_address;
        private javax.swing.JTextField fathername;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jobdescription;
        private javax.swing.JTextField memberid;
        private javax.swing.JTextField mobileno;
        private javax.swing.JTextField name;
        private javax.swing.JButton search;
        private javax.swing.JButton update;

}
