import java.util.Stack;

public class ReverseStack {

    void reverse(Stack<String> s) {
        if (s.empty()) {
            return;
        }
        String top = s.pop();
        reverse(s);
        new PushAtBottom().pushAtBottom(s, top);
    }

    void main() {
        Stack<String> flowers = new Stack<>();
        flowers.push("apples");
        flowers.add("rose");
        flowers.add("jasmine");
        flowers.add("lily");
        for (var a : flowers) {
            System.out.println(a);
        }
        reverse(flowers);
        System.out.println("Reverse stack");
        for (var a : flowers) {
            System.out.println(a);
        }
    }

}
