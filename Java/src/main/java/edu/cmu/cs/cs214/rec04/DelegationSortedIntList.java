package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private SortedIntList sortedList;
    private int totalAdded;

    public DelegationSortedIntList() {
        sortedList = new SortedIntList();
        totalAdded = 0;
    }

    public boolean add(int val) {
        totalAdded++;
        return sortedList.add(val);
    }

    public boolean addAll(IntegerList vals) {
        totalAdded += vals.size();
        return sortedList.addAll(vals);
    }

    public int get(int index) {
        return sortedList.get(index);
    }

    public boolean remove(int val) {
        return sortedList.remove(val);
    }

    public boolean removeAll(IntegerList vals) {
        return sortedList.removeAll(vals);
    }

    public int size() {
        return sortedList.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}