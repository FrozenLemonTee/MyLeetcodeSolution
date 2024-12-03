package interpret;

public class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G'){
                sb.append("G");
            }else if (command.charAt(i) == '(') {
                flag = 1;
            }else if (command.charAt(i) == 'a' || command.charAt(i) == 'l') {
                flag = 0;
            }else if (command.charAt(i) == ')'){
                if (flag == 0){
                    sb.append("al");
                }else {
                    sb.append("o");
                }
                flag = 0;
            }
        }
        return sb.toString();
    }
}
