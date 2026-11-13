import java.util.Stack;

public class PushAtBottom {
    void pushAtBottom(Stack<String> s, String item) {
        if (s.isEmpty()) {
            s.push(item);
            return;
        }
        String temp = s.pop();
        pushAtBottom(s, item);
        s.push(temp);
    }

    void main() {
        Stack<String> flowers = new Stack<>();
        flowers.push("apples");
        flowers.pop();
        flowers.add("rose");
        flowers.add("jasmine");
        pushAtBottom(flowers, "lily");
        System.out.println(flowers.pop());
        System.out.println(flowers.pop());
        System.out.println(flowers.pop());
    }

}
