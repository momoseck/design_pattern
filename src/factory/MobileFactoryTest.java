package factory;

public class MobileFactoryTest {


    public static void main(String[] args) {
        MobileFactory mobileFactory = new MobileFactory();
        Lenovo lenovo = (Lenovo) mobileFactory.createMobile("len");
        lenovo.cost();
        Samsung sam= (Samsung)mobileFactory.createMobile("sam");
        sam.cost();
    }
}
