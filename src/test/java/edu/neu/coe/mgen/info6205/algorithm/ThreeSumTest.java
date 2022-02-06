package edu.neu.coe.mgen.info6205.algorithm;

import apple.laf.JRSUIUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSum() {
        List<Integer> num = Arrays.asList(-1,0,1,2,-1,4);
        ThreeSum triples = new ThreeSum();
        ArrayList<ArrayList<Integer>> results = triples.threeSum(num);
        assertEquals(2,results.size());

    }
}