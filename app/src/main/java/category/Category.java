package category;

import java.util.List;

import home.Home;

public class Category {

    private String nameCategory;
    private List<Home> homes;

    public Category(String nameCategory, List<Home> homes) {
        this.nameCategory = nameCategory;
        this.homes = homes;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Home> getShops() {
        return homes;
    }

    public void setShops(List<Home> shops) {
        this.homes = homes;
    }
}
