/**
 * A package contains all of class and interface that
 * have relation between their.
 * In this package We are going to write all of class about
 * Editable class.
 * Note: Just one class may have the same name as package.
*/
package editable;

public class Editable {
    private boolean cursor = true;

    // Constructor
    public Editable() {

    }

    // Constructor overloading
    // Notes: If we don not write a constructor, then the system write it for you.
    public Editable(boolean cursor) {
        this.cursor = cursor;
    }

    public static void aboutFunction() {
        System.out.println("Class that contains all of methods and attributes about Editable class.");
    }

    // Getters and Setter
    public boolean getCursor() {
        return this.cursor;
    }

    public void setCursor(boolean cursor) {
        this.cursor = cursor;
    }
}

class useEditable {
    
}