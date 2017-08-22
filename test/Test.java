package test;

import java.util.ArrayList;
import test.sort.select.*;
import test.sort.insert.*;

public class Test {
    private static ArrayList<TestInterface> testList = new ArrayList<TestInterface>();

    public static void main(String[] args) {
        // 添加测试用力列表
        testList.add(new SortIterationTest());
        testList.add(new RecursionSortTest());
        testList.add(new InsertSortIterationTest());

        for (TestInterface item : testList){
            item.test();
        }
    }
}
