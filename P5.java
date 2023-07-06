// wajp to find max of two integers 
// using turnary operator


class P5
{
public static void main(String args[])
{
int n1 = Integer.parseInt(args[0]);
int n2 = Integer.parseInt(args[1]);

//compare n1 and n2
int res = n1 > n2 ? n1 : n2;

System.out.println("res = " + res);
}
}