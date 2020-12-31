class FirstNonConsecutive {
    static Integer find(final int[] array) {

       int counter = 0;
       int non = 0;

        for (int i = 0; i<array.length-1; i++){
            if (array[i+1]- array[i]==1)
                counter++;
            else if (Math.abs(array[i+1]-array[i])==2) {
                non = i+1;
                break;
            }

        }

        System.out.println("=============");
        System.out.println(array[non]);
        System.out.println(non);
        System.out.println(counter);
        System.out.println(array.length);


        if (counter+1==array.length)
            return null; else
                return array[non];




    }
}
