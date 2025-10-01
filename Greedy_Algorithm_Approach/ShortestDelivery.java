/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.greedy_algorithm_approach.Number3;

/**
 *
 * @author Jim Owen
 */
import java.util.*;
public class ShortestDelivery {
    public static int[] shortestDelivery(int n, int[][] roads) {
        List<int[]>[] adj = new List[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        for (int[] road : roads) adj[road[0]].add(new int[]{road[1], road[2]});
        
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0});
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0], u = curr[1];
            for (int[] neighbor : adj[u]) {
                if (dist[neighbor[0]] > d + neighbor[1]) {
                    dist[neighbor[0]] = d + neighbor[1];
                    pq.offer(new int[]{dist[neighbor[0]], neighbor[0]});
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] roads = {{0, 1, 10}, {0, 2, 3}, {1, 2, 1}, {2, 3, 2}, {3, 4, 8}, {1, 4, 7}};

        int[] result = shortestDelivery(n, roads);
        System.out.println("Shortest distances from source: " + Arrays.toString(result));
    }
}
