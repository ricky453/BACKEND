package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Diagnostico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T19:21:23")
@StaticMetamodel(DiagnosticoParte.class)
public class DiagnosticoParte_ { 

    public static volatile SingularAttribute<DiagnosticoParte, Integer> idDiagnosticoParte;
    public static volatile CollectionAttribute<DiagnosticoParte, Diagnostico> diagnosticoCollection;
    public static volatile SingularAttribute<DiagnosticoParte, String> observaciones;
    public static volatile SingularAttribute<DiagnosticoParte, String> parte;

}