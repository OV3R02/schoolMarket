/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.schoolmarket.gui;

import com.mycompany.schoolmarket.boundary.SchoolMarket;
import com.mycompany.schoolmarket.control.Store;
import com.mycompany.schoolmarket.entity.Book;
import com.mycompany.schoolmarket.entity.BookCondition;
import com.mycompany.schoolmarket.entity.Student;
import com.mycompany.schoolmarket.entity.StudentClass;
import com.mycompany.schoolmarket.entity.Subject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author utentepc
 */
public class WinSchoolMarket extends javax.swing.JFrame {

    ArrayList<Integer> listIdStudents = new ArrayList<>();

    /**
     * Creates new form WinSchoolMarket
     */
    public WinSchoolMarket() {
        initComponents();
        refreshListClass();
        refreshListStudents();
        refreshListClassBooks();
        refreshListSubjects();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBooksList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txFirstName = new javax.swing.JTextField();
        txLastName = new javax.swing.JTextField();
        txAge = new javax.swing.JTextField();
        btInsertStudentSubscription = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txBookName = new javax.swing.JTextField();
        spBookCost = new javax.swing.JSpinner();
        lbLogMessage = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tpShowStudent = new javax.swing.JTextPane();
        btInsertBook = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstStudentsList = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        txBookHealth = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstClassesList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstClassesBook = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstSubjects = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SCHOOL MARKET");

        tbBooksList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nome", "classe", "costo", "grado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbBooksList);

        jLabel2.setText("Inserisci i tuoi dati nelle caselle sottostanti per registrarti nel e-commerce!");

        jLabel3.setText("INSERIRE I DATI DEL NUOVO STUDENTE :");

        jLabel4.setText("Nome : ");

        jLabel5.setText("Cognome :");

        jLabel6.setText("Età : ");

        jLabel7.setText("Sezione classe :");

        txFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFirstNameActionPerformed(evt);
            }
        });

        btInsertStudentSubscription.setText("OKAY");
        btInsertStudentSubscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertStudentSubscriptionActionPerformed(evt);
            }
        });

        jLabel8.setText("INSERIRE I DATI DEL NUOVO LIBRO:");

        jLabel9.setText("Nome libro :");

        jLabel10.setText("Costo :");

        jLabel11.setText("Classe :");

        txBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBookNameActionPerformed(evt);
            }
        });

        spBookCost.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        lbLogMessage.setText("nessun dato ancora fornito...");

        jScrollPane3.setViewportView(tpShowStudent);

        btInsertBook.setText("OKAY");
        btInsertBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertBookActionPerformed(evt);
            }
        });

        jLabel12.setText("E-mail : ");

        lstStudentsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstStudentsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstStudentsListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstStudentsList);

        jLabel13.setText("Stato dell'oggetto :");

        jLabel14.setText("(es. Grado A, B o C)");

        lstClassesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstClassesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstClassesListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstClassesList);

        lstClassesBook.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstClassesBook.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstClassesBookValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(lstClassesBook);

        jLabel15.setText("LISTA LIBRI");

        jLabel16.setText("Sei nuovo? ");

        jLabel17.setText("Premi il pulsante \"OKAY\" ");

        jLabel18.setText("per aggiungere il libro.");

        jLabel19.setText("Vuoi vendere un libro?");

        jLabel20.setText("Compila i dati sottostanti per aggiungerlo nel catalogo!");

        jLabel21.setText("Materia :");

        lstSubjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstSubjects.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstSubjectsValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(lstSubjects);

        jLabel22.setText("Premi \"OKAY\" per completare");

        jLabel23.setText("la registrazione");

        jLabel24.setText("SELEZIONARE ACCOUNT ESISTENTE : ");

        jLabel25.setText("Se invece ti sei già registrato/a puoi scegliere tra gli utenti esistenti : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(21, 21, 21))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(33, 33, 33)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txFirstName)
                                                    .addComponent(txLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                    .addComponent(txAge))
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel22)
                                                    .addComponent(btInsertStudentSubscription)
                                                    .addComponent(jLabel23)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel9)
                                                    .addComponent(txBookName))
                                                .addGap(24, 24, 24))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(spBookCost, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel13)
                                                .addComponent(txBookHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)
                                            .addComponent(btInsertBook)))
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lbLogMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(414, 414, 414)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel24))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel8)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spBookCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txBookHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btInsertBook, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane6)
                                    .addComponent(jScrollPane5))))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLogMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btInsertStudentSubscription))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txFirstNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tx_firstNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_tx_firstNameActionPerformed

    private void btInsertStudentSubscriptionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btInsertStudentSubscriptionActionPerformed
        // TODO add your handling code here:

        StudentSubscriptionGui.StudentSubscription(txFirstName, txLastName, txAge, txEmail, lstClassesList, tpShowStudent, lbLogMessage);
        refreshListStudents();

    }// GEN-LAST:event_btInsertStudentSubscriptionActionPerformed

    private void btInsertBookActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btInsertBookActionPerformed
        // TODO add your handling code here:

        BookVendingGui.BookVending(txBookName, txBookHealth, spBookCost, lstStudentsList, lstClassesBook, lstSubjects, tpShowStudent, lbLogMessage);
        refreshTableBooks();

    }// GEN-LAST:event_btInsertBookActionPerformed

    private void lstStudentsListValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_lst_studentsListValueChanged
        // TODO add your handling code here:
        
        String firstname = lstStudentsList.getSelectedValue().getFname();
        String lastname = lstStudentsList.getSelectedValue().getLname();
        String name = lastname + " " + firstname;

        StudentClass classSection = lstStudentsList.getSelectedValue().getClassSection();
        lbLogMessage.setText(" STUDENT_NAME: " + name + " " + "CLASS_SECTION: " + classSection);
        refreshTableBooks();
    }// GEN-LAST:event_lst_studentsListValueChanged

    private void lstClassesListValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_lst_classesListValueChanged

        // TODO add your handling code here:
        String section = lstClassesList.getSelectedValue().getSection();
        int classId = lstClassesList.getSelectedValue().getIdClass();
        lbLogMessage.setText("CLASS_ID: " + classId + " SECTION: " + section);
    }// GEN-LAST:event_lst_classesListValueChanged

    private void txBookNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tx_bookNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_tx_bookNameActionPerformed

    private void lstClassesBookValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_lst_classesBookValueChanged
        // TODO add your handling code here:
        String section = lstClassesBook.getSelectedValue().getSection();
        int classId = lstClassesBook.getSelectedValue().getIdClass();
        lbLogMessage.setText("CLASS_ID: " + classId + " SECTION: " + section);
    }// GEN-LAST:event_lst_classesBookValueChanged

    private void lstSubjectsValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_lst_subjectsValueChanged
        // TODO add your handling code here:
        String subject = lstSubjects.getSelectedValue().getSubjectName();
        lbLogMessage.setText("SUBJECT: " + subject);

    }// GEN-LAST:event_lst_subjectsValueChanged

    public void refreshListClass() {

        List<StudentClass> result = SchoolMarket.classesList();
        DefaultListModel<StudentClass> model = new DefaultListModel<>();
        result.forEach(v -> model.addElement(v));
        lstClassesList.setModel(model);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinSchoolMarket.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinSchoolMarket.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinSchoolMarket.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinSchoolMarket.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinSchoolMarket().setVisible(true);
            }
        });
    }

    public void refreshListStudents() {

        List<Student> result = SchoolMarket.studentsList();
        DefaultListModel<Student> model = new DefaultListModel<>();
        result.forEach(v -> model.addElement(v));
        result.forEach(v -> listIdStudents.add(v.getIdStudent()));
        lstStudentsList.setModel(model);

    }

    private void refreshListClassBooks() {

        List<StudentClass> result = SchoolMarket.classesList();
        DefaultListModel<StudentClass> model = new DefaultListModel<>();
        result.forEach(v -> model.addElement(v));
        lstClassesBook.setModel(model);

    }

    private void refreshTableBooks() {

        int index = lstStudentsList.getSelectedIndex();
        int idstSelected = listIdStudents.get(index);
        List<Book> booksByUser = SchoolMarket.booksByUser(idstSelected);
        DefaultTableModel model = (DefaultTableModel) tbBooksList.getModel();
        model.setRowCount(0);
        
        for (Book b : booksByUser) {
                String bn = b.getBookName();
                StudentClass cs = b.getClassSection();
                BigDecimal co = b.getCost();
                BookCondition gr = b.getGrade();
                Object[] obj = new Object[]{
                        bn, cs, co, gr
                };
                model.addRow(obj);
        }
        tbBooksList.setModel(model);
    
    }

    private void refreshListSubjects() {

        List<Subject> result = SchoolMarket.subjectList();
        DefaultListModel<Subject> model = new DefaultListModel<>();
        result.forEach(v -> model.addElement(v));
        lstSubjects.setModel(model);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInsertBook;
    private javax.swing.JButton btInsertStudentSubscription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbLogMessage;
    private javax.swing.JList<StudentClass> lstClassesBook;
    private javax.swing.JList<StudentClass> lstClassesList;
    private javax.swing.JList<Student> lstStudentsList;
    private javax.swing.JList<Subject> lstSubjects;
    private javax.swing.JSpinner spBookCost;
    private javax.swing.JTable tbBooksList;
    private javax.swing.JTextPane tpShowStudent;
    private javax.swing.JTextField txAge;
    private javax.swing.JTextField txBookHealth;
    private javax.swing.JTextField txBookName;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txFirstName;
    private javax.swing.JTextField txLastName;
    // End of variables declaration//GEN-END:variables

}
