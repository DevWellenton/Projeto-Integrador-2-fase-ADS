
package controller;

import abstratas.dao;
import java.util.List;
import model.Avaliacao;
import model.PontoTuristico;

public class daoAvaliacao extends dao<Avaliacao>{
    public List<Avaliacao> read(){
        String JPQL="select a from Avaliacao a order by a.nome_usuario";
        return super.read(JPQL);
    }
    public List<Avaliacao> read(String filtro){
        String JPQL="select a from Avaliacao a "
                + "where a.nome_usuario like ?1 order by a.nome_usuario";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
    public List<Avaliacao> read(PontoTuristico pontoTuristico){
        String JPQL="select a from Avaliacao a where a.pontoTuristico=?1 "
                + "order by a.nome_usuario";
        return super.read(JPQL, pontoTuristico);
    }
}
