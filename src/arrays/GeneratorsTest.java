package arrays;

import util.CountingGenerator;
import util.Generator;
import util.RandomGenerator;

/**
 * Created by degang on 17/3/25.
 */
public class GeneratorsTest {
    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.print(type.getSimpleName() + ": ");
            try {
                Generator<?> generator = (Generator<?>) type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.printf(generator.next() + " ");
                }
                System.out.println("");
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
        System.out.println("=============");
        test(RandomGenerator.class);
    }
}
