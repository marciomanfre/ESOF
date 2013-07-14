
package View;

import model.UsuarioLogado;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.*;
import persistencia.Persistencia;


public class AdicionaAgenda extends javax.swing.JFrame {
    
    int tipo = 0;
    int imp = 0;
    int id = 0;
    
    

    public AdicionaAgenda() {
        this.setLocationRelativeTo(null);
        try{
           Persistencia persitencia = new Persistencia().getInstancia();
           id = persitencia.select("SELECT a FROM Aniversario a").size() + persitencia.select("SELECT a FROM Reuniao a").size() + persitencia.select("SELECT a FROM Outroagenda a").size() ;
        }catch(Exception e){
           
        }
        initComponents();
        jTextField1.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escolha o tipo de Evento a ser adicionado:");

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Aniversário");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Reunião");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Outro");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Hora:");

        jLabel3.setText("Local:");

        jLabel4.setText("Descrição:");

        jLabel5.setText("ID:");

        jLabel6.setText("Importância:");

        jLabel7.setText("Nome aniversariante:");

        jLabel8.setText("Assunto:");

        jLabel9.setText("Nome:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Urgente");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Moderado");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Não Urgente");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Cancela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Data:");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel11.setText("DD/MM/AAAA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel2))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField3)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel10))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel11)))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel4)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(145, 145, 145)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField6)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(jTextField5)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jRadioButton4)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Agenda agenda = new Agenda();
        String[] args = null;
        dispose();
        agenda.main(args);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Persistencia persistencia = new Persistencia().getInstancia();
            FabricaEvento a = new FabricaAgenda();
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
            
            Aniversario niver = a.criaEventoAniversaio();
            niver.setAniversariante(jTextField2.getText());
            niver.setData(data1);
            niver.setDescricao(descricao);
            niver.setHora(hora);
            niver.setIdevento(Idevento);
            niver.setImportancia(importancia);
            niver.setLocal(local);
            niver.setUsuario(u);
            try{
                persistencia.insert(niver);
                JOptionPane.showMessageDialog(null,"Aniversário cadastrado com sucesso!");
                Agenda agenda = new Agenda();
                String[] args = null;
                this.dispose();
                agenda.main(args);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Erro ao inserir novo Aniversário", "Erro",JOptionPane.ERROR_MESSAGE);
                }
        }
            if(tipo == 2){
                Reuniao reuniao = a.criaEventoReuniao();
                reuniao.setAssunto(jTextField5.getText());
                reuniao.setData(data1);
                reuniao.setHora(hora);
                reuniao.setDescricao(descricao);
                reuniao.setIdevento(Idevento);
                reuniao.setImportancia(importancia);
                reuniao.setLocal(local);
                reuniao.setUsuario(u);
                try{
                    persistencia.insert(reuniao);
                    JOptionPane.showMessageDialog(null,"Reunião cadastrada com sucesso!");
                    Agenda agenda = new Agenda();
                    String[] args = null;
                    this.dispose();
                    agenda.main(args);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Erro ao inserir nova Reunião", "Erro",JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
            if(tipo == 3){
                Outroagenda oa = a.criaEventoOutroAgenda();
                oa.setData(data1);
                oa.setDescricao(descricao);
                oa.setHora(hora);
                oa.setIdevento(Idevento);
                oa.setImportancia(importancia);
                oa.setLocal(local);
                oa.setUsuario(u);
                oa.setNome(jTextField6.getText());
                try{
                    persistencia.insert(oa);
                    JOptionPane.showMessageDialog(null,"Outros compromissos cadastrado com sucesso!");
                    Agenda agenda = new Agenda();
                    String[] args = null;
                     this.dispose();
                    agenda.main(args);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Erro ao cadastrar Outros compromissos","Erro",JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
           
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        tipo = 1;
        jTextField2.setEnabled(true);
        jTextField5.setEnabled(false);
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
        jTextField2.setEnabled(false);
        jTextField5.setEnabled(true);
        jTextField6.setEnabled(false);
        try{
           Persistencia persitencia = new Persistencia().getInstancia(); 
          
               id = persitencia.maxChave()+1;
               //id = persitencia.select("SELECT a FROM Aniversario a").size() + persitencia.select("SELECT a FROM Reuniao a").size() + persitencia.select("SELECT a FROM Outroagenda a").size() + 1 ;
            
            jTextField1.setText(String.valueOf(id));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        tipo = 3;
        jTextField2.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField6.setEnabled(true);
        try{
            Persistencia persitencia = new Persistencia().getInstancia();
            
              id = persitencia.maxChave()+1;
               // id = persitencia.select("SELECT a FROM Aniversario a").size() + persitencia.select("SELECT a FROM Reuniao a").size() + persitencia.select("SELECT a FROM Outroagenda a").size() + 1 ;
            jTextField1.setText(String.valueOf(id));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
    imp = 1;        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
       imp =2; // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
    imp = 3;        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdicionaAgenda aa = new AdicionaAgenda();
                aa.setVisible(true);
                aa.setLocationRelativeTo(null);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
