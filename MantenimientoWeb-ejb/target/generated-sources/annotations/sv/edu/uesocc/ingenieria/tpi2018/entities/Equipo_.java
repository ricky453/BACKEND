package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.DetalleEquipo;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Solicitud;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-09T20:06:12")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile CollectionAttribute<Equipo, DetalleEquipo> detalleEquipoCollection;
    public static volatile SingularAttribute<Equipo, String> unidad;
    public static volatile SingularAttribute<Equipo, Integer> idEquipo;
    public static volatile CollectionAttribute<Equipo, Solicitud> solicitudCollection;
    public static volatile SingularAttribute<Equipo, String> serie;

}