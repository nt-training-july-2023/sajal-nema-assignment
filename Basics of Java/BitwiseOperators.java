public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println(~(1));     //-2 
        //Algorithm:
            //1) Take 1's Complement : 1 -> 0
            //2) Take 2's Complement : 0 -> 1 ---> 1
                                                // 1
                                              //  ------
                                                 //10
            
        System.out.println(1 << 2);     //100 --> 4

        System.out.println(1 >> 2);     //001 --> 0

        System.out.println(1 >>> 2);    //Unsigned right shift   // 0

        System.out.println(2 & 3);      // 10 & 11 = 10 ---> 2

        System.out.println(2 | 3);      // 10 | 11 = 11 ---> 3

        System.out.println(1 ^ 1);      // 01 ^ 01 = 0
    }
}
