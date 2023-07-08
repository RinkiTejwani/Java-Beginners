// wajp to find sum of first "n" +ve integers
// i/p: 5       1+2+3+4+5 = 15
// i/p: 3       1+2+3 = 6


class P10 {
public static void main(String args[]) {
int num = Integer.parseInt(args[0]);


if (num > 0) {
        int i = 1, sum = 0;
        do {
                sum = sum + i;
                i = i + 1;
        } while( i <= num );
        System.out.println("sum = " + sum);

}
else
{
System.out.println("invalid input");
}

}
}