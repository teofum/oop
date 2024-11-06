package Parcial2_2023_C2.E01;

public class RouteTester {
    public static void main(String[] args) {
        RouteCentral routeCentral = new RouteCentral(twoWayCost -> twoWayCost / 2);
        routeCentral.addOneWayRoute("EZE", "MIA", 1000);
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "MIA"));
        try {
            System.out.println(routeCentral.getDirectRouteMiles("MIA", "EZE"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        routeCentral.changeRouteCost("EZE", "MIA", 1250);
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "MIA"));
        try {
            routeCentral.changeRouteCost("MIA", "EZE", 8000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        routeCentral.addTwoWayRoute("EZE", "SCL", 5000);
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "SCL"));
        System.out.println(routeCentral.getDirectRouteMiles("SCL", "EZE"));
        routeCentral.changeRouteCost("EZE", "SCL", 3500);
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "SCL"));
        System.out.println(routeCentral.getDirectRouteMiles("SCL", "EZE"));
        routeCentral.addOneWayRoute("SCL", "MIA", 7500);
        System.out.println(routeCentral.getOneStopRouteMiles("EZE", "SCL", "MIA"));
        System.out.println(routeCentral.getOneStopRouteMiles("EZE", "SCL", "EZE"));
        try {
            System.out.println(routeCentral.getOneStopRouteMiles("EZE", "SCL", "YVR"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        routeCentral.addTwoWayRoute("EZE", "MIA", 9000);
        System.out.println(routeCentral.getDirectRouteMiles("EZE", "MIA"));
        System.out.println(routeCentral.getDirectRouteMiles("MIA", "EZE"));
    }
}
