
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PONTOSTURISTICOS")
public class PontoTuristico implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Column(name = "endereco", length = 100, nullable = false)
    private String endereco;
    @Column(name = "descricao", length = 500, nullable = false) 
    private String descricao;
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cidade",nullable = false, referencedColumnName = "id")
    private Cidade cidade;
    @Column(name = "foto", length = 500, nullable = false)
    private String foto;
    //
    public PontoTuristico() {
    }
    public PontoTuristico(int id, String nome, String endereco, String descricao, Cidade cidade, String foto) {
        this.setId(id);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDescricao(descricao);
        this.setCidade(cidade);
        this.setFoto(foto);
    }
    //
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"NONAME":nome.toUpperCase();
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty()?"NOADRESS":endereco.toUpperCase();
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao.trim().isEmpty()?"NODESCRIPTION":descricao.toUpperCase();
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public void setFoto(String foto) {
        this.foto = foto.trim().isEmpty()?"NULL":foto;
    }
    //
    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public Cidade getCidade() {
        return this.cidade;
    }
    public String getFoto() {
        return this.foto;
    }
    //
    @Override
    public String toString() {
        return this.nome;
    }
    //

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PontoTuristico other = (PontoTuristico) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
