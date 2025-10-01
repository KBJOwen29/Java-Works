/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.greedy_algorithm_approach.Number1;
import java.util.PriorityQueue;
    
/**
 *
 * @author Jim Owen
 */
public class MinRefuelStops {
    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int fuel = startFuel, stops = 0, index = 0;
        
        while (fuel < target) {
            while (index < stations.length && stations[index][0] <= fuel) {
                pq.offer(stations[index][1]);
                index++;
            }
            
            if (pq.isEmpty()) return -1;
            
            fuel += pq.poll();
            stops++;
        }
        return stops;
    }

    public static void main(String[] args) {
        // Example test case
        int target = 100;
        int startFuel = 10;
        int[][] stations = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};

        int result = minRefuelStops(target, startFuel, stations);
        System.out.println("Minimum refuel stops: " + result);
    }
}
