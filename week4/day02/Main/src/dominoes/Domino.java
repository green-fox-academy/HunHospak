package dominoes;

import java.util.Arrays;

public class Domino implements Comparable<Domino>{

    private final int left;

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino nextOne) {
        if (this.left < nextOne.left) {
            return -1;
        } else if (this.left == nextOne.left) {
            return 0;
        } else {
            return 1;
        }
    }
}