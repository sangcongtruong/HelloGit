package com.mycompany.app;

/**
 * Created bys IntelliJ IDEA.
 * User: pesekbvxcvxcvdfdfsdfsd
 * Date: 12.10.11dfsfsfsdfsdfdsfsdfsdfs
 * Time: 15:41bhbvhbv
 * To change this template use File | Settings | File Templates.
 */
public class Bit2 {

    public static Bit2 newZero() {
                return new Bit2(false);
    }

    public static Bit2 newOne() {
                return new Bit2(true);
    }

    private boolean b;

    public Bit2(boolean bit) {
        b = bit;
    }

    public Bit2(int bit) {
        b = (bit==0)?false:true;
    }

    public boolean value() {
        return b;
    }

    public int valueAsInt() {
        return b?1:0;
    }

    public char valueAsChar() {
        return b?'1':'0';
    }

    //is this ever used ?
}
