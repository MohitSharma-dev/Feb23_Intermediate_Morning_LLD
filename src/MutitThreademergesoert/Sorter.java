package MutitThreademergesoert;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService es;
    Sorter(List<Integer> arr, ExecutorService es){
        this.arrayToSort = arr;
        this.es = es;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        int size = arrayToSort.size();
        int mid = size / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i = 0; i < mid; i++){
            leftArray.add(arrayToSort.get(i));
        }

        for(int i = mid; i < size; i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftArraySorter = new Sorter(leftArray,es);
        Sorter rightArraySorter = new Sorter(rightArray,es);

//        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> LeftSortedArrayFuture = es.submit(leftArraySorter);
        Future<List<Integer>> RightSortedArrayFuture= es.submit(rightArraySorter);

        List<Integer> sortedLeftArray =  LeftSortedArrayFuture.get();
        List<Integer> sortedRightArray =  RightSortedArrayFuture.get();
        // to merge I'll have to wait to for both of them
        // Merge

        int i= 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }
}
