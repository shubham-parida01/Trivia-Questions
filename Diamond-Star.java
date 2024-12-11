class Main {
    public static void main(String[] args) {
        int height = 15;
        for (int i = 1 ; i<= (height/2)+1 ; i++){
            for (int k = 0 ; k < ((height/2) - i+1) ; k++){
                System.out.print(" ");
            }
            for (int j = 0 ; j < i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = height/2; i >0 ; i--){
            for (int k = 0 ; k < height/2 -i +1 ; k++){
                System.out.print(" ");
            }
            for (int j = i ; j > 0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
