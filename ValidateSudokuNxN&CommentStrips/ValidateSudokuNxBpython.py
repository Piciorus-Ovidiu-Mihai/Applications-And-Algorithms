import math
import itertools

def function(lst):
    return sorted(lst) == list(range(1,len(lst) + 1))
def test(square):
    flat_list = []
    for lst in square:
        for item in lst:
            flat_list.append(item)
    return function(flat_list)

n = 4
sudoku = [[1,2,3,4],
        [4,3,2,1],
        [2,1,4,3],
        [3,4,1,2]]
ok = 1
for i in range(len(sudoku)):
    if function(sudoku[i]) == 0:
        ok = 0
    list1 = []
    for lst in sudoku:
        list1.append(lst[i])
    if function(lst) == 0:
        ok = 0
        
linie_nr = int(math.sqrt(n))
squares = []

for i in range(0, n, linie_nr):
        for j in range(0, n, linie_nr):
            patrat = list(itertools.chain(linie[j:j+linie_nr] for linie in sudoku[i:i+linie_nr]))
            if test(patrat) == 0:
                ok = 0
if ok == 1:
    print('Valid')
else:
    print('Not Valid')