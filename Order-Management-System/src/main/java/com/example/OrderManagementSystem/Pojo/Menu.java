package com.example.OrderManagementSystem.Pojo;



import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue
    private Long menuId;

    private String type;

    private String info;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MenuItem> items;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "restaurant_fkid")
    private Restaurant mrestaurant;

    @JsonSetter
    public void setMrestaurant(Restaurant mrestaurant) {
        this.mrestaurant = mrestaurant;
    }

    @JsonGetter
    public Restaurant getMrestaurant() {
        return mrestaurant;
    }

    @JsonCreator
    public Menu(@JsonProperty("menuId") Long menuId, @JsonProperty("type") String type, @JsonProperty("info") String info, @JsonProperty("items") List<MenuItem> items) {
        this.menuId = menuId;
        this.type = type;
        this.info = info;
        if (items != null) {
            this.items = items;
            for (MenuItem item : items) 
                item.setMenu(this);
        }
    }

    public Menu(Long menuId, String type, String info, Restaurant mrestaurant) {
        this.menuId= menuId;
        this.type = type;
        this.info = info;
        this.mrestaurant = mrestaurant;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + menuId +
                ", type='" + type + '\'' +
                ", info='" + info + '\'' +
                ", items=" + items +
                '}';
    }
}