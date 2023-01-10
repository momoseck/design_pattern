package abstractFactory;

import factory.Lenovo;

public class LenovoMobileFactory extends MobileFactory{
    Lenovo createLenovoMobile(){
        return new Lenovo();
    }
}
