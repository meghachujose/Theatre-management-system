package dbms;

import dbms.Theatres;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-28T11:56:04")
@StaticMetamodel(Booking.class)
public class Booking_ { 

    public static volatile SingularAttribute<Booking, Integer> price;
    public static volatile SingularAttribute<Booking, Integer> nooftickets;
    public static volatile SingularAttribute<Booking, String> mname;
    public static volatile SingularAttribute<Booking, String> bid;
    public static volatile SingularAttribute<Booking, Theatres> tId;

}