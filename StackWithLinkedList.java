class Stack {
    ListNode head;

    public Stack() {
        this.head = null;
    }

    boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }

    void pop() throws StackUnderFlowExeption {
        if (isEmpty())
            throw new StackUnderFlowExeption("Stack is Empty");
        head = head.next;
        System.out.println("Item removed succesfuly");

    }

    void push(int item) {
        ListNode newNode = new ListNode(item);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        head = newNode;
        head.next = temp;
        System.out.println("item added succesfuly");
    }

    int peek() throws Exception {
        if (isEmpty())
            throw new StackUnderFlowExeption("Stack is Empty");
        return head.data;
    }

}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackWithLinkedList {

    public static void main() {
        Stack stack = new Stack();
        try {
            // stack.peek();
            stack.push(1);
            System.out.println(stack.peek());
            stack.push(2);
            System.out.println(stack.peek());
            stack.push(3);
            System.out.println(stack.peek());
            stack.push(4);
            System.out.println(stack.peek());
            stack.push(5);
            System.out.println(stack.peek());
            stack.push(6);

            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            System.out.println(stack.peek());
            stack.pop();
            System.out.println(stack.peek());
            stack.pop();
            stack.pop();

        } catch (StackOverFlowException e) {
            System.err.println(e.getMessage());
        } catch (StackUnderFlowExeption e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program End");
        }
    }

}
