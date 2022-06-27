package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.PontoTuristico;

<<<<<<< Updated upstream
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-26T17:09:51", comments="EclipseLink-2.7.7.v20200504-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-27T14:30:34", comments="EclipseLink-2.7.10.v20211216-rNA")
>>>>>>> Stashed changes
@StaticMetamodel(Avaliacao.class)
public class Avaliacao_ { 

    public static volatile SingularAttribute<Avaliacao, PontoTuristico> pontoTuristico;
    public static volatile SingularAttribute<Avaliacao, String> nomeUsuario;
    public static volatile SingularAttribute<Avaliacao, Integer> id;
    public static volatile SingularAttribute<Avaliacao, Integer> nota;
    public static volatile SingularAttribute<Avaliacao, String> descricao;

}