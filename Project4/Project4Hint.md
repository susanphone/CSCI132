# Project 4 Hints/Tips
    Searcing an array for a value

x=5 A ={3   5   1   7   2}
    is x in A?

    Two Ways
        Linear Search
        Sort + Binary Search
### Linear Search --- O(n)
    iterate through the search
        for i in(1:n)
            if A[i]==x?
                return found it
                break;

### Binary Search use the book
    sort using A.sort();
    sorting is O(nlogn)
    binary search O(logn)

### Big Idea
    think about the runtimes
    -streaming data
    fast algorithms are important.
