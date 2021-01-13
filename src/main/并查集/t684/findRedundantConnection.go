package t684

type unionFind struct {
	parent []int
}

func generate(n int) *unionFind {
	uf := unionFind{}
	uf.parent = make([]int, n)
	for i := 0; i < n; i++ {
		uf.parent[i] = i
	}
	return &uf
}
func (uf *unionFind) union(x, y int) bool {
	rootX, rootY := uf.find(x), uf.find(y)
	if rootX == rootY {
		return false
	}
	uf.parent[rootX] = rootY
	return true
}
func (uf *unionFind) find(x int) int {
	for uf.parent[x] != x {
		x = uf.parent[uf.parent[x]]
	}
	return x
}

func isCircle(edges [][]int, removeIndex int) bool {
	uf := generate(len(edges) + 1)
	for i := range edges {
		if i == removeIndex {
			continue
		}
		if !uf.union(edges[i][0], edges[i][1]) {
			return true
		}
	}
	return false

}
func findRedundantConnection(edges [][]int) []int {
	for i := len(edges) - 1; i >= 0; i-- {
		if !isCircle(edges, i) {
			return edges[i]
		}
	}
	return []int{}
}
