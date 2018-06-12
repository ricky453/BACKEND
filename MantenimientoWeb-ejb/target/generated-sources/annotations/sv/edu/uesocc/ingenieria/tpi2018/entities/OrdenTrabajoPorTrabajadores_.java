package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.OrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.entities.OrdenTrabajoPorTrabajadoresPK;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Trabajadores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T19:21:23")
@StaticMetamodel(OrdenTrabajoPorTrabajadores.class)
public class OrdenTrabajoPorTrabajadores_ { 

    public static volatile SingularAttribute<OrdenTrabajoPorTrabajadores, Trabajadores> trabajadores;
    public static volatile SingularAttribute<OrdenTrabajoPorTrabajadores, OrdenTrabajo> ordenTrabajo;
    public static volatile SingularAttribute<OrdenTrabajoPorTrabajadores, OrdenTrabajoPorTrabajadoresPK> ordenTrabajoPorTrabajadoresPK;
    public static volatile SingularAttribute<OrdenTrabajoPorTrabajadores, String> detalle;

}