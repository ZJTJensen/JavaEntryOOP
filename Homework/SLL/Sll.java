public class Sll{
    private int value;
    private Sll next;
    private static Sll head;


    public Sll(int value, Sll next){
        this.value= value;
        this.next = next;
    }

    public void add(int value){
        Sll runner = head;
        if(this.head == null){
            this.head= new Sll( value, null);
            return;
        }
        while (runner.next != null){
            runner = runner.next; 
        }
        runner.next = new Sll(value, null);
    }
    


    public void remove(){
        Sll runner = head;
        while(runner != null){
            if(runner.next.next == null){
                runner.next = null;
            }
            runner = runner.next;
        }

    }


    public boolean remove(int value){
        Sll runner = head;
        int checker = 0;
        while(runner != null){
            if(checker + 1 == value){
                runner.next = runner.next.next;
                return true;
            }
            runner = runner.next;
            checker +=1;
        }
        return false;
    }

    public boolean find(int value){
        Sll runner = head;
        
        while(runner != null){
            if(runner.value == value){
                System.out.println("we found your value");
                return true;
            }
            runner = runner.next;
        }
        System.out.println("value not found");
        return false;
    }

    public static void SinglyLinked(Sll node1){
        head= node1;
    }
    
    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
    public void setNext(Sll next){
        this.next = next;
    }

    public Sll getNext(){
        return next;
    }
    public void setHead(Sll head){
        this.head = head;
    }

    public Sll getHead(){
        return head;
    }

    public void nodeInfo(){
        Sll runner = head;
        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }

    }
}