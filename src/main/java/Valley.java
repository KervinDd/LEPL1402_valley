import java.util.Arrays;

public class Valley{


    public static int valleyUn(int[] slopes, int init) {
      if (init == slopes.length) return 0;

      int first = slopes[init];
      if (first == -1) return valleyUn(slopes, init+1);

      int count = (int) Arrays.stream(slopes).skip(init).takeWhile(x-> x==1).count();
      return Math.max(count, valleyUn(slopes, init + count));
    }

    public static int valleyMinusUn(int[] slopes, int init) {
        if (init == slopes.length) return 0;

        int first = slopes[init];
        if (first == 1) return valleyMinusUn(slopes, init+1);

        int count = (int) Arrays.stream(slopes).skip(init).takeWhile(x-> x==-1).count();
        return Math.max(count, valleyMinusUn(slopes, init + count));
    }

    /**
     * Compute the deepest valley and highest mountain
     * @param slopes A non-empty array of slope
     * @return An array of two element. The first is the
     *         depth of the deepest valley and the second
     *         the height of the highest mountain
     */
    public static int[] valley (int[] slopes){
        int maxDeep = valleyMinusUn(slopes, 0);
        int maxHigh = valleyUn(slopes, 0);
        return new int[] {maxDeep, maxHigh};
//        if (slopes.length == 1) return slopes[0] == 1 ? new int[] {0, 1} : new int[] {1,0};
//
//        int [] toReturn = new int[2];
//        int current = 0;
//        int deepest = slopes[0];
//        int highest = slopes[0];
//
//        System.out.println(Arrays.toString(slopes));
//        System.out.println(slopes.length);
//        System.out.println(" ");
//
//        for(int i = 1 ; i < slopes.length ; i++){
//
//            System.out.println(deepest);
//            System.out.println(highest);
//            System.out.println("");
//            System.out.println(Arrays.toString(toReturn));
//            System.out.println("");
//
//
//            if( slopes[i] == slopes[i - 1] && slopes[i] == -1 ){
//                System.out.println("down");
//                highest = 0;
//                deepest --;
//                if ( -deepest >= toReturn[0] ){ toReturn[0] = deepest; }
//
//            }
//
//            if( slopes[i] == slopes[i - 1] && slopes[i] == 1 ){
//                System.out.println("up");
//                deepest = 0;
//                highest ++;
//                if( highest >= toReturn[1] ){ toReturn[1] = highest; }
//
//
//            }
//            if( slopes[i] != slopes[i-1] ){
//                highest = 1;
//                deepest = 1;
//            }
//        }
//        toReturn[0] = Math.abs(toReturn[0]);
//        System.out.println(Arrays.toString(toReturn));
//
//        return toReturn;
    }
}
