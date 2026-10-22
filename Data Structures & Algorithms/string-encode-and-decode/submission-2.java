class Solution {

    private static char delimeter = '|';

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length());
            sb.append(delimeter);
            sb.append(str);
        }
        return new String(sb);
    }

    public List<String> decode(String str) {
        int i = 0;
        int len = 0;
        List<String> res = new ArrayList<>();
        while (i < str.length()) {
            StringBuilder sb = new StringBuilder();
            while (str.charAt(i) != delimeter) {
                sb.append(str.charAt(i++));
            }
            len = Integer.parseInt(sb.toString());
            sb = new StringBuilder();
            i++;
            while (len > 0) {
                sb.append(str.charAt(i));
                len--; i++;
            }
            res.add(sb.toString());
        }
        return res;
    }
}
