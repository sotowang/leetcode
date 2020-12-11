package t649

func predictPartyVictory(senate string) string {
	var Rlist, Dlist []int
	n := len(senate)
	for i := 0; i < n; i++ {
		if senate[i] == 'R' {
			Rlist = append(Rlist, i)
		} else {
			Dlist = append(Dlist, i)
		}
	}
	for len(Rlist) > 0 && len(Dlist) > 0 {
		Rindex, Dindex := Rlist[0], Dlist[0]
		Rlist = Rlist[1:]
		Dlist = Dlist[1:]
		if Rindex < Dindex {
			Rlist = append(Rlist, Rindex+n)
		} else {
			Dlist = append(Dlist, Dindex+n)
		}
	}
	if len(Rlist) > 0 {
		return "Radiant"
	}
	return "Dire"
}
