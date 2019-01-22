import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name= "hibernate_computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "COST")
    private int cost;
    @Column(name = "NAME")
    private String name;
    @Column(name = "GHZ")
    private int GHz;

    //@ManyToMany(cascade = CascadeType.all, fetch = FetchType.LAZY//,mappedBy="")
    //@JoinTable(
    //...
    //)
    //field

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGHz() {
        return GHz;
    }

    public void setGHz(int GHz) {
        this.GHz = GHz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return cost == computer.cost &&
                id == computer.id &&
                GHz == computer.GHz &&
                Objects.equals(name, computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, name, id, GHz);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", GHz=" + GHz +
                '}';
    }
}
