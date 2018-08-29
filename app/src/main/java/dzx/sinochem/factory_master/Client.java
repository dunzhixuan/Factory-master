package dzx.sinochem.factory_master;

/**
 * 作者： 敦志轩 on 2018/8/29.
 * 邮箱： 997681136@qq.com
 */
public class Client {

    public static void main(String[] args){
        Factory factory = new ConcreteFractory();
//        Product p = factory.createProduct(ConcreteProductB.class);
        Product p = factory.createProduct();
        p.method();
    }
}
