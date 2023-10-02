package variables;


interface MyInterface {
    void abstractMethod(); // Abstract method, no body

    default void defaultMethodWithBody() {
        System.out.println("Default implementation of defaultMethodWithBody");
    }

    void defaultMethodWithoutBody(); // Abstract method, no body
}


