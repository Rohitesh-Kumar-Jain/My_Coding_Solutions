Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
        array[i] = scanner.nextInt(); // read the next number of the array
        }

        System.out.println(Arrays.toString(array)); // output the array

