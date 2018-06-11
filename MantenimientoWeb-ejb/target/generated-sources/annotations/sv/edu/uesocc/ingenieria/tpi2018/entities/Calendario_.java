package sv.edu.uesocc.ingenieria.tpi2018.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Asuetos;
import sv.edu.uesocc.ingenieria.tpi2018.entities.OrdenTrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-09T20:06:12")
@StaticMetamodel(Calendario.class)
public class Calendario_ { 

    public static volatile CollectionAttribute<Calendario, OrdenTrabajo> ordenTrabajoCollection;
    public static volatile SingularAttribute<Calendario, Asuetos> idAsuetos;
    public static volatile SingularAttribute<Calendario, String> responsable;
    public static volatile SingularAttribute<Calendario, Date> fechaInicio;
    public static volatile SingularAttribute<Calendario, Integer> cantidad;
    public static volatile SingularAttribute<Calendario, String> decripcion;
    public static volatile SingularAttribute<Calendario, String> telefono;
    public static volatile SingularAttribute<Calendario, Date> fechaFin;
    public static volatile SingularAttribute<Calendario, Integer> idCalendario;

}