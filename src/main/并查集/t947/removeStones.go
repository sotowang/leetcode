package t947

type unionFind struct {
	parent []int
	size   []int
}

func generate(n int) *unionFind {
	uf := unionFind{make([]int, n), make([]int, n)}
	for i := 0; i < n; i++ {
		uf.parent[i] = i
		uf.size[i] = 1
	}
	return &uf
}
func (uf *unionFind) union(i, j int) {
	parentI, parentJ := uf.find(i), uf.find(j)
	if parentI == parentJ {
		return
	}
	if uf.size[parentI] > uf.size[parentJ] {
		uf.parent[parentI] = parentJ
		uf.size[parentJ] += uf.size[parentI]
	} else {
		uf.parent[parentJ] = parentI
		uf.size[parentI] += uf.size[parentJ]
	}
}
func (uf *unionFind) find(x int) int {
	for uf.parent[x] != x {
		uf.parent[x] = uf.parent[uf.parent[x]]
		x = uf.parent[x]
	}
	return x
}
func removeStones(stones [][]int) int {
	uf := generate(20000)
	rootSet := make(map[int]bool)
	for i := range stones {
		uf.union(stones[i][0], stones[i][1]+10000)
	}
	for i := range stones {
		x := uf.find(stones[i][0])
		if _, ok := rootSet[x]; !ok {
			rootSet[x] = true
		}
	}
	return len(stones) - len(rootSet)
}
