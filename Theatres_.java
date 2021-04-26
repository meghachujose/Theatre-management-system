package dbms;

import dbms.Booking;
import dbms.Movies;
import dbms.Seat;
import dbms.Staffs;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-28T11:56:04")
@StaticMetamodel(Theatres.class)
public class Theatres_ { 

    public static volatile CollectionAttribute<Theatres, Movies> moviesCollection;
    public static volatile SingularAttribute<Theatres, String> tNo;
    public static volatile CollectionAttribute<Theatres, Seat> seatCollection;
    public static volatile CollectionAttribute<Theatres, Booking> bookingCollection;
    public static volatile SingularAttribute<Theatres, String> tId;
    public static volatile SingularAttribute<Theatres, Staffs> staffid;

}