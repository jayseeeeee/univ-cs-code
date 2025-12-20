# PYTHON SETS: EXERCISES

# 1. Create a Set: Create a set of five unique numbers.
unique_numbers = {6, 9, 4, 2, 0}
print('1. Create a Set:', unique_numbers)

# 2. Add Element: Add 10 to the set {1, 2, 3, 4, 5}.
add_set = {1, 2, 3, 4, 5}
add_set.add(10)
print('2. Add Element:', add_set)

# 3. Union: Find the union of {1, 2, 3} and {3, 4, 5}.
union_1 = {1, 2, 3}
union_2 = {3, 4, 5}
union_set = union_1.union(union_2)
print('3. Union:', union_set)

# 4. Intersection: Find the intersection of {1, 2, 3} and {2, 3, 4}.
intersection_1 = {1, 2, 3}
intersection_2 = [2, 3, 4]
intersection_set = intersection_1.intersection(intersection_2)
print('4. Intersection:', intersection_set)

# 5. Difference: Find the difference between {1, 2, 3, 4} and {3, 4, 5}.
difference_1 = {1, 2, 3, 4}
difference_2 = {3, 4, 5}
difference_set = difference_1.difference(difference_2)
print('5. Difference:', difference_set)

# 6. Symmetric Difference: Find the symmetric difference of {1, 2, 3} and {3, 4, 5}.
symmetric_1 = {1, 2, 3}
symmetric_2 = {3, 4, 5}
symmetric_set = symmetric_1.symmetric_difference(symmetric_2)
print('6. Symmetric Difference:', symmetric_set)

# 7. Membership: Check if 7 is in {1, 2, 3, 4, 5}.
membership_set = {1, 2, 3, 4, 5}
is_member = 7 in membership_set
print('7. Membership:', is_member)

# 8. Remove Element: Remove 3 from {1, 2, 3, 4}.
remove_set = {1, 2, 3, 4}
remove_set.remove(3)
print('8. Remove Element:', remove_set)

# 9. Clear Set: Clear all elements from {1, 2, 3}.
clear_set = {1, 2, 3}
clear_set.clear()
print('9. Clear Set:', clear_set)

# 10. Convert List to Set: Convert [1, 2, 2, 3, 3, 4] to a set to remove duplicates.
new_list = [1, 2, 2, 3, 3, 4]
convert_list = set(new_list)
print('10. Convert List to Set:', convert_list)