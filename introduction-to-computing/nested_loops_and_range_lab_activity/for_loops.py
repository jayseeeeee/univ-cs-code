NUMBER_OF_ITERATION = 5

print("Ascending Order")
for x in range(NUMBER_OF_ITERATION):
    for y in range(x+1):
        print(y+1, end=" ")
    print()

print("Descending Order")
for x in range(NUMBER_OF_ITERATION, 0, -1):
    for y in range(1, x+1):
        print(y, end=" ")
    print()

print("Pyramidal Order")
for x in range(NUMBER_OF_ITERATION):
    for space in range (NUMBER_OF_ITERATION-x, 0, -1):
        print(end=" ")
    for numbers in range(1, x+2):
        print(numbers, end=" ")
    print(end="\n")