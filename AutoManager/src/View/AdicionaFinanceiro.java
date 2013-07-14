

package View;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Compra;
import model.Conta;
import model.Deposito;
import model.FabricaEvento;
import model.FabricaFinanceiro;
import model.Outrofinanceiro;
import model.Usuario;
import model.UsuarioLogado;
import persistencia.Persistencia;


public class AdicionaFinanceiro extends javax.swing.JFrame {

    int tipo = 0;
    int imp = 0;
    int id = 0;
    

    public AdicionaFinanceiro() {
        this.setLocationRelativeTo(null);
        try{
           Persistencia persitencia = new Persistencia().getInstancia();
           id = persitencia.select("SELECT a FROM Conta a").size() + persitencia.select("SELECT a FROM Compra a").size() + persitencia.select("SELECT a FROM Outrofinanceiro a").size() + persitencia.select("SELECT a FROM Deposito a").size() ;
        }catch(Exception e){
           
        }
        initComponents();
        jTextField1.setEnabled(false);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escolha o tipo de Evento a ser adicionado:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Compra");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Conta");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Depósito");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Outro");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        jLabel2.setText("Hora:");

        jLabel3.setText("Local:");

        jLabel8.setText("Valor:");

        jLabel7.setText("Conta:");

        jLabel9.setText("Nome:");

        jLabel4.setText("Descrição:");

        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Importância:");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Moderado");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Urgente");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("Não Urgente");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jButton1.setText("Cancela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel10.setText("Banco:");

        jLabel11.setText("Agência:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(115, 115, 115))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jRadioButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
            Persistencia persistencia = new Persistencia().getInstancia();
            FabricaEvento a = new FabricaFinanceiro();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data = new java.sql.Date(format.parse(jTextField7.getText()).getTime());
            Date data1 = new Date();
            data1 = data;
            String descricao = jTextArea1.getText();
            int Idevento = Integer.parseInt(jTextField1.getText());
            String local = jTextField4.getText();
            String hora = jTextField3.getText();
            String importancia = null;
            if(imp ==1)
                importancia = "Urgente";
            if(imp == 2)
                importancia = "Moderado";
            if(imp == 3)
                importancia = "Não Urgente";
            Usuario u = new Usuario();
            u.setUsername(UsuarioLogado.getUserName());
            u.setSenha(UsuarioLogado.getSenha());
            
        if(tipo == 1){
            
            Compra compra = a.criaEventoCompra();
            compra.setValor(Double.parseDouble(jTextField5.getText()));
            compra.setData(data1);
            compra.setDescricao(descricao);
            compra.setHora(hora);
            compra.setIdevento(Idevento);
            compra.setImportancia(importancia);
            compra.setLocal(local);
            compra.setUsuario(u);
            try{
                persistencia.insert(compra);
                JOptionPane.showMessageDialog(null,"Compra cadastrada com sucesso!");
                Financeiro financeiro = new Financeiro();
                String[] args = null;
                this.dispose();
                financeiro.main(args);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Erro ao inserir nova Compra", "Erro",JOptionPane.ERROR_MESSAGE);
                }
        }
            if(tipo == 2){
                Conta conta = a.criaEventoConta();
                conta.setValor(Double.parseDouble(jTextField5.getText()));
                conta.setData(data1);
                conta.setHora(hora);
                conta.setDescricao(descricao);
                conta.setIdevento(Idevento);
                conta.setImportancia(importancia);
                conta.setLocal(local);
                conta.setUsuario(u);
                try{
                    persistencia.insert(conta);
                    JOptionPane.showMessageDialog(null,"Conta cadastrada com sucesso!");
                    Financeiro financeiro = new Financeiro();
                    String[] args = null;
                    this.dispose();
                    financeiro.main(args);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Erro ao inserir nova Conta", "Erro",JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
            if(tipo == 3){
                Deposito deposito = a.criaEventoDeposito();
                deposito.setData(data1);
                deposito.setDescricao(descricao);
                deposito.setHora(hora);
                deposito.setIdevento(Idevento);
                deposito.setImportancia(importancia);
                deposito.setLocal(local);
                deposito.setUsuario(u);
                deposito.setConta(jTextField2.getText());
                deposito.setAgencia(jTextField8.getText());
                deposito.setBanco(jTextField7.getText());
                deposito.setValor(Double.parseDouble(jTextField5.getText()));
                try{
                    persistencia.insert(deposito);
                    JOptionPane.showMessageDialog(null,"Deposito cadastrado com sucesso!");
                    Financeiro financeiro = new Financeiro();
                    String[] args = null;
                     this.dispose();
                    financeiro.main(args);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Erro ao cadastrar Deposito ","Erro",JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
                
          if(tipo == 4){
                Outrofinanceiro of = a.criaEventoOutroFin();
                of.setData(data1);
                of.setDescricao(descricao);
                of.setHora(hora);
                of.setIdevento(Idevento);
                of.setImportancia(importancia);
                of.setLocal(local);
                of.setUsuario(u);
                of.setNome(jTextField6.getText());
                try{
                    persistencia.insert(deposito);
                    JOptionPane.showMessageDialog(null,"Outros compromissos cadastrado com sucesso!");
                    Financeiro financeiro = new Financeiro();
                    String[] args = null;
                     this.dispose();
                    financeiro.main(args);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Erro ao cadastrar Outros compromissos","Erro",JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
           
        }
        }catch(Exception e){
            
        }
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Financeiro financeiro = new Financeiro();
        String[] args = null;
        dispose();
        financeiro.main(args);
}//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        tipo = 1;
        
        jTextField5.setEnabled(true);
        jTextField2.setEnabled(false);
        jTextField8.setEnabled(false);
        jTextField7.setEnabled(false);
        jTextField6.setEnabled(false);
        
        try{
            Persistencia persitencia = new Persistencia().getInstancia();
            id = persitencia.maxChave()+1;
              //id = persitencia.select("SELECT a FROM Aniversario a").size() + persitencia.select("SELECT a FROM Reuniao a").size() + persitencia.select("SELECT a FROM Outroagenda a").size() + 1  ;
            jTextField1.setText(String.valueOf(id));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        tipo = 2;
        
        jTextField5.setEnabled(true);
        jTextField2.setEnabled(false);
        jTextField8.setEnabled(false);
        jTextField7.setEnabled(false);
        jTextField6.setEnabled(false);
        
        try{
            Persistencia persitencia = new Persistencia().getInstancia();
            id = persitencia.maxChave()+1;
              //id = persitencia.select("SELECT a FROM Aniversario a").size() + persitencia.select("SELECT a FROM Reuniao a").size() + persitencia.select("SELECT a FROM Outroagenda a").size() + 1  ;
            jTextField1.setText(String.valueOf(id));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        tipo = 3;
        
        jTextField5.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField8.setEnabled(true);
        jTextField7.setEnabled(true);
        jTextField6.setEnabled(false);
        
        try{
            Persistencia persitencia = new Persistencia().getInstancia();
            id = persitencia.maxChave()+1;
              //id = persitencia.select("SELECT a FROM Aniversario a").size() + persitencia.select("SELECT a FROM Reuniao a").size() + persitencia.select("SELECT a FROM Outroagenda a").size() + 1  ;
            jTextField1.setText(String.valueOf(id));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        tipo = 4;
        
        jTextField5.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField8.setEnabled(false);
        jTextField7.setEnabled(false);
        jTextField6.setEnabled(true);
        
        try{
            Persistencia persitencia = new Persistencia().getInstancia();
            id = persitencia.maxChave()+1;
              //id = persitencia.select("SELECT a FROM Aniversario a").size() + persitencia.select("SELECT a FROM Reuniao a").size() + persitencia.select("SELECT a FROM Outroagenda a").size() + 1  ;
            jTextField1.setText(String.valueOf(id));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        imp = 1;
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        imp = 2;
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        imp = 3;
    }//GEN-LAST:event_jRadioButton7ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdicionaFinanceiro af = new AdicionaFinanceiro();
                af.setVisible(true);
                af.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
