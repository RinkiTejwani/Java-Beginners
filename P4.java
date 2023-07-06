// wajp to find min of two integers

class P4
{
public static void main(String ... args)
{
double n1 = Integer.parseInt(args[0]);
double n2 = Integer.parseInt(args[1]);
double res = n1 < n2 ? n1 : n2;
System.out.println("min = " + res);
}
}


// ? : ==> turnary op / conditional op / if else op