/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByIdOrder", query = "SELECT o FROM Orders o WHERE o.idOrder = :idOrder"),
    @NamedQuery(name = "Orders.findByData", query = "SELECT o FROM Orders o WHERE o.data = :data"),
    @NamedQuery(name = "Orders.findByTime", query = "SELECT o FROM Orders o WHERE o.time = :time")})
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order")
    private Integer idOrder;
    @Basic(optional = false)
    @Column(name = "data")
    private String data;
    @Basic(optional = false)
    @Column(name = "time")
    private String time;
    @JoinColumn(name = "idFood", referencedColumnName = "idFood")
    @ManyToOne(optional = false)
    private Menu idFood;

    public Orders() {
    }

    public Orders(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Orders(Integer idOrder, String data, String time) {
        this.idOrder = idOrder;
        this.data = data;
        this.time = time;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Menu getIdFood() {
        return idFood;
    }

    public void setIdFood(Menu idFood) {
        this.idFood = idFood;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrder != null ? idOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.idOrder == null && other.idOrder != null) || (this.idOrder != null && !this.idOrder.equals(other.idOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Orders[ idOrder=" + idOrder + " ]";
    }
    
}
