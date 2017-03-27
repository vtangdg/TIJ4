package util;

import arrays.CollectionData;
import util.Generator;

/**
 * Created by degang on 17/3/25.
 */
public class Generated {
    // 用生成器生成元素填充指定数组
    public static <T> T[] array(T[] a, Generator<T> gen) {
        return new CollectionData<>(gen, a.length).toArray(a);
    }

    // 通过反射动态创建一个新数组
    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type, Generator<T> gen, int size) {
        T[] a = (T[]) java.lang.reflect.Array.newInstance(type, size);
        return new CollectionData<>(gen, size).toArray(a);
    }
}
