package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.EstadoDetalleMantenimiento;
import sv.edu.uesocc.ingenieria.tpi2018.entities.OrdenTrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-09T20:06:12")
@StaticMetamodel(DetalleMantenimiento.class)
public class DetalleMantenimiento_ { 

    public static volatile SingularAttribute<DetalleMantenimiento, OrdenTrabajo> idOrdenTrabajo;
    public static volatile SingularAttribute<DetalleMantenimiento, String> software;
    public static volatile SingularAttribute<DetalleMantenimiento, Integer> idDetalleMantenimiento;
    public static volatile SingularAttribute<DetalleMantenimiento, String> detalleSoftware;
    public static volatile CollectionAttribute<DetalleMantenimiento, EstadoDetalleMantenimiento> estadoDetalleMantenimientoCollection;
    public static volatile SingularAttribute<DetalleMantenimiento, String> detalleHarware;

}