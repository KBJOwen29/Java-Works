/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.greedy_algorithm_approach.Number2;

/**
 *
 * @author Jim Owen
 */
import java.util.*;

public class RoadNetwork {
    static int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }
    
    static void union(int[] parent, int[] rank, int x, int y) {
        int rootX = find(parent, x), rootY = find(parent, y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) parent[rootY] = rootX;
            else if (rank[rootX] < rank[rootY]) parent[rootX] = rootY;
            else { parent[rootY] = rootX; rank[rootX]++; }
        }
    }
    
    public static int minCostToConnect(int n, int[][] roads) {
        Arrays.sort(roads, Comparator.comparingInt(a -> a[2]));
        int[] parent = new int[n], rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        
        int cost = 0, edges = 0;
        for (int[] road : roads) {
            if (find(parent, road[0]) != find(parent, road[1])) {
                union(parent, rank, road[0], road[1]);
                cost += road[2];    
                edges++;
                if (edges == n - 1) return cost;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] roads = {{0, 1, 1}, {1, 2, 2}, {2, 3, 3}, {0, 3, 4}, {1, 3, 5}};

        int result = minCostToConnect(n, roads);
        System.out.println("Minimum cost to connect all cities: " + result);
    }
}
