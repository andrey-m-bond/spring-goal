package carshop.db.models;

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
@Table(name = "clients")
public class ClientModel {
    @Id
    private Integer id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private int discount;
    private String notes;
}