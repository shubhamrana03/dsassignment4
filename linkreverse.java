import java.util.*;
class node
{
 node head = null;
 int data;
 node next;
public node()
{
 this.data=0;
 this.next= null;
}
public node(int data1)
{
 this.data=data1;
 this.next= null;
}

public node add(int data)
{
  node a = new node(data);
  if(head == null)
{
head=a;
}
else
{ 
 node temp = head;
   while(temp.next!=null) //tb tak chlega jb tk use next me null nahi mil jata.
{
 temp=temp.next;
}

temp.next=a;
}
return head;
}
public node reverse(node d1)
{
   node a1 = new node();
   node prev=null;
   node curr=d1;
   node next=null;
   while(curr!=null)
   {
   	 next=curr.next;
   	 curr.next=prev;
   	 prev=curr;
   	 curr=next;

   }
   d1=prev;
   return d1;
}

public void printlist(node head)
{
 node temp=head;
while(temp!=null)
{
 

 System.out.print(temp.data);
 System.out.println();
temp=temp.next;
}
}
}

public class linkreverse
{
public static void main(String[] args) 
{
node l = new node();
 Scanner in = new Scanner(System.in);
 int d;
 d = in.nextInt();
 node h=null;
 while(d!=0)
{
int n=in.nextInt();
 h=l.add(n);
 d--;
}
 System.out.println("Answer is");

//l.printlist(h);
 h =l.reverse(h); 
  l.printlist(h);



}
}