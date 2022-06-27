package controller;

import abstratas.dao;
import java.util.List;
import model.Cidade;
import model.PontoTuristico;

public class daoPontoTuristico extends dao<PontoTuristico> {
    public List<PontoTuristico> read(){
<<<<<<< Updated upstream
        String JPQL="select p from PontoTuristico p order by c.nome";
=======
        String JPQL="select p from PontoTuristico p order by p.nome";
>>>>>>> Stashed changes
        return super.read(JPQL);
    }
    public List<PontoTuristico> read(String filtro){
        String JPQL="select p from PontoTuristico p "
                + "where p.nome like ?1 order by p.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
    public List<PontoTuristico> read(Cidade cidade){
        String JPQL="select p from PontoTuristico p where p.cidade=?1 "
                + "order by p.nome";
        return super.read(JPQL, cidade);
    }
}