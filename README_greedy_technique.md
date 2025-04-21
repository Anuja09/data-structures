## Greedy Technique:
Finding local optimal choice at each stage with intent to find global optimal result. e.g. Finding minimum cost, shortest path, longest path, maximize profit etc
* Feasible solution - there could be multiple feasible solutions based on some selction criteria
* Optimal Solution - there is always only one optimal solution
Greedy algorithm is based for optimal solution.

Applications: 
1. Knapsack problem
2. Job sequencing
3. Minimum cost spanning tree
4. Optimal merge pattern
5. Huffman coding algorithm
6. Djkstra's algorithm (single source shortest path)

------
### Knapsack problem:
Knapsack means bag and bag have some capacity. 
e.g. A bag having capacity of 20kg. And, I have to find maximum profit with maximum items that can fit in 20kg.
   Lets say we have input objects having profit and weight: obj1={25, 18}, obj2={24,15}, Obj3={15,10}.
   1. Greedy about profit (maximum profit first, then second max profit and so on). Then, max profit = 25 + ((2/15) * 24) = 28.5
   2. Greedy about weight (minimum weight first, then seond minimum weight and so on). Then, max profit = 15 + ((10/15)* 24) = 31
   3. Greedy about both (based on p/w ratio = maximum first, and so on) = 24 + ((5/10) * 15) = 31.5
   
   So, 31.5 is the answer.

pseudo code:
```
1. M is capacity of bag, P is Maximum total profit.
2. for i = 0 to n, calculate p/w
3. for i= 0 to n, sort the p/w
4. for i = 0 to n,
    1. if M > 0 and w[i] <= M
       then,
        M = M - w[i] 
        P = P + p[i]
    2. else
        continue
    3. if (M > 0 and w[i] > M) 
        P = P + (p[i] * (M/w[i]))
```
TC = O(n) + O(nlogn) + O(n) ==> O(nlong)

### Optimal merge pattern:
It is to find optimal solution of merging.
E.g. I have files f1, f2, f3 with lines 10, 20, 30 respectively. I have to find no if minimum movements to merge all files, provided that you can merge only two files at a time.
   1. Solution 1 -> merge f2 and f3 first and then, merge it with f1. Total movements = (10 * 1 + 20 * 2 + 30 * 2) = 110 movemnets
   2. Solution 2 -> merge f1 and f3 first and then, merge it with f2. Total movements = (20 * 1 + 10 * 2 + 30 * 2) = 100 movemnets
   3. Solution 3 -> merge f1 and f2 first and then, merge it with f3. Total movements = (30 * 1 + 10 * 2 + 20 * 2) = 90 movemnets
   So, 90 is optimal answer.

pseudo code:
```
1. create min heap with 'n' files - (use heapify or manual)
2. at each level,
   1. remove first file with minimum lines
   2. remove second file with minimum lines
   2. put result back into heap
```
TC = O(n) + O(nlogn) ==> O(nlong)   

