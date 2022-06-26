
package controller;

import abstratas.dao;
import java.util.List;
import model.PontoTuristico;
import model.Tarifa;

public class daoTarifa extends dao<Tarifa> {
    public List<Tarifa> read(){
        String JPQL="select t from Tarifa t order by t.descricao";
        return super.read(JPQL);
    }
    /*public List<Tarifa> read(String filtro){
        String JPQL="select t from Tarifa t "
                + "where t.descricao like ?1 order by t.descricao";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }*/
    public List<Tarifa> read(PontoTuristico pontoTuristico){
        String JPQL="select t from Tarifa t where t.pontoTuristico=?1 order by t.descricao";
        return super.read(JPQL, pontoTuristico);
    }
}
