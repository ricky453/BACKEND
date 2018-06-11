package sv.edu.uesocc.ingenieria.tpi2018.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entities.Calendario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-09T20:06:12")
@StaticMetamodel(Asuetos.class)
public class Asuetos_ { 

    public static volatile SingularAttribute<Asuetos, String> descripcion;
    public static volatile SingularAttribute<Asuetos, Date> fecha;
    public static volatile CollectionAttribute<Asuetos, Calendario> calendarioCollection;
    public static volatile SingularAttribute<Asuetos, Integer> idAsueto;

}