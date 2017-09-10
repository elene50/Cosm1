package beans;

import beans.Basket;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-04T01:31:32")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, Basket> basketCollection;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, String> login;

}