DOOR_AMOUNT = 100
doors = [False] * DOOR_AMOUNT

def one_hundred_doors():
    for i in range(DOOR_AMOUNT):
        for j in range (i, DOOR_AMOUNT, i+1):
            doors[j] = not doors[j]
        print ("Door %d:" % (i + 1), "open"  if doors[i] else "closed")

one_hundred_doors()
