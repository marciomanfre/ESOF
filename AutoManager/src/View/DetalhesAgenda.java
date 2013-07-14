

package View;

import model.NumeroEvento;
import model.UsuarioLogado;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.*;
import persistencia.Persistencia;


public class DetalhesAgenda extends javax.swing.JFrame {
    int cont = 0;
    int imp = 0;
    public DetalhesAgenda() {
        this.setLocationRelativeTo(null);
        initComponents();
        preencherCampos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID do Evento");

        jLabel2.setText("Hora:");

        jLabel3.setText("Local:");

        jLabel4.setText("Urgência:");

        jLabel5.setText("Tipo:");

        jLabel6.setText("Nome:");

        jLabel7.setText("Assunto:");

        jLabel8.setText("Nome aniversariante:");

        jLabel9.setText("Descrição:");

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Data:");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Urgente");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Moderado");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Não Urgente");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTextField4)
                                                        .addGap(64, 64, 64)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9)))
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8)
                            .addComponent(jTextField7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jRadioButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton3)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void preencherCampos(){
       jTextField1.setText(String.valueOf(NumeroEvento.getNumero()));
       jTextField1.setEnabled(false);
       int codigo = Integer.parseInt(jTextField1.getText());
       String hora = jTextField3.getText();
       String local = jTextField4.getText();
       String importancia = null;
       String descricao  = jTextArea1.getText();
       try{
          Persistencia p = new Persistencia().getInstancia();
          ArrayList<Aniversario> aniversarios = new ArrayList();
          aniversarios = (ArrayList<Aniversario>)p.select("Select a FROM Aniversario a");
          for(Aniversario a:aniversarios){
             if(a.getIdevento() == NumeroEvento.getNumero()){
                jTextField2.setText("Aniversário");
                jTextField3.setText(a.getHora());
                jTextField4.setText(a.getLocal());
                if(a.getImportancia().equals("Urgente"))
                   jRadioButton1.setSelected(true);
                if(a.getImportancia().equals("Moderado"))
                   jRadioButton2.setSelected(true);
                if(a.getImportancia().equals("Não Urgente"))
                   jRadioButton3.setSelected(true);
                jTextField8.setText(a.getAniversariante());
                jTextArea1.setText(a.getDescricao());
                Date data = a.getData();
                SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
                jTextField9.setText(formataData.format(data));
                cont = 1;
             }
          }
          ArrayList<Reuniao> reunioes = new ArrayList();
          reunioes = (ArrayList<Reuniao>)p.select("Select r FROM Reuniao r");
          for(Reuniao r: reunioes){
             if(r.getIdevento()== NumeroEvento.getNumero()){
                jTextField2.setText("Reunião");
                jTextField3.setText(r.getHora());
                jTextField4.setText(r.getLocal());
                if(r.getImportancia().equals("Urgente"))
                   jRadioButton1.setSelected(true);
                if(r.getImportancia().equals("Moderado"))
                   jRadioButton2.setSelected(true);
                if(r.getImportancia().equals("Não Urgente"))
                  jRadioButton3.setSelected(true);
                
                jTextField7.setText(r.getAssunto());
                jTextArea1.setText(r.getDescricao());
                Date data = r.getData();
                SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
                jTextField9.setText(formataData.format(data));
                cont = 2;
             }
          }
          ArrayList<Outroagenda> outros = new ArrayList();
          outros = (ArrayList<Outroagenda>)p.select("Select o FROM Outroagenda o");
          for(Outroagenda o: outros){
             if(o.getIdevento()==NumeroEvento.getNumero()){
                jTextField2.setText("Outros");
                jTextField3.setText(o.getHora());
                jTextField4.setText(o.getLocal());
                if(o.getImportancia().equals("Urgente")){
                   jRadioButton1.setSelected(true);
                   imp = 1;
                }
                if(o.getImportancia().equals("Moderado")){
                   jRadioButton2.setSelected(true);
                   imp = 2;
                }
                if(o.getImportancia().equals("Não Urgente")){
                   jRadioButton3.setSelected(true);
                   imp = 3;
                }
                jTextField6.setText(o.getNome());
                jTextArea1.setText(o.getDescricao());
                Date data = o.getData();
                SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
                jTextField9.setText(formataData.format(data));
                cont = 3;
             }
          }
             
             jTextField2.setEnabled(false);
             if(cont ==1){
                jTextField6.setEnabled(false);
                jTextField7.setEnabled(false);
             }
             if(cont == 2){
                jTextField6.setEnabled(false);
                jTextField8.setEnabled(false);
             }
             if(cont == 3){
                jTextField7.setEnabled(false);
                jTextField8.setEnabled(false);
             }
                
          
          
          
       }catch(Exception e){
          
       }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Agenda agenda = new Agenda();
        String[] args = null;
        dispose();
        agenda.main(args);
    }//GEN-LAST:event_jButton2ActionPerformed

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try{
      Persistencia p = new Persistencia().getInstancia();
      int op = JOptionPane.showConfirmDialog(null,"Deseja realmente remover o Evento?");
            if(op == JOptionPane.YES_OPTION){
      p.delete(p.selectObj(Integer.parseInt(jTextField1.getText())));
      JOptionPane.showMessageDialog(null,"Item Excluido com sucesso com sucesso!");
      Agenda agenda = new Agenda();
      String[] args = null;
      this.dispose();
      agenda.main(args);
            }
      
   }catch(Exception e){
      e.printStackTrace();
   }
   }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
    String descricao = jTextArea1.getText();
    String hora = jTextField3.getText();
    String importancia = null;
    if(imp == 1) 
       importancia = "Urgente";
    if(imp == 2)
       importancia = "Moderado";
    if(imp == 3)
       importancia = "Não Urgente";
    
    String local = jTextField4.getText();
    String codigo = jTextField1.getText();
    String tipo = jTextField2.getText();
    int id = Integer.parseInt(jTextField1.getText());
    Usuario u = new Usuario();
    u.setUsername(UsuarioLogado.getUserName());
    u.setSenha(UsuarioLogado.getSenha());
    
    try{
         SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
         java.sql.Date data = new java.sql.Date(format.parse(jTextField9.getText()).getTime());
         Persistencia p = new Persistencia().getInstancia();
         FabricaEvento a = new FabricaAgenda();
    if(cont == 1){
        
        Aniversario niver = a.criaEventoAniversaio();
        niver.setAniversariante(jTextField8.getText());
        niver.setData(data);
        niver.setDescricao(descricao);
        niver.setIdevento(id);
        niver.setImportancia(importancia);
        niver.setHora(hora);
        niver.setLocal(local);
        niver.setUsuario(u);
        p.update(niver);
        JOptionPane.showMessageDialog(null,"Evento alterado com sucesso com sucesso!");
       Agenda agenda = new Agenda();
       String[] args = null;
       this.dispose();
       agenda.main(args);
        
    }
    
    if(cont == 2){
        Reuniao reuniao = a.criaEventoReuniao();
        reuniao.setData(data);
        reuniao.setDescricao(descricao);
        reuniao.setIdevento(id);
        reuniao.setImportancia(importancia);
        reuniao.setLocal(local);
        reuniao.setHora(hora);
        reuniao.setAssunto(jTextField7.getText());
        reuniao.setUsuario(u);
        p.update(reuniao);
        JOptionPane.showMessageDialog(null,"Evento alterado com sucesso com sucesso!");
       Agenda agenda = new Agenda();
       String[] args = null;
       this.dispose();
       agenda.main(args);
    }
    
    if(cont == 3){
        Outroagenda outro = a.criaEventoOutroAgenda();
        outro.setData(data);
        outro.setDescricao(descricao);
        outro.setIdevento(id);
        outro.setImportancia(importancia);
        outro.setLocal(local);
        outro.setHora(hora);
        outro.setNome(jTextField6.getText());
        outro.setUsuario(u);
        
        p.update(outro);
       JOptionPane.showMessageDialog(null,"Evento alterado com sucesso com sucesso!");
       Agenda agenda = new Agenda();
       String[] args = null;
       this.dispose();
       agenda.main(args);
    }

    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Erro ao fazer a alteracao","Erro",JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
      
    }// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

   private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
   imp = 1; 
   
   }//GEN-LAST:event_jRadioButton1ActionPerformed

   private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
   imp = 2;      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton2ActionPerformed

   private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
   imp = 3;      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetalhesAgenda da = new DetalhesAgenda();
                da.setVisible(true);
                da.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
