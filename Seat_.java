package dbms;

import dbms.SeatPK;
import dbms.Theatres;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-28T11:56:04")
@StaticMetamodel(Seat.class)
public class Seat_ { 

    public static volatile SingularAttribute<Seat, Integer> noOfSeats;
    public static volatile SingularAttribute<Seat, SeatPK> seatPK;
    public static volatile SingularAttribute<Seat, Theatres> theatres;

}