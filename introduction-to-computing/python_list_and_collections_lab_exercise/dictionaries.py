# PYTHON DICTIONARIES: EXERCISES

# 1. Create a Dictionary: Create a dictionary with 'name', 'age', and 'city' as keys.
dictionary = {'name': 'Alice', 'age': 25, 'city': 'New York'}
print('1. Create a Dictionary:', dictionary)

# 2. Access Value: Print the value of 'name' from {'name': 'Alice', 'age': 25, 'city': 'New York'}.
print('2. Access Value:', dictionary['name'])

# 3. Add Key-Value: Add 'job': 'Engineer' to the dictionary.
dictionary['job'] = 'Engineer'
print('3. Add Key-Value:', dictionary['job'])

# 4. Update Value: Change 'age' to 30 in {'name': 'Alice', 'age': 25, 'city': 'New York'}.
dictionary['age'] = 30
print('4. Update Value:', dictionary['age'])

# 5. Remove Key: Remove 'city' from the dictionary.
dictionary.pop('city')
print('5. Remove Key:', dictionary)

# 6. Key Existence: Check if 'age' is a key in the dictionary.
check_key = 'age' in dictionary
print('6. Key Existence:', check_key)

# 7. Dictionary Length: Print the number of key-value pairs in the dictionary.
dictionary_length = len(dictionary)
print('7. Dictionary Length:', dictionary_length)

# 8. Loop through Dictionary: Print all keys and values from the dictionary.
for key, values in dictionary.items():
    print('8. Loop through Dictionary:', key, values) 

# 9. Nested Dictionaries: Access Bob's 'age' from {'Alice': {...}, 'Bob': {'age': 30, 'city': 'SF'}}.
nested_dictionaries = {'Alice': {...}, 'Bob': {'age': 30, 'city': 'SF'}}
access_value = nested_dictionaries['Bob']['age']
print('9. Nested Dictionaries: ', access_value)

# 10. Convert Lists to Dictionary: Use ['name', 'age'] and ['Alice', 25] to create a dictionary.
keys = ['name', 'age']
values = ['Alice', 25]
convert_list = dict(zip(keys, values))
print('10. Convert Lists to Dictionary:', convert_list)