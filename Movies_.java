package dbms;

import dbms.Theatres;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-28T11:56:04")
@StaticMetamodel(Movies.class)
public class Movies_ { 

    public static volatile SingularAttribute<Movies, String> mId;
    public static volatile SingularAttribute<Movies, String> mname;
    public static volatile SingularAttribute<Movies, String> time;
    public static volatile SingularAttribute<Movies, Theatres> tId;

}