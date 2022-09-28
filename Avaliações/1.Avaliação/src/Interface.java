
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author laboratorio
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
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
        jButton3 = new javax.swing.JButton();
        jRadioButton_outros = new javax.swing.JRadioButton();
        jRadioButton_feminino = new javax.swing.JRadioButton();
        jRadioButton_masculino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_nome = new javax.swing.JTextField();
        jTextField_sobrenome = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jTextField_telefone = new javax.swing.JTextField();
        jTextField_cpf = new javax.swing.JTextField();
        jTextField_cidade = new javax.swing.JTextField();
        jTextField_nacionalidade = new javax.swing.JTextField();
        jTextField_idade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox_soldador = new javax.swing.JCheckBox();
        jCheckBox_montador = new javax.swing.JCheckBox();
        jCheckBox_torneiro = new javax.swing.JCheckBox();
        jCheckBox_operadorMaquinas = new javax.swing.JCheckBox();
        jCheckBox_secretario = new javax.swing.JCheckBox();
        jCheckBox_faxineiro = new javax.swing.JCheckBox();
        jCheckBox_vendedor = new javax.swing.JCheckBox();
        jButton_salvar = new javax.swing.JButton();

        jButton3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton3.setText("EXIBIR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton_outros);
        jRadioButton_outros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_outros.setText("OUTROS");
        jRadioButton_outros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_outrosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_feminino);
        jRadioButton_feminino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_feminino.setText("FEMININO");

        buttonGroup1.add(jRadioButton_masculino);
        jRadioButton_masculino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_masculino.setText("MASCULINO");

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO DE CANDIDATOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Sobrenome:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Telefone:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Nacionalidade:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Idade:");

        jTextField_nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_sobrenome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_telefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_cpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_cidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_nacionalidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_idade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Sexo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Vaga desejada:");

        jCheckBox_soldador.setText("SOLDADOR");

        jCheckBox_montador.setText("MONTADOR");

        jCheckBox_torneiro.setText("TORNEIRO");

        jCheckBox_operadorMaquinas.setText("OPERADOR DE MAQUINAS");

        jCheckBox_secretario.setText("SECRETÁRIO");

        jCheckBox_faxineiro.setText("FAXINEIRO");

        jCheckBox_vendedor.setText("VENDEDOR");

        jButton_salvar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton_salvar.setText("SALVAR");
        jButton_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_sobrenome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(36, 36, 36)
                                    .addComponent(jTextField_nome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_email))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_cidade))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_nacionalidade)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox_faxineiro)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox_vendedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox_secretario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox_soldador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox_montador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox_torneiro)
                                        .addGap(24, 24, 24)
                                        .addComponent(jCheckBox_operadorMaquinas))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton_feminino)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_outros))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButton_masculino)
                    .addComponent(jRadioButton_feminino)
                    .addComponent(jRadioButton_outros))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_soldador)
                            .addComponent(jCheckBox_montador)
                            .addComponent(jCheckBox_torneiro)
                            .addComponent(jCheckBox_operadorMaquinas))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_faxineiro)
                    .addComponent(jCheckBox_vendedor)
                    .addComponent(jCheckBox_secretario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton_salvar)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_outrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_outrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_outrosActionPerformed

    private void jButton_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvarActionPerformed
        Candidatos candidato = new Candidatos();

        candidato.setNome(jTextField_nome.getText());
        candidato.setSobrenome(jTextField_sobrenome.getText());
        candidato.setCidade(jTextField_cidade.getText());
        candidato.setNacionalidade(jTextField_nacionalidade.getText());
        candidato.setIdade(jTextField_idade.getText());
        candidato.setEmail(jTextField_email.getText());
        candidato.setTelefone(jTextField_telefone.getText());
        candidato.setCpf(jTextField_cpf.getText());

        if (jRadioButton_masculino.isSelected()) {
            candidato.setSexo("MASCULINO");
        } else if (jRadioButton_feminino.isSelected()) {
            candidato.setSexo("FEMININO");
        } else {
            candidato.setSexo("OUTRO");
        }

        ArrayList<String> listaVagas = new ArrayList<String>();

        if (jCheckBox_soldador.isSelected()) {
            listaVagas.add("SOLDADOR");
        }
        if (jCheckBox_montador.isSelected()) {
            listaVagas.add("MONTADOR");
        }
        if (jCheckBox_torneiro.isSelected()) {
            listaVagas.add("TORNEIRO");
        }
        if (jCheckBox_operadorMaquinas.isSelected()) {
            listaVagas.add("OPERADOR DE MÁQUINAS");
        }
        if (jCheckBox_faxineiro.isSelected()) {
            listaVagas.add("FAXINEIRO");
        }
        if (jCheckBox_vendedor.isSelected()) {
            listaVagas.add("VENDEDOR");
        }
        if (jCheckBox_secretario.isSelected()) {
            listaVagas.add("SECRETARIO");
        }
        
        String vagas="";
        for (int i = 0; i < listaVagas.size(); i++) {
                vagas = vagas+" "+listaVagas.get(i);
        }
        candidato.setVagaDesejada(vagas);
        
        Arquivo arquivo = new Arquivo();
        arquivo.registrar(candidato);

        /*
        System.out.println(candidato.getNome() + "\n" + candidato.getSobrenome()
                + "\n" + candidato.getCpf() + "\n" + candidato.getCidade() + "\n"
                + candidato.getTelefone() + "\n" + candidato.getIdade() + "\n"
                + candidato.getEmail() + "\n" + candidato.getNacionalidade()
                + "\n" + candidato.getSexo()+"\n"+candidato.getVagaDesejada());
         */

    }//GEN-LAST:event_jButton_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JCheckBox jCheckBox_faxineiro;
    private javax.swing.JCheckBox jCheckBox_montador;
    private javax.swing.JCheckBox jCheckBox_operadorMaquinas;
    private javax.swing.JCheckBox jCheckBox_secretario;
    private javax.swing.JCheckBox jCheckBox_soldador;
    private javax.swing.JCheckBox jCheckBox_torneiro;
    private javax.swing.JCheckBox jCheckBox_vendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton_feminino;
    private javax.swing.JRadioButton jRadioButton_masculino;
    private javax.swing.JRadioButton jRadioButton_outros;
    private javax.swing.JTextField jTextField_cidade;
    private javax.swing.JTextField jTextField_cpf;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_idade;
    private javax.swing.JTextField jTextField_nacionalidade;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTextField_sobrenome;
    private javax.swing.JTextField jTextField_telefone;
    // End of variables declaration//GEN-END:variables
}
