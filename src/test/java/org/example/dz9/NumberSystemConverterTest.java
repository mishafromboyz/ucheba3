package org.example.dz9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSystemConverterTest {

//    @Test
//    void decimalToBinary() {
//        NumberSystemConverter nsc = new NumberSystemConverter();
//        String res = nsc.decimalToBinary("7");
//        assertEquals("111", res);
//    }
//
//    @Test
//    void binaryToDecimal() {
//        NumberSystemConverter nsc = new NumberSystemConverter();
//        int res = nsc.binaryToDecimal("10");
//        assertEquals(2, res);
//    }


    @Test
    void toOct()
    {
        NumberSystemConverter nsc = new NumberSystemConverter();
        nsc.toOct("0x1F");
        System.out.println(nsc.getContent());
        assertEquals("37" , nsc.getContent());
    }

    @Test
    void toBin()
    {
        NumberSystemConverter nsc = new NumberSystemConverter();
        nsc.toBin("0x1F");
        System.out.println(nsc.getContent());
        assertEquals("11111" , nsc.getContent());
    }

    @Test
    void toHex()
    {
//        NumberSystemConverter nsc = new NumberSystemConverter();
//        nsc.toHex("010");
//        System.out.println(nsc.getContent());
//        assertEquals("8" , nsc.getContent());
    }

    @Test
    void toDec()
    {
        NumberSystemConverter nsc = new NumberSystemConverter();
        nsc.toDec("0x1F");
        System.out.println(nsc.getContent());
        assertEquals("31" , nsc.getContent());
    }
}