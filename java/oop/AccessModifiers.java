// Access Modifiers - Controls visibility of classes, methods, and variables

// 'public' and 'default' classes are allowed on top-level classes
public class AccessModifiers {
    // 'private' - Accessible only within the same class
    private String privateCode = "When blue meets yellow in the west.";

    private void privateMethod() {

    }

    // 'default' (no modifier/package-private) -  Accessible only within the same package
    String defaultCode = "The week is long.";

    void defaultMethod() {

    }

    // 'protected' - Accessible within the same package and by subclasses in different packages
    protected String protectedCode = "A trip to China sounds nice if you tread lightly.";

    protected void protectedMethod() {

    }

    // 'public' - Accessible from anywhere
    public String publicCode = "The silver cat feeds.";

    public void publicMethod() {

    }
}

class DefaultClass {
    // 'private' and 'protected' classes are only possible within inner class
    private class PrivateClass {

    }

    protected class ProtectedClass {

    }
}

