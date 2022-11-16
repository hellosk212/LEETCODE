/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


//Brute force is not applicable here
/*
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        for (int i = 1; i < n; i++)
            if (guess(i) == 0)
                return i;
        return n;
    }
}

*/

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */


//By using binary search it works 
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int h = n;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}
