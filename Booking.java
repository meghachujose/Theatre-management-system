/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "booking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b"),
    @NamedQuery(name = "Booking.findByBid", query = "SELECT b FROM Booking b WHERE b.bid = :bid"),
    @NamedQuery(name = "Booking.findByNooftickets", query = "SELECT b FROM Booking b WHERE b.nooftickets = :nooftickets"),
    @NamedQuery(name = "Booking.findByMname", query = "SELECT b FROM Booking b WHERE b.mname = :mname"),
    @NamedQuery(name = "Booking.findByPrice", query = "SELECT b FROM Booking b WHERE b.price = :price")})
public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "bid")
    private String bid;
    @Column(name = "nooftickets")
    private Integer nooftickets;
    @Column(name = "mname")
    private String mname;
    @Column(name = "price")
    private Integer price;
    @JoinColumn(name = "t_id", referencedColumnName = "t_id")
    @ManyToOne
    private Theatres tId;

    public Booking() {
    }

    public Booking(String bid) {
        this.bid = bid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Integer getNooftickets() {
        return nooftickets;
    }

    public void setNooftickets(Integer nooftickets) {
        this.nooftickets = nooftickets;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Theatres getTId() {
        return tId;
    }

    public void setTId(Theatres tId) {
        this.tId = tId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bid != null ? bid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.bid == null && other.bid != null) || (this.bid != null && !this.bid.equals(other.bid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbms.Booking[ bid=" + bid + " ]";
    }
    
}
