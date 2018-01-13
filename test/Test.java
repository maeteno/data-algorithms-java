package test;

import java.util.ArrayList;
import test.sort.select.*;
import test.sort.insert.*;
import test.sort.bubble.*;
import test.sort.shell.*;

public class Test {
    private static ArrayList<TestInterface> testList = new ArrayList<TestInterface>();

    public static void main(String[] args) {
        // 添加测试用力列表
        testList.add(new SortIterationTest());
        testList.add(new RecursionSortTest());
        testList.add(new InsertSortIterationTest());
        testList.add(new InsertSortTest());
        testList.add(new BubbleSortTest());
        testList.add(new ShellSortTest());

        for (TestInterface item : testList){
            item.test();
        }
    }
}
