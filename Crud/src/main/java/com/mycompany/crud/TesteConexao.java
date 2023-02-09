/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crud;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author thiag
 */
public class TesteConexao extends javax.swing.JFrame {

    private Conexao con;

    /**
     * Creates new form TesteConexao
     */
    public TesteConexao() {
        super("Minha tela para testar conexão com o BD");
        initComponents();
        painelLista.setLayout(new WrapLayout());
        setVisible(true);

        con = new Conexao();

        botaoInserir.addActionListener((ActionEvent e) -> {
            inserirTexto();
        });



        


        
        botaoListar.addActionListener((ActionEvent e) -> {
            preencherLista();
        });
        
        preencherLista();
    }

    private void preencherLista() {
        if (painelLista.getComponentCount() > 0) {
            painelLista.removeAll();
        }
        
        ArrayList<Pessoa> lista = con.listarPessoas();
        
        for (Pessoa pessoa : lista) {
            PainelLinha pl = new PainelLinha(pessoa);
            
            painelLista.add(pl);
        }
        
        SwingUtilities.invokeLater(() -> {
            jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMinimum());
        });
    }
    
    private void inserirTexto() {
        Boolean ret = con.inserir(txtNome.getText());
        if (ret) {
            preencherLista();
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível gravar!");
        }
    }


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        botaoInserir = new javax.swing.JButton();
        botaoListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelLista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        labelNome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelNome.setText("Nome");

        botaoInserir.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        botaoInserir.setText("Inserir");

        botaoListar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        botaoListar.setText("Listar");

        jScrollPane1.setViewportView(painelLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 506, Short.MAX_VALUE)
                        .addComponent(botaoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel painelLista;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
