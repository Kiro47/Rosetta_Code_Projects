
## Copied and modified from python 2 to python 3.
## Primarily used to try and grasp a hold of this concept
names = [[1]]

def column(num):
    for i in range (len(names), (num +1)):
        cache = [0]
        for j in range (1, (i + 1)):
            cache.append(cache[-1] + names[i-j][min(j, i -j)])
        names.append(cache)
    return names[num]

def row(num):
    cache = column(num)
    return [cache[i+1] - cache[i] for i in range (num)]

print ("rows:")
for i in range (1,11): print ("%2d:" % i, row(i) )

print ("\n")
print ("sums:")
for i in [1, 23, 123, 1234, 12345, 123456, 1234567, 12345678, 123456789]: print (i, column(i)[-1] )

####### THIS MAXES OUT CPU AND CONSUMES OVER 64GB of RAM PLEASE ADVISE
