package com.epam.jf.Shabashov.homework;


public class Task9 extends com.epam.jf.common.homework.Task9{

    public boolean isPowerOfTwo(long value) {
        if ((value & 1L) != 0) return false;
        if (Long.bitCount(value)==1) return true;
        return false;
    }
}