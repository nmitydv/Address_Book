
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class New_Info extends javax.swing.JDialog {

        public New_Info(java.awt.Frame parent, boolean modal) {
                super(parent, modal);
                initComponents();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                back = new javax.swing.JButton();
                Editmember = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                mobileno = new javax.swing.JTextField();
                name = new javax.swing.JTextField();
                fathername = new javax.swing.JTextField();
                age = new javax.swing.JTextField();
                email_address = new javax.swing.JTextField();
                jobdescription = new javax.swing.JTextField();
                address = new javax.swing.JTextField();
                add = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();
                clear = new javax.swing.JButton();
                jLabel11 = new javax.swing.JLabel();
                memberid = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 36));
                jLabel1.setForeground(new java.awt.Color(51, 51, 51));
                jLabel1.setText("Address");

                jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 2, 24));
                jLabel2.setForeground(new java.awt.Color(204, 0, 204));
                jLabel2.setText("Member Detail");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel3.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

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

                Editmember.setBackground(new java.awt.Color(153, 0, 153));
                Editmember.setFont(new java.awt.Font("Segoe UI", 2, 24));
                Editmember.setForeground(new java.awt.Color(255, 255, 255));
                Editmember.setText("Edit Member ");
                Editmember.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                Editmember.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                EditmemberActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel4.setText("Name");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel5.setText("Address");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel6.setText("Mobile No.");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel7.setText("Email Address ");

                jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel8.setText("Father Name");

                jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel9.setText("Job Description ");

                jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel10.setText("Age");

                jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 2, 36));
                jLabel13.setForeground(new java.awt.Color(204, 0, 204));
                jLabel13.setText("Book ");

                name.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameActionPerformed(evt);
                        }

                        private void nameActionPerformed(ActionEvent evt) {
                        }
                });

                add.setBackground(new java.awt.Color(153, 0, 153));
                add.setFont(new java.awt.Font("Segoe UI", 2, 22));
                add.setForeground(new java.awt.Color(255, 255, 255));
                add.setText("Add");
                add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                add.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addActionPerformed(evt);
                        }
                });

                jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newinfo1.jpg")));

                clear.setBackground(new java.awt.Color(153, 0, 153));
                clear.setFont(new java.awt.Font("Segoe UI", 2, 22));
                clear.setForeground(new java.awt.Color(255, 255, 255));
                clear.setText("Clear");
                clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                clear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                clearActionPerformed(evt);
                        }
                });

                jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel11.setText("Member_ID");

                memberid.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                memberidActionPerformed(evt);
                        }

                        private void memberidActionPerformed(ActionEvent evt) {
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(86, 86, 86)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                141,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(6, 6, 6)
                                                                                                .addComponent(jLabel13,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                99,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(543, 543, 543)
                                                                                                .addComponent(Editmember,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                177,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(43, 43, 43)
                                                                                                .addComponent(back,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                158,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel3)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(100, 100, 100)
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                177,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(100, 100, 100)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(jLabel10)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel11))
                                                                .addGap(143, 143, 143)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(memberid,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jobdescription,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(address,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(email_address,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(mobileno,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(age,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(fathername,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(name,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel14)
                                                                .addGap(75, 75, 75))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(add,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                115,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(84, 84, 84)
                                                                .addComponent(clear,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                115,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(539, 539, 539)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jLabel13)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(10, 10, 10)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(Editmember)
                                                                                                                .addComponent(back))))
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jLabel3)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(68, 68, 68)
                                                                                                .addComponent(jLabel14))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel2)
                                                                                                .addGap(29, 29, 29)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel11)
                                                                                                                .addComponent(memberid,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(31, 31, 31)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(name,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel4))
                                                                                                .addGap(49, 49, 49)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(fathername,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel8))
                                                                                                .addGap(29, 29, 29)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel10)
                                                                                                                .addComponent(age,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(45, 45, 45)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(mobileno,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel6))
                                                                                                .addGap(43, 43, 43)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel7)
                                                                                                                .addComponent(email_address,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(39, 39, 39)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel9)
                                                                                                                .addComponent(jobdescription,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(35, 35, 35)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addComponent(address,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                31, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(add)
                                                                                .addComponent(clear))
                                                                .addGap(39, 39, 39)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(26, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(22, Short.MAX_VALUE)));

                pack();
        }

        private void clearActionPerformed(java.awt.event.ActionEvent evt) {
                name.setText(null);
                fathername.setText(null);
                age.setText(null);
                mobileno.setText(null);
                jobdescription.setText(null);
                email_address.setText(null);
                address.setText(null);
                memberid.setText(null);
        }

        private void backActionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard ds = new Dashboard();
                dispose();
        }

        private void addActionPerformed(java.awt.event.ActionEvent evt) {
                if (name.getText().length() <= 0 || memberid.getText().length() <= 0
                                || fathername.getText().length() <= 0 || age.getText().length() <= 0
                                || mobileno.getText().length() <= 0 || email_address.getText().length() <= 0
                                || jobdescription.getText().length() <= 0 || address.getText().length() <= 0) {
                        JOptionPane.showMessageDialog(null, " Enter All Valid Information");
                } else {
                        try {
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                java.sql.Connection con = DriverManager.getConnection(
                                                "jdbc:mysql://localhost:3306/Address_Book",
                                                "root", "2412");
                                String sql = "insert into member_detail (S_no,Name, fName , Age , mobile_no , Email , Job_Description , Address) values(?,?,?,?,?,?,?,?)";
                                PreparedStatement pstmt = con.prepareStatement(sql);
                                pstmt.setInt(1, Integer.parseInt(memberid.getText()));
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
                                JOptionPane.showMessageDialog(null, "Insertion Successfull");
                                con.close();

                        } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e, null, 0);
                        }
                }

        }

        private void EditmemberActionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Info ei = new Edit_Info();
                dispose();
        }

        public New_Info() {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(New_Info.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(New_Info.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(New_Info.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(New_Info.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                New_Info dialog = new New_Info(new javax.swing.JFrame(), true);
                                dialog.setLocation(280, 90);
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

        private javax.swing.JButton Editmember;
        private javax.swing.JButton add;
        private javax.swing.JTextField address;
        private javax.swing.JTextField age;
        private javax.swing.JButton back;
        private javax.swing.JButton clear;
        private javax.swing.JTextField email_address;
        private javax.swing.JTextField fathername;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
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

}
