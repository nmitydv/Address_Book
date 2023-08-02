
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JDialog {

        public Dashboard(java.awt.Frame parent, boolean modal) {
                super(parent, modal);
                initComponents();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                addmember = new javax.swing.JButton();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                Editmember = new javax.swing.JButton();
                searchingname = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                Table1 = new javax.swing.JTable();
                newmember = new javax.swing.JButton();
                reset = new javax.swing.JButton();
                search = new javax.swing.JButton();

                addmember.setBackground(new java.awt.Color(153, 0, 153));
                addmember.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
                addmember.setForeground(new java.awt.Color(255, 255, 255));
                addmember.setText("Add Member ");
                addmember.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                addmember.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addmemberActionPerformed(evt);
                        }

                        private void addmemberActionPerformed(ActionEvent evt) {
                        }
                });

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jPanel1.setForeground(new java.awt.Color(204, 0, 204));

                jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 36));
                jLabel1.setForeground(new java.awt.Color(51, 51, 51));
                jLabel1.setText("Address");

                jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 2, 36));
                jLabel2.setForeground(new java.awt.Color(204, 0, 204));
                jLabel2.setText("Book ");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel3.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundPhoto1.png")));

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

                searchingname.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                searchingnameActionPerformed(evt);
                        }
                });
                searchingname.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                searchingnameKeyReleased(evt);
                        }

                        private void searchingnameKeyReleased(KeyEvent evt) {
                        }
                });

                Table1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "Member_ID", "Name", "Job Description"
                                }) {
                        Class[] types = new Class[] {
                                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class
                        };
                        boolean[] canEdit = new boolean[] {
                                        false, true, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types[columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                jScrollPane1.setViewportView(Table1);

                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://localhost:3306/Address_Book", "root",
                                        "2412");
                        String query2 = "Select S_no, name, job_description from member_detail";
                        PreparedStatement pst = con.prepareStatement(query2);
                        ResultSet r = pst.executeQuery(query2);
                        while (r.next()) {
                                String S_no = r.getString(1);
                                String Name = r.getString(2);
                                String Job_Description = r.getString(3);
                                String tb[] = { S_no, Name, Job_Description
                                };
                                DefaultTableModel tbm = (DefaultTableModel) Table1.getModel();
                                tbm.addRow(tb);

                        }
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e, null, 0);
                }
                newmember.setBackground(new java.awt.Color(153, 0, 153));
                newmember.setFont(new java.awt.Font("Segoe UI", 2, 24));
                newmember.setForeground(new java.awt.Color(255, 255, 255));
                newmember.setText("Add Member ");
                newmember.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                newmember.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                newmemberActionPerformed(evt);
                        }
                });

                reset.setBackground(new java.awt.Color(153, 0, 153));
                reset.setFont(new java.awt.Font("Segoe UI", 2, 20));
                reset.setForeground(new java.awt.Color(255, 255, 255));
                reset.setText("Reset");
                reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                reset.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                resetActionPerformed(evt);
                        }
                });

                search.setBackground(new java.awt.Color(153, 0, 153));
                search.setFont(new java.awt.Font("Segoe UI", 2, 20));
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
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(88, 88, 88)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                141,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(newmember,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                177,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Editmember,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                177,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(74, 74, 74))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(99, 99, 99)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                519,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(searchingname,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                210,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                500,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(73, 73, 73))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(129, 129, 129)
                                                                                                .addComponent(search,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                125,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(reset,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                125,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(598, 598, 598)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(Editmember)
                                                                                .addComponent(newmember))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel3)
                                                                                                .addGap(20, 20, 20)
                                                                                                .addComponent(searchingname,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                41,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(search,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                100, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                347,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0, Short.MAX_VALUE))
                                                                .addGap(43, 43, 43)
                                                                .addComponent(reset,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(77, 77, 77)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(24, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(28, Short.MAX_VALUE)));

                pack();
        }

        private void searchingnameActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void searchActionPerformed(java.awt.event.ActionEvent evt) {

                if (searchingname.getText().length() <= 0) {
                        JOptionPane.showMessageDialog(null, " Enter Valid Information");
                } else {
                        ((DefaultTableModel) Table1.getModel()).setNumRows(0);
                        try {
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection con = DriverManager.getConnection(
                                                "jdbc:mysql://localhost:3306/Address_Book", "root",
                                                "2412");
                                String query2 = "Select S_no, name, job_description from member_detail where Name = '"
                                                + searchingname.getText() + "'";
                                PreparedStatement pst = con.prepareStatement(query2);
                                ResultSet r = pst.executeQuery(query2);
                                while (r.next()) {
                                        String S_no = r.getString(1);
                                        String Name = r.getString(2);
                                        String Job_Description = r.getString(3);
                                        String tb[] = { S_no, Name, Job_Description
                                        };
                                        DefaultTableModel tbm = (DefaultTableModel) Table1.getModel();
                                        tbm.addRow(tb);

                                }
                        } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e, null, 0);
                        }
                }
        }

        private void newmemberActionPerformed(java.awt.event.ActionEvent evt) {
                new New_Info();
                dispose();
        }

        private void EditmemberActionPerformed(java.awt.event.ActionEvent evt) {
                new Edit_Info();
                dispose();
        }

        private void resetActionPerformed(java.awt.event.ActionEvent evt) {
                searchingname.setText(null);

        }

        public Dashboard() {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                Dashboard dialog = new Dashboard(new javax.swing.JFrame(), true);
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
        private javax.swing.JTable Table1;
        private javax.swing.JButton addmember;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JButton newmember;
        private javax.swing.JButton reset;
        private javax.swing.JButton search;
        private javax.swing.JTextField searchingname;
}
