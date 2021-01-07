package t547

type unionFind struct {
	parent []int
	size   []int
	count  int
}

func generate(n int) (uf *unionFind) {
	uf = &unionFind{}
	uf.size = make([]int, n)
	uf.parent = make([]int, n)
	for i := 0; i < n; i++ {
		uf.parent[i] = i
		uf.size[i] = 1
	}
	uf.count = n
	return
}

func (uf *unionFind) union(p, q int) {
	rootP, rootQ := uf.find(p), uf.find(q)
	if rootP == rootQ {
		return
	}

	if uf.size[rootP] > uf.size[rootQ] {
		uf.parent[rootQ] = rootP
		uf.size[rootP] += uf.size[rootQ]
	} else {
		uf.parent[rootP] = rootQ
		uf.size[rootQ] += uf.size[rootP]
	}
	uf.count--
}
func (uf *unionFind) find(x int) int {
	for x != uf.parent[x] {
		uf.parent[x] = uf.parent[uf.parent[x]]
		x = uf.parent[x]
	}
	return x
}

func findCircleNum(isConnected [][]int) int {
	uf := generate(len(isConnected))
	for i := range isConnected {
		for j := 0; j < i; j++ {
			if isConnected[i][j] == 1 {
				uf.union(i, j)
			}
		}
	}
	return uf.count
}
