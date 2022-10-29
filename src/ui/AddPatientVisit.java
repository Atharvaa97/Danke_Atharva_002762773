/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Atharva
 */
public class AddPatientVisit extends javax.swing.JPanel {

    public ArrayList<Person> filteredList = new ArrayList<>();
    Patient selectedPatient;
    Person selectedPerson;

    /**
     * Creates new form AddPatientVisit
     */
    public AddPatientVisit() {
        initComponents();
        detailsJPanel.setVisible(false);
        filteredJList.setVisible(false);
        visitJPanel.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        searchNameJField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        filteredJList = new javax.swing.JList<>();
        detailsJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        identifierJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        zipCodeJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cityJLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stateJLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        communityNameJLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dobJLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailJLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mobileNoJLabel = new javax.swing.JLabel();
        addVisitJButton = new javax.swing.JButton();
        visitJPanel = new javax.swing.JPanel();
        seatsJLabel = new javax.swing.JLabel();
        respiratoryRateJField = new javax.swing.JTextField();
        seatsJLabel1 = new javax.swing.JLabel();
        heartRateJField = new javax.swing.JTextField();
        seatsJLabel2 = new javax.swing.JLabel();
        bloodPressureJField = new javax.swing.JTextField();
        seatsJLabel3 = new javax.swing.JLabel();
        ageJField = new javax.swing.JTextField();
        cardentifierJLabel = new javax.swing.JLabel();
        patientIdentifierJLabel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 48, 56));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Patient:");

        searchNameJField.setBackground(new java.awt.Color(238, 238, 238));
        searchNameJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchNameJField.setText("Enter here");
        searchNameJField.setToolTipText("Click to enter your name.");
        searchNameJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        searchNameJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchNameJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchNameJFieldnameChangeHandler(evt);
            }
        });
        searchNameJField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                searchNameJFieldInputMethodTextChanged(evt);
            }
        });
        searchNameJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameJFieldActionPerformed(evt);
            }
        });
        searchNameJField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchNameJFieldKeyReleased(evt);
            }
        });

        filteredJList.setBackground(new java.awt.Color(255, 255, 255));
        filteredJList.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        filteredJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filteredJListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(filteredJList);

        detailsJPanel.setBackground(new java.awt.Color(11, 48, 56));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        nameJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameJLabel.setText("Select Person to see details!");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address:");

        addressJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addressJLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressJLabel.setText("Select Person to see details!");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Person Identifier:");

        identifierJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        identifierJLabel.setForeground(new java.awt.Color(255, 255, 255));
        identifierJLabel.setText("Select Person to see details!");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Zip Code:");

        zipCodeJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        zipCodeJLabel.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeJLabel.setText("Select Person to see details!");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("City:");

        cityJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cityJLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityJLabel.setText("Select Person to see details!");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("State:");

        stateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        stateJLabel.setForeground(new java.awt.Color(255, 255, 255));
        stateJLabel.setText("Select Person to see details!");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Community Name:");

        communityNameJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        communityNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        communityNameJLabel.setText("Select Person to see details!");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DOB:");

        dobJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        dobJLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobJLabel.setText("Select Person to see details!");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email ID:");

        emailJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        emailJLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailJLabel.setText("Select Person to see details!");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mobile No.:");

        mobileNoJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        mobileNoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        mobileNoJLabel.setText("Select Person to see details!");

        addVisitJButton.setBackground(new java.awt.Color(0, 0, 0));
        addVisitJButton.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        addVisitJButton.setForeground(new java.awt.Color(255, 255, 255));
        addVisitJButton.setText("Add Visit");
        addVisitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVisitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailsJPanelLayout = new javax.swing.GroupLayout(detailsJPanel);
        detailsJPanel.setLayout(detailsJPanelLayout);
        detailsJPanelLayout.setHorizontalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addVisitJButton)
                    .addComponent(nameJLabel)
                    .addComponent(addressJLabel)
                    .addComponent(identifierJLabel)
                    .addComponent(zipCodeJLabel)
                    .addComponent(cityJLabel)
                    .addComponent(stateJLabel)
                    .addComponent(communityNameJLabel)
                    .addComponent(emailJLabel)
                    .addComponent(dobJLabel)
                    .addComponent(mobileNoJLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailsJPanelLayout.setVerticalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(identifierJLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addressJLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(zipCodeJLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cityJLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(stateJLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(communityNameJLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dobJLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(emailJLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(mobileNoJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addVisitJButton))
        );

        visitJPanel.setBackground(new java.awt.Color(11, 48, 56));

        seatsJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel.setText("Respiratory Rate (*) :");

        respiratoryRateJField.setBackground(new java.awt.Color(238, 238, 238));
        respiratoryRateJField.setForeground(new java.awt.Color(0, 0, 0));
        respiratoryRateJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        respiratoryRateJField.setText("Enter here");
        respiratoryRateJField.setToolTipText("Click to enter your name.");
        respiratoryRateJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        respiratoryRateJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                respiratoryRateJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                respiratoryRateJFieldnameChangeHandler(evt);
            }
        });
        respiratoryRateJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respiratoryRateJFieldActionPerformed(evt);
            }
        });

        seatsJLabel1.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel1.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel1.setText("Heart Rate (*) :");

        heartRateJField.setBackground(new java.awt.Color(238, 238, 238));
        heartRateJField.setForeground(new java.awt.Color(0, 0, 0));
        heartRateJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        heartRateJField.setText("Enter here");
        heartRateJField.setToolTipText("Click to enter your name.");
        heartRateJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        heartRateJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                heartRateJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                heartRateJFieldnameChangeHandler(evt);
            }
        });

        seatsJLabel2.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel2.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel2.setText("Blood Pressure (*) :");

        bloodPressureJField.setBackground(new java.awt.Color(238, 238, 238));
        bloodPressureJField.setForeground(new java.awt.Color(0, 0, 0));
        bloodPressureJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bloodPressureJField.setText("Enter here");
        bloodPressureJField.setToolTipText("Click to enter your name.");
        bloodPressureJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        bloodPressureJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bloodPressureJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bloodPressureJFieldnameChangeHandler(evt);
            }
        });

        seatsJLabel3.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel3.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel3.setText("Age (*) :");

        ageJField.setBackground(new java.awt.Color(238, 238, 238));
        ageJField.setForeground(new java.awt.Color(0, 0, 0));
        ageJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ageJField.setText("Enter here");
        ageJField.setToolTipText("Click to enter your name.");
        ageJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        ageJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageJFieldFocusGained(evt);
            }
        });

        cardentifierJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        cardentifierJLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardentifierJLabel.setText("Patient Identifier (*):");

        patientIdentifierJLabel.setEditable(false);
        patientIdentifierJLabel.setBackground(new java.awt.Color(216, 220, 228));
        patientIdentifierJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        patientIdentifierJLabel.setForeground(new java.awt.Color(0, 0, 0));
        patientIdentifierJLabel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        patientIdentifierJLabel.setToolTipText("This is your identifier.");
        patientIdentifierJLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(67, 100, 100));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("/minute");

        jLabel14.setText("bpm");

        jLabel15.setText("mm Hg");

        javax.swing.GroupLayout visitJPanelLayout = new javax.swing.GroupLayout(visitJPanel);
        visitJPanel.setLayout(visitJPanelLayout);
        visitJPanelLayout.setHorizontalGroup(
            visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visitJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardentifierJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seatsJLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seatsJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(visitJPanelLayout.createSequentialGroup()
                        .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bloodPressureJField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respiratoryRateJField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel15)))
                    .addComponent(patientIdentifierJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seatsJLabel1)
                    .addComponent(seatsJLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heartRateJField)
                    .addComponent(ageJField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, visitJPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(138, 138, 138)))
        );
        visitJPanelLayout.setVerticalGroup(
            visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visitJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatsJLabel)
                    .addComponent(respiratoryRateJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel1)
                    .addComponent(heartRateJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatsJLabel2)
                    .addComponent(bloodPressureJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel3)
                    .addComponent(ageJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIdentifierJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardentifierJLabel)
                    .addComponent(jButton2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(visitJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(visitJPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detailsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchNameJField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(visitJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchNameJField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(detailsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visitJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchNameJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchNameJFieldFocusGained
        if (searchNameJField.getText().equals("Enter here")) {
            searchNameJField.setText("");
        }
    }//GEN-LAST:event_searchNameJFieldFocusGained

    private void searchNameJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchNameJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNameJFieldnameChangeHandler

    private void searchNameJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNameJFieldActionPerformed

    private void searchNameJFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_searchNameJFieldInputMethodTextChanged

    }//GEN-LAST:event_searchNameJFieldInputMethodTextChanged

    private void filteredJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filteredJListMouseClicked
        openSelectedProfile();

    }//GEN-LAST:event_filteredJListMouseClicked

    private void searchNameJFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchNameJFieldKeyReleased
        if ("".equals(searchNameJField.getText())) {
            return;
        }
        filteredList.clear();
        filteredJList.removeAll();
        detailsJPanel.setVisible(false);
        visitJPanel.setVisible(false);
        for (int i = 0; i < PersonDirectory.allPeople.size(); i++) {
            Person onGoing = PersonDirectory.allPeople.get(i);
            if (onGoing.name.contains(searchNameJField.getText())) {
                filteredList.add(onGoing);
            }
        }
        filteredJList.setVisible(true);
        DefaultListModel model = new DefaultListModel();

        filteredList.forEach(patient -> {
            model.addElement(patient.personId + " - " + patient.name);
        });
        filteredJList.setModel(model);
        filteredJList.setSelectedIndex(0);
    }//GEN-LAST:event_searchNameJFieldKeyReleased

    private void respiratoryRateJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_respiratoryRateJFieldFocusGained
        if (respiratoryRateJField.getText().equals("Enter here")) {
            respiratoryRateJField.setText("");
        }
    }//GEN-LAST:event_respiratoryRateJFieldFocusGained

    private void respiratoryRateJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_respiratoryRateJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_respiratoryRateJFieldnameChangeHandler

    private void respiratoryRateJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respiratoryRateJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respiratoryRateJFieldActionPerformed

    private void heartRateJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heartRateJFieldFocusGained
        if (heartRateJField.getText().equals("Enter here")) {
            heartRateJField.setText("");
        }
    }//GEN-LAST:event_heartRateJFieldFocusGained

    private void heartRateJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heartRateJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_heartRateJFieldnameChangeHandler

    private void bloodPressureJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bloodPressureJFieldFocusGained
        if (bloodPressureJField.getText().equals("Enter here")) {
            bloodPressureJField.setText("");
        }
    }//GEN-LAST:event_bloodPressureJFieldFocusGained

    private void bloodPressureJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bloodPressureJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodPressureJFieldnameChangeHandler

    private void ageJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageJFieldFocusGained
        if (ageJField.getText().equals("Enter here")) {
            ageJField.setText("");
        }
    }//GEN-LAST:event_ageJFieldFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Boolean isAlreadyAPatient = isAlreadyPatient();
        String errorMessage = "";
        VitalSigns vitals = new VitalSigns();
        String respiratoryErrorMessage = vitals.validateRespiratoryRate(String.valueOf(this.respiratoryRateJField.getText()));
        String heartRateErrorMessage = vitals.validateHeartRate(String.valueOf(this.heartRateJField.getText()));
        String bloodPresureErrorMessage = vitals.validateBloodPressure(String.valueOf(this.bloodPressureJField.getText()));
        String ageErrorMessage = vitals.validateAge(String.valueOf(this.ageJField.getText()));

        errorMessage += respiratoryErrorMessage;
        errorMessage += heartRateErrorMessage;
        errorMessage += bloodPresureErrorMessage;
        errorMessage += ageErrorMessage;

        if (!errorMessage.equals("")) {
            JOptionPane.showMessageDialog(this, errorMessage, "Create Patient's visit", ERROR_MESSAGE);
            return;
        }
        selectedPatient.personDetails = selectedPerson;

        vitals.age = Integer.valueOf(this.ageJField.getText());
        vitals.respiratoryRate = Integer.valueOf(this.respiratoryRateJField.getText());
        vitals.heartRate = Integer.valueOf(this.heartRateJField.getText());
        vitals.bloodPressure = Integer.valueOf(this.bloodPressureJField.getText());

        Encounter encounter = new Encounter();
        encounter.findings = vitals;
        encounter.visitDate = new Date();
        selectedPatient.allVisitsHistory.encounterHistory.add(encounter);
        int getID = getPatientId();
        selectedPatient.patientIdentifier = getID;

        visitJPanel.setVisible(false);

        patientIdentifierJLabel.setText(String.valueOf(getID));

        if (!isAlreadyAPatient) {
            PatientDirectory.patientDirectory.add(selectedPatient);
        }
        restVitals();
        JOptionPane.showMessageDialog(this, "Patient's history created successfully!!", "Create Visit", INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void restVitals() {
        ageJField.setText("Enter here");
        respiratoryRateJField.setText("Enter here");
        heartRateJField.setText("Enter here");
        bloodPressureJField.setText("Enter here");
    }

    public int getPatientId() {
        int foundID = PatientDirectory.patientDirectory.size();
        for (int i = 0; i < PatientDirectory.patientDirectory.size(); i++) {
            if (PatientDirectory.patientDirectory.get(i).personDetails.personId == selectedPerson.personId) {
                System.out.println("--Already a patient");
                foundID = PatientDirectory.patientDirectory.get(i).patientIdentifier;
            }
        }
        System.out.println("new patient--");
        return foundID;
    }

    public Boolean isAlreadyPatient() {
        Boolean found = false;
        for (int i = 0; i < PatientDirectory.patientDirectory.size(); i++) {
            if (PatientDirectory.patientDirectory.get(i).personDetails.personId == selectedPerson.personId) {
                found = true;
            }
        }
        return found;
    }

    public Patient getPatient() {
        Patient found = new Patient();
        for (int i = 0; i < PatientDirectory.patientDirectory.size(); i++) {
            if (PatientDirectory.patientDirectory.get(i).personDetails.personId == selectedPerson.personId) {
                found = PatientDirectory.patientDirectory.get(i);
            }
        }
        return found;
    }

    private void addVisitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVisitJButtonActionPerformed
        visitJPanel.setVisible(true);
    }//GEN-LAST:event_addVisitJButtonActionPerformed

    public void openSelectedProfile() {
        int seletedPersonIndex = filteredJList.getSelectedIndex();//get the index of the selection made in the left section.
        if (seletedPersonIndex != -1) {
            selectedPerson = PersonDirectory.allPeople.get(seletedPersonIndex);
            selectedPatient = getPatient();
            detailsJPanel.setVisible(true);
            identifierJLabel.setText(String.valueOf(selectedPerson.personId));
            nameJLabel.setText(String.valueOf(selectedPerson.name));
            addressJLabel.setText(String.valueOf(selectedPerson.address));
            zipCodeJLabel.setText(String.valueOf(selectedPerson.address.zipcode));
            cityJLabel.setText(String.valueOf(selectedPerson.city.city));
            stateJLabel.setText(String.valueOf(selectedPerson.city.state));
            communityNameJLabel.setText(String.valueOf(selectedPerson.community.communityName));
            dobJLabel.setText((String.valueOf((new SimpleDateFormat("MM/dd/yyyy", Locale.US)).format(selectedPerson.dob))));
            emailJLabel.setText(String.valueOf(selectedPerson.email));
            mobileNoJLabel.setText(String.valueOf(selectedPerson.mobileNo));
            //Patient Identifier
            patientIdentifierJLabel.setText(String.valueOf(getPatientId()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVisitJButton;
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextField ageJField;
    private javax.swing.JTextField bloodPressureJField;
    private javax.swing.JLabel cardentifierJLabel;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JLabel communityNameJLabel;
    private javax.swing.JPanel detailsJPanel;
    private javax.swing.JLabel dobJLabel;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JList<String> filteredJList;
    private javax.swing.JTextField heartRateJField;
    private javax.swing.JLabel identifierJLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mobileNoJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField patientIdentifierJLabel;
    private javax.swing.JTextField respiratoryRateJField;
    private javax.swing.JTextField searchNameJField;
    private javax.swing.JLabel seatsJLabel;
    private javax.swing.JLabel seatsJLabel1;
    private javax.swing.JLabel seatsJLabel2;
    private javax.swing.JLabel seatsJLabel3;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JPanel visitJPanel;
    private javax.swing.JLabel zipCodeJLabel;
    // End of variables declaration//GEN-END:variables
}