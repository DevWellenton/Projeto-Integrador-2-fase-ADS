package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.PontoTuristico;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-25T20:34:07", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Avaliacao.class)
public class Avaliacao_ { 

    public static volatile SingularAttribute<Avaliacao, PontoTuristico> pontoTuristico;
    public static volatile SingularAttribute<Avaliacao, String> nomeUsuario;
    public static volatile SingularAttribute<Avaliacao, Integer> id;
    public static volatile SingularAttribute<Avaliacao, Integer> nota;
    public static volatile SingularAttribute<Avaliacao, String> descricao;

}