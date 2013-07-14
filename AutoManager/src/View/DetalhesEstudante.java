

package View;

import model.NumeroEvento;
import model.UsuarioLogado;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.*;
import persistencia.Persistencia;


public class DetalhesEstudante extends javax.swing.JFrame {
    int cont = 0;
    int imp = 0;

    public DetalhesEstudante() {
        this.setLocationRelativeTo(null);
        initComponents();
        preencherCampos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Evento: ");

        jLabel3.setText("Local:");

        jLabel10.setText("Matéria:");

        jLabel2.setText("Hora:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setText("Descrição:");

        jLabel8.setText("Assunto:");

        jLabel7.setText("Nota:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setText("Urgência:");

        jLabel11.setText("Tipo:");

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Urgente");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Moderado");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Sem Urgência");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Data: ");

        jLabel12.setText("DD/MM/AAAA");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(24, 24, 24)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)
                                    .addComponent(jButton3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)))
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void preencherCampos(){
       jTextField1.setText(String.valueOf(NumeroEvento.getNumero()));
       jTextField1.setEnabled(false);
       jTextField8.setEnabled(false);
       int codigo = Integer.parseInt(jTextField1.getText());
       String hora = jTextField3.getText();
       String local = jTextField4.getText();
       String importancia = null;
       String descricao  = jTextArea1.getText();
       String materia = jTextArea2.getText();
       String assunto = jTextField7.getText();
       try{
          Persistencia p = new Persistencia().getInstancia();
          ArrayList<Trabalho> trabs = new ArrayList();
          trabs = (ArrayList<Trabalho>)p.select("Select t FROM Trabalho t");
          for(Trabalho t:trabs){
             if(t.getIdevento() == NumeroEvento.getNumero()){
                jTextField8.setText("Trabalho");
                jTextField3.setText(t.getHora());
                jTextField4.setText(t.getLocal());
               
                if(t.getImportancia().equals("Urgente"))
                {
                   jRadioButton1.setSelected(true);
                   imp = 1;
                }
                if(t.getImportancia().equals("Moderado"))
                {
                   jRadioButton2.setSelected(true);
                   imp = 2;
                }
                if(t.getImportancia().equals("Não Urgente"))
                {
                   jRadioButton3.setSelected(true);
                   imp = 3;
                }
                jTextField5.setText(String.valueOf(t.getNota()));
                jTextArea1.setText(t.getDescricao());
                jTextField7.setText(t.getAssunto());
                Date data = t.getData();
                SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
                jTextField6.setText(formataData.format(data));
                cont = 1;
             }
          }
          ArrayList<Prova> provas = new ArrayList();
          provas = (ArrayList<Prova>)p.select("Select p FROM Prova p");
          for(Prova p1: provas){
             if(p1.getIdevento()== NumeroEvento.getNumero()){
                jTextField8.setText("Prova");
                jTextField3.setText(p1.getHora());
                jTextField4.setText(p1.getLocal());
                if(p1.getImportancia().equals("Urgente"))
                   jRadioButton1.setSelected(true);
                if(p1.getImportancia().equals("Moderado"))
                   jRadioButton2.setSelected(true);
                if(p1.getImportancia().equals("Não Urgente"))
                  jRadioButton3.setSelected(true);
                
                jTextField5.setText(String.valueOf(p1.getNota()));
                jTextArea1.setText(p1.getDescricao());
                jTextArea2.setText(p1.getMateria());
                Date data = p1.getData();
                SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
                jTextField6.setText(formataData.format(data));
                cont = 2;
             }
          }
          ArrayList<Seminario> semis = new ArrayList();
          semis = (ArrayList<Seminario>)p.select("Select s FROM Seminario s");
          for(Seminario s: semis){
             if(s.getIdevento()==NumeroEvento.getNumero()){
                jTextField8.setText("Seminario");
                jTextField3.setText(s.getHora());
                jTextField4.setText(s.getLocal());
                if(s.getImportancia().equals("Urgente")){
                   jRadioButton1.setSelected(true);
                   
                }
                if(s.getImportancia().equals("Moderado")){
                   jRadioButton2.setSelected(true);
                   
                }
                if(s.getImportancia().equals("Não Urgente")){
                   jRadioButton3.setSelected(true);
                  
                }
                jTextField5.setText(s.getAssunto());
                jTextArea1.setText(s.getDescricao());
                jTextField5.setText(String.valueOf(s.getNota()));
                Date data = s.getData();
                SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
                jTextField6.setText(formataData.format(data));
                cont = 3;
                
             }
          }
             
             
             if(cont ==1){
                jTextArea2.setEnabled(false);
             }
             if(cont == 2){
                jTextField7.setEnabled(false);
             }
             if(cont == 3){
                jTextArea2.setEnabled(false);
             }
                
          
          
          
       }catch(Exception e){
          
       }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Estudante estudante = new Estudante();
        String[] args = null;
        dispose();
        estudante.main(args);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
      Persistencia p = new Persistencia().getInstancia();
      int op = JOptionPane.showConfirmDialog(null,"Deseja realmente remover o Evento?");
            if(op == JOptionPane.YES_OPTION){
      p.delete(p.selectObjEst(Integer.parseInt(jTextField1.getText())));
      JOptionPane.showMessageDialog(null,"Item Excluido com sucesso com sucesso!");
      Estudante est = new Estudante();
      String[] args = null;
      this.dispose();
      est.main(args);
            }
      
   }catch(Exception e){
      e.printStackTrace();
   }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int id = Integer.parseInt(jTextField1.getText()); 
    String tipo = jTextField8.getText();
    String hora = jTextField3.getText();
    
    String materia = jTextArea2.getText();
    String descricao = jTextArea1.getText();
    String local = jTextField4.getText();
    double nota = Double.parseDouble(jTextField5.getText());
    String assunto = jTextField8.getText();
    String importancia = null;
    if(imp == 1) 
       importancia = "Urgente";
    if(imp == 2)
       importancia = "Moderado";
    if(imp == 3)
       importancia = "Não Urgente";
    Usuario u = new Usuario();
    u.setUsername(UsuarioLogado.getUserName());
    u.setSenha(UsuarioLogado.getSenha());
    FabricaEvento a = new FabricaEstudante();
    
    try{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
         java.sql.Date data = new java.sql.Date(format.parse(jTextField6.getText()).getTime());
         Persistencia p = new Persistencia().getInstancia();
         
         if(cont == 1){
             Trabalho t = a.criaEventoTrabalho();
             t.setAssunto(assunto);
             t.setData(data);
             t.setDescricao(descricao);
             t.setHora(hora);
             t.setIdevento(id);
             t.setImportancia(importancia);
             t.setLocal(local);
             t.setNota(nota);
             t.setUsuario(u);
             p.update(t);
             JOptionPane.showMessageDialog(null,"Evento alterado com sucesso com sucesso!");
             Estudante est = new Estudante();
             String[] args = null;
             this.dispose();
             est.main(args);
            }
         if(cont == 2){
             Prova prova = a.criaEventoProva();
             prova.setData(data);
             prova.setDescricao(descricao);
             prova.setHora(hora);
             prova.setIdevento(id);
             prova.setImportancia(importancia);
             prova.setLocal(local);
             prova.setMateria(materia);
             prova.setNota(nota);
             prova.setUsuario(u);
             p.update(prova);
             JOptionPane.showMessageDialog(null,"Evento alterado com sucesso com sucesso!");
             Estudante est = new Estudante();
             String[] args = null;
             this.dispose();
             est.main(args);
         }
         
         if(cont == 3){
             Seminario sem = a.criaEventoSeminario();
             sem.setAssunto(assunto);
             sem.setData(data);
             sem.setDescricao(descricao);
             sem.setHora(hora);
             sem.setIdevento(id);
             sem.setImportancia(importancia);
             sem.setLocal(local);
             sem.setNota(nota);
             sem.setUsuario(u);
             p.update(sem);
             JOptionPane.showMessageDialog(null,"Evento alterado com sucesso com sucesso!");
             Estudante est = new Estudante();
             String[] args = null;
             this.dispose();
             est.main(args);
             
         }
         
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Erro ao fazer a alteracao","Erro",JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    imp = 1;
    // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    imp = 2;        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    imp = 3;        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetalhesEstudante de = new DetalhesEstudante();
                de.setVisible(true);
                de.setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
