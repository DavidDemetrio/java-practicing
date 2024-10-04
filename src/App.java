import editable.Editable;

public class App {
    public static void main(String[] args) throws Exception {
        var editableObj = new Editable(false);

        System.out.println("cursor: " + editableObj.getCursor());
        editableObj.setCursor(false);
        System.out.println("cursor set: " + editableObj.getCursor());
    }
}
