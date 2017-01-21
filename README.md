# Java-Loops-Math
a recursive way to solve a Series problem


We use the integers a,b and n to create the following series:

(a+2^n*b) + (a+2^(n-1)*b) + (a+2^(n-2)*b) + (a+2^(n-3)*b) + (a+2^(n-4)*b)+ ... + (a+2^(n-n)*b) 

You are given  queries in the form of a, b, and n. For each query, 
print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.


Sample Input

2
0 2 10
5 3 5



Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
