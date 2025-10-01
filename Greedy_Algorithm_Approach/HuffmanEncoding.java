/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.greedy_algorithm_approach.Number4;

/**
 *
 * @author Jim Owen
 */
import java.util.*;

public class HuffmanEncoding {
    public static int huffmanCost(int[] freq) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int f : freq) pq.offer(f);
        
        int cost = 0;
        while (pq.size() > 1) {
            int sum = pq.poll() + pq.poll();
            cost += sum;
            pq.offer(sum);
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] freq = {5, 9, 12, 13, 16, 45};

        int result = huffmanCost(freq);
        System.out.println("Minimum Huffman encoding cost: " + result);
    }
}
