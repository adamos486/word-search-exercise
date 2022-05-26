import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem:
 * A word search is a common puzzle enjoyed by children and adults as a way to pass time and have a little fun. Generally
 * found in newspappers or puzzle books the person playing is given a rectangular grid of characters and a bank of words
 * that they are meant to find in said grid. A word is said to be "Found" when all characters that make up the word can
 * be circled in a continuous line going in any direction (up/down/side to side/diagonal).
 *
 * For an example word search please feel free to google for some or simply visit https://thewordsearch.com/
 *
 * Prompt:
 * Given a list of strings called "targetWords" and a Character[][] called "board" return a list of WordResult objects
 * that give each word and its solution if it exists.
 *
 * Assumptions:
 * 1) each word will be found only one time
 * 2) the board is of size NxM - meaning the length of board[a] is equal to the length of board[b] and same for
 *      board[x][a].length() == board[x][b].length()
 *
 * Solution Hint:
 * The solution can run at O(n*m) where n is the number of characters on the board and m is the number of words in the
 * list
 *
 */
public class WordSearchTemplate {

    /**
     * Helper class that holds an X, and Y location in of the starting point, as well as which direction the word goes
     */
    @Data
    @AllArgsConstructor
    public static class WordResult {
        int startingX;
        int startingY;
        String word;
        WordSearchSolution.WordResult.Direction direction;

        enum Direction {
            NORTH,
            NORTHEAST,
            EAST,
            SOUTHEAST,
            SOUTH,
            SOUTHWEST,
            WEST,
            NORTHWEST
        }
    }

    public static List<WordResult> searchForWords(List<String> searchForWords, Character[][] wordSearchBoard) {
        List<WordResult> results = new ArrayList<WordResult>();

        // TODO answer here

        return results;
    }

    public static void main(String[] args) {

        /**
         * ASSUMPTIONS: The board is not null
         * The board is of any size X and Y
         * each word will be found only once
         *
         * Optimizations:
         * Is it possible to not go in a direction if you know the starting position, the direction, and the word?
         *
         * General point of the problem:
         * What is the basic strategy that you would use? Can you code it? Can you write a test
         *
         */

        /**
         * Found these from here https://www.gameanswer.net/10x10-word-search-levels/
         */
        Character[][] board1 = new Character[][]{
                {'b', 'b', 'k', 'c', 's', 's', 'k', 'a', 'r', 'l'},
                {'s', 'l', 'i', 'i', 'h', 'f', 't', 'e', 'k', 'i'},
                {'a', 'a', 'u', 'i', 'w', 'e', 'o', 'r', 'h', 'm'},
                {'d', 'c', 'o', 'e', 'n', 'i', 'r', 'u', 'a', 'e'},
                {'w', 'k', 'e', 'a', 'b', 'i', 'o', 'r', 'r', 'w'},
                {'a', 'b', 't', 't', 's', 'e', 'i', 'b', 'y', 'h'},
                {'t', 'e', 'n', 't', 'i', 'o', 'r', 'l', 'a', 'n'},
                {'e', 'r', 'a', 's', 'p', 'b', 'e', 'r', 'r', 'y'},
                {'r', 'r', 'h', 'a', 'e', 'y', 'c', 'n', 'y', 'a'},
                {'l', 'y', 'e', 'j', 'a', 'l', 'e', 'm', 'o', 'n'}};
        String[] wordsToFind = new String[]{"water", "blackberry", "blueberry", "kiwi", "cherry", "four", "straw", "lime", "lemon"};
        List wordsAsList = Arrays.asList(wordsToFind);

        List<WordSearchSolution.WordResult> results = searchForWords(wordsAsList, board1);
        for (WordSearchSolution.WordResult result : results) {
            System.out.println(result.toString());
        }

        Character[][] board2 = new Character[][]{
                {'d', 'r', 'e', 'e', 'o', 'i', 'f', 't', 'e', 'd'},
                {'o', 'd', 'u', 'b', 'g', 'b', 'l', 'h', 'a', 'a'},
                {'a', 'w', 'e', 's', 't', 'd', 'a', 'h', 'r', 't'},
                {'t', 'l', 'a', 'p', 't', 'm', 's', 'x', 'o', 's'},
                {'l', 'e', 'a', 'e', 'm', 'g', 'h', 'o', 'e', 'd'},
                {'a', 'w', 'r', 'e', 'o', 'l', 'l', 'o', 'i', 'a'},
                {'h', 'i', 'r', 'o', 'n', 'o', 'i', 'h', 'o', 's'},
                {'k', 'n', 'i', 'f', 'e', 'v', 'g', 'e', 'e', 'k'},
                {'o', 'f', 's', 'n', 'o', 'e', 'h', 'd', 'n', 'e'},
                {'e', 'a', 'e', 's', 'o', 's', 't', 'a', 't', 'u'},
        };
        String[] wordsToFind2 = new String[]{"rust", "bell", "iron","knife","gloves","flashlight","axe","tool","hook","hammer"};
        List wordsAsList2 = Arrays.asList(wordsToFind2);

        System.out.println("Solution for board 2 is...");
        List<WordSearchSolution.WordResult> results2 = searchForWords(wordsAsList2, board2);
        for (WordSearchSolution.WordResult result : results2) {
            System.out.println(result.toString());
        }

    }
}
