
import java.util.Stack;

public class CollectionStack {

    void main() {

        Stack<String> flowers = new Stack<>();
        flowers.push("apples");
        flowers.pop();
        flowers.add("rose");
        flowers.add("jasmine");
        System.out.println(flowers.pop());
        // another way is by queue and the double queue
        // which are interface

    }

}
