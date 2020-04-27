---
title: "Basics"
tags: ""
---
-   It is an interpreted language
-   It is a high level language
-   It is one of the most widely used languages
-   Dynamically typed language
-   It doesn't use braces "{}" but uses indentation for formating and scope detection in code

**Input:**

-   There are functions for input like:
    -   input()
    -   raw_input()
-   input():
    -   This takes values from user as in the form of string.
    -   Any _input is taken as string_

**Operators:**

-   Same operators are used as in other languages
-   Division:
    -   Integer division → a//b (also known as floor division), takes float/integer input → output is only integer
    -   Float division → a/b takes any float/integer input → float (any float input) or integer (both values must be integer)

**Data types**

-   Normal datatypes exist
-   Tuple, set are both native data types
    -   tuple → (val_1, val_2, ...)
    -   set → {val_1, val_2, ...}

**Loops:**

-   for in, and while are present
-   for in loop:
    -   _Iterate over a sequence_, sequence → array, list etc.
    -   **syntax** → for index in values:
    -   So to _iterate over numbers_ → use _range(num)_ and _xrange(num)_ functions
    -   For i in seq, list,...:
        -   i's value changes with every stage

**Basic datastructures:**

-   Lists: These are fundamental data structures and are like array but can contain heterogenous elements.
    -   We declare an empty list as "list_name=\[]".
    -   We access a list through index number '\[]'
    -   For _multidimensional list_ access (\[[1,2],[3,4]]) etc we use _'list [for outer list][for inner list]'_
    -   _Negative indexing_ is allowed in list negative indicies _represent values from the end_, Ex: list [-1] → last element, list [-5] → 5 th from the last

-   Dictionaries: Python dictionaries are created by {} and have key:value pairs in them
    -   Empty dictionary → "dictionary_name={}"
    -   We use "{ }" for declaring a dictionary
    -   Dictionaries contain key, value pair together as "key : value".
    -   key and value can be homogenous, heterogenous and can be list/tuple etc.

**Printing:**

-   print() → prints stuff implictly applying newline
    -   print(arg1, arg2, ...) → takes multiple arguments and these can be var, literals
    -   Syntax

```Python
print(*objects, sep=' ', end='\n', file=sys.stdout, flush=False)
```

keywords in print():

Objects → strings, integers, floats and other objects

sep → seperation between elements

end → what to add at end of the line, default = '\\n'

file → object must have write (ex file), default value = sys.stdout (screen)

**Some neat points:**

-   if \_\_name\_\_ == "\_\_main\_\_" : → is like telling the code to execute after this line (main function of python)

-   _'\*' operator:_
    -   It has other uses apart from multiplication
    -   It is used as _repetition_ of strings, lists, tuples
        -   s="hi", s\*3 → hihihi
        -   list=[1,2], list\*2 → [1,2,1,2]
    -   \* can be used to list all elements in range object, \*range(n) → 0 1 .. n

-   _Arrays vs Lists:_
    		\- arrays need to be declared but not lists
    -   Lists → [1,2,"hello",'a'] \(can be homogenous and heterogenous)
    -   List → default in python
    -   array → one type of data
    -   _Creation_ of _array_ requires _array module_, array.array(code, list)

-   We can add elements from one list to another by the use of _+_ and _+=_, list_1 +/+= list_2

-   **Handling precision in Python**:
    -   We can use "%" → %0.2f means upto 2 decimals for a float value
    -   We can use round(value, decimal_points) function
        -   Ex: round(value, 2) → round value till 2 decimal points
    -   We can use str.format() → "{0.2f}".format(value) means rounding value till 2 decimals.
