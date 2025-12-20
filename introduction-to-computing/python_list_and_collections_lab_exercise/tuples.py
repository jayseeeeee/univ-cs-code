# PYTHON TUPLES: EXERCISES

# 1. Create a Tuple: Create a tuple of five countries and print it.
countries = ('Japan', 'Taiwan', 'Thailand', 'Vietnam', 'Philippines')
print('1. Create a Tuple:', countries)

# 2. Access Elements: Print the first and last elements of ('red', 'green', 'blue', 'yellow').
elements = ('red', 'green', 'blue', 'yellow')
first_element = elements[0]
second_element = elements[-1]
print('2. Access Elements:', first_element, second_element)

# 3. Concatenate Tuples: Combine (1, 2, 3) and (4, 5, 6) into one tuple.
first_tuple = (1, 2, 3)
second_tuple = (4, 5, 6)
combined_tuple = first_tuple + second_tuple
print('3. Concatenate Tuples:', combined_tuple)

# 4. Convert List to Tuple: Convert [10, 20, 30] to a tuple.
new_list = [10, 20, 30]
convert_tuple = tuple(new_list)
print('4. Convert List to Tuple:', convert_tuple)

# 5. Unpacking: Unpack ('John', 25, 'Engineer') into separate variables.
unpack_variables = ('John', 25, 'Engineer')
name, age, job = unpack_variables
print('5. Unpacking:', name, age, job)

# 6. Membership Check: Check if 'apple' is in ('apple', 'banana', 'cherry').
membership_fruits = ('apple', 'banana', 'cherry')
is_member = 'apple' in membership_fruits
print('6. Membership Check:', is_member)

# 7. Count Occurrences: Count occurrences of 5 in (1, 5, 3, 5, 5, 2).
occurence_tuple = (1, 5, 3, 5, 5, 2)
number_count = occurence_tuple.count(5)
print('7. Count Occurrences:', number_count)

# 8. Indexing: Find the index of 'banana' in ('apple', 'banana', 'cherry').
fruits_index = ('apple', 'banana', 'cherry')
index = fruits_index.index('banana')
print('8. Indexing:', index)

# 9. Tuple Length: Print the length of ('cat', 'dog', 'rabbit', 'fox').
animals_tuple = ('cat', 'dog', 'rabbit', 'fox')
animals_count = len(animals_tuple)
print('9. Tuple Length:', animals_count)

# 10. Nested Tuples: Access 'B' from (('A', 'B'), ('C', 'D')).
nested_tuples = (('A', 'B'), ('C', 'D'))
nested_element = nested_tuples[0][1]
print('10. Nested Tuples:', nested_element)