package com.example.OrderManagementSystem.Pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class MenuItem {

    @Id
    @GeneratedValue
    private Long menuItemid;

    private String name;

    private String info;

    private String imageUrl;

    private Double price;
   
    @ManyToMany( mappedBy = "mitems",targetEntity=Order.class)
    private List<Order> morder;

    @ManyToMany(mappedBy = "items")
    private List<Menu> menu;
    public MenuItem(@JsonProperty("menuItemid") Long id, @JsonProperty("name") String name, @JsonProperty("info") String info,
                    @JsonProperty("imageUrl") String imageUrl, @JsonProperty("price") Double price) {
        this.menuItemid= menuItemid;
        this.name = name;
        this.info = info;
        this.imageUrl = imageUrl;
        this.price = price;
    }
    

	public Long getMenuItemid() {
		return menuItemid;
	}


	public void setMenuItemid(Long menuItemid) {
		this.menuItemid = menuItemid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	


	


	public List<Menu> getMenu() {
		return menu;
	}


	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}


	

	public List<Order> getMorder() {
		return morder;
	}


	public void setMorder(List<Order> morder) {
		this.morder = morder;
	}


	@Override
    public String toString() {
        return "MenuItem{" +
                "id=" + menuItemid +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", price=" + price +
                '}';
    }
}