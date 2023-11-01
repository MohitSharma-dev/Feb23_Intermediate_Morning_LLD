package MutitThreademergesoert;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(8, 1 , 6 , 2 , 3 , 9 ,7 , 5);
        ExecutorService es = Executors.newCachedThreadPool();
        Sorter arrSorter = new Sorter(arr, es);
        Future<List<Integer>> sortedArrayFuture = es.submit(arrSorter);
        List<Integer> sortedArr = sortedArrayFuture.get();

        for(Integer i : sortedArr){
            System.out.print(i);
        }

    }
}
