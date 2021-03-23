# Dat355 Exercise 5

**Exercise 1a)** S = (Int,Int) and V = (Int) and get: S -> V, put: S x V -> S
Get Input: (A,B): V -> (A * B) 
Put input: ((A,B),C'): S -> (A, C/A) 

**Exercise 1b)** S = (firstName, lastName) and V = (name) and get: S -> V, put: S x V -> S 
Get Input: (firstName, lastName): V -> (lastName) 
Put input: ((firstName, lastName), name): S -> (firstName,name) (if you mean that name = firstName + lastName  then put must be handled differently and we technically have what we need to get firstName and lastName from name, but having two lastNames or firstNames make it impossible again)

**Exercise 1c)** S = (List) and V = (Set) and get: S -> V, put: S x V -> S 
Get Input: (List): V -> All of List, but remove duplicates
Put Input: (List, Set): S -> Add/remove element that are present/gone in Set and order all elements.

**Exercise 2)** I would use a symmetric lense. The way I understood it operations and super hierarchy is private for the left side, and typeKey is private for the right side. 

(R->) input (m1, m2): Changes in association CToA (m1) reflected in table CToA (m2). 
                      Changes in A (m1) reflected in Tab-A (m2)
                      Changes in attributes, both A and sublasses B (m1), reflected as attr in Tab_A (m2) (also maps to PrimType)
                      
(R<-) input (m1, m2): A lot of the same as (R->). It is important in both ways to keep both the transformed m1 and m2 after its done, since its a symmetric lense.                       

**Exercise 3a)** For all new objects in the changed A1 a corresponding object is added to A2, the same goes for removed objects in the changed A1. Changes made in A1 also restores A2 so it adheres to correctness. If no new objects are added or removed nothing happens, so hippocraticness is also accounted for.

**Exercise 3b)** The forward transformation makes A2 correspond to A1, no matter if another transformation happened to A2 in advance. Any changes made in R->(A′1, A2)) does not matter. This does not happen in the composer example. firstName can be lost when removed.

**Exercise 4a)** Z is just every set, does not tell us about the pairs. We can construct V from just the S, but need both V and S to construct S again.

**Exercise 4b)** It is correct, but will do the union etc regardless if nothing has changed so it is not hippocratic.

**Exercise 4c)** No. Because if you were to remove an element from Z that was within X and in the next put add this element back in Z it would end up as a part of the Y pair. Using just the final Z and the original X and Y would put this element in X, so it is not the same.

**Exercise 5a)** Yes it is possible. Put implementation is just the changes in V in itself with the C set. Put((v,c),v')= (v',c)

**Exercise 5b)** Since S = V x C any changes done when re-generating code does not affect C, so it is protected under all transformations. Get just gives us the collection of classes (V), while put gives us the transformed collection of class (V') and the protected region C. Only get re-generated code for the protected region C. It is history ignorant since C is protected and we always get the latest transformation of V, no matter how many times it has been transformed before. 

If there are syntax errors in the protected region this is fixed, and since its protected it will stay this way?
