

package View;

import model.NumeroEvento;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.*;
import model.UsuarioLogado;
import persistencia.Persistencia;


public class Estudante extends javax.swing.JFrame {
      private PintarLinhasTabela renderer = new PintarLinhasTabela();
      int opcao = 0;
      int selecao =0;
      int codigoEvento = 0;

    public Estudante() {
        this.setLocationRelativeTo(null);
        initComponents();
        preencherTable();
        jButton6.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    
    public void colorTable(){
        for(int i=0;i<jTable1.getRowCount();i++){
           if(jTable1.getValueAt(i,2).toString().equals("Moderado")){
              renderer.colorirCelula(i, 2, Color.BLUE);
              jTable1.getColumnModel().getColumn(2).setCellRenderer(renderer);
              
           }
           if(jTable1.getValueAt(i,2).toString().equals("Urgente")){
              renderer.colorirCelula(i, 2, Color.RED);
              jTable1.getColumnModel().getColumn(2).setCellRenderer(renderer);
               
           }
           if(jTable1.getValueAt(i,2).toString().equals("Não Urgente")){
              renderer.colorirCelula(i, 2, Color.GREEN);
              jTable1.getColumnModel().getColumn(2).setCellRenderer(renderer);
           }
           
               
        }
       
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setText("Add Compromisso");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Defina os tipos de eventos a serem exibidos:");

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

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Todos");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Retorna para janela de programas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Ver Detalhes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void preencherTable(){
       try{
          Persistencia p = new Persistencia().getInstancia();
          String username = UsuarioLogado.getUserName();
          int total = p.maxChaveEst();
            ArrayList<Trabalho> trabs = new ArrayList();
            ArrayList<Prova> provas = new ArrayList();
            ArrayList<Seminario> semis = new ArrayList();
            if(selecao == 0 ){
           trabs = (ArrayList<Trabalho>)p.select("SELECT t FROM Trabalho t WHERE t.usuario.username LIKE '"+username+"'");
           provas = (ArrayList<Prova>)p.select("SELECT p FROM Prova p WHERE p.usuario.username LIKE '"+username+"'");
           semis = (ArrayList<Seminario>)p.select("SELECT s FROM Seminario s WHERE s.usuario.username LIKE '"+username+"'");
           }
            
            if(selecao == 1){
               trabs = (ArrayList<Trabalho>)p.select("SELECT t FROM Trabalho t WHERE t.usuario.username LIKE '"+username+"'");
            }
            if(selecao == 2){
               provas = (ArrayList<Prova>)p.select("SELECT p FROM Prova p WHERE p.usuario.username LIKE '"+username+"'");
            }
            if(selecao == 3){
               semis = (ArrayList<Seminario>)p.select("SELECT s FROM Seminario s WHERE s.usuario.username LIKE '"+username+"'");
            }
            DefaultTableModel dtmc = new DefaultTableModel();
           dtmc.addColumn("Id Evento");
           dtmc.addColumn("Data/Hora");
           dtmc.addColumn("Urgência");
           dtmc.addColumn("Tipo");
           SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
           
           for(int i =1; i<= total;i++){
              for(Trabalho t: trabs){
              if(t.getIdevento() == i){
                 Object[] linha = new Object[4];
                 linha[0] = t.getIdevento();
                 if(formataData.format(t.getData()).toString().equals(formataData.format(new Date(System.currentTimeMillis())).toString()))
                   linha[1] = t.getHora();
                 else
                     linha[1] = formataData.format(t.getData());
                 linha[2] = t.getImportancia();
                 linha[3] = "Trabalho";
                 dtmc.addRow(linha);
                }
              }
              
              for(Prova p1: provas){
              if(p1.getIdevento() == i){
                 Object[] linha = new Object[4];
                 linha[0] = p1.getIdevento();
                 if(formataData.format(p1.getData()).toString().equals(formataData.format(new Date(System.currentTimeMillis())).toString()))
                   linha[1] = p1.getHora();
                 else
                     linha[1] = formataData.format(p1.getData());
                 linha[2] = p1.getImportancia();
                 linha[3] = "Prova";
                 dtmc.addRow(linha);
                 }
              for(Seminario s: semis){
              if(s.getIdevento() == i){
                 Object[] linha = new Object[4];
                 linha[0] = s.getIdevento();
                 if(formataData.format(s.getData()).toString().equals(formataData.format(new Date(System.currentTimeMillis())).toString()))
                   linha[1] = s.getHora();
                 else
                     linha[1] = formataData.format(s.getData());
                 linha[2] = s.getImportancia();
                 linha[3] = "Seminário";
                 dtmc.addRow(linha);
              }
              }
              }
              jTable1.setModel(dtmc);
              colorTable();
              
           }
           
       }catch(Exception e){
          e.printStackTrace();
       }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdicionaEstudante adiciona = new AdicionaEstudante();
        String[] args = null;
        dispose();
        adiciona.main(args);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JanelaProgramas janela = new JanelaProgramas();
        String[] args = null;
        dispose();
        janela.main(args);
    }//GEN-LAST:event_jButton5ActionPerformed

   private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
   selecao = 1;
       preencherTable();
      jTable1.repaint();      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton1ActionPerformed

   private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
   selecao = 2;
       preencherTable();
      jTable1.repaint();      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton2ActionPerformed

   private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
   selecao = 3;
       preencherTable();
      jTable1.repaint();      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton3ActionPerformed

   private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
   selecao = 0;
       preencherTable();
      jTable1.repaint();      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton4ActionPerformed

   private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   selectClick();
   jButton6.setVisible(true);      // TODO add your handling code here:
   }//GEN-LAST:event_jTable1MouseClicked

   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   DetalhesEstudante dest = new DetalhesEstudante();
   String[] args = null;
      dispose();
      dest.main(args);
   // TODO add your handling code here:
   }//GEN-LAST:event_jButton6ActionPerformed
 public void selectClick(){
       DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
       int row = jTable1.getSelectedRow();
       codigoEvento = Integer.parseInt((tableModel.getValueAt(row,0)).toString());
       NumeroEvento.setNumero(codigoEvento);
   }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Estudante e = new Estudante();
                e.setVisible(true);
                e.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
