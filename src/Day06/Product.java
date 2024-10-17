package Day06;

public class Product {
    
    //attributes
    long id;
    String name;
    String description;
    String category;




    //getter setter
    public long getId() {    return id;}
    public void setId(long id) {    this.id = id;}

    public String getName() {    return name;}
    public void setName(String name) {    this.name = name;}

    public String getDescription() {    return description;}
    public void setDescription(String description) {    this.description = description;}

    public String getCategory() {    return category;}
    public void setCategory(String category) {    this.category = category;}

    //toString
    @Override
    public String toString() {
        return "Product |id:" +
    }

}
