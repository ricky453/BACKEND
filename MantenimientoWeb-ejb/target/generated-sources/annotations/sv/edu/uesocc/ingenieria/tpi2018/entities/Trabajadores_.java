package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Cargo;
import sv.edu.uesocc.ingenieria.tpi2018.entities.OrdenTrabajoPorTrabajadores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-09T20:06:12")
@StaticMetamodel(Trabajadores.class)
public class Trabajadores_ { 

    public static volatile SingularAttribute<Trabajadores, String> apellidos;
    public static volatile SingularAttribute<Trabajadores, Integer> idTrabajador;
    public static volatile CollectionAttribute<Trabajadores, OrdenTrabajoPorTrabajadores> ordenTrabajoPorTrabajadoresCollection;
    public static volatile CollectionAttribute<Trabajadores, Cargo> cargoCollection;
    public static volatile SingularAttribute<Trabajadores, String> email;
    public static volatile SingularAttribute<Trabajadores, String> nombres;

}