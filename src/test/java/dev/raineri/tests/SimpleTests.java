package dev.raineri.tests;

public class SimpleTests {

    {
        System.out.println("new Instance");
    }

    @Test
    void test_1(){
        System.out.println("Test 1 ran");
    }

    @Test
    void test_2(){
        System.out.println("Test 2 ran");
    }

    @Test
    void test_3(){
        System.out.println("Test 3 ran but there was an exception");
        throw new RuntimeException("OHHHHHH NOOOOOOOOO");
    }
    void not_aTest(){
        System.out.println("I am not a test!");
    }

    @Test
    void test_4(){
        System.out.println("Test 4 ran");
        JankAsserts.assertEquals(100,100);
    }

    @Test
    void test_5(){
        System.out.println("Test 5 ran");
        JankAsserts.assertEquals(25,50);
    }


}
