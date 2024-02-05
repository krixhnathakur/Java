
public class Main {
    public static void main(String[] args) {


        // all the bitwise operator performs on binary numbers of that operand //


       /*
        AND "&" operator:
        --> output of each bit is 1 if corresponding 'bits of both'
            operand is 1, otherwise 0
        ex. 13 = 1101 and 14 = 1110 then,
             1101
             1110
         --> 1100 (which is 12 in decimal)
       */
       int a = 13 & 14;
        System.out.println(a);


       /*
        OR "|" operator:
        --> output of each bit is 1 if, 'at least one bit' of corresponding
            operand is 1, otherwise 0
        ex. 9 = 1001 and 10 = 1010 then,
             1001
             1010
         --> 1011 (which is 11 in decimal)
       */
       int b = 9 | 10;
        System.out.println(b);


        /*
        XOR "^" operator:
        --> output is 1 if "both bits are different"
        --> output is 0 if "both bits are same"
        ex. 5 = 0101 and 6 = 0110 then,
             0101
             0110
         --> 0011 (which is 3 in decimal)
       */
        int c = 5 ^ 6;
        System.out.println(c);


        /*
        NOT or complement operator "~" :
        examples ~12 --> -13
                 ~51 --> -52
                 ~31 --> -32
                 ~17 --> -18
       */
        int d = ~11;
        int e = ~40;
        System.out.println(d);
        System.out.println(e);


        /*
        Left Shift operator "<<" :
        --> it shift each bit towards left
        --> output is multiply by 2
        example:  5 << 2  (here 2 represents how many times we want to shift)
                  5  -->    0101
                  10 -->   01010  (shifted first time it becomes 10)
                  20 -->  010100  (shifted second time it becomes 20)
       */
        int f = 7 << 3;
        System.out.println(f);


        /*
        Right Shift operator ">>" :
        --> it shift each bit towards right
        --> output is divided by 2
        example:  20 >> 2  (here 2 represents how many times we want to shift)
                  20 -->   10100
                  10 -->   01010 0  (shifted first time and last 0 discarded, it becomes 10)
                  5  -->   00101 00 (shifted second time and last 00 discarded, it becomes 5)
       */
        int g = 18 >> 3;
        System.out.println(g);


    }
}