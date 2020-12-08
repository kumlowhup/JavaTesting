public class foring {
    public static void main(String[] args) {
        int k;
        k = 8;
        for(int i = 1;i < k;i++){
            for(int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        k = 0;
        for(int i = 8;i > k;i--){
            for(int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}


