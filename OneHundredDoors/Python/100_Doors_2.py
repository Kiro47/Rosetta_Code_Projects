DOOR_AMOUNT = 100
#### Optimized-ish

def one_hundred_doors():
    for i in range(1, DOOR_AMOUNT+1):
        squareRoot = i ** 0.5
        print ("Door %d: " % i, "open" if squareRoot == (int(squareRoot)) else "closed")

one_hundred_doors()
