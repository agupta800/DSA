def Lastdigit(lst):
    last = len(lst)

    for i in range(last):
        if i == last-1:
            lst[i] = lst[i] + 1

    return lst

print(Lastdigit([1, 2, 9]))
