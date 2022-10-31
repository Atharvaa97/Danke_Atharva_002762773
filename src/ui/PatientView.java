/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.Person_Directory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Atharva
 */
public class PatientView extends javax.swing.JPanel {

    Patient selectedPerson;

    public PatientView() {
        initComponents();

        for (int i = 0; i < Person_Directory.allPeople.size(); i++) {
            Person sel = Person_Directory.allPeople.get(i);
            System.out.println("Person directory" + sel.personId + "-" + sel.name);
        }

        jSplitPane1.setDividerLocation((int) (0.35 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width - 300)));
        DefaultListModel model = new DefaultListModel();
        encounterJList.setVisible(false);
        encounterJPanel.setVisible(false);
        if (PatientDirectory.patientDirectory.isEmpty()) {
            uploadedJList.setModel(model);
            JOptionPane.showMessageDialog(this, "Patient Directory Empty!", "View Details", ERROR_MESSAGE);
        } else {
            PatientDirectory.patientDirectory.forEach(patient -> {
                model.addElement(patient.patientIdentifier + " - " + patient.personDetails.name);
                for (int i = 0; i < patient.allVisitsHistory.encounterHistory.size(); i++) {
                    Encounter sel = patient.allVisitsHistory.encounterHistory.get(i);
                    System.out.println(patient.patientIdentifier + "Vital directory" + sel.visitDate + "-" + sel.findings.bloodPressure);
                }
            });
            uploadedJList.setModel(model);
            uploadedJList.setSelectedIndex(0);
            try {
                openSelectedProfile();
            } catch (ParseException ex) {
                Logger.getLogger(PatientView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        peresonJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        identifierJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        zipCodeJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cityJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stateJLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        communityNameJLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dobJLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emailJLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mobileNoJLabel = new javax.swing.JLabel();
        encounterJPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dateJLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        respiratoryRateJLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        heartRateJLabel = new javax.swing.JLabel();
        ageJLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        bloodPressureJLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        encounterJList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        uploadedJList = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 48, 56));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Directory");

        jPanel1.setBackground(new java.awt.Color(11, 48, 56));

        peresonJPanel.setBackground(new java.awt.Color(11, 48, 56));
        peresonJPanel.setForeground(new java.awt.Color(255, 255, 255));

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

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Person Identifier:");

        identifierJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        identifierJLabel.setForeground(new java.awt.Color(255, 255, 255));
        identifierJLabel.setText("Select Person to see details!");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Zip Code:");

        zipCodeJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        zipCodeJLabel.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeJLabel.setText("Select Person to see details!");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City:");

        cityJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cityJLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityJLabel.setText("Select Person to see details!");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("State:");

        stateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        stateJLabel.setForeground(new java.awt.Color(255, 255, 255));
        stateJLabel.setText("Select Person to see details!");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Community Name:");

        communityNameJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        communityNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        communityNameJLabel.setText("Select Person to see details!");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DOB:");

        dobJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        dobJLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobJLabel.setText("Select Person to see details!");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email ID:");

        emailJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        emailJLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailJLabel.setText("Select Person to see details!");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile No.:");

        mobileNoJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        mobileNoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        mobileNoJLabel.setText("Select Person to see details!");

        javax.swing.GroupLayout peresonJPanelLayout = new javax.swing.GroupLayout(peresonJPanel);
        peresonJPanel.setLayout(peresonJPanelLayout);
        peresonJPanelLayout.setHorizontalGroup(
            peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(peresonJPanelLayout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        peresonJPanelLayout.setVerticalGroup(
            peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
            .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(peresonJPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(identifierJLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nameJLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(addressJLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(zipCodeJLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cityJLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(stateJLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(communityNameJLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(dobJLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(emailJLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(peresonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(mobileNoJLabel))
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        encounterJPanel.setBackground(new java.awt.Color(11, 48, 56));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date:");

        dateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        dateJLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateJLabel.setText("Select Person to see details!");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Respiratory Rate");

        respiratoryRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        respiratoryRateJLabel.setForeground(new java.awt.Color(255, 255, 255));
        respiratoryRateJLabel.setText("Select Person to see details!");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Heart Rate");

        heartRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        heartRateJLabel.setForeground(new java.awt.Color(255, 255, 255));
        heartRateJLabel.setText("Select Person to see details!");

        ageJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ageJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageJLabel.setText("Select Person to see details!");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Age:");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Blood Pressure");

        bloodPressureJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bloodPressureJLabel.setForeground(new java.awt.Color(255, 255, 255));
        bloodPressureJLabel.setText("Select Person to see details!");

        javax.swing.GroupLayout encounterJPanelLayout = new javax.swing.GroupLayout(encounterJPanel);
        encounterJPanel.setLayout(encounterJPanelLayout);
        encounterJPanelLayout.setHorizontalGroup(
            encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encounterJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateJLabel)
                    .addComponent(respiratoryRateJLabel)
                    .addComponent(heartRateJLabel)
                    .addComponent(ageJLabel)
                    .addComponent(bloodPressureJLabel))
                .addGap(29, 29, 29))
        );
        encounterJPanelLayout.setVerticalGroup(
            encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encounterJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dateJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(respiratoryRateJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(heartRateJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ageJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(bloodPressureJLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(encounterJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(peresonJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peresonJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encounterJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(11, 48, 56));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Directory:");

        encounterJList.setBackground(new java.awt.Color(222, 222, 222));
        encounterJList.setForeground(new java.awt.Color(0, 0, 0));
        encounterJList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                encounterJListFocusGained(evt);
            }
        });
        encounterJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encounterJListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(encounterJList);

        uploadedJList.setBackground(new java.awt.Color(222, 222, 222));
        uploadedJList.setForeground(new java.awt.Color(0, 0, 0));
        uploadedJList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uploadedJListFocusGained(evt);
            }
        });
        uploadedJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadedJListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(uploadedJList);

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Encounters:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSplitPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void encounterJListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_encounterJListFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_encounterJListFocusGained

    private void encounterJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encounterJListMouseClicked
        openSelectedEncounter();
    }//GEN-LAST:event_encounterJListMouseClicked

    private void uploadedJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadedJListMouseClicked
        try {
            openSelectedProfile();
        } catch (ParseException ex) {
            Logger.getLogger(PatientView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadedJListMouseClicked

    private void uploadedJListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uploadedJListFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadedJListFocusGained

    private void openSelectedEncounter() {
        int seletedPersonIndex = encounterJList.getSelectedIndex();
        if (seletedPersonIndex != -1) {
            Encounter history = selectedPerson.allVisitsHistory.encounterHistory.get(seletedPersonIndex);
            encounterJPanel.setVisible(true);
            dateJLabel.setText(String.valueOf(history.visitDate));
            respiratoryRateJLabel.setText(String.valueOf(history.findings.respiratoryRate));
            heartRateJLabel.setText(String.valueOf(history.findings.heartRate));
            ageJLabel.setText(String.valueOf(history.findings.age));
            bloodPressureJLabel.setText(String.valueOf(history.findings.bloodPressure));
        }
    }

    private void openSelectedProfile() throws ParseException {
        int seletedPersonIndex = uploadedJList.getSelectedIndex();
        if (seletedPersonIndex != -1) {
            selectedPerson = PatientDirectory.patientDirectory.get(seletedPersonIndex);
            identifierJLabel.setText(String.valueOf(selectedPerson.personDetails.personId));
            nameJLabel.setText(String.valueOf(selectedPerson.personDetails.name));
            addressJLabel.setText(String.valueOf(selectedPerson.personDetails.address));
            zipCodeJLabel.setText(String.valueOf(selectedPerson.personDetails.address.zipcode));
            cityJLabel.setText(String.valueOf(selectedPerson.personDetails.city.city));
            stateJLabel.setText(String.valueOf(selectedPerson.personDetails.city.state));
            communityNameJLabel.setText(String.valueOf(selectedPerson.personDetails.community.communityName));
            dobJLabel.setText((String.valueOf((new SimpleDateFormat("MM/dd/yyyy", Locale.US)).format(selectedPerson.personDetails.dob))));
            emailJLabel.setText(String.valueOf(selectedPerson.personDetails.email));
            mobileNoJLabel.setText(String.valueOf(selectedPerson.personDetails.mobileNo));

            DefaultListModel model = new DefaultListModel();
            selectedPerson.allVisitsHistory.encounterHistory.forEach(patient -> {
                model.addElement(patient.visitDate);
            });
            encounterJList.setModel(model);
            encounterJList.setSelectedIndex(0);

            encounterJList.setVisible(true);
            openSelectedEncounter();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JLabel ageJLabel;
    private javax.swing.JLabel bloodPressureJLabel;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JLabel communityNameJLabel;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JLabel dobJLabel;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JList<String> encounterJList;
    private javax.swing.JPanel encounterJPanel;
    private javax.swing.JLabel heartRateJLabel;
    private javax.swing.JLabel identifierJLabel;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel mobileNoJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JPanel peresonJPanel;
    private javax.swing.JLabel respiratoryRateJLabel;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JList<String> uploadedJList;
    private javax.swing.JLabel zipCodeJLabel;
    // End of variables declaration//GEN-END:variables
}
