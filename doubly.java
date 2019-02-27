import java.util.Scanner;
class node{
    int data;
    node prev;
    node next;
    node head=null;
    public node()
    {
      data=0;
      next=null;
      prev=null;
    }
    public node(int data)
    {
      this.data=data;
      next=null;
      prev=null;
    }
    public node begin(int data)
    {
      node n=new node(data);
      if (head==null)
      {
        n.prev=head;
        head=n;
      }
      else
      {
        n.next=head;
        n.prev=head;
        head=n;
      }
      return head;
    }
    
    public void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
    
    
    
}
 class doubly {
    public static void main(String[] args) {
        int data;
        node p=new node();//////ACCESING FUNCTIONS OF CLASS NODE
        node head1;////HEAD OF LIST
       System.out.println("enter number of elements ");
       Scanner s1=new Scanner(System.in);
       int n=s1.nextInt();
       for(int i=1;i<=n;i++){
         data=s1.nextInt();
         head1=p.begin(data);
       }
       //p.display(head1);
        node temp=head1;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
}
