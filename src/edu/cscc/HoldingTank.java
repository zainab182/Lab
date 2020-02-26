package edu.cscc;
//Zainab ALi 02/19/20 Lab5
public class HoldingTank {
    private int current;
    private int maxCapacity;

    public HoldingTank(int current, int maxCapacity) {
      this.current = current;
      this.maxCapacity = maxCapacity;

    }
        public int getCurrent() {
            return current;
        }
        public int getMaxCapacity () {
            return maxCapacity;
        }

    public void add(int i) {
        current = current+i;
        if (this.current > maxCapacity) {
            this.current = maxCapacity;
        } else {
            this.current = current;
        }
    }
    public void drain(int i) {
        current=current-i;
        if ((this.current - i) < 0) {
            this.current = 0;
        } else {
            this.current = current;
        }
    }
    public void print() {
        System.out.println("The Tank volume is: " + this.current + " gallons");
    }
}