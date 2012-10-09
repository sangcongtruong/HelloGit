package com.mycompany.app;

/**
 * Created by IntelliJ IDEA.
 * User: pesekbdsds
 * Date: 12.10.11
 * Time: 13:37
 * To change this template use File | Settings | .
 */
public class BitStream {

    private boolean[] bits;

    public BitStream() {
        bits = new boolean[0];
    }

    public BitStream(boolean[] aBits) {
        bits = aBits;
    }

    public int getLength() {
        return bits.length;
    }






}
