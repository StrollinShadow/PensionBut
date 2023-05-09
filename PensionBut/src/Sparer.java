
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author kai_s
 */
public class Sparer extends javax.swing.JFrame {

    double Startkapital;
    double SparbetragJahr;
    int SparbetragJahrDauer;
    double SparbetragMonat;
    int EinzahltagSparbetragMonat;
    double Zinsbetrag;

    public Sparer() {
        initComponents();
        EinzahltagSpinner.setEnabled(false);
        SparbetragMonatTextField.setEnabled(false);
        DauerSpinner.setEnabled(false);
        SparbetragTextField.setEnabled(false);
        ZinsbetragTextField.setEnabled(false);
        keineBuchstabenImStartkapitalTextField(10);
        keineBuchstabenImSparbetragTextField(10);
        keineBuchstabenImSparbetragMonatTextField(10);
        keineBuchstabenImZinsbetrag(10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        titel = new javax.swing.JLabel();
        monthlyRB = new javax.swing.JRadioButton();
        yearlyRB = new javax.swing.JRadioButton();
        SpeichernButton = new javax.swing.JButton();
        SparbetragMonatTextField = new javax.swing.JTextField();
        SparbetragLabel = new javax.swing.JLabel();
        DauerSpinner = new javax.swing.JSpinner();
        SparbetragMonatLabel = new javax.swing.JLabel();
        DauerLabel2 = new javax.swing.JLabel();
        EinzahltagSpinner = new javax.swing.JSpinner();
        SparbetragTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ZinsbetragTextField = new javax.swing.JTextField();
        StartkapitalTextField = new javax.swing.JTextField();
        DauerLabel = new javax.swing.JLabel();
        AnfangJahrRB = new javax.swing.JRadioButton();
        EndeMonatRB = new javax.swing.JRadioButton();
        AnfangMonatRB = new javax.swing.JRadioButton();
        EndeJahrRB = new javax.swing.JRadioButton();
        StartkapitalLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        head.setBackground(new java.awt.Color(51, 188, 209));

        titel.setBackground(new java.awt.Color(0, 0, 0));
        titel.setFont(new java.awt.Font("Lucida Console", 0, 48)); // NOI18N
        titel.setText("Sparer");

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(titel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(titel)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        buttonGroup3.add(monthlyRB);
        monthlyRB.setText("Monatlich");
        monthlyRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyRBActionPerformed(evt);
            }
        });

