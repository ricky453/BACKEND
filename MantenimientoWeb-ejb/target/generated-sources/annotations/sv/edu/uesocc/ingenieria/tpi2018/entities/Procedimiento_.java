package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Diagnostico;
import sv.edu.uesocc.ingenieria.tpi2018.entities.EstadoDetalleMantenimiento;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Pasos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T19:21:23")
@StaticMetamodel(Procedimiento.class)
public class Procedimiento_ { 

    public static volatile SingularAttribute<Procedimiento, Integer> idProcedimiento;
    public static volatile SingularAttribute<Procedimiento, Pasos> idPasos;
    public static volatile CollectionAttribute<Procedimiento, Diagnostico> diagnosticoCollection;
    public static volatile CollectionAttribute<Procedimiento, EstadoDetalleMantenimiento> estadoDetalleMantenimientoCollection;
    public static volatile SingularAttribute<Procedimiento, String> procedimiento;

}