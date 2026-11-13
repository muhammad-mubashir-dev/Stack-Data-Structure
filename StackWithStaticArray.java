
class Stack {
    int n = 5;
    int index = 0;
    int[] a = new int[n];

    public Stack() {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    void push(int item) throws Exception {
        if (isFull())
            throw new StackOverFlowException("Stack is full");
        a[index++] = item;
        System.out.println("Item " + item + " added Succecfuly");

    }

    void pop() throws StackUnderFlowExeption {
        if (isEmpty())
            throw new StackUnderFlowExeption("Stack is Empty");
        a[index - 1] = 0;
        index--;
        System.out.println("Item removed Succecfuly");

    }

    int peek() throws StackUnderFlowExeption {
        if (isEmpty())
            throw new StackUnderFlowExeption("Stack is Empty");
        return a[index - 1];
    }

    boolean isEmpty() {
        if (index == 0)
            return true;
        return false;
    }

    boolean isFull() {
        if (index == n)
            return true;
        return false;
    }

}

public class StackWithStaticArray {
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
            // stack.push(6);

            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
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