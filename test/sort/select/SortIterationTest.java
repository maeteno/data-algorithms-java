package  test.sort.select;

import test.TestInterface;
import sort.select.*;

public class SortIterationTest implements TestInterface{

    public void test(){
        SortIteration si = new SortIteration();
        si.sort(new int[]{8,10,1,4,6,3,2,9,7,5});
    }
}