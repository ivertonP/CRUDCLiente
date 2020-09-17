/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ClienteDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author Iverton
 */
public class TelaCliente extends javax.swing.JFrame {

    ClienteDAO clienteDAO = new ClienteDAO();
    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
        initComponents();
        listarTabela(); //Carrega a tabela de clientes ao iniciar o programa
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTable2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoTel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela do Cliente");
        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("CPF:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inserir(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remover(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Cliente", "CPF do Cliente", "e-mail do cliente", "Telefone do cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jTable2.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alterar(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/client.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(256, 256));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("e-mail:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Telefone:");

        campoEmail.setPreferredSize(new java.awt.Dimension(6, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jTable2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(campoCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(campoNome))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoTel, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(campoTel))
                        .addGap(6, 6, 6)))
                .addComponent(jTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Inserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inserir
        //Metodo utilizado para inserir um objeto cliente ao banco
        Cliente cliente = new Cliente();        
        if(campoCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite os dados do cliente antes de inserir.");
        }
        else{
            cliente.setNome(campoNome.getText());
            cliente.setCpf(campoCPF.getText());
            cliente.setEmail(campoEmail.getText());
            cliente.setTel(campoTel.getText());
            clienteDAO.save(cliente);
            AddRow();
            campoNome.setText("");
            campoCPF.setText("");
            campoEmail.setText("");
            campoTel.setText("");
        }
    }//GEN-LAST:event_Inserir

    private void Remover(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remover
        //Metodo utilizado para remover um cliente do banco
        if(campoCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Selecione algum cliente antes de excluir.");           
        }
        else{
            Cliente cliente = new Cliente();
            cliente.setNome(campoNome.getText());
            cliente.setCpf(campoCPF.getText());
            cliente.setEmail(campoEmail.getText());
            cliente.setTel(campoTel.getText());
            clienteDAO.delete(cliente);
            RemoveRow();
            campoNome.setText("");
            campoCPF.setText("");
            campoEmail.setText("");
            campoTel.setText("");
        }
    }//GEN-LAST:event_Remover

    private void Alterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alterar
        //Metodo utilizado para fazer update nos dados de um objeto cliente no banco
        if(campoNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Selecione algum cliente antes de alterar.");  
        }
        else{            
            jTable1.setValueAt(campoNome.getText(), jTable1.getSelectedRow(), 0);
            jTable1.setValueAt(campoEmail.getText(), jTable1.getSelectedRow(), 2);
            jTable1.setValueAt(campoTel.getText(), jTable1.getSelectedRow(), 3);
            Cliente cliente  = new Cliente();
            cliente.setNome(campoNome.getText());
            cliente.setEmail(campoEmail.getText());
            cliente.setTel(campoTel.getText());
            cliente.setCpf(campoCPF.getText());
            clienteDAO.update(cliente);
            campoNome.setText("");
            campoCPF.setText("");
            campoEmail.setText("");
            campoTel.setText("");
        }
    }//GEN-LAST:event_Alterar

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //Metodo utilizado para permitir o preenchimento dos textfields ao usar o clique do mouse
        if(jTable1.getSelectedRow() != -1){
            campoNome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            campoCPF.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            campoEmail.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            campoTel.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        //Metodo utilizado para permitir o preenchimento dos textfields ao usar a seta do teclado
        if(jTable1.getSelectedRow() != -1){
            campoNome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            campoCPF.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            campoEmail.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            campoTel.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jTable1KeyReleased

    public void listarTabela(){
        DefaultTableModel dtmClientes = (DefaultTableModel) jTable1.getModel();
        ClienteDAO cdao = new ClienteDAO();
        
        for(Cliente c: cdao.select()){
            //Adiciona em jTable1 um objeto da lista de objetos recuperados do banco atraves do metodo select().
            dtmClientes.addRow(new Object[]{c.getNome(), c.getCpf(), c.getEmail(), c.getTel()}); 
        }
    }
    
    public void AddRow(){ //Adiciona uma linha a jTable1
        DefaultTableModel dtmClientes = (DefaultTableModel) jTable1.getModel();
        Object[] dados = {campoNome.getText(), campoCPF.getText(), campoEmail.getText(), campoTel.getText()};
        dtmClientes.addRow(dados);       
    }
    
    public void RemoveRow(){//Deleta uma linha de jTable1
            DefaultTableModel dtmClientes = (DefaultTableModel) jTable1.getModel();
            dtmClientes.removeRow(jTable1.getSelectedRow());
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCliente().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane jTable2;
    // End of variables declaration//GEN-END:variables
}
