import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Stack<String> stk = new Stack<>();
        // we use push() to add elements in Stack.
        stk.push("Apple");
        stk.push("Mango");
        stk.push("Banana");
        stk.push("Grapes");
        stk.push("Kiwi");
        System.out.println("Contents: "+ stk);
        System.out.println("Search: "+ stk.search("Banana"));//search() return index of element if exist, if element not found it returns -1.  
        System.out.println("is stack empty: " + stk.empty());//empty() is used to check the stack is empty or not.
        System.out.println("Top most element: " + stk.peek());//peek() returns last element or top element in the stack.
        stk.pop();// it will remove last entered element from the stack, it does not take any argument.
        System.out.println("Contents after removing: "+ stk);
        System.out.println("Size: " + stk.size());
        System.out.println("Extracting using iterator: ");
        Iterator<String> it = stk.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //it.remove(); //it will remove the coming element. and make arl empty
        }
        System.out.println("after iteration: " + stk);
    }
}
