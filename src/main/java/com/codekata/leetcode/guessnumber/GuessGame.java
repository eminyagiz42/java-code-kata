package com.codekata.leetcode.guessnumber;

/**
 * The type Guess game.
 */
public abstract class GuessGame {

    /**
     * Guess int.
     *
     * @param n the n
     * @return the int
     */
    public static int guess(int n) {
        int num = 6;
        return Integer.compare(n, num);
    }
}
