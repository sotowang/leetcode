package main

import "fmt"

type Edges struct {
	From   string
	To     string
	Weight float64
}

func calcEquation(equations [][]string, values []float64, queries [][]string) []float64 {
	res := make([]float64, len(queries))
	edgeMap := make(map[string][]Edges)
	for i := range equations {
		edge := equations[i]
		v1, v2, weight := edge[0], edge[1], values[i]
		v1Egdes := edgeMap[v1]
		v1Egdes = append(v1Egdes, Edges{v1, v2, weight})
		edgeMap[v1] = v1Egdes

		v2Edges := edgeMap[v2]
		v2Edges = append(v2Edges, Edges{v2, v1, 1.0 / weight})
		edgeMap[v2] = v2Edges
	}
	for i := range queries {
		que1, que2 := queries[i][0], queries[i][1]
		_, ok := edgeMap[que1]
		if que1 == que2 && ok {
			res[i] = 1.0
		} else if _, ok2 := edgeMap[que2]; !ok && !ok2 {
			res[i] = -1.0
		} else {
			visited := make(map[string]bool)
			visited[que1] = true
			res[i] = dfs(&edgeMap, que1, que2, &visited, 1.0)
		}
	}
	return res
}
func dfs(edgeMap *map[string][]Edges, q1, q2 string, visited *map[string]bool, ans float64) float64 {
	edges := (*edgeMap)[q1]
	res := -1.0
	for _, edge := range edges {
		to, val := edge.To, edge.Weight
		if to == q2 {
			res = ans * val
			return res
		}
		if _, ok := (*visited)[to]; !ok {
			(*visited)[to] = true
			res = dfs(edgeMap, to, q2, visited, ans*val)
			if res != -1.0 {
				return res
			}
		}
	}
	return -1.0
}
func main() {
	equations := [][]string{{"a", "b"}, {"b", "c"}}
	values := []float64{2.0, 3.0}
	querys := [][]string{{"a", "c"}, {"b", "a"}, {"a", "e"}, {"x", "x"}}
	fmt.Printf("%v", calcEquation(equations, values, querys))

}
