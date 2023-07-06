// wajp to multiply three numbers
// supplied by the user


class P2
{
public static void main(String args[])
{
double n1 = Double.parseDouble(args[0]);
double n2 = Double.parseDouble(args[1]);
double n3 = Double.parseDouble(args[2]);
double ans = n1 * n2 * n3;
System.out.println("ans = " + ans);
System.out.format("ans = %.3f" , ans);
}
}