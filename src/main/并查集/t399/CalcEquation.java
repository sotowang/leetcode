package 并查集.t399;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/1/4 22:53
 */
public class CalcEquation {
    private class Edges{
        String from;
        String to;
        double weight;
        public Edges(String from, String to, double weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] res = new double[queries.size()];
        HashMap<String, List<Edges>> map = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            List<String> edge = equations.get(i);
            String v1 = edge.get(0);
            String v2 = edge.get(1);
            double weight = values[i];
            //添加 v1-v2的边
            List<Edges> v1Edges = map.get(v1);
            if (v1Edges == null) {
                v1Edges = new ArrayList<>();
                map.put(v1, v1Edges);
            }
            v1Edges.add(new Edges(v1, v2, weight));

            //添加 v2-v1的边
            List<Edges> v2Edges = map.get(v2);
            if (v2Edges == null) {
                v2Edges = new ArrayList<>();
                map.put(v2, v2Edges);
            }
            v2Edges.add(new Edges(v2, v1, 1.0 / weight));
        }

        //遍历
        for (int j = 0; j < queries.size(); j++) {
            String que1 = queries.get(j).get(0);
            String que2 = queries.get(j).get(1);
            if (que1.equals(que2) && map.containsKey(que1)) {
                res[j] = 1.0;
            } else if (!map.containsKey(que1) || !map.containsKey(que2)) {
                res[j] = -1.0;
            } else {
                List<String> visited = new ArrayList<>();
                visited.add(que1);
                res[j] = dfs(map, que1, que2, visited, 1.0);
            }
        }
        return res;
    }

    private double dfs(Map<String, List<Edges>> edgeMap, String q1, String q2,  List<String> visited ,double ans) {
        List<Edges> edges = edgeMap.get(q1);
        for (Edges edge :
                edges
        ) {
            String to = edge.to;
            double val = edge.weight;
            if (to.equals(q2)) {
                return ans * val;
            }
            if (!visited.contains(to)) {
                visited.add(to);
                return dfs(edgeMap, to, q2, visited, ans * val);
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        List<List<String>> equations = new ArrayList<>();
        List l1 = Arrays.asList("x1", "x2");
        List l2 = Arrays.asList("x2", "x3");
        List l3 = Arrays.asList("x1", "x4");
        List l4 = Arrays.asList("x2", "x5");
        equations.add(l1);
        equations.add(l2);
        equations.add(l3);
        equations.add(l4);
        double[] values = {3.0, 0.5, 3.4, 5.6};
        List<List<String>> queries = new ArrayList<>();
        List q1 = Arrays.asList("x2", "x4");
        List q2 = Arrays.asList("x1", "x5");
        List q3 = Arrays.asList("x1", "x3");
        List q4 = Arrays.asList("x5", "x5");
        List q5 = Arrays.asList("x5", "x1");
        List q6 = Arrays.asList("x3", "x4");
        List q7 = Arrays.asList("x4", "x3");
        List q8 = Arrays.asList("x6", "x6");
        List q9 = Arrays.asList("x0", "x0");

        queries.add(q1);
        queries.add(q2);
        queries.add(q3);
        queries.add(q4);
        queries.add(q5);
        queries.add(q6);
        queries.add(q7);
        queries.add(q8);
        queries.add(q9);

        double[] res = new CalcEquation().calcEquation(equations, values, queries);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
//        List<List<String>> equations = new ArrayList<>();
//        List l1 = Arrays.asList("a", "b");
//        equations.add(l1);
//        List l2 = Arrays.asList("b", "c");
//        equations.add(l2);
//        double[] values = {2.0, 3.0};
//        List<List<String>> queries = new ArrayList<>();
//        List q1 = Arrays.asList("a", "c");
//        List q2 = Arrays.asList("b", "a");
//        List q3 = Arrays.asList("a", "e");
//        List q4 = Arrays.asList("a", "a");
//        List q5 = Arrays.asList("x", "x");
//        queries.add(q1);
//        queries.add(q2);
//        queries.add(q3);
//        queries.add(q4);
//        queries.add(q5);
//
//        double[] res = new CalcEquation().calcEquation(equations, values, queries);
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//        }
    }
}
