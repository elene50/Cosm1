/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByIdFood", query = "SELECT m FROM Menu m WHERE m.idFood = :idFood"),
    @NamedQuery(name = "Menu.findByFood", query = "SELECT m FROM Menu m WHERE m.food = :food"),
    @NamedQuery(name = "Menu.findByDose", query = "SELECT m FROM Menu m WHERE m.dose = :dose"),
    @NamedQuery(name = "Menu.findByCost", query = "SELECT m FROM Menu m WHERE m.cost = :cost"),
    @NamedQuery(name = "Menu.findByImage", query = "SELECT m FROM Menu m WHERE m.image = :image")})
public class Menu implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFood")
    private Collection<Orders> ordersCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFood")
    private Integer idFood;
    @Basic(optional = false)
    @Column(name = "food")
    private String food;
    @Basic(optional = false)
    @Column(name = "dose")
    private String dose;
    @Basic(optional = false)
    @Column(name = "cost")
    private int cost;
 
    @Basic(optional = false)
    @Column(name = "image")
    private String image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFood")
    private Collection<Basket> basketCollection;

    public Menu() {
    }

    public Menu(Integer idFood) {
        this.idFood = idFood;
    }

    public Menu(Integer idFood, String food, int cost, String image) {
        this.idFood = idFood;
        this.food = food;
        this.cost = cost;
        this.image = image;        
    }
    
    public Menu(Integer idFood, String food, String dose, int cost,  String image) {
        this.idFood = idFood;
        this.food = food;
        this.dose = dose;
        this.cost = cost;
        this.image = image;
    }

    public Integer getIdFood() {
        return idFood;
    }

    public void setIdFood(Integer idFood) {
        this.idFood = idFood;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @XmlTransient
    public Collection<Basket> getBasketCollection() {
        return basketCollection;
    }

    public void setBasketCollection(Collection<Basket> basketCollection) {
        this.basketCollection = basketCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFood != null ? idFood.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idFood == null && other.idFood != null) || (this.idFood != null && !this.idFood.equals(other.idFood))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Menu[ idFood=" + idFood + " ]";
    }

    @XmlTransient
    public Collection<Orders> getOrdersCollection() {
        return ordersCollection;
    }

    public void setOrdersCollection(Collection<Orders> ordersCollection) {
        this.ordersCollection = ordersCollection;
    }
    
}
