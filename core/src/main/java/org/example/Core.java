package org.example;

import org.apache.commons.lang3.StringUtils;

public class Core {
    public static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            if (!(StringUtils.isNumeric(s) && Integer.parseInt(s) > 0)) {
                return false;
            }
        }
        return true;
    }

    private Core() {
    }
}