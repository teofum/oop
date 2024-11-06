package Parcial2_2023_C2.E01;

import java.util.HashMap;
import java.util.Map;

public class RouteCentral {
    private final Map<Route, Integer> routeCosts;
    private final OneWayCostCalculator calc;

    public RouteCentral(OneWayCostCalculator calc) {
        this.calc = calc;
        this.routeCosts = new HashMap<>();
    }

    public void addOneWayRoute(String from, String to, int cost) {
        routeCosts.putIfAbsent(new Route(from, to), cost);
    }

    public void addTwoWayRoute(String from, String to, int cost) {
        addOneWayRoute(from, to, calc.calculate(cost));
        addOneWayRoute(to, from, calc.calculate(cost));
    }

    public void changeRouteCost(String from, String to, int cost) {
        var route = new Route(from, to);
        if (!routeCosts.containsKey(route)) {
            throw new RuntimeException("Route does not exist.");
        }

        routeCosts.put(route, cost);
    }

    public int getDirectRouteMiles(String from, String to) {
        var cost = routeCosts.get(new Route(from, to));
        if (cost == null) {
            throw new RuntimeException("Route does not exist.");
        }

        return cost;
    }

    public int getOneStopRouteMiles(String from, String via, String to) {
        return getDirectRouteMiles(from, via) + getDirectRouteMiles(via, to);
    }

    private record Route(String from, String to) {
    }

    @FunctionalInterface
    public interface OneWayCostCalculator {
        int calculate(int twoWayCost);
    }
}
