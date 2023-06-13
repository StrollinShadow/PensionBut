
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
public class Planer extends javax.swing.JFrame {

    Double StartkapitalDouble;
    Double ZinssatzDouble;
    Double SparzielDouble;
    Double JährlicherSparbetragDouble;
    Double MonatlicherSparbetragDouble;

    public Planer() {
        initComponents();
        setLocationRelativeTo(null);
        AnfangMonatRB.setEnabled(false);
        EndeMonatRB.setEnabled(false);
        AnfangJahrRB.setEnabled(false);
        EndeJahrRB.setEnabled(false);
        MonatlicherSparbetrag.setEnabled(false);
        JährlicherSparbetrag.setEnabled(false);
        KeineBuchstabenImJährlicherSparbetrag(10);
        KeineBuchstabenImMonatlicherSparbetrag(10);
        KeineBuchstabenImSparZiel(10);
        KeineBuchstabenImZinssatz(10);
        KeineBuchstabenImStartkapital(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        head = new javax.swing.JPanel();
        titel = new javax.swing.JLabel();
        Startkapital = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Sparziel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Zinssatz = new javax.swing.JTextField();
        MonatlichRB = new javax.swing.JRadioButton();
        JährlichRB = new javax.swing.JRadioButton();
        AnfangMonatRB = new javax.swing.JRadioButton();
        EndeMonatRB = new javax.swing.JRadioButton();
        AnfangJahrRB = new javax.swing.JRadioButton();
        EndeJahrRB = new javax.swing.JRadioButton();
        MonatlicherSparbetrag = new javax.swing.JTextField();
        JährlicherSparbetrag = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BerechnenButton = new javax.swing.JButton();
        StartseiteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 550));

        head.setBackground(new java.awt.Color(51, 188, 209));

