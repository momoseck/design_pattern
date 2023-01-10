package composite;

/**
 * design structural design pattern
 * Manager(Composite)
 * Developer(Leaf)
 * Employee(Component)
 */
public interface Employee {
    void add(Employee employee);

    void remove(Employee employee);

    Employee getChild(int i);

    String getName();

    double getSalary();

    void print();
}
