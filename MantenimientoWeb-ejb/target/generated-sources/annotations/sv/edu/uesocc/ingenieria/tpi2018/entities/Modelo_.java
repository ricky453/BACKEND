package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.DetalleEquipo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-09T20:06:12")
@StaticMetamodel(Modelo.class)
public class Modelo_ { 

    public static volatile SingularAttribute<Modelo, String> descripcion;
    public static volatile CollectionAttribute<Modelo, DetalleEquipo> detalleEquipoCollection;
    public static volatile SingularAttribute<Modelo, Integer> idModelo;
    public static volatile SingularAttribute<Modelo, String> modelo;

}