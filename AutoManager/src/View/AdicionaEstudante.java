
package View;

import model.UsuarioLogado;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.*;
import persistencia.Persistencia;


public class AdicionaEstudante extends javax.swing.JFrame {
   int imp = 0;
   int tipo =0;
   int id =0;
    public AdicionaEstudante() {
        this.setLocationRelativeTo(null);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escolha o tipo de Evento a ser adicionado:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Trabalho");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Prova");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Seminário");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        jLabel2.setText("Hora:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Assunto:");

        jLabel7.setText("Nota:");

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

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Urgente");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Não Urgente");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
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
        jTextArea1.setText("\n");
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Matéria:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("\n\t");
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setText("Local:");

        jLabel11.setText("Data: ");

        jLabel12.setText("DD/MM/AAAA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel12))
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jRadioButton6))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
          Persistencia p = new Persistencia().getInstancia();SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
          FabricaEvento e = new FabricaEstudante();
            java.sql.Date data = new java.sql.Date(format.parse(jTextField7.getText()).getTime());
            Date data1 = new Date();
            data1 = data;
            String descricao = jTextArea1.getText();
            int Idevento = Integer.parseInt(jTextField1.getText());
            String local = jTextField4.getText();
            String hora = jTextField3.getText();
            String importancia = null;
            Double nota = Double.parseDouble(jTextField2.getText());
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
               
               Trabalho t = e.criaEventoTrabalho();
               t.setAssunto(jTextField5.getText());
               t.setData(data1);
               t.setDescricao(descricao);
               t.setIdevento(Idevento);
               t.setImportancia(importancia);
               t.setLocal(local);
               t.setUsuario(u);
               t.setNota(nota);
               t.setHora(hora);
               try{
                  p.insert(t);
                  JOptionPane.showMessageDialog(null,"Trabalho cadastrado com sucesso!");
                   Estudante estudante = new Estudante();
                   String[] args = null;
                   dispose();
                   estudante.main(args);
               }catch(Exception e3){
                  JOptionPane.showMessageDialog(null,"Erro ao inserir novo Trabalho", "Erro",JOptionPane.ERROR_MESSAGE);
               }
            }
               
               if(tipo == 2){
                  
                  Prova prova = e.criaEventoProva();
                  prova.setData(data1);
                  prova.setDescricao(descricao);
                  prova.setIdevento(Idevento);
                  prova.setImportancia(importancia);
                  prova.setLocal(local);
                  prova.setMateria(jTextArea2.getText());
                  prova.setNota(nota);
                  prova.setUsuario(u);
                  prova.setHora(hora);
                  
                  try{
                     p.insert(prova);
                     JOptionPane.showMessageDialog(null,"Prova cadastrado com sucesso!");
                   Estudante estudante = new Estudante();
                   String[] args = null;
                   dispose();
                   estudante.main(args);
                     
                  }catch(Exception e2){
                     JOptionPane.showMessageDialog(null,"Erro ao inserir nova Prova", "Erro",JOptionPane.ERROR_MESSAGE);
                     e2.printStackTrace();
                  }
               }
                  if(tipo == 3){
                     
                     Seminario sem = e.criaEventoSeminario();
                     sem.setAssunto(jTextField5.getText());
                     sem.setData(data1);
                     sem.setDescricao(descricao);
                     sem.setHora(hora);
                     sem.setIdevento(Idevento);
                     sem.setImportancia(importancia);
                     sem.setLocal(local);
                     sem.setNota(nota);
                     sem.setUsuario(u);
                     sem.setHora(hora);
                     try{
                        p.insert(sem);
                        JOptionPane.showMessageDialog(null,"Seminário cadastrado com sucesso!");
                         Estudante estudante = new Estudante();
                        String[] args = null;
                        dispose();
                         estudante.main(args);
                     }catch(Exception e4){
                        JOptionPane.showMessageDialog(null,"Erro ao inserir novo Seminário", "Erro",JOptionPane.ERROR_MESSAGE);
                     }
                  }
                 
               }catch(Exception e){
            }
            
          
       
       
       
           
        
        
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Estudante estudante = new Estudante();
        String[] args = null;
        dispose();
        estudante.main(args);
        
}//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        tipo = 1;
        jTextField2.setEnabled(true);
        jTextField5.setEnabled(true);
        jTextArea2.setEnabled(false);
        
        try{
            Persistencia persitencia = new Persistencia().getInstancia();
            
             id = persitencia.maxChaveEst()+1;
             // id = persitencia.select("SELECT t FROM Trabalho t").size() + persitencia.select("SELECT p FROM Prova p").size() + persitencia.select("SELECT s FROM Seminario s").size() + 1  ;
            jTextField1.setText(String.valueOf(id));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        tipo = 2;
        jTextField2.setEnabled(true);
        jTextField5.setEnabled(false);
        jTextArea2.setEnabled(true);
        
        try{
            Persistencia persitencia = new Persistencia().getInstancia();
           
             id = persitencia.maxChaveEst()+1;
              //id = persitencia.select("SELECT t FROM Trabalho t").size() + persitencia.select("SELECT p FROM Prova p").size() + persitencia.select("SELECT s FROM Seminario s").size() + 1  ;
            jTextField1.setText(String.valueOf(id));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        tipo =3;
        jTextField2.setEnabled(true);
        jTextField5.setEnabled(true);
        jTextArea2.setEnabled(false);
        
        try{
            Persistencia persitencia = new Persistencia().getInstancia();
            
             id = persitencia.maxChaveEst()+1;
             // id = persitencia.select("SELECT t FROM Trabalho t").size() + persitencia.select("SELECT p FROM Prova p").size() + persitencia.select("SELECT s FROM Seminario s").size() + 1  ;
            jTextField1.setText(String.valueOf(id));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

   private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jTextField3ActionPerformed

   private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jTextField2ActionPerformed

   private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
   imp = 1;      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton4ActionPerformed

   private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
   imp = 2;      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton5ActionPerformed

   private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
   imp =3;      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton6ActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdicionaEstudante ae = new AdicionaEstudante();
                ae.setVisible(true);
                ae.setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
