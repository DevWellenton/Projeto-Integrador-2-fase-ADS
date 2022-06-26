package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cidade;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-26T17:09:51", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(PontoTuristico.class)
public class PontoTuristico_ { 

    public static volatile SingularAttribute<PontoTuristico, Cidade> cidade;
    public static volatile SingularAttribute<PontoTuristico, String> endereco;
    public static volatile SingularAttribute<PontoTuristico, String> foto;
    public static volatile SingularAttribute<PontoTuristico, String> nome;
    public static volatile SingularAttribute<PontoTuristico, Integer> id;
    public static volatile SingularAttribute<PontoTuristico, String> descricao;

}