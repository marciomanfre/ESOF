
package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import model.Usuario;
import model.UsuarioLogado;
import persistencia.Persistencia;


public class LoginFrame extends javax.swing.JFrame {
    
   
    public LoginFrame() {
        initComponents();
    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><b>BEM VINDO");

        jLabel2.setText("Login: ");

        jLabel3.setText("Senha: ");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    CadastrarFrame cf = new CadastrarFrame();
    cf.setVisible(true);
    cf.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Usuario u = new Usuario();
    
    int cont = 0;
    try{
        Persistencia persistencia = new Persistencia().getInstancia();
        ArrayList<Usuario> usuarios = new ArrayList();
        usuarios = (ArrayList<Usuario>)persistencia.select("Select u FROM Usuario u");
        String login = jTextField1.getText();
        String senha = jPasswordField1.getText();
        for(Usuario u1: usuarios)
            if(u1.getUsername().equals(login) && u1.getSenha().equals(senha)){
                new UsuarioLogado().setUserName(u1.getUsername());
                cont =1;
                
            }
        
    }catch(Exception e){
        
    }
    if(cont ==1){
        JanelaProgramas jp = new JanelaProgramas();
        jp.main(null);
        this.dispose();
    }
    else{
        JOptionPane.showMessageDialog(null,"Login e senha Inválidos!", "Erro",JOptionPane.ERROR_MESSAGE);
        jTextField1.setText("");
        jPasswordField1.setText("");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
      
    try {
         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
     }catch (Exception ex) {
         ex.printStackTrace();
     }
     java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try{
                    new Persistencia().getInstancia();
                }catch(Exception e){
                    
                }
                LoginFrame lf = new LoginFrame();
                lf.setVisible(true);
                lf.setLocationRelativeTo(null);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