        titel.setBackground(new java.awt.Color(0, 0, 0));
        titel.setFont(new java.awt.Font("Lucida Console", 0, 48)); // NOI18N
        titel.setText("Planer");

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titel)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setText("Startkapital:");

        jLabel2.setText("Sparziel:");

        jLabel3.setText("Zinssatz:");

        buttonGroup1.add(MonatlichRB);
        MonatlichRB.setText("Monatlich einzahlen");
        MonatlichRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonatlichRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(JährlichRB);
        JährlichRB.setText("Jährlich einzahlen");
        JährlichRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JährlichRBActionPerformed(evt);
            }
        });

        buttonGroup2.add(AnfangMonatRB);
        AnfangMonatRB.setText("Anfang des Monats");

        buttonGroup2.add(EndeMonatRB);
        EndeMonatRB.setText("Ende des Monats");

        buttonGroup3.add(AnfangJahrRB);
        AnfangJahrRB.setText("Anfang des Jahres");

        buttonGroup3.add(EndeJahrRB);
        EndeJahrRB.setText("Ende des Jahres");

        jLabel4.setText("Jährlicher Sparbetrag:");

        jLabel5.setText("Monatlicher Sparbetrag:");

        BerechnenButton.setText("Berechnen");
        BerechnenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BerechnenButtonActionPerformed(evt);
            }
        });

        StartseiteButton.setText("Zurück zur Startseite");
        StartseiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartseiteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Startkapital, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Zinssatz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(63, 249, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addGap(437, 437, 437))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnfangMonatRB)
                            .addComponent(MonatlicherSparbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EndeMonatRB)
                                    .addComponent(MonatlichRB))
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnfangJahrRB)
                                    .addComponent(JährlichRB)
                                    .addComponent(EndeJahrRB)
                                    .addComponent(JährlicherSparbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BerechnenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StartseiteButton))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Sparziel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Startkapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Zinssatz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sparziel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonatlichRB)
                    .addComponent(JährlichRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnfangMonatRB)
                    .addComponent(AnfangJahrRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EndeJahrRB)
                    .addComponent(EndeMonatRB))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonatlicherSparbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JährlicherSparbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BerechnenButton)
                    .addComponent(StartseiteButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MonatlichRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonatlichRBActionPerformed
        if (MonatlichRB.isSelected()) {
            AnfangMonatRB.setEnabled(true);
            EndeMonatRB.setEnabled(true);
            MonatlicherSparbetrag.setEnabled(true);
            AnfangJahrRB.setEnabled(false);
            EndeJahrRB.setEnabled(false);
            JährlicherSparbetrag.setEnabled(false);
        }


    }//GEN-LAST:event_MonatlichRBActionPerformed

    private void JährlichRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JährlichRBActionPerformed
        if (JährlichRB.isSelected()) {
            AnfangJahrRB.setEnabled(true);
            EndeJahrRB.setEnabled(true);
            JährlicherSparbetrag.setEnabled(true);
            AnfangMonatRB.setEnabled(false);
            EndeMonatRB.setEnabled(false);
            MonatlicherSparbetrag.setEnabled(false);
        }


    }//GEN-LAST:event_JährlichRBActionPerformed

    private void StartseiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartseiteButtonActionPerformed
        this.dispose();
        Startseite Startseite = new Startseite();
        Startseite.setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_StartseiteButtonActionPerformed

    private void BerechnenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BerechnenButtonActionPerformed
        String startkapital = Startkapital.getText();

        if ("".equals(startkapital)) {
            System.out.println("Kein Wert");
        } else {
            StartkapitalDouble = Double.parseDouble(startkapital);
            System.out.println(StartkapitalDouble);
        }

        String zinssatz = Zinssatz.getText();

        if ("".equals(zinssatz)) {
            System.out.println("Kein Wert");
        } else {
            ZinssatzDouble = Double.parseDouble(zinssatz);
            System.out.println(ZinssatzDouble);
        }

        String sparziel = Sparziel.getText();

        if ("".equals(sparziel)) {
            System.out.println("Kein Wert");
        } else {
            SparzielDouble = Double.parseDouble(sparziel);
            System.out.println(SparzielDouble);
        }

        String jährlicherSparbetrag = JährlicherSparbetrag.getText();

        if ("".equals(jährlicherSparbetrag)) {
            System.out.println("Kein Wert");
        } else {
            JährlicherSparbetragDouble = Double.parseDouble(jährlicherSparbetrag);
            System.out.println(JährlicherSparbetragDouble);
        }

        String monatlicherSparbetrag = MonatlicherSparbetrag.getText();

        if ("".equals(monatlicherSparbetrag)) {
            System.out.println("Kein Wert");
        } else {
            MonatlicherSparbetragDouble = Double.parseDouble(monatlicherSparbetrag);
            System.out.println(MonatlicherSparbetragDouble);
        }

    }//GEN-LAST:event_BerechnenButtonActionPerformed

    private void KeineBuchstabenImJährlicherSparbetrag(int maxLength) {
        ((AbstractDocument) JährlicherSparbetrag.getDocument()).setDocumentFilter(new DocumentFilter() {
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

    private void KeineBuchstabenImMonatlicherSparbetrag(int maxLength) {
        ((AbstractDocument) MonatlicherSparbetrag.getDocument()).setDocumentFilter(new DocumentFilter() {
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

    private void KeineBuchstabenImSparZiel(int maxLength) {
        ((AbstractDocument) Sparziel.getDocument()).setDocumentFilter(new DocumentFilter() {
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

    private void KeineBuchstabenImZinssatz(int maxLength) {
        ((AbstractDocument) Zinssatz.getDocument()).setDocumentFilter(new DocumentFilter() {
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

    private void KeineBuchstabenImStartkapital(int maxLength) {
        ((AbstractDocument) Startkapital.getDocument()).setDocumentFilter(new DocumentFilter() {
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
            java.util.logging.Logger.getLogger(Planer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AnfangJahrRB;
    private javax.swing.JRadioButton AnfangMonatRB;
    private javax.swing.JButton BerechnenButton;
    private javax.swing.JRadioButton EndeJahrRB;
    private javax.swing.JRadioButton EndeMonatRB;
    private javax.swing.JRadioButton JährlichRB;
    private javax.swing.JTextField JährlicherSparbetrag;
    private javax.swing.JRadioButton MonatlichRB;
    private javax.swing.JTextField MonatlicherSparbetrag;
    private javax.swing.JTextField Sparziel;
    private javax.swing.JTextField Startkapital;
    private javax.swing.JButton StartseiteButton;
    private javax.swing.JTextField Zinssatz;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
