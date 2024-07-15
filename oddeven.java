class EvenOdd {
    public static void main(String[] args) {
        int i;
        int a[] = {2, 5, 6, 3, 4};
        
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is an even number");
            } else {
                System.out.println(a[i] + " is an odd number");
            }
        }
    }
}
