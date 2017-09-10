package beans;

import beans.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-04T01:31:32")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Integer> idOrder;
    public static volatile SingularAttribute<Orders, String> data;
    public static volatile SingularAttribute<Orders, Menu> idFood;
    public static volatile SingularAttribute<Orders, String> time;

}