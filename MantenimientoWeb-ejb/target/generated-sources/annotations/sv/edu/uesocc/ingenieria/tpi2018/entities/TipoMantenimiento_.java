package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Solicitud;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T19:21:23")
@StaticMetamodel(TipoMantenimiento.class)
public class TipoMantenimiento_ { 

    public static volatile SingularAttribute<TipoMantenimiento, String> tipoMantenimiento;
    public static volatile SingularAttribute<TipoMantenimiento, Integer> idTipoMantenimiento;
    public static volatile CollectionAttribute<TipoMantenimiento, Solicitud> solicitudCollection;
    public static volatile SingularAttribute<TipoMantenimiento, String> observaciones;

}