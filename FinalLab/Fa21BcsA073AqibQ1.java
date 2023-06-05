package FinalLab;

public class Fa21BcsA073AqibQ1 {
    public static void main(String[] args) {
        QueueWithTwoStacks<Integer> queue = new QueueWithTwoStacks<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        queue.enqueue(40);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
    }
}
