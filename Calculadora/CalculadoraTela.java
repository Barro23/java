package Calculadora;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CalculadoraTela extends JFrame {


    public CalculadoraTela() {
        super("CalCÚ");
        initComponents();
        setVisible(true);
    }

    Calculadora c = new Calculadora();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        soma = new javax.swing.JButton();
        subtrair = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        fatorial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        numero1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nº 2:");

        soma.setText("SOMA ");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        subtrair.setText("SUBTRAIR");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });

        multiplicar.setText("MULTIPLICAR");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        dividir.setText("DIVIDIR");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        fatorial.setText("FATORIAL");
        fatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatorialActionPerformed(evt);
            }
        });

        jLabel2.setText("RESULTADO:");

        jLabel3.setText("Nº 1:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(subtrair)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(multiplicar))))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(fatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soma)
                    .addComponent(subtrair)
                    .addComponent(multiplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dividir)
                    .addComponent(fatorial))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
       
       try {
       double n1 = Double.parseDouble( numero1.getText());
       c.setN1(n1);
       double n2 = Double.parseDouble( numero2.getText());
       c.setN2(n2);
       resultado.setText(c.getSoma().toString());
       }
       catch(NumberFormatException e){
       JOptionPane.showMessageDialog(null, "ERRO, DIGITE UM VALOR VÁLIDO!");
       }   
    }//GEN-LAST:event_somaActionPerformed

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairActionPerformed
       try {
       double n1 = Double.parseDouble( numero1.getText());
       c.setN1(n1);
       double n2 = Double.parseDouble( numero2.getText());
       c.setN2(n2);
       resultado.setText(c.getSubtrair().toString());
       }
       catch(NumberFormatException e){
       JOptionPane.showMessageDialog(null, "ERRO, DIGITE UM VALOR VÁLIDO!");
       }        
    }//GEN-LAST:event_subtrairActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
       try {
       double n1 = Double.parseDouble( numero1.getText());
       c.setN1(n1);
       double n2 = Double.parseDouble( numero2.getText());
       c.setN2(n2);
       resultado.setText(c.getMultiplicar().toString());
       }
       catch(NumberFormatException e){
       JOptionPane.showMessageDialog(null, "ERRO, DIGITE UM VALOR VÁLIDO!");
       }        
    }//GEN-LAST:event_multiplicarActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
       try {
       double n1 = Double.parseDouble( numero1.getText());
       c.setN1(n1);
       double n2 = Double.parseDouble( numero2.getText());
       c.setN2(n2);
       resultado.setText(c.getDividir().toString());
       }
       catch(NumberFormatException e){
       JOptionPane.showMessageDialog(null, "ERRO, DIGITE UM VALOR VÁLIDO!");
       }        
    }//GEN-LAST:event_dividirActionPerformed

    private void fatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatorialActionPerformed
       try {
       double n1 = Double.parseDouble( numero1.getText());
       c.setN1(n1);
       resultado.setText(c.getFatorial().toString());
       c.fatorial = 1;
       }
       catch(NumberFormatException e){
       JOptionPane.showMessageDialog(null, "ERRO, DIGITE UM VALOR VÁLIDO!");
       }  
    }//GEN-LAST:event_fatorialActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividir;
    private javax.swing.JButton fatorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton multiplicar;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtrair;
    // End of variables declaration//GEN-END:variables
}
