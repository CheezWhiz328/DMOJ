import sys
sys.setrecursionlimit(10**6)
MOD = (int)((1e9)+7)

def fib(n):
    global a,b
    F = [[ 1, 1 ], [ 1, 0 ]]
    if(n == 0):
        return 0
    power(F, n-1)
    return F[0][0]

def multiply(F, M):
    x = F[0][0] * M[0][0] %MOD + F[0][1] * M[1][0] %MOD
    y = F[0][0] * M[0][1] %MOD + F[0][1] * M[1][1] %MOD
    z = F[1][0] * M[0][0] %MOD + F[1][1] * M[1][0] %MOD
    w = F[1][0] * M[0][1] %MOD + F[1][1] * M[1][1] %MOD
    x %= MOD
    y %= MOD
    z %= MOD
    w %= MOD
    F[0][0] = x
    F[0][1] = y
    F[1][0] = z
    F[1][1] = w

def power(F, n):
    if (n == 0 or n == 1):
        return
    M = [[ 1, 1 ], [ 1, 0 ]]
    power(F, n//2)
    multiply(F, F)
    if (n%2 != 0):
        multiply(F, M)
        
n = int(input())
n %= 2000000016
a,b = 0,1

if n==0:
    print(a)
elif n==1:
    print(b)
else:
    print((fib(n-1)*a+fib(n)*b)%MOD)