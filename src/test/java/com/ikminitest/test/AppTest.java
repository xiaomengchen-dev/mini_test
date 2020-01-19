package com.ikminitest.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.ikminitest.test.service.MainFactory;
import com.ikminitest.test.service.impl.Main;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**JUNIT TEST for mini-test
     *  scanner can only be used in main function
     */
//    @Test
//    public static void main(String[] args) {
//        //Main test2 = new Main();
//        MainFactory<Main> mainFactory = Main::new;
//        Main test2 = mainFactory.create();
//        //System.out.println(test2.letterCombins("23"));
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()){
//            String s = scanner.nextLine();
//            System.out.println(test2.letterCombins(s));
//        }
//    }
    //注意这个不能忘记！！要不然后面无法调用
    private MainFactory<Main> mainFactory = Main::new;
    private Main main;
    @Before
    public void setUp() throws Exception {
        main = mainFactory.create();
    }

    @Test
    public void letterCombins() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ad");
        arr.add("ae");
        arr.add("af");
        arr.add("bd");
        arr.add("be");
        arr.add("bf");
        arr.add("cd");
        arr.add("ce");
        arr.add("cf");
        assertEquals(main.letterCombins("23"), arr);
//        assertEquals(main.letterCombins("23"), "[ad, ae, af, bd, be, bf, cd, ce, cf]");
    }


}
