package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.DetalleMantenimiento;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Procedimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T19:21:23")
@StaticMetamodel(EstadoDetalleMantenimiento.class)
public class EstadoDetalleMantenimiento_ { 

    public static volatile SingularAttribute<EstadoDetalleMantenimiento, String> estado;
    public static volatile SingularAttribute<EstadoDetalleMantenimiento, Procedimiento> idProcedimiento;
    public static volatile SingularAttribute<EstadoDetalleMantenimiento, DetalleMantenimiento> idDetalleMantenimiento;
    public static volatile SingularAttribute<EstadoDetalleMantenimiento, String> observaciones;
    public static volatile SingularAttribute<EstadoDetalleMantenimiento, Integer> idEstadoDetalleMantenimiento;

}