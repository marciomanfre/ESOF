/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MARCIO
 */
public class UsuarioLogado {
    private static String userName;
    private static String senha;

    /**
     * @return the senha
     */
    public static String getSenha() {
        return senha;
    }

    /**
     * @param aSenha the senha to set
     */
    public static void setSenha(String aSenha) {
        senha = aSenha;
    }
    public UsuarioLogado() {
    }
   
    
    /**
     * @return the userName
     */
    
    public static String getUserName() {
        return userName;
    }

    /**
     * @param aUserName the userName to set
     */
    public static void setUserName(String aUserName) {
        userName = aUserName;
    }

    /**
     * @return the senha
     */
   
    public static void setAll(Usuario u){
        
        userName = u.getUsername();
        setSenha(u.getSenha());
        
    }
}
