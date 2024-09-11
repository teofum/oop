package E03;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(14);
        list.add(60);
        System.out.println(list);               // [5, 14, 60]
        System.out.println(list.get(0));        // 5
        System.out.println(list.get(1));        // 14
        System.out.println(list.get(2));        // 60
        System.out.println(list.indexOf(14));   // 1
        System.out.println(list.indexOf(3));    // -1
        System.out.println(list.size());        // 3

        list.remove(1);
        list.set(1, 45);
        System.out.println(list);               // [5, 45]
        System.out.println(list.size());        // 2

        list.add(12);
        System.out.println(list);               // [5, 45, 12]
        System.out.println(list.size());        // 3
    }
}
