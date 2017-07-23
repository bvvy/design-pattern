package state.first;


/**
 * Created by bvvy on 2017/7/21.
 */
public class GumBallMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER =2;
    final static int SOLD = 3;
    int state = SOLD_OUT;
    int count = 0;

    public GumBallMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("you cant insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("you insert a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("you cant insert a quarter the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("please wait we're already giving you a gumball");
        }
    }
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("quarter return");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("you haven't insert  a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("you cant insert a quarter the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("turn twice does't return a gumball");

        }
    }
    public void turnCrank() {
        if (state == HAS_QUARTER) {
            state = SOLD;
            dispense();
            System.out.println("you cant insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("you insert a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("you cant insert a quarter the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("please wait we're already giving you a gumball");

        }
    }

    public void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("you cant insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("you insert a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("you cant insert a quarter the machine is sold out");
        } else if (state == SOLD) {
            if (count == 0) {
                state = SOLD_OUT;

            } else state = NO_QUARTER;
            System.out.println("please wait we're already giving you a gumball");

        }

    }

}
