package sv.edu.uesocc.ingenieria.tpi2018.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Equipo;
import sv.edu.uesocc.ingenieria.tpi2018.entities.OrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.entities.TipoMantenimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-09T20:06:12")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile SingularAttribute<Solicitud, String> descripcion;
    public static volatile SingularAttribute<Solicitud, Date> fecha;
    public static volatile CollectionAttribute<Solicitud, OrdenTrabajo> ordenTrabajoCollection;
    public static volatile SingularAttribute<Solicitud, Equipo> idEquipo;
    public static volatile SingularAttribute<Solicitud, String> responsable;
    public static volatile SingularAttribute<Solicitud, TipoMantenimiento> idTipoMantenimiento;
    public static volatile SingularAttribute<Solicitud, Integer> idSolicitud;
    public static volatile SingularAttribute<Solicitud, String> telefono;
    public static volatile SingularAttribute<Solicitud, String> email;

}