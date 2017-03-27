package containers;

import java.util.Random;

/**
 * Created by degang on 17/3/20.
 */
public class Prediction {
    private static Random random = new Random((47));
    private boolean shadow = random.nextBoolean();

    @Override
    public String toString() {
        if (shadow) {
            return "winter";
        } else {
            return "spring";
        }
    }

}
