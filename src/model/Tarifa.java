
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
@Table(name = "Tarifas")
public class Tarifa implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "descricao", length = 255, nullable = false) 
    private String descricao;
    @Column(name = "valor", nullable = false)
    private Double valor;
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_ponto_turistico",nullable = false, referencedColumnName = "id")
    private PontoTuristico pontoTuristico;
    //
    public Tarifa() {
    }
    public Tarifa(int id, String descricao, Double valor, PontoTuristico pontoTuristico) {
        this.setId(id);
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setPontoTuristico(pontoTuristico);
    }
    //
    public void setId(int id) {
        this.id = id;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao.trim().isEmpty()?"NODESCRIPTION":descricao.toUpperCase();
    }
    public void setValor(Double valor) {
        this.valor = valor<0 ? 0 : valor;
    }
    public void setPontoTuristico(PontoTuristico pontoTuristico) {
        this.pontoTuristico = pontoTuristico;
    }
    //
    public int getId() {
        return id;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public Double getValor() {
        return this.valor;
    }
    public PontoTuristico getPontoTuristico() {
        return this.pontoTuristico;
    }
    //
    @Override
    public String toString() {
        return this.descricao;
    }
    //
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Tarifa other = (Tarifa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
