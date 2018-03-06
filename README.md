# Packing Optimizer
This was a particularly vexing problem from a recent coding interview I had.

The problem is this: You run a fast food chicken restaurant. You get orders
for some quantity of chicken but you only have boxes that can hold 20, 9, or
6 pieces of chicken. The problem is to optimize the number of boxes needed to
contain a given chicken order. If the order does not fit perfectly, an error
is to be detected.

In the interview, I provided a naive answer. Not surprisingly, I did not get
an offer, but I kept thinking about this problem.

A brute force solution is to loop through all combinations of 20, 9, and 6 
until you find all the combinations that work. Once you have this list of
solutions, can you use this to create a neural network solution?

Maybe.

First, let's think of what we know:

1. n = f(a,b,c) = 20a + 9b + 6c
2. &delta;f/&delta;a = 20 + 9b + 6c 


