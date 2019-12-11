package be.ehb.from_handling_demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Snack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id= 0L;
    @NotBlank
    @NotNull(message = "Name can not be empty")
    private String name;
    @NotNull(message = "Price can not be empty")
    @DecimalMin(value = "0.5" , message = "Value needs to be bigger than 0.5")
    private BigDecimal price;
    @NotNull(message = "Value can not be empty")
    @DecimalMin(value = "1", message = "Value needs to be bigger then 1")
    private BigDecimal amount;

    public Snack() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
