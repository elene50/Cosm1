package beans;

import beans.Basket;
import beans.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-04T01:31:32")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> image;
    public static volatile SingularAttribute<Menu, String> dose;
    public static volatile SingularAttribute<Menu, Integer> cost;
    public static volatile SingularAttribute<Menu, Integer> idFood;
    public static volatile CollectionAttribute<Menu, Basket> basketCollection;
    public static volatile CollectionAttribute<Menu, Orders> ordersCollection;
    public static volatile SingularAttribute<Menu, String> food;

}