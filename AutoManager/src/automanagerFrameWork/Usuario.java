
package automanagerFrameWork;


public class Usuario {

    String senha;
    String username;
    Integer idUser;

    public Usuario(String username, String senha)
    {
        this.username = username;
        this.senha = senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    public String getSenha()
    {
        return senha;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return username;
    }

    public void setIdUser(Integer idUser)
    {
        this.idUser = idUser;
    }
    public Integer getIdUser()
    {
        return idUser;
    }
}
