# PYTHON LISTS: EXERCISES

# 1. List Concatenation: Combine two lists [1, 2, 3] and [4, 5, 6] and print the result.
list1 = [1, 2, 3]
list2 = [4, 5, 6]
combined_list = list1 + list2
print('1. List Concatenation:', combined_list)

# 2. List Repetition: Repeat the list ['A', 'B'] three times and print the result.
letter_list = ['A', "B"]
repeated_list = letter_list * 3
print('2. List Repetition:', repeated_list)

# 3. List of Even Numbers: Create a list of even numbers between 1 and 20 using a loop.
even_numbers = []
for num in range(1, 21):
    if num % 2 == 0:
        even_numbers.append(num)
print('3. List of Even Numbers', even_numbers)

# 4. Remove Duplicates: Remove duplicates from the list [1, 2, 2, 3, 4, 4, 5].
duplicate_list = [1, 2, 2, 3, 4, 4, 5]
i = 0
while i < len(duplicate_list) - 1:
    if duplicate_list[i] == duplicate_list[i+1]:
        duplicate_list.pop(i)
    else:
        i += 1
print('4. Remove Duplicates:', duplicate_list)

# 5. Nested Lists: Create a 3x3 matrix using nested lists and print an element from it.
nested_list = [
    [1, 2, 3], 
    [4, 5, 6], 
    [7, 8, 9]
]
print('5. Nested Lists:', nested_list[2][2])

# 6. Find Max and Min: Find the largest and smallest values in [34, 12, 78, 56, 98].
values = [34, 12, 78, 56, 98]
min_value = min(values)
max_value = max(values)
print('6. Find Max and Min:', min_value, max_value)

# 7. List Reversal: Reverse the list [10, 20, 30, 40] using reverse() and slicing.
new_list = [10, 20, 30, 40]
new_list.reverse()
slicing_list = new_list[::-1]
print('7. List Reversal:', new_list, slicing_list)

# 8. Remove All Occurrences: Remove all occurrences of 2 from [2, 3, 2, 4, 5, 2].
occurence_list = [2, 3, 2, 4, 5, 2]
for index in occurence_list:
    if index == 2:
        occurence_list.remove(index) 
print('8. Remove All Occurences', occurence_list)

# 9. List to String: Convert ['hello', 'world', 'python'] to a single comma-separated string.
string_list = ['hello', 'world', 'python']
single_string = ', '.join(string_list)
print('9. List to String:', single_string)

# 10. Split String: Split 'Python is fun' into a list of words.
split_string =  'Python is fun'
word_list = split_string.split(' ')
print('10. Split String', word_list)