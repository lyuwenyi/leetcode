package medium;

public class StringToIntergerAtoi {
    public int myAtoi(String s) {
        int res = 0;
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (flag != 0) {
                    break;
                }
            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (flag == 0) {
                    flag = 1;
                    sb.append(s.charAt(i));
                } else {
                    break;
                }
            } else if (s.charAt(i) == '0') {
                if (flag != 0 && flag != 1) {
                    sb.append(s.charAt(i));
                } else {
                    flag = 1;
                }
            } else if (s.charAt(i) > '0' && s.charAt(i) <= '9') {
                flag = 2;
                sb.append(s.charAt(i));
            } else {
                break;
            }
        }
        if (sb.length() > 0 && !(sb.toString().equals("+") || sb.toString().equals("-"))) {
            String resString;
            resString = sb.toString();
            try {
                res = Integer.parseInt(resString);
            } catch (Exception e) {
                if (resString.charAt(0) == '-') {
                    res = Integer.MIN_VALUE;
                } else {
                    res = Integer.MAX_VALUE;
                }
            }
        }
        return res;
    }
}
