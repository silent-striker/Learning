---
title: "In built functions"
tags: ""
---
These include either independent functions or object funtions

Independent functions:

-   _type()_ → used for checking type

-   _sys.getsizeof()_ → used for getting size

-   _range() → python 2 and python 3_
    -   Normally range(num) returns a new list of numbers starting from 0 to num-1
    -   range(num), range(first, last), range(first, last, increment) → first is inclusive and last is exclusive
    -   range() in python 3 behaves like xrange()

-   _xrange() → only python 2.x_
    -   xrange(num) returns an iterator (xrange object) and evaluates lazily.
    -   xrange object type → has same size no matter what the range.
    -   xrange() has similar forms to range()
    -   xrange() faster than range()

-   map():
    		\- This method takes the method to be applied (1st arg) to the data to be applied on (2nd arg)
    -   Ex map(int, input().strip().split())  → basically typcasting list elements to int

-   min() and max():
    		\- These methods find min and max values in an array, lists etc, min(array/list) and max(array/list)

Class methods:

-   _strip():_ This strips all the trailing white spaces. This is used along with input(). _String class method_

-   _split():_ This is generally used to split a string using a delimiter. _String class method_
    -   Breaks a string → List
    -   Default → spaces
