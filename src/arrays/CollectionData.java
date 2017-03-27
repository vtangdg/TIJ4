package arrays;

import util.Generator;

import java.util.ArrayList;

/**
 * Created by degang on 17/3/25.
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }
}
