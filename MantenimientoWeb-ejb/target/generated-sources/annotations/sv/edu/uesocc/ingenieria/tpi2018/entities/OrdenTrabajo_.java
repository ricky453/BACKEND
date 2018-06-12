package sv.edu.uesocc.ingenieria.tpi2018.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Calendario;
import sv.edu.uesocc.ingenieria.tpi2018.entities.DetalleMantenimiento;
import sv.edu.uesocc.ingenieria.tpi2018.entities.OrdenTrabajoPorTrabajadores;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Solicitud;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T19:21:23")
@StaticMetamodel(OrdenTrabajo.class)
public class OrdenTrabajo_ { 

    public static volatile SingularAttribute<OrdenTrabajo, Integer> idOrdenTrabajo;
    public static volatile SingularAttribute<OrdenTrabajo, Date> fechaInicio;
    public static volatile CollectionAttribute<OrdenTrabajo, DetalleMantenimiento> detalleMantenimientoCollection;
    public static volatile SingularAttribute<OrdenTrabajo, Solicitud> idSolicitud;
    public static volatile CollectionAttribute<OrdenTrabajo, OrdenTrabajoPorTrabajadores> ordenTrabajoPorTrabajadoresCollection;
    public static volatile SingularAttribute<OrdenTrabajo, String> prioridad;
    public static volatile SingularAttribute<OrdenTrabajo, Calendario> idCalendario;

}