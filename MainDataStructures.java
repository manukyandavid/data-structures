
public class MainDataStructures {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(15);
//        list.removeLast();
//        System.out.println(list.indexOf(2));
//        System.out.println(list.contains(3));
//        list.printList();

//        Stack stack = new Stack();
//        stack.push(8);
//        stack.show();
//        stack.push(15);
//        stack.show();
//        stack.push(25);
//        stack.show();
//        stack.push(2);
//        stack.show();
//        stack.push(27);
//        stack.show();
//        stack.push(27);
//        stack.show();
//        stack.pop();
//        stack.show();
//        stack.pop();
//        stack.show();
//        stack.pop();
//        stack.show();
//        stack.pop();
//        stack.show();
//        System.out.println(stack.size());

        Queue q = new Queue();
        q.enQueue(8);
        q.enQueue(7);
        q.enQueue(7);
        q.enQueue(6);
        q.enQueue(3);
        q.deQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(2);
        q.enQueue(2);
        q.show();
    }
}
