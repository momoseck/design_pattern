package abstractFactory;

import factory.Samsung;

public class SamsungMobileFactory extends MobileFactory{
    Samsung createSamsungMobile(){
        return new Samsung();
    }
}
