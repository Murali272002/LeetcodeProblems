public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] input = {"flower", "flow", "flight"};

        System.out.println(solution.longestCommonPrefix(input));
    }

    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        // take temp_prefix string and assign first element of arr : a.
        String result = strs[0];

        // Iterate for rest of element in string.
        for (int i = 1; i < n; i++) {
            // .indexOf() return index of that substring from string.
            while (strs[i].indexOf(result) != 0) {

                // update matched substring prefx
                result = result.substring(0, result.length() - 1);

                // check for empty case. direct return if true..
                if (result.isEmpty()) {
                    return "";
                }
            }
        }
        return result;
    }
}
