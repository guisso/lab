package io.github.guisso.lab.relacionamentos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 */
public class Pessoa {

    private String nome;
    private LocalDate nascimento;
    private Byte idade;
    private Credencial credencial;
    private Telefone[] telefones;
    private ArrayList<Endereco> enderecos;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Pessoa() {
//        this("Sem nome", LocalDate.now());
        telefones = new Telefone[3];
        enderecos = new ArrayList<>();
    }

    public Pessoa(String nome, LocalDate nascimento) {
        this();
        this.nome = nome;
        this.nascimento = nascimento;
//        telefones = new Telefone[3];
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome)
            throws Exception {
        if (nome.length() > 40) {
            throw new Exception("Nome não pode ter mais do que 40 caracteres");
        }

        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;

        idade = (byte) nascimento
                .until(
                        LocalDate.now(),
                        ChronoUnit.YEARS);
    }

    public Byte getIdade() {
        return idade;
    }

//    public void setIdade(Byte idade) {
//        this.idade = idade;
//    }
    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
        credencial.setPessoa(this);
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

//    public void setTelefones(Telefone[] telefones) {
//        this.telefones = telefones;
//    }
    
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Acesso aos telefones">
    public void adicionarTelefonePrimario(Telefone t) {
        telefones[0] = t;
        t.setPessoa(this);
    }

    public void removerTelefonePrimario() {
        telefones[0] = null;  // GC
//        System.gc();
//        adicionarTelefonePrimario(null);
    }

    public void adicionarTelefoneSecundario(Telefone t) {
        telefones[1] = t;
        t.setPessoa(this);
    }

    public void adicionarTelefoneTerciario(Telefone t) {
        telefones[2] = t;
        t.setPessoa(this);
    }
    //</editor-fold>

    public void adicionarEndereco(Endereco e) {
        enderecos.add(e);
        e.setPessoa(this);
    }
    
    //<editor-fold defaultstate="collapsed" desc="hashCode/equals/toString">
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.nascimento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        // ??
//        final Pessoa other = (Pessoa) obj;
//        if (!Objects.equals(this.nome, other.nome)) {
//            return false;
//        }
//        return Objects.equals(this.nascimento, other.nascimento);
        // ??
        return hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return "Pessoa{"
                + "nome=" + nome
                + ", nascimento=" + nascimento
                + ", idade=" + idade
                + ", telefones=" + Arrays.toString(telefones)
                + ", enderecos=" + enderecos
                + '}';
    }
    //</editor-fold>

}
