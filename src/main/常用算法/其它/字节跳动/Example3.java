package 常用算法.其它.字节跳动;

import java.util.*;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    private static int diffArea = 0;

    static class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }

        public void union(int i, int j) {
            int parentI = find(i);
            int parentJ = find(j);
            if (parentI == parentJ) {
                return;
            }
            parent[parentI] = parentJ;
        }

        public int find(int x) {
            while (x != parent[x]) {
                x = parent[parent[x]];
            }
            return x;
        }
    }

    public static List<List<Integer>> processOrder(List<int[]> list, int orderCount, List<Integer> orders) {
        diffArea = list.size();
        UnionFind uf = new UnionFind(orderCount);
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i)[0];
            int b = list.get(i)[1];
            if (uf.find(a) != uf.find(b)) {
                diffArea--;
                uf.union(a, b);
            }
        }
        Collections.sort(orders);
        List<List<Integer>> resList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int j = 0; j < orders.size(); j++) {
            List<Integer> temList = new ArrayList<>();

            int start = orders.get(j);
            if (set.contains(start)) {
                continue;
            }
            set.add(start);
            temList.add(start);
            int startParent = uf.find(start);
            for (int i = j + 1; i < orders.size(); i++) {
                if (!set.contains(orders.get(i)) && startParent == uf.find(orders.get(i))) {
                    if (!temList.contains(orders.get(i))) {
                        temList.add(orders.get(i));
                        set.add(orders.get(i));
                    }
                }
            }
            resList.add(temList);
        }
        Collections.sort(resList, (a, b) -> (a.get(0) - b.get(0)));
        return resList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        UnionFind df = new UnionFind(n);
        List<Integer> orders = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int[] nums = new int[2];
            int a = sc.nextInt();
            nums[0] = a;
            int b = sc.nextInt();
            nums[1] = b;
            list.add(nums);
            df.union(a, b);
            if (!orders.contains(a)) {
                orders.add(a);
            }
            if (!orders.contains(b)) {
                orders.add(b);
            }
        }
        List<List<Integer>> resList = processOrder(list, n, orders);
        System.out.println(resList.size());
        for (int i = 0; i < resList.size(); i++) {
            List<Integer> tem = resList.get(i);
            for (int j = 0; j < tem.size() - 1; j++) {
                System.out.print(tem.get(j));
                System.out.print(" ");
            }
            System.out.println(tem.get(tem.size() - 1));
        }

    }


}
