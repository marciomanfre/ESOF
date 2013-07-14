

package View;


import model.NumeroEvento;
import model.UsuarioLogado;
import automanagerFrameWork.Evento;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.*;
import persistencia.Persistencia;


public class Agenda extends javax.swing.JFrame {

   private PintarLinhasTabela renderer = new PintarLinhasTabela();
    int opcao = 0;
    int selecao =0;
    int codigoEvento = 0;

    public Agenda() {
        this.setLocationRelativeTo(null);
        initComponents();
        preencherTable();
        
        jButton5.setVisible(false);
        
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton1.setText("Adicionar Compromisso");
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

        jButton4.setText("Retornar para Janela de programas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Aniversário");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Reunião");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Outro");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Defina os tipos de eventos a serem exibidos:");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Todos");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Ver detalhes");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel1)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jButton4))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addGap(61, 61, 61)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void preencherTable(){
       
       try{
           Persistencia persistencia = new Persistencia().getInstancia();
            String username = UsuarioLogado.getUserName();
           // ArrayList<Aniversario> aniversarios = (ArrayList<Aniversario>)persistencia.select("SELECT MAX a.idevento FROM Aniversario a WHERE a.usuario.username LIKE '"+username+"'");
         //   ArrayList<Reuniao> reunioes = (ArrayList<Reuniao>)persistencia.select("SELECT r.idevento FROM Reuniao r WHERE r.usuario.username LIKE '"+username+"'");
          //  ArrayList<Outroagenda> outrosagenda = (ArrayList<Outroagenda>)persistencia.select("SELECT o FROM Outroagenda o WHERE o.usuario.username LIKE '"+username+"'");
            
           int total = persistencia.maxChave();
            
            ArrayList<Aniversario> aniversario = new ArrayList();
            ArrayList<Reuniao> reuniao = new ArrayList();
            ArrayList<Outroagenda> outroagenda = new ArrayList();
            
           if(selecao == 0 ){
           aniversario = (ArrayList<Aniversario>)persistencia.select("SELECT a FROM Aniversario a WHERE a.usuario.username LIKE '"+username+"'");
           reuniao = (ArrayList<Reuniao>)persistencia.select("SELECT r FROM Reuniao r WHERE r.usuario.username LIKE '"+username+"'");
           outroagenda = (ArrayList<Outroagenda>)persistencia.select("SELECT o FROM Outroagenda o WHERE o.usuario.username LIKE '"+username+"'");
           }
           if (selecao == 1){
               aniversario = (ArrayList<Aniversario>)persistencia.select("SELECT a FROM Aniversario a WHERE a.usuario.username LIKE '"+username+"'");
           }
           if(selecao == 2){
              reuniao = (ArrayList<Reuniao>)persistencia.select("SELECT r FROM Reuniao r WHERE r.usuario.username LIKE '"+username+"'");
           }
           if(selecao == 3){
              outroagenda = (ArrayList<Outroagenda>)persistencia.select("SELECT o FROM Outroagenda o WHERE o.usuario.username LIKE '"+username+"'");
           }
           DefaultTableModel dtmc = new DefaultTableModel();
           dtmc.addColumn("Id Evento");
           dtmc.addColumn("Data/Hora");
           dtmc.addColumn("Urgência");
           dtmc.addColumn("Tipo");
           SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
           
           
           
           for(int i =1; i<= total;i++){
              for(Aniversario a: aniversario){
              if(a.getIdevento() == i){
                 Object[] linha = new Object[4];
                 linha[0] = a.getIdevento();
                 if(formataData.format(a.getData()).toString().equals(formataData.format(new Date(System.currentTimeMillis())).toString()))
                   linha[1] = a.getHora();
                 else
                     linha[1] = formataData.format(a.getData());
                 linha[2] = a.getImportancia();
                 linha[3] = "Aniversario";
                 dtmc.addRow(linha);
              }}
              for(Reuniao r: reuniao){
              if(r.getIdevento() == i){
                 Object[] linha = new Object[4];
                 linha[0] = r.getIdevento();
                 if(formataData.format(r.getData()).toString().equals(formataData.format((new Date(System.currentTimeMillis()))).toString()))
                    linha[1] = r.getHora();
                 else
                     linha[1] = formataData.format(r.getData());
                 linha[2] = r.getImportancia();
                 linha[3] = "Reunião";
                 dtmc.addRow(linha); 
              }}
              for(Outroagenda o: outroagenda){
              if(o.getIdevento() == i){
                 Object[] linha = new Object[4];
                 linha[0] = o.getIdevento();
                 if(formataData.format(o.getData()).toString().equals(formataData.format((new Date(System.currentTimeMillis()))).toString()))
                    linha[1] = o.getHora();
                 else
                     linha[1] = formataData.format(o.getData());
                 linha[2] = o.getImportancia();
                 linha[3] = "Outros";
                 dtmc.addRow(linha);
              }}
              jTable1.setModel(dtmc);
              colorTable();
           
           }
           
       }catch(Exception e){
          e.printStackTrace();
       }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JanelaProgramas janela = new JanelaProgramas();
        String[] args = null;
        dispose();
        janela.main(args);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        AdicionaAgenda adiciona = new AdicionaAgenda();
        String[] args = null;
        dispose();
        adiciona.main(args);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       selecao = 1;
       preencherTable();
      jTable1.repaint();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       selecao = 2;
       preencherTable();
      jTable1.repaint();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

   private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
   selecao = 3;
   preencherTable();
   jTable1.repaint();// TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton3ActionPerformed

   private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
   selecao = 0;
   preencherTable();
   jTable1.repaint();// TODO add your handling code here:
   }//GEN-LAST:event_jRadioButton4ActionPerformed

   private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   selectClick();
   jButton5.setVisible(true);// TODO add your handling code here:
   }//GEN-LAST:event_jTable1MouseClicked

   private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed


      DetalhesAgenda detalhes = new DetalhesAgenda();
      String[] args = null;
      dispose();
      detalhes.main(args);
   
}//GEN-LAST:event_jButton5ActionPerformed

   private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_formMouseClicked
   
   public void selectClick(){
       DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
       int row = jTable1.getSelectedRow();
       codigoEvento = Integer.parseInt((tableModel.getValueAt(row,0)).toString());
       NumeroEvento.setNumero(codigoEvento);
   }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agenda a = new Agenda();
                a.setVisible(true);
                a.setLocationRelativeTo(null);
            }
        });
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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