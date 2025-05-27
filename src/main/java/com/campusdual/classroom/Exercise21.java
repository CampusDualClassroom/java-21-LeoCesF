package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> collectionHashSet = new HashSet<>();
        collectionHashSet.add("ELEMENT KPRBC");
        collectionHashSet.add("ELEMENT YPBTM");
        collectionHashSet.add("ELEMENT AADXU");
        collectionHashSet.add("ELEMENT RXCGJ");
        collectionHashSet.add("ELEMENT WYMVD");
        collectionHashSet.add("ELEMENT WFGEJ");
        collectionHashSet.add("ELEMENT TYGBS");
        collectionHashSet.add("ELEMENT MAPTK");
        collectionHashSet.add("ELEMENT GJXVE");
        collectionHashSet.add("ELEMENT BAFGL");

        return collectionHashSet;
    }

    public static Set<String> createTreeSet() {
        Set<String> collectionTreeSet = new TreeSet<>();
        collectionTreeSet.add("ELEMENT KPRBC");
        collectionTreeSet.add("ELEMENT YPBTM");
        collectionTreeSet.add("ELEMENT AADXU");
        collectionTreeSet.add("ELEMENT RXCGJ");
        collectionTreeSet.add("ELEMENT WYMVD");
        collectionTreeSet.add("ELEMENT WFGEJ");
        collectionTreeSet.add("ELEMENT TYGBS");
        collectionTreeSet.add("ELEMENT MAPTK");
        collectionTreeSet.add("ELEMENT GJXVE");
        collectionTreeSet.add("ELEMENT BAFGL");

        return collectionTreeSet;
    }

    private static void printSet(Set<String> customSet) {
        for (String item : customSet) {
            System.out.println(item);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        set.add(elementToAdd);
        return true;
    }

    public static void main(String[] args) {
        Set<String> newHashSet = createHashSet();
        Set<String> newTreeSet = createTreeSet();

        boolean anhadidoHash = addElementToSet(newHashSet, "ELEMENTO AAA");
        boolean anhadidoTree = addElementToSet(newTreeSet, "ELEMENTO AAA");

        printSet(newHashSet);
        System.out.println("===============");
        printSet(newTreeSet);
    }

}
