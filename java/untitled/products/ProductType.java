package products;

public class ProductType extends BaseModel {

    private String name;
    private String description;
    private String type;
    private Double percentageDiscount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return Type.valueOf(type);
    }

    public void setType(Type type) {
        this.type = type.toString();
    }

    public Double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(Double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    // Remove this conflicting method
    // public void setType(String type2) {
    //     throw new UnsupportedOperationException("Unimplemented method 'setType'");
    // }
}
