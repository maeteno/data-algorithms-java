package test.sort.insert;

import test.TestInterface;
import sort.insert.*;
import java.util.Arrays;

public class InsertSortTest implements TestInterface{
    public void test(){
        InsertSort is = new InsertSort();
        System.out.println("插入排序，递归：");
        int[] a = new int[]{7,1,2,3,8,10,1,4,6,3,2,9,7,5};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(a));
        is.sort(a);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(a));
    }
}