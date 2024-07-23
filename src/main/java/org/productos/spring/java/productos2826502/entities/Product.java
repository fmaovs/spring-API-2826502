package org.productos.spring.java.productos2826502.entities;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Entity
@Table(name="products")
public class Product {
    private Long id;
    private String name;
    private Double price;
}
