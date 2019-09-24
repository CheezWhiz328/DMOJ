for i in range(5):
    a = int(input())
    for j in range(-5, 6):
        if j==0:
            print("|",end="")
        elif a < 0 and j < 0 and j >= a:
            print("*",end="")
        elif a > 0 and j > 0 and j <= a:
            print("*",end="")
        else:
            print("-", end="")
    print()
