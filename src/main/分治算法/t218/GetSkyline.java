package 分治算法.t218;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/2/25 18:20
 */
public class GetSkyline {

    class Tree {
        int x;
        int height;

        public Tree(int x, int height) {
            this.x = x;
            this.height = height;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tree tree = (Tree) o;
            return x == tree.x &&
                    height == tree.height;
        }

    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        if (buildings == null || buildings.length == 0 || buildings[0] == null || buildings[0].length == 0) {
            return res;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> (b - a));
        List<Tree> list = new ArrayList<>();
        for (int i = 0; i < buildings.length; i++) {
            Tree x = new Tree(buildings[i][0], buildings[i][2]);
            Tree y = new Tree(buildings[i][1], buildings[i][2]);
            if (list.size() > 0 && (list.get(list.size() - 1).equals(x))) {
                list.remove(x);
            } else {
                list.add(x);
            }
            list.add(y);

        }
        Collections.sort(list, (a, b) -> (a.x - b.x));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int height = list.get(i).height;
            int x = list.get(i).x;
            if (!maxHeap.contains(height)) {
                if (height > max) {
                    res.add(Arrays.asList(x, height));
                    max = height;
                }
                maxHeap.offer(height);
            } else {
                maxHeap.remove(height);
                if (height == max) {
                    if (!maxHeap.isEmpty()) {
                        max = maxHeap.peek();
                    } else {
                        max = 0;
                    }
                    if (i < list.size() - 1 && x == list.get(i + 1).x && height <= list.get(i + 1).height) {
                    } else {
                        res.add(Arrays.asList(x, max));
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] buildings1 = new int[][]{
                {0, 2, 3},
                {2, 5, 3},
        };
        System.out.println(new GetSkyline().getSkyline(buildings1));
        int[][] buildings = new int[][]{
                {2, 9, 10},
                {3, 7, 15},
                {5, 12, 12},
                {15, 20, 10},
                {19, 24, 8},
        };
        System.out.println(new GetSkyline().getSkyline(buildings));
    }
}
