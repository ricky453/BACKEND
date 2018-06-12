package sv.edu.uesocc.ingenieria.tpi2018.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Equipo;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Marca;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Modelo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-11T19:21:23")
@StaticMetamodel(DetalleEquipo.class)
public class DetalleEquipo_ { 

    public static volatile SingularAttribute<DetalleEquipo, String> descripcion;
    public static volatile SingularAttribute<DetalleEquipo, Integer> idDetalleEquipo;
    public static volatile SingularAttribute<DetalleEquipo, Equipo> idEquipo;
    public static volatile SingularAttribute<DetalleEquipo, String> dispositivo;
    public static volatile SingularAttribute<DetalleEquipo, Modelo> idModelo;
    public static volatile SingularAttribute<DetalleEquipo, Marca> idMarca;

}