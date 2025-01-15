package DSA.recursion;

/*

for example you have an array = {9,2,1,3,6,5,7,8,0,2}
o/p:
9
2 1
3 6 5
7 8 0 2

using single loop



 */




public class PrintInPattern {
    static void printName(int times, String name){
        if(times == 0)
            return;
        System.out.println(name);
        printName(--times,name);
    }
    static int printSumOfNNumbers(int n,int sum){
        if(n==0)
            return sum;
        sum += n;
        n--;
        return printSumOfNNumbers(n, sum);
    }
    static int printSumOfNNumbers(int n){
        if(n==0)
            return 0;
        return n + printSumOfNNumbers(n-1);
    }
    static void printLenearly(int n,int i){
        if(i == n){
            System.out.println(i);
                return;
        }
        System.out.println(i++);
        printLenearly(n,i);

    }
    public static void main(String[] args) {
        int arr[] = {9,2,1,3,6,5,7,8,0,2,1};
        int size = arr.length;
        int counter = 1;
        int index =0;

        while (size>=0){

            int temp = counter;
            while (temp!=0){
                temp--;
                System.out.print(arr[index]+" ");

                index++;
                if (index == arr.length)
                    break;;
            }
            if (index == arr.length)
                break;;



            System.out.println();
            counter++;
            size--;
        }
        printName(5,"yash");
        printLenearly(10,1);
        System.out.println(printSumOfNNumbers(10,0));
        System.out.println(printSumOfNNumbers(10));
    }
}
