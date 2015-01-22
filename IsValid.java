import java.io.IOException;


public class IsValid {
public static void main(String args[])throws IOException
{
	Node3 a=new Node3('A');
	Node3 b=new Node3('B');
	Node3 c=new Node3('C');
	Node3 d=new Node3('D');
	Node3 e=new Node3('E');
	Node3 f=new Node3('F');
	Node3 g=new Node3('G');
	Node3 h=new Node3('H');
	Node3 i=new Node3('I');
	
	f.left = b;
    f.right = g;
    b.left = a;
    b.right = d;
    d.left = c;
    d.right = e;
    g.right = i;
    i.left = h;
	checkBST(f,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
static Boolean checkBST(Node3 root,int min,int max)
{
	if(root==null)
	return true;
	if(min<root.data && root.data<max)
		return checkBST(root.left,min,root.data) && checkBST(root.right,root.data,max);
	else 
		return false;
}

}


class Node3{
	Node3 left;
	Node3 right;
	int data;
	
	Node3(char c)
	{
		this.data=c;
	}
}