        buttonGroup3.add(yearlyRB);
        yearlyRB.setText("Jährlich");
        yearlyRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyRBActionPerformed(evt);
            }
        });

        SpeichernButton.setText("Zins berechnen");
        SpeichernButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeichernButtonActionPerformed(evt);
            }
        });

        SparbetragLabel.setText("Jährlicher Sparbetrag");

        DauerSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        DauerSpinner.setFocusable(false);
        DauerSpinner.setMaximumSize(new java.awt.Dimension(12, 12));
        DauerSpinner.setMinimumSize(new java.awt.Dimension(0, 0));
        DauerSpinner.setRequestFocusEnabled(false);
        DauerSpinner.setValue(1);

        SparbetragMonatLabel.setText("Monatlicher Sparbetrag");

        DauerLabel2.setText("Tag im Monat");

        EinzahltagSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel1.setText("Zinssatz");

        DauerLabel.setText("Dauer (Jahre):");

        buttonGroup1.add(AnfangJahrRB);
        AnfangJahrRB.setText("Anfang des Jahres");
        AnfangJahrRB.setEnabled(false);

        buttonGroup2.add(EndeMonatRB);
        EndeMonatRB.setText("Ende des Monats");
        EndeMonatRB.setEnabled(false);

        buttonGroup2.add(AnfangMonatRB);
        AnfangMonatRB.setText("Anfang des Monats");
        AnfangMonatRB.setEnabled(false);

        buttonGroup1.add(EndeJahrRB);
        EndeJahrRB.setText("Ende des Jahres");
        EndeJahrRB.setEnabled(false);

        StartkapitalLabel.setText("Startkapital");

        jButton1.setText("Zurück zur Startseite");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SparbetragLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DauerLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(yearlyRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EndeJahrRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(10, 10, 10))
                                    .addComponent(AnfangJahrRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SpeichernButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(13, 13, 13))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SparbetragTextField)
                                        .addGap(4, 4, 4)))
                                .addGap(28, 28, 28)
                                .addComponent(DauerSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(monthlyRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(EndeMonatRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(11, 11, 11))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(AnfangMonatRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(8, 8, 8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SparbetragMonatTextField)
                                            .addComponent(SparbetragMonatLabel))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DauerLabel2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(EinzahltagSpinner)
                                                .addGap(28, 28, 28)))))
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(StartkapitalTextField)
                                .addGap(208, 208, 208))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(StartkapitalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(98, 98, 98))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ZinsbetragTextField)
                                .addGap(37, 37, 37))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartkapitalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartkapitalTextField)
                    .addComponent(ZinsbetragTextField))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearlyRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthlyRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AnfangJahrRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AnfangMonatRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndeJahrRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EndeMonatRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SparbetragLabel)
                    .addComponent(DauerLabel)
                    .addComponent(SparbetragMonatLabel)
                    .addComponent(DauerLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SparbetragTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(DauerSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SparbetragMonatTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(EinzahltagSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpeichernButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
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

    private void monthlyRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyRBActionPerformed
        if (monthlyRB.isSelected()) {
            EinzahltagSpinner.setEnabled(true);
            SparbetragMonatTextField.setEnabled(true);
            DauerSpinner.setEnabled(false);
            SparbetragTextField.setEnabled(false);
            ZinsbetragTextField.setEnabled(true);
            AnfangMonatRB.setEnabled(true);
            EndeMonatRB.setEnabled(true);
            AnfangJahrRB.setEnabled(false);
            EndeJahrRB.setEnabled(false);

        }
    }//GEN-LAST:event_monthlyRBActionPerformed

    private void yearlyRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyRBActionPerformed
        if (yearlyRB.isSelected()) {
            DauerSpinner.setEnabled(true);
            SparbetragTextField.setEnabled(true);
            EinzahltagSpinner.setEnabled(false);
            SparbetragMonatTextField.setEnabled(false);
            ZinsbetragTextField.setEnabled(true);
            EndeJahrRB.setEnabled(true);
            AnfangJahrRB.setEnabled(true);
            AnfangMonatRB.setEnabled(false);
            EndeMonatRB.setEnabled(false);

        }
    }//GEN-LAST:event_yearlyRBActionPerformed

    private void SpeichernButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeichernButtonActionPerformed

        String startkapital = StartkapitalTextField.getText();

        if ("".equals(startkapital)) {
            System.out.println("Kein Wert");
        } else {
            Startkapital = Double.parseDouble(startkapital);
            System.out.println(Startkapital);
        }

        String sparbetragMonat = SparbetragMonatTextField.getText();

        if ("".equals(sparbetragMonat)) {
            System.out.println("Kein Wert");
        } else {
            SparbetragMonat = Double.parseDouble(sparbetragMonat);
            System.out.println(SparbetragMonat);
        }

        int einzahltag = (int) EinzahltagSpinner.getValue();
        EinzahltagSparbetragMonat = einzahltag;
        System.out.println(EinzahltagSparbetragMonat);

        String sparbetrag = SparbetragTextField.getText();

        if ("".equals(sparbetrag)) {
            System.out.println("Kein Wert");
        } else {
            SparbetragJahr = Double.parseDouble(sparbetrag);
            System.out.println(SparbetragJahr);
        }

        int dauer = (int) DauerSpinner.getValue();
        SparbetragJahrDauer = dauer;
        System.out.println(SparbetragJahrDauer);

        String zinsbetrag = ZinsbetragTextField.getText();

        if ("".equals(zinsbetrag)) {
            System.out.println("Kein Wert");
        } else {
            Zinsbetrag = Double.parseDouble(zinsbetrag);
            System.out.println(Zinsbetrag);
        }
    }//GEN-LAST:event_SpeichernButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Startseite Startseite = new Startseite();
        Startseite.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void keineBuchstabenImZinsbetrag(int maxLength) {
        ((AbstractDocument) ZinsbetragTextField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                try {
                    double number = Double.parseDouble(newText);
                    if (number >= 0 && number <= Double.MAX_VALUE && ("" + number).length() <= maxLength) {
                        super.insertString(fb, offset, text, attrs);
                    }
                } catch (NumberFormatException e) {
                    // ignore non-double input
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newText.equals("-") && maxLength > 0) {
                    super.replace(fb, offset, length, text, attrs);
                    return;
                }
                try {
                    double number = Double.parseDouble(newText);
                    if (number >= 0 && number <= Double.MAX_VALUE && ("" + number).length() <= maxLength) {
                        super.replace(fb, offset, length, text, attrs);
                    }
                } catch (NumberFormatException e) {
                    // ignore non-double input
                }
            }
        });
    }

    private void keineBuchstabenImSparbetragMonatTextField(int maxLength) {
        ((AbstractDocument) SparbetragMonatTextField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                try {
                    double number = Double.parseDouble(newText);
                    if (number >= 0 && number <= Double.MAX_VALUE && ("" + number).length() <= maxLength) {
                        super.insertString(fb, offset, text, attrs);
                    }
                } catch (NumberFormatException e) {
                    // ignore non-double input
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newText.equals("-") && maxLength > 0) {
                    super.replace(fb, offset, length, text, attrs);
                    return;
                }
                try {
                    double number = Double.parseDouble(newText);
                    if (number >= 0 && number <= Double.MAX_VALUE && ("" + number).length() <= maxLength) {
                        super.replace(fb, offset, length, text, attrs);
                    }
                } catch (NumberFormatException e) {
                    // ignore non-double input
                }
            }
        });
    }

    private void keineBuchstabenImSparbetragTextField(int maxLength) {
        ((AbstractDocument) SparbetragTextField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                try {
                    double number = Double.parseDouble(newText);
                    if (number >= 0 && number <= Double.MAX_VALUE && ("" + number).length() <= maxLength) {
                        super.insertString(fb, offset, text, attrs);
                    }
                } catch (NumberFormatException e) {
                    // ignore non-double input
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newText.equals("-") && maxLength > 0) {
                    super.replace(fb, offset, length, text, attrs);
                    return;
                }
                try {
                    double number = Double.parseDouble(newText);
                    if (number >= 0 && number <= Double.MAX_VALUE && ("" + number).length() <= maxLength) {
                        super.replace(fb, offset, length, text, attrs);
                    }
                } catch (NumberFormatException e) {
                    // ignore non-double input
                }
            }
        });
    }

    private void keineBuchstabenImStartkapitalTextField(int maxLength) {
        ((AbstractDocument) StartkapitalTextField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                try {
                    double number = Double.parseDouble(newText);
                    if (number >= 0 && number <= Double.MAX_VALUE && ("" + number).length() <= maxLength) {
                        super.insertString(fb, offset, text, attrs);
                    }
                } catch (NumberFormatException e) {
                    // ignore non-double input
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newText.equals("-") && maxLength > 0) {
                    super.replace(fb, offset, length, text, attrs);
                    return;
                }
                try {
                    double number = Double.parseDouble(newText);
                    if (number >= 0 && number <= Double.MAX_VALUE && ("" + number).length() <= maxLength) {
                        super.replace(fb, offset, length, text, attrs);
                    }
                } catch (NumberFormatException e) {
                    // ignore non-double input
                }
            }
        });
    }

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
            java.util.logging.Logger.getLogger(Sparer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sparer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sparer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sparer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sparer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AnfangJahrRB;
    private javax.swing.JRadioButton AnfangMonatRB;
    private javax.swing.JLabel DauerLabel;
    private javax.swing.JLabel DauerLabel2;
    private javax.swing.JSpinner DauerSpinner;
    private javax.swing.JSpinner EinzahltagSpinner;
    private javax.swing.JRadioButton EndeJahrRB;
    private javax.swing.JRadioButton EndeMonatRB;
    private javax.swing.JLabel SparbetragLabel;
    private javax.swing.JLabel SparbetragMonatLabel;
    private javax.swing.JTextField SparbetragMonatTextField;
    private javax.swing.JTextField SparbetragTextField;
    private javax.swing.JButton SpeichernButton;
    private javax.swing.JLabel StartkapitalLabel;
    private javax.swing.JTextField StartkapitalTextField;
    private javax.swing.JTextField ZinsbetragTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel head;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton monthlyRB;
    private javax.swing.JLabel titel;
    private javax.swing.JRadioButton yearlyRB;
    // End of variables declaration//GEN-END:variables
}
