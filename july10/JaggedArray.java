class JaggedArray{
    public static void main(String[] args){
        
        int arr[][] = new int[3][]; //Declaring a 2-D array

        arr[0] = new int[1]; //The first row has 1 column
        
        arr[1] = new int[2]; //The second row has 2 columns
        arr[2] = new int[3]; //The third row has 3  columns

        // Initializing array
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = count++;
            }
        }

        System.out.println("Contents of 2-D array are : ");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}