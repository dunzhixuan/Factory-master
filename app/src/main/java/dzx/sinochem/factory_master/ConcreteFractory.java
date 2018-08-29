package dzx.sinochem.factory_master;

/**
 * 作者： 敦志轩 on 2018/8/29.
 * 邮箱： 997681136@qq.com
 */
public class ConcreteFractory extends Factory{

//    @Override
//    public <T extends Product> T createProduct(Class<T> clz) {
//        Product p = null;
//        try {
//            p = (Product) Class.forName(clz.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return (T) p;
//    }


    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }


}
