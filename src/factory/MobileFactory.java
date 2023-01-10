package factory;

public class MobileFactory {
    public MobileFactory() {
    }

    IMobile createMobile(String type) {
        IMobile mobile = null;
        if ("len".equalsIgnoreCase(type)) {
            mobile = new Lenovo();
            System.out.println("lenovo created");
        } else {
            mobile = new Samsung();
            System.out.println("Samsung created");
        }
        return mobile;
    }
}
