package carshop.db.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "goods")
public class GoodModel {
    @Id
    private Integer id;
    private String name;
    @Column(name = "supplier_id")
    private String supplierId;
    private Integer price;
    private Integer amount;
}