package dzx.sinochem.factory_master;

/**
 * 作者： 敦志轩 on 2018/8/29.
 * 邮箱： 997681136@qq.com
 */
public abstract class Factory {

    /*
    * 抽象工厂方法
    * */
    public abstract Product createProduct();

//    public abstract <T extends Product> T createProduct(Class<T> clz);
}
