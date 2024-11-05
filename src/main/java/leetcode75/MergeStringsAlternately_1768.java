package leetcode75;

//You are given two strings word1 and word2. Merge the strings
// by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional
// letters onto the end of the merged string.
//
//        Return the merged string.

public class MergeStringsAlternately_1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i >= word1.length()) {
                builder.append(word2.substring(i));
                return builder.toString();
            }
            if (i >= word2.length()) {
                builder.append(word1.substring(i));
                return builder.toString();
            }
            builder.append(word1.charAt(i)).append(word2.charAt(i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately_1768 test = new MergeStringsAlternately_1768();
        System.out.println(test.mergeAlternately("abc", "pqr")); //expected: "apbqcr"
        System.out.println(test.mergeAlternately("ab", "pqrs")); //expected: "apbqrs"
        System.out.println(test.mergeAlternately("abcd", "pq")); //expected: "apbqcd"
    }
}
