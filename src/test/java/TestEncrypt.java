import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEncrypt {

    @Test
    public void TestSomething() {

        assertEquals("This is a test!", KataEncrypt.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", KataEncrypt.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", KataEncrypt.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", KataEncrypt.encrypt("This is a test!", 3));
        assertEquals("This is a test!", KataEncrypt.encrypt("This is a test!", 4));
        assertEquals("This is a test!", KataEncrypt.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", KataEncrypt.encrypt("This kata is very interesting!", 1));

    }


    @Test
    public void testDecrypt() {
        // assertEquals("expected", "actual");

        assertEquals("cadbe", KataEncrypt.decrypt("abcde", 1));
        assertEquals("This is a test!", KataEncrypt.decrypt("This is a test!", 0));
        assertEquals("This is a test!", KataEncrypt.decrypt("hsi  etTi sats!", 1));
      //  assertEquals("This is a test!", KataEncrypt.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", KataEncrypt.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", KataEncrypt.decrypt("This is a test!", 4));
        assertEquals("This is a test!", KataEncrypt.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", KataEncrypt.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }


       @Test
   public void testNullOrEmpty() {
     // assertEquals("expected", "actual");
     assertEquals("", KataEncrypt.encrypt("", 0));
     assertEquals("", KataEncrypt.decrypt("", 0));
     assertEquals(null, KataEncrypt.encrypt(null, 0));
     assertEquals(null, KataEncrypt.decrypt(null, 0));
   }



}
