package containers;

/**
 * Created by degang on 17/3/20.
 */
public class Groundhog2 extends Groundhog {
    public Groundhog2(int number) {
        super(number);
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        // 不能单独使用obj instanceof Groundhog2来判断，违反了equals的对称性原则，比如dog instanceof Animal 为true, animal instanceof Dog 却为false
        // return obj instanceof Groundhog2 && (number == ((Groundhog2) obj).number); // 书中方法
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            // equals方法条件之一：对任何不是null的x，x.equals(null)为false
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Groundhog2 ghog2 = (Groundhog2)obj;

        return number == ghog2.number;
    }
}
