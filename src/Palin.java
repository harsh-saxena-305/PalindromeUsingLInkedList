class Node
{
    private String string;
    private Node next;

    public Node()
    {
        string = null;
        next = null;
    }

    public Node(String string,Node next)
    {
        this.string = string;
        this.next = next;
    }

    public String getData()
    {
        return string;
    }

    public void setData(String string)
    {
        this.string = string;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }
}

public class Palin
{

    Node top;

    public Palin()
    {
        top = null;
    }
    public boolean isEmpty()
    {
        return (top==null);
    }
    public void push(String s)
    {
        Node n = new Node();
        n.setData(s);
        n.setNext(top);
        top = n;
    }
    public String pop()
    {
        String result;
        if(isEmpty())
        {
            System.out.println("LinkedList is empty");
            return "";
        }
        else
        {
            result = top.getData();
            top = top.getNext();
            return result;
        }
    }
    public void display()
    {
        Node temp = top;

        if(temp==null)
        {
            System.out.println("Linked list is Empty");
            return;
        }
        else
        {
            while (temp != null)
            {
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }

    public String cpm()
    {
        String s1 = "";
        Node n = top;

        while (n!= null)
        {
            s1 = s1.concat(n.getData());
            n = n.getNext();
        }
        return s1;
    }

    public static void main(String[] args)
    {
        Palin obj = new Palin();
        obj.push("N");
        obj.push("A");
        obj.push("M");
        obj.push("A");
        obj.push("J");
        obj.pop();
        obj.push("N");
        StringBuffer str = new StringBuffer(obj.cpm());

        String s = str.toString();
        String s1 = str.reverse().toString();

        if(s.equals(s1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
