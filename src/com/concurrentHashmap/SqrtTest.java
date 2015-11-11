package com.concurrentHashmap;

import java.util.*;
import java.util.concurrent.*;
 
public class SqrtTest {
 private static final String CONCURRENCY_LEVEL_DEFAULT = "50";
 private static final String CONCURRENCY_KEY = "concurrency";
 private ConcurrentMap<Double, Double> sqrtCache = new ConcurrentHashMap<Double, Double>();
 
 public static void main(String args[]) {
     final SqrtTest test = new SqrtTest();
     final int concurrencyLevel = Integer.parseInt(System.getProperty(CONCURRENCY_KEY, CONCURRENCY_LEVEL_DEFAULT));
     final ExecutorService executor = Executors.newCachedThreadPool();
 
     try {
         for(int i = 0; i < concurrencyLevel; i++) {
             for(String s : args) {
                 final Double d = Double.valueOf(s);
                 executor.submit(new Runnable() {
                     @Override public void run() {
                         System.out.printf("sqrt of %s = %s in thread %s%n",
                             d, test.getSqrt(d), Thread.currentThread().getName());
                     }
                 });
             }
         }
     } finally {
         executor.shutdown();
     }
 }
 
 // 4 steps as outlined above
 public double getSqrt(Double d) {
     Double sqrt = sqrtCache.get(d);
     if(sqrt == null) {
         sqrt = Math.sqrt(d);
         System.out.printf("calculated sqrt of %s = %s%n", d, sqrt);
         Double existing = sqrtCache.putIfAbsent(d, sqrt);
         if(existing != null) {
             System.out.printf("discard calculated sqrt %s and use the cached sqrt %s", sqrt, existing);
             sqrt = existing;
         }
     }
     return sqrt;
 }
}