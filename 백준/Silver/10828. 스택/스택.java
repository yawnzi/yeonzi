import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            String command = br.readLine();

            if(command.equals("top")) {
                if(stack.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(stack.peek()).append("\n");
                }
            }
            else if(command.equals("size")) {
                sb.append(stack.size()).append("\n");
            }
            else if(command.equals("empty")) {
                if(stack.isEmpty()) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if(command.equals("pop")) {
                if(stack.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(stack.pop()).append("\n");
                }
            }
            else if (command.startsWith("push")) {
                int a = Integer.parseInt(command.split(" ")[1]);
                stack.add(a);
            }
        }

        System.out.print(sb.toString());
    }
}
