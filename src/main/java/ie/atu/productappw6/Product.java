package ie.atu.productappw6;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Max(value = 10, message ="ID cannot be greater than 10 characters")
    private int id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotNull(message ="Price cannot be empty")
    private double price;
}
