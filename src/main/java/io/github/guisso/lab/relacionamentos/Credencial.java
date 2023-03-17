package io.github.guisso.lab.relacionamentos;

/**
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 */
public class Credencial {

    private String email;
    private String senha;
    private Pessoa pessoa;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Credencial() {
    }

    public Credencial(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getSenha() {
//        return senha;
//    }
    public void setSenha(String senha) {
        this.senha = senha.replace("a", "4");
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    //</editor-fold>

    public Boolean autenticar() {
//        if (email == "luis@mail.com"
//                && senha == "asdf123") {

//        if (email.equals("luis@mail.com")
//                && senha.equals("asdf123")) {
//            return true;
//        } else {
//            return false;
//        }
        return email.equals("luis@mail.com")
                && senha.equals("asdf123");
    }

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "Credencial{"
                + "email=" + email
                + ", senha=" + senha
                + '}';
    }
    //</editor-fold>

}
