package arrays;

import util.Generated;
import util.Generator;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by degang on 17/3/25.
 */
public class CompType implements Comparable<CompType> {
    private int i;
    private int j;
    private static int count = 1;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        if (count++ % 2 == 0) {
            result += "\n";
        }
        return result;
    }

    @Override
    public int compareTo(CompType rv) {
        return (i < rv.i) ? -1 : (i == rv.i ? 0 : 1);
    }

    private static Random r = new Random(47);

    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(r.nextInt(100), r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[6], generator());
        System.out.println("排序前：");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(a));
    }
}
