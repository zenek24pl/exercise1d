package wdsr.exercise1.logic;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Created by Marek on 14.02.2016.
 */
public class Calculator {
    public int min(int... values) {
        return NumberUtils.min(values);
    }

    public int max(int... values) {
        return NumberUtils.max(values);
    }
}
