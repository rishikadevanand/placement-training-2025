import java.lang.annotation.*;
import java.util.*;

// ---------------- Meta-Annotations + Custom Annotations ----------------

// @Documented → appears in Javadoc
// @Retention → available at runtime
// @Target → applies to class
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Developer {
    String name();
}

// @Inherited → subclasses inherit this annotation
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Config {
    String value();
}

// @Repeatable example
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Roles.class)
@interface Role {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Roles {
    Role[] value();
}

// ---------------- Functional Interface (Compiler Annotation) ----------------

@FunctionalInterface
interface Task {
    void run();
}

// ---------------- Parent + Child to show @Override and @Deprecated ----------------

@Developer(name = "Pranesh")
@Config("production")
@Role("admin")
@Role("user")
class Parent {

    public void start() {
        System.out.println("Parent starting...");
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("Old method (deprecated)");
    }
}

class Child extends Parent {
    @Override
    public void start() {
        System.out.println("Child starting (overridden)");
    }
}

// ---------------- Class for @SafeVarargs and @SuppressWarnings ----------------

class Utils {

    @SafeVarargs
    public static final <T> void printAll(List<T>... lists) {
        for (List<T> list : lists) {
            System.out.println(list);
        }
    }

    @SuppressWarnings("unchecked")
    public static void uncheckedCast() {
        List raw = new ArrayList(); // raw type
        raw.add("Hello");
        List<String> list = (List<String>) raw; // unchecked cast
        System.out.println(list.get(0));
    }
}

// ---------------- Main Class ----------------

public class Problem_09
 {
    public static void main(String[] args) 
    {
        System.out.println("=== Annotation Demo ===");

        Child c = new Child();
        c.start();

        // Deprecated (warning suppressed)
        callDeprecated(c);

        // SafeVarargs example
        List<String> a = Arrays.asList("A", "B");
        List<String> b = Arrays.asList("C", "D");
        Utils.printAll(a, b);

        // SuppressWarnings example
        Utils.uncheckedCast();

        // @FunctionalInterface example
        Task t = () -> System.out.println("Running task...");
        t.run();

        // Read annotations via reflection
        Class<?> cls = Parent.class;

        System.out.println("\n--- Class Annotations on Parent ---");
        for (Annotation a1 : cls.getAnnotations()) {
            System.out.println(a1);
        }

        // Repeatable annotations
        System.out.print("\nRoles: ");
        for (Role r : cls.getAnnotationsByType(Role.class)) {
            System.out.print(r.value() + " ");
        }
    }

    @SuppressWarnings("deprecation")
    private static void callDeprecated(Parent p) {
        p.oldMethod();
    }
}
