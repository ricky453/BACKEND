package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Trabajadores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T19:21:23")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, String> descripcion;
    public static volatile SingularAttribute<Cargo, Integer> idCargo;
    public static volatile SingularAttribute<Cargo, Trabajadores> idTrabajadores;
    public static volatile SingularAttribute<Cargo, String> cargo;

}