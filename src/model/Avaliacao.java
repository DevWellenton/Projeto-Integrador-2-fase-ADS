
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
@Table(name = "AVALIACOES")
public class Avaliacao implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "nome_usuario", length = 100, nullable = false)
    private String nomeUsuario;
    @Column(name = "descricao")
    private String descricao;
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_ponto_turistico",nullable = false, referencedColumnName = "id")
    private PontoTuristico pontoTuristico;
    @Column(name = "nota")
    private int nota;
    //
    public Avaliacao() {
    }
    //
    public Avaliacao(int id, String nomeUsuario, String descricao, PontoTuristico pontoTuristico, int nota) {
        this.setId(id);
        this.setNomeUsuario(nomeUsuario);
        this.setDescricao(descricao);
        this.setPontoTuristico(pontoTuristico);
        this.setNota(nota);
    }
    //
    public void setId(int id) {
        this.id = id;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario.trim().isEmpty()?"NONAME":nomeUsuario.toUpperCase();
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao.trim().isEmpty()?"NODESCRIPTION":descricao.toUpperCase();
    }
    public void setPontoTuristico(PontoTuristico pontoTuristico) {
        this.pontoTuristico = pontoTuristico;
    }
    //------------------------- rever esta validação ------------------
    public void setNota(int nota) {
        this.nota = nota<1 || nota>5 ? 1 : nota;
    }
    //-----------------------------------------------------------------
    //
    public int getId() {
        return this.id;
    }
    public String getNomeUsuario() {
        return this.nomeUsuario;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public PontoTuristico getPontoTuristico() {
        return this.pontoTuristico;
    }
    public int getNota() {
        return this.nota;
    }
    //
    @Override
    public String toString() {
        return this.descricao;
    }
    //
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id;
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
        final Avaliacao other = (Avaliacao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
