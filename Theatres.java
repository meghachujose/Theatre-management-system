/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "theatres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Theatres.findAll", query = "SELECT t FROM Theatres t"),
    @NamedQuery(name = "Theatres.findByTId", query = "SELECT t FROM Theatres t WHERE t.tId = :tId"),
    @NamedQuery(name = "Theatres.findByTNo", query = "SELECT t FROM Theatres t WHERE t.tNo = :tNo")})
public class Theatres implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "theatres")
    private Collection<Seat> seatCollection;
    @OneToMany(mappedBy = "tId")
    private Collection<Booking> bookingCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "t_id")
    private String tId;
    @Column(name = "t_no")
    private String tNo;
    @OneToMany(mappedBy = "tId")
    private Collection<Movies> moviesCollection;
    @JoinColumn(name = "staffid", referencedColumnName = "sid")
    @ManyToOne
    private Staffs staffid;

    public Theatres() {
    }

    public Theatres(String tId) {
        this.tId = tId;
    }

    public String getTId() {
        return tId;
    }

    public void setTId(String tId) {
        this.tId = tId;
    }

    public String getTNo() {
        return tNo;
    }

    public void setTNo(String tNo) {
        this.tNo = tNo;
    }

    @XmlTransient
    public Collection<Movies> getMoviesCollection() {
        return moviesCollection;
    }

    public void setMoviesCollection(Collection<Movies> moviesCollection) {
        this.moviesCollection = moviesCollection;
    }

    public Staffs getStaffid() {
        return staffid;
    }

    public void setStaffid(Staffs staffid) {
        this.staffid = staffid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tId != null ? tId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theatres)) {
            return false;
        }
        Theatres other = (Theatres) object;
        if ((this.tId == null && other.tId != null) || (this.tId != null && !this.tId.equals(other.tId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbms.Theatres[ tId=" + tId + " ]";
    }

    @XmlTransient
    public Collection<Seat> getSeatCollection() {
        return seatCollection;
    }

    public void setSeatCollection(Collection<Seat> seatCollection) {
        this.seatCollection = seatCollection;
    }

    @XmlTransient
    public Collection<Booking> getBookingCollection() {
        return bookingCollection;
    }

    public void setBookingCollection(Collection<Booking> bookingCollection) {
        this.bookingCollection = bookingCollection;
    }
    
}
