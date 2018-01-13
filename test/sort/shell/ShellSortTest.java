package test.sort.shell;

import test.TestInterface;
import sort.shell.*;
import java.util.Arrays;

public class ShellSortTest implements TestInterface{

    public void test(){
        ShellSort rs = new ShellSort();
        int[] a = new int[]{1,2,3,8,10,1,4,6,3,2,9,7,5};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(a));
        rs.sort(a);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(a));
    }
}
