package peaksoft.model;

import jakarta.persistence.*;
import lombok.*;


import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.CascadeType.PERSIST;
import static jakarta.persistence.FetchType.LAZY;

@Getter
@Setter
@Table(name = "products")
@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "product_name")
    private String productName;
    private int price;
    @Column(name = "year_of_issue")
    private String yearOfIssue;

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH, PERSIST}, fetch = LAZY)
    private Category category;

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH, PERSIST}, fetch = LAZY)
    private Company company;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", category=" + category +
                ", company=" + company +
                '}';
    }
}
