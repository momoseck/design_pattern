package abstractFactory;

import factory.Lenovo;

public class MobileFactory implements IMobileAbstractFactory {
    @Override
    public IMobileAbstractFactory createMobile(String type) {
        IMobileAbstractFactory factory = null;
        if ("len".equalsIgnoreCase(type)) {
            factory = new LenovoMobileFactory();
        } else if ("sam".equalsIgnoreCase(type)) {
            factory = new SamsungMobileFactory();
        }
        return factory;
    }
}
