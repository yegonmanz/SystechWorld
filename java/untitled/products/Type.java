package products;

public enum Type {
    ELECTRONICS("Electronics"),
    CLOTHING("Clothing"),
    BOOKS("Books"),
    SPORTS("Sports"),
    FOOD("Food"),
    OTHER("Other"),

    GOLF_ITEMS("Golf Items"),
    TRAVEL_ITEMS("Travel Items"),
    TOURISM_PRODUCTS("Trourism Products"),
    SPARE_PARTS("Spare parts"),
    CLOTHING_PRODUCTS("Clothing products"),
    ;

    final String name;

    Type(String name) {
        this.name = name;
    }
}
