package dbms;

import dbms.Theatres;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-28T11:56:04")
@StaticMetamodel(Staffs.class)
public class Staffs_ { 

    public static volatile CollectionAttribute<Staffs, Theatres> theatresCollection;
    public static volatile SingularAttribute<Staffs, String> sname;
    public static volatile SingularAttribute<Staffs, String> job;
    public static volatile SingularAttribute<Staffs, String> sid;
    public static volatile SingularAttribute<Staffs, Integer> sal;

}