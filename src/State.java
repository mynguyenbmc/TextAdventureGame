
public class State {
    String name;
    String description;
    Dictionary<String, Command> commands;
    Dictionary<String, Item> items;
    State parent;
    String path;
        
    State(String name, String description) {
        this.name = name;
        this.description = description;
        commands = new Dictionary<String, Command>();
        items = new Dictionary<String, Item>();	
        parent = null;
        path = "";
    }
}
