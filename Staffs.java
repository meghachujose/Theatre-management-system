/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "staffs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staffs.findAll", query = "SELECT s FROM Staffs s"),
    @NamedQuery(name = "Staffs.findBySid", query = "SELECT s FROM Staffs s WHERE s.sid = :sid"),
    @NamedQuery(name = "Staffs.findBySname", query = "SELECT s FROM Staffs s WHERE s.sname = :sname"),
    @NamedQuery(name = "Staffs.findBySal", query = "SELECT s FROM Staffs s WHERE s.sal = :sal"),
    @NamedQuery(name = "Staffs.findByJob", query = "SELECT s FROM Staffs s WHERE s.job = :job")})
public class Staffs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sid")
    private String sid;
    @Column(name = "sname")
    private String sname;
    @Column(name = "sal")
    private Integer sal;
    @Column(name = "job")
    private String job;
    @OneToMany(mappedBy = "staffid")
    private Collection<Theatres> theatresCollection;

    public Staffs() {
    }

    public Staffs(String sid) {
        this.sid = sid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @XmlTransient
    public Collection<Theatres> getTheatresCollection() {
        return theatresCollection;
    }

    public void setTheatresCollection(Collection<Theatres> theatresCollection) {
        this.theatresCollection = theatresCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sid != null ? sid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staffs)) {
            return false;
        }
        Staffs other = (Staffs) object;
        if ((this.sid == null && other.sid != null) || (this.sid != null && !this.sid.equals(other.sid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbms.Staffs[ sid=" + sid + " ]";
    }
    
}
