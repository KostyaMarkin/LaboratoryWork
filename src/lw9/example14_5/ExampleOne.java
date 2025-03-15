package lw9.example14_5;

public class ExampleOne {
    public static void main(String[] args) {
        Node head = new Node(0,null);
        Node oldNode = head;
        for(int i = 1; i < 10 ; i++){
            if( i >= 9){
                Node newNode = new Node(i,null);
                oldNode.next = newNode;
                break;
            }
            Node newNode = new Node(i,head);
            oldNode.next = newNode;
            oldNode = newNode;
        }

        Node ref = head;
        while(ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
