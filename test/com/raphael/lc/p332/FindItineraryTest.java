package com.raphael.lc.p332;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-05 13:39:42
 */
class FindItineraryTest {

    private final FindItinerary solution = new FindItinerary();

    @Test
    void t1() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC", "LHR"));
        tickets.add(Arrays.asList("JFK", "MUC"));
        tickets.add(Arrays.asList("SFO", "SJC"));
        tickets.add(Arrays.asList("LHR", "SFO"));
        List<String> ans = Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC");
        Assertions.assertEquals(ans, solution.findItinerary(tickets));
    }

    @Test
    void t2() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("JFK", "SFO"));
        tickets.add(Arrays.asList("JFK", "ATL"));
        tickets.add(Arrays.asList("SFO", "ATL"));
        tickets.add(Arrays.asList("ATL", "JFK"));
        tickets.add(Arrays.asList("ATL", "SFO"));
        List<String> ans = Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
        Assertions.assertEquals(ans, solution.findItinerary(tickets));
    }

    @Test
    void t3() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("JFK", "KUL"));
        tickets.add(Arrays.asList("JFK", "NRT"));
        tickets.add(Arrays.asList("NRT", "JFK"));
        List<String> ans = Arrays.asList("JFK", "NRT", "JFK", "KUL");
        Assertions.assertEquals(ans, solution.findItinerary(tickets));
    }

    @Test
    void t4() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("EZE", "AXA"));
        tickets.add(Arrays.asList("TIA", "ANU"));
        tickets.add(Arrays.asList("ANU", "JFK"));
        tickets.add(Arrays.asList("JFK", "ANU"));
        tickets.add(Arrays.asList("ANU", "EZE"));
        tickets.add(Arrays.asList("TIA", "ANU"));
        tickets.add(Arrays.asList("AXA", "TIA"));
        tickets.add(Arrays.asList("TIA", "JFK"));
        tickets.add(Arrays.asList("ANU", "TIA"));
        tickets.add(Arrays.asList("JFK", "TIA"));
        List<String> ans = Arrays.asList("JFK", "ANU", "EZE", "AXA", "TIA", "ANU", "JFK", "TIA", "ANU", "TIA", "JFK");
        Assertions.assertEquals(ans, solution.findItinerary(tickets));
    }
}
