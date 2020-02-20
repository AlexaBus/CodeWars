package com.busurca;

import static org.junit.Assert.*;
import org.junit.Test;

public class StockListTest {

    @Test
    public void test1() {
        String art[] = new String[]{};
        String cd[] = new String[] {"A", "B"};
        assertEquals("",
                StockList.stockSummary(art, cd));
    }
}
