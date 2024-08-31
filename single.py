def find_one_time(arr):
    unique = list(set(arr))  # Find all unique elements in the array

    for i in range(len(unique)):
        count = 0  # Reset count for each unique element
        for j in range(len(arr)):
            if unique[i] == arr[j]:
                count += 1

        if count == 1:  # Check if the element occurs only once
            return unique[i]

    return None  # Return None if no such element is found

# Test the function
print(find_one_time([2, 2, 1]))
