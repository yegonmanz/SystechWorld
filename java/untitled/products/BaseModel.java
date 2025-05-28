package products;
import java.util.Date;

public class BaseModel {
    protected long id;
    protected Date dateCreated;

    public BaseModel() {
        this.dateCreated = new Date();
    }

}
