class pac11 {
    public static int[][] create_arr() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = (int) ((Math.random() * 5) % 2);
            }
        }
        System.out.print("\nMatrix Values \n");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][];
        int i, j, count;
        arr = create_arr();
        System.out.println("\nRows Having ODD no of 1s");
        for (i = 0; i < 6; i++) {
            count = 0;
            for (j = 0; j < 6; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println("Row - " + (i + 1) + " has ODD no of 1s");
            }
        }
        System.out.println("\nColumns Having ODD no of 1s");
        for (i = 0; i < 6; i++) {
            count = 0;
            for (j = 0; j < 6; j++) {
                if (arr[j][i] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println("Column - " + (i + 1) + " has ODD no of 1s");
            }
        }
    }
}