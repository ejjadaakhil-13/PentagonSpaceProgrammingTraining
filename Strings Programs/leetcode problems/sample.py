s="122456679"
n="";
print(len(s))
for i in range(0,len(s)):
    if i+1!=len(s):
        if ((int(s[i])%2==0) and (int(s[i+1])%2==0)):
            n=n+((str(s[i]))+"*")
        elif ((int(s[i])%2!=0) and (int(s[i+1])%2!=0)):
            n=n+str(s[i])+"-"
        else:
            n+=str(s[i])
n+=str(s[len(s)-1])
print(n)