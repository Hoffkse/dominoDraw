/**
 * Created by hoffm on 2/27/2016.
 */
public class Domino {
    private int num1, num2;
    private int xCoordinate, yCoordinate, size;
    private String orientation;

    //simple private instance ints - 2 for each domino
    public Domino(int n, int j) {
        this.setNum1(n);
        this.setNum2(j);
        //constructor based on two param that user passes in which they want the nums on the domino they are creating to be
    }
    public Domino(int n, int j, int x, int y, int s, String o)
    {
        this.setNum1(n);
        this.setNum2(j);
        this.setXCoord(x);
        this.setYCoord(y);
        this.setSize(s);
        this.setOrientation(o);
    }
    public Domino (Domino d)
    {
        //copy constructor for copying one domino's var's to another domino obj
        this.setNum1(d.num1);
        this.setNum2(d.num2);
    }
    public int getNum1()
    {
        return this.num1;
    }
    public int getNum2()
    {
        return this.num2;
    }
    public void setNum1(int n)
    {
        this.num1 = n;
    }
    public void setNum2(int n)
    {
        this.num2 = n;
    }
    public void setXCoord(int x) {this.xCoordinate = x;}
    public void setYCoord(int y) {this.yCoordinate = y;}
    public void setSize(int s) {this.size = s;}
    public void setOrientation(String o) {this.orientation = o;}
    public int getXCood() {return this.xCoordinate;}
    public int getYCood() {return this.yCoordinate;}
    public int getSize() {return this.size;}
    public String getOrientation() {return this.orientation;}

    public String toString()
    {
        //converts domino to string
        return String.format("[" + this.num1 + "|" + this.num2 + "|" + this.xCoordinate + "|" + this.yCoordinate + "|" + this.size + "|" + this.orientation + "]");
    }

    public Boolean equals(Domino d)
    {
        //checks to see what cases are true/false to compared when placing domino left/right
        Domino c = (Domino) d;

        return Integer.compare(num1, c.num1) == 0 || Integer.compare(num1, c.num2) == 0 || Integer.compare(num2, c.num1) == 0 || Integer.compare(num2, c.num2) == 0;
    }

    public void swapNumbers()
    {
        //swaps the two digits on a domino between each other
        int holder;

        holder = this.num1;
        this.num1 = this.num2;
        this.num2 = holder;

    }
    public int getValue()
    {
        //adds the two values together on the domino for a total value
        int total;
        total = this.num1 + this.num2;
        return total;
    }

}
