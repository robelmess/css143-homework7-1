import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }

    @Test
    public void remove() {
//SET 1 (S1)
        //A,B,C
        ArrayDictionary S1A=new ArrayDictionary(0);
        assertTrue("empty dictionary<int, int>, contain returns false with key -1",S1A.remove(-1)==false);
        ArrayDictionary S1B=new ArrayDictionary(0);
        assertTrue("empty dictionary<int, int>, contain returns false with key 0",S1B.remove(0)==false);// place holder
        ArrayDictionary S1C=new ArrayDictionary(0);
        assertTrue("empty dictionary<int, int>, contain returns false with key 1",S1C.remove(0)==false);
        //SET 2
        //A,B

        ArrayDictionary S2A=new ArrayDictionary(1);
        S2A.add(0,103);
        assertTrue("dictionary<int, int>, capacity 1, init values {0:103}, key=2 returns false",S2A.remove(2)==false);
        assertTrue("dictionary<int, int>, capacity 1, init values {0:103}, key=0 returns true", S2A.remove(0)==true);

        //SET 3
        //A,B,C,D
        ArrayDictionary S3A=new ArrayDictionary(2);
        S3A.add(0,103);
        S3A.add(1,105);
        assertTrue("dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=0 returns true",S3A.remove(0) == true);
        assertTrue("dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=1 returns true",S3A.remove(1)==true);
        assertTrue("dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=2 returns false",S3A.remove(2)==false);
        assertTrue("dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=3 returns false",S3A.remove(3)==false);

        // SET 4
        //dictionary<int, int>, capacity 3, init values {0:103, 1:105}, key=3 returns false
        ArrayDictionary S4A=new ArrayDictionary(3);
        S4A.add(0,103);
        S4A.add(1,105);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105}, key=3 returns false",S4A.remove(3)==false);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206}, key=1 returns true",S4A.remove(1)==true);

        //dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=1 returns true
        ArrayDictionary S5A=new ArrayDictionary(3);
        S5A.add(0,103);
        S5A.add(1,105);
        S5A.add(2,206);
        S5A.add(4,407);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=1 returns true",S5A.remove(1)==true);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=4 returns true",S5A.remove(4)==true);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=7 returns false",S5A.remove(7)==false);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=8 returns false",S5A.remove(8)==false);
    }

    @Test
    public void contains() {
        //SET 1 (S1)
        //A,B,C
        ArrayDictionary S1A=new ArrayDictionary(0);
        assertTrue("empty dictionary<int, int>, contain returns false with key -1",S1A.contains(-1)==false);
        ArrayDictionary S1B=new ArrayDictionary(0);
        assertTrue("empty dictionary<int, int>, contain returns false with key 0",S1B.contains(0)==false);// place holder
        ArrayDictionary S1C=new ArrayDictionary(0);
        assertTrue("empty dictionary<int, int>, contain returns false with key 1",S1C.contains(0)==false);
        //SET 2
        //A,B

        ArrayDictionary S2A=new ArrayDictionary(1);
        S2A.add(0,103);
        assertTrue("dictionary<int, int>, capacity 1, init values {0:103}, key=2 returns false",S2A.contains(2)==false);
        assertTrue("dictionary<int, int>, capacity 1, init values {0:103}, key=0 returns true", S2A.contains(0)==true);

        //SET 3
        //A,B,C,D
        ArrayDictionary S3A=new ArrayDictionary(2);
        S3A.add(0,103);
        S3A.add(1,105);
        assertTrue("dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=0 returns true",S3A.contains(0) == true);
        assertTrue("dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=1 returns true",S3A.contains(1)==true);
        assertTrue("dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=2 returns false",S3A.contains(2)==false);
        assertTrue("dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=3 returns false",S3A.contains(3)==false);

        // SET 4
        //dictionary<int, int>, capacity 3, init values {0:103, 1:105}, key=3 returns false
        ArrayDictionary S4A=new ArrayDictionary(3);
        S4A.add(0,103);
        S4A.add(1,105);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105}, key=3 returns false",S4A.contains(3)==false);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206}, key=1 returns true",S4A.contains(1)==true);

        //dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=1 returns true
        ArrayDictionary S5A=new ArrayDictionary(3);
        S5A.add(0,103);
        S5A.add(1,105);
        S5A.add(2,206);
        S5A.add(4,407);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=1 returns true",S5A.contains(1)==true);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=4 returns true",S5A.contains(4)==true);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=7 returns false",S5A.contains(7)==false);
        assertTrue("dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=8 returns false",S5A.contains(8)==false);
    }
}