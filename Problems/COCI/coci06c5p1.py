d = input()
a = 1
b = 0
c = 0
for i in range(len(d)):
    if d[i] == 'A':
        a,b=b,a
    if d[i] == 'B':
        b,c=c,b
    if d[i] == 'C':
        a,c=c,a
if a==1:
    print(1)
if b==1:
    print(2)
if c==1:
    print(3)
