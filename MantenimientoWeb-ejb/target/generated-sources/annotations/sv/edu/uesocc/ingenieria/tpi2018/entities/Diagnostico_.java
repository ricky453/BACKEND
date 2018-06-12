package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.DiagnosticoParte;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Procedimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T19:21:23")
@StaticMetamodel(Diagnostico.class)
public class Diagnostico_ { 

    public static volatile SingularAttribute<Diagnostico, Procedimiento> idProcedimiento;
    public static volatile SingularAttribute<Diagnostico, DiagnosticoParte> idDiagnosticoParte;
    public static volatile SingularAttribute<Diagnostico, String> diagnostico;
    public static volatile SingularAttribute<Diagnostico, Integer> idDiagnostico;

}