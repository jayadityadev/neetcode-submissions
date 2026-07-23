class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs)
            sb.append(str.length()+"|"+str);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            StringBuilder sb = new StringBuilder();
            while (Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
                i++;
            }
            int len = Integer.parseInt(sb.toString());
            ans.add(str.substring(i+1, i+len+1));
            i = i + len + 1;
        }
        return ans;
    }
}
