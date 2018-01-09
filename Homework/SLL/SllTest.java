public class SllTest{
    public static void main(String[] args) {
        Sll node1 = new Sll(1, null);
        Sll.SinglyLinked(node1);
        node1.add(22);
        node1.add(24);
        node1.add(23);
        node1.add(2);
        node1.add(3);

        // node1.setValue("1");
        // node1.setNext("null");

        node1.nodeInfo();
        // node1.find(3);
        // node1.remove();
        // node1.nodeInfo();
        // node1.find(3);
        node1.remove(3);
        node1.nodeInfo();


    }
}