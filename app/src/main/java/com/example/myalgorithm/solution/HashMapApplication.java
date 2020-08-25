package com.example.myalgorithm.solution;

import java.util.HashMap;
//HashMap 题
public class HashMapApplication {
    private static final String TAG = "HashMapApplication";
        public HashMapApplication() {
        }

    /**
     * 387. 字符串中的第一个唯一字符
     * @param s;输入字符串
     * @return
     */
    public int firstUniqChar(String s) {
            HashMap<Character, Integer> count = new HashMap<>();
            int n = s.length();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                count.put(c, count.getOrDefault(c, 0) + 1);
            }

            for (int i = 0; i < n; i++) {
                if (count.get(s.charAt(i)) == 1) {
                    return i;
                }
            }
            return -1;
        }



    public static void main(String [] args) {
        HashMapApplication test = new HashMapApplication();
        String inputString = new String("abcdbcd");
        int result = test.firstUniqChar(inputString);
        System.out.println("result:");
        System.out.println(result);
    }

}
