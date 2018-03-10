package Model;

public class ListItem {

    public ListItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
