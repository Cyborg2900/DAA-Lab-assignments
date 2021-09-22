import java.util.Scanner;

class Linear_search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        while(test_case>0){
            
            int size,i,c=0;
            size=sc.nextInt();
            int ar[]=new int[size];
            for(i=0;i<size;i++){
                ar[i]=sc.nextInt();
            }
            int key=sc.nextInt();
            for( i=0;i<size;i++){
                if(ar[i]==key){
                    c++;
                    System.out.println("Present "+c);
                    break;
                }
                c++;
            }
            if(i==size)
                System.out.println("Not Present "+c);

            test_case--;
        }

        sc.close();

    }
}