package Medium;

import java.util.*;

public class LeetCode_271_EncodeAndDecode_String {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for (String s : strs) {
            encode.append(s.length());
            encode.append("#");
            encode.append(s);
        }
        return encode.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        int i = 0;
        List<String> decode = new ArrayList();
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            int len = Integer.valueOf(s.substring(i, j));
            decode.add(s.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }

        return decode;
    }
}
