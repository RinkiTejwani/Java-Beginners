// wajp to find fact of int 
// using do while loop

class P11 {
public static void main(String args[]) {
int num = Integer.parseInt(args[0]);

if (num >= 0) {
        double i=1, f=1;
        do {
               f = f * i;
               i = i + 1;

        } while( i <= num);
        System.out.println("fact = " + f);
}
else {
System.out.println("invalid input");
}
}
}