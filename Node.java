public class Node <T> {
    private T data;
    public  Node next;

    public Node(T data){
        this.data=data;
        next =null;

    }
    T getData(){
        return data;
    }

}
