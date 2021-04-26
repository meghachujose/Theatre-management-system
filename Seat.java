/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "seat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seat.findAll", query = "SELECT s FROM Seat s"),
    @NamedQuery(name = "Seat.findBySid", query = "SELECT s FROM Seat s WHERE s.seatPK.sid = :sid"),
    @NamedQuery(name = "Seat.findByNoOfSeats", query = "SELECT s FROM Seat s WHERE s.noOfSeats = :noOfSeats"),
    @NamedQuery(name = "Seat.findByTId", query = "SELECT s FROM Seat s WHERE s.seatPK.tId = :tId")})
public class Seat implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SeatPK seatPK;
    @Column(name = "no_of_seats")
    private Integer noOfSeats;
    @JoinColumn(name = "t_id", referencedColumnName = "t_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Theatres theatres;

    public Seat() {
    }

    public Seat(SeatPK seatPK) {
        this.seatPK = seatPK;
    }

    public Seat(String sid, String tId) {
        this.seatPK = new SeatPK(sid, tId);
    }

    public SeatPK getSeatPK() {
        return seatPK;
    }

    public void setSeatPK(SeatPK seatPK) {
        this.seatPK = seatPK;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Theatres getTheatres() {
        return theatres;
    }

    public void setTheatres(Theatres theatres) {
        this.theatres = theatres;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seatPK != null ? seatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seat)) {
            return false;
        }
        Seat other = (Seat) object;
        if ((this.seatPK == null && other.seatPK != null) || (this.seatPK != null && !this.seatPK.equals(other.seatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbms.Seat[ seatPK=" + seatPK + " ]";
    }
    
}
