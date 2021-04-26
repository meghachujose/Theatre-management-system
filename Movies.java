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
@Table(name = "movies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movies.findAll", query = "SELECT m FROM Movies m"),
    @NamedQuery(name = "Movies.findByMId", query = "SELECT m FROM Movies m WHERE m.mId = :mId"),
    @NamedQuery(name = "Movies.findByMname", query = "SELECT m FROM Movies m WHERE m.mname = :mname"),
    @NamedQuery(name = "Movies.findByTime", query = "SELECT m FROM Movies m WHERE m.time = :time")})
public class Movies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "m_id")
    private String mId;
    @Column(name = "mname")
    private String mname;
    @Column(name = "time")
    private String time;
    @JoinColumn(name = "t_id", referencedColumnName = "t_id")
    @ManyToOne
    private Theatres tId;

    public Movies() {
    }

    public Movies(String mId) {
        this.mId = mId;
    }

    public String getMId() {
        return mId;
    }

    public void setMId(String mId) {
        this.mId = mId;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
        hash += (mId != null ? mId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movies)) {
            return false;
        }
        Movies other = (Movies) object;
        if ((this.mId == null && other.mId != null) || (this.mId != null && !this.mId.equals(other.mId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbms.Movies[ mId=" + mId + " ]";
    }
    
}
