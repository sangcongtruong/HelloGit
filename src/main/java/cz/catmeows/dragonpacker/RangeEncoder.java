package cz.catmeows.dragonpacker;

/**
 * Created by IntelliJ IDEA.
 * User: pesekb
 * Date: 14.10.11
 * Time: 13:01
 * To change this template use File | Settings | File Templates.
 */
public class RangeEncoder {

    private int treshold;
    private RawBits toOut;
    private long state;
    private long upper;
    private long lower;


    public RangeEncoder(int ones, int zeroes) {
        treshold = Math.round( 256*((float)(ones+zeroes))/((float)zeroes));
        if (treshold==0) treshold++;
        if (treshold>254) treshold=254;
        toOut = null;
    }

    public RawBits encodeBit(boolean bit) {
        RawBits toReturn = null;
        long range = upper - lower;
        if (bit) {
          lower = lower + (range * treshold)>>8;
          if ((upper - lower)<1) {
              toOut = new RawBits();
              toReturn = toOut;
              lower = 0;
              upper = 0xffffffff;

          }
        } else {
          upper = lower + (range * treshold)>>8;
          if ((upper - lower)<1) {
              toOut = new RawBits();
              toReturn = toOut;
              lower = 0;
              upper = 0xffffffff;
          }
            /////
            /////
            ////

        }







        return toReturn;
    }



}
