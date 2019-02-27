
import java.util.Scanner;
class Node
{
    int info;
    Node next;
    void display(Node r){
        Node temp=r;
        while(temp.next!=r){
            System.out.print(temp.info);
            temp=temp.next;
        }
        System.out.print(temp.info);
        
    }
}
class circularlist{
    public static void main(String[] args){
    Node p=null;
    Node q=null;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    ///int i;
    for(int i=0;i<n;i++){
    Node t=new Node();
    t.info=s.nextInt();
     t.next=null;
     if(p==null){
         p=t;
         t.next=p;
     }
     else {
         q=p;
         while(q.next!=p){
             q=q.next;
         }
         q.next=t;
         t.next=p;
         p=t;    
     }
     }
    p.display(p);
}
}
class LinkList1
{
    public static void main(String[] args)
    {
        Node n1=new Node();
        int a;
        Node d;
        
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        d=n1.add(a);
        do {
            a=s.nextInt();
            if(a!=-1)
            {
                d=n1.add(a);
            }
        } while (a!=-1);
        n1.display(d);
        
    }
}