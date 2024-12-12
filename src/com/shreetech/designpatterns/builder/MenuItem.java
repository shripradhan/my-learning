package com.shreetech.designpatterns.builder;

public class MenuItem {

    private Integer menuId;

    private String menuName;

    private String menuDescription;

    private Double price;

    private String menuType;

    private MenuItem(){}

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private final MenuItem menuItem;


        public Builder() {
            this.menuItem = new MenuItem();
        }

        public Builder menuId(Integer menuId) {
            menuItem.menuId = menuId;
            return this;
        }

        public Builder menuType(String menuType) {
            menuItem.menuType = menuType;
            return this;
        }

        public Builder price(Double price) {
            menuItem.price = price;
            return this;
        }

        public Builder menuDescription(String menuDescription) {
            menuItem.menuDescription = menuDescription;
            return this;
        }

        public Builder menuName(String menuName) {
            menuItem.menuName = menuName;
            return this;
        }

        public MenuItem build(){
            return menuItem;
        }
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", menuDescription='" + menuDescription + '\'' +
                ", price=" + price +
                ", menuType='" + menuType + '\'' +
                '}';
    }
}
