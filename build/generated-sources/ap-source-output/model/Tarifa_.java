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
@StaticMetamodel(Tarifa.class)
public class Tarifa_ { 

    public static volatile SingularAttribute<Tarifa, PontoTuristico> pontoTuristico;
    public static volatile SingularAttribute<Tarifa, Double> valor;
    public static volatile SingularAttribute<Tarifa, Integer> id;
    public static volatile SingularAttribute<Tarifa, String> descricao;

}