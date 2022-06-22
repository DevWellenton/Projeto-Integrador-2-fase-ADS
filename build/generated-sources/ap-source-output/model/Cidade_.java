package model;

import enums.Estados;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-21T21:49:38", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Cidade.class)
public class Cidade_ { 

    public static volatile SingularAttribute<Cidade, Estados> estado;
    public static volatile SingularAttribute<Cidade, String> nome;
    public static volatile SingularAttribute<Cidade, Integer> id;

}