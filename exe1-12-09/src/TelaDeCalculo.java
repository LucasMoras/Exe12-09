
import javax.swing.JOptionPane;

public class TelaDeCalculo extends javax.swing.JFrame {

    public TelaDeCalculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        BtCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtAltTri = new javax.swing.JTextField();
        TxtLarTri = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtAltRet = new javax.swing.JTextField();
        TxtLarRet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtRaioCir = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtCalcular.setText("Calcular");
        BtCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCalcularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Calculos de Area");

        TxtAltTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAltTriActionPerformed(evt);
            }
        });

        TxtLarTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLarTriActionPerformed(evt);
            }
        });

        jLabel2.setText("Circulo");

        jLabel3.setText("Triangulo");

        jLabel4.setText("Retangulo");

        TxtAltRet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAltRetActionPerformed(evt);
            }
        });

        TxtLarRet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLarRetActionPerformed(evt);
            }
        });

        jLabel5.setText("Altura");

        jLabel6.setText("Largura");

        TxtRaioCir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRaioCirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(BtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20)
                                .addComponent(TxtLarTri, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(TxtAltTri, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtLarRet, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(TxtAltRet))
                        .addGap(21, 21, 21)
                        .addComponent(TxtRaioCir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TxtAltTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAltRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRaioCir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TxtLarTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtLarRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(BtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCalcularActionPerformed
    CalculoDAO objCalculo = new CalculoDAO();
    objCalculo.CalcularAreas();
    }//GEN-LAST:event_BtCalcularActionPerformed

    private void TxtAltTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAltTriActionPerformed
      FormasDTO objFormasDTO = new FormasDTO();
      double Alt = Double.parseDouble(TxtAltTri.getText());
      objFormasDTO.setAlturaTri(Alt);
    }//GEN-LAST:event_TxtAltTriActionPerformed
    
    private void TxtLarTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLarTriActionPerformed
      FormasDTO objFormasDTO = new FormasDTO();
      double Lar = Double.parseDouble(TxtLarTri.getText());
      objFormasDTO.setLarguraTri(Lar);
    }//GEN-LAST:event_TxtLarTriActionPerformed
    
    private void TxtAltRetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAltRetActionPerformed
    FormasDTO objFormasDTO = new FormasDTO();
    double Alt = Double.parseDouble(TxtAltRet.getText());
      objFormasDTO.setAlturaRet(Alt);
    }//GEN-LAST:event_TxtAltRetActionPerformed

    private void TxtLarRetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLarRetActionPerformed
    FormasDTO objFormasDTO = new FormasDTO(); 
    double Lar = Double.parseDouble(TxtLarRet.getText());
      objFormasDTO.setAlturaTri(Lar);
    }//GEN-LAST:event_TxtLarRetActionPerformed

    private void TxtRaioCirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRaioCirActionPerformed
    FormasDTO objFormasDTO = new FormasDTO(); 
    double Raio = Double.parseDouble(TxtRaioCir.getText());
      objFormasDTO.setAlturaTri(Raio);
    }//GEN-LAST:event_TxtRaioCirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCalculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCalcular;
    private javax.swing.JTextField TxtAltRet;
    private javax.swing.JTextField TxtAltTri;
    private javax.swing.JTextField TxtLarRet;
    private javax.swing.JTextField TxtLarTri;
    private javax.swing.JTextField TxtRaioCir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
