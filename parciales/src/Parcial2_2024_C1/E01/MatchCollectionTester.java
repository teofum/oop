package Parcial2_2024_C1.E01;

public class MatchCollectionTester {
    public static void main(String[] args) {
        MatchCollection<String> sC = new MatchCollectionImpl<>();
        sC.add("Mundo");
        sC.add("Hola");
        sC.add("Hola");
        System.out.println(sC.size());
        System.out.println(sC.get(0));
        System.out.println(sC.get(1));
        System.out.println(sC.get(2));
        System.out.println(sC.contains("Mundo"));

        sC.addMatchPredicate(e -> e.length() >= 4);

        sC.add("Abc");
        sC.add("Wxyz");
        System.out.println(sC.size());
        System.out.println(sC.get(3));

        sC.addMatchPredicate(e -> e.contains("o"));
        sC.add("Lol!");

        for (String e : sC.getAllMatched()) {
            System.out.println(e);
        }

        for (String e : sC.getAllMatchedReversed()) {
            System.out.println(e);
        }
    }
}
