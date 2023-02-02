package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name = "companies")
@Entity
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "company_name")
    private String companyName;
    private String country;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Product> products = new ArrayList<>();

    public Company(String companyName, String country) {
        this.companyName = companyName;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", products=" + products +
                '}';
    }
}
