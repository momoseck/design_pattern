package abstractFactory;

import factory.Lenovo;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MobileFactory factory= new MobileFactory();
        LenovoMobileFactory lmf= (LenovoMobileFactory)factory.createMobile("len");
        Lenovo ln= lmf.createLenovoMobile();
        ln.pictureCapacity();
    }
}
