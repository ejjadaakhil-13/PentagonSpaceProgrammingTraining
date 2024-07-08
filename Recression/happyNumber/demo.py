def happycat(num):
    sum=0
    while num>0:
        rem=num%10
        sum=(rem**2)+sum
        num=num//10
    if sum==1 or sum==4:
        if sum==1:
            print("it's a happy number")
        else:
            print("it's unhappy number")
    else:
        temp=sum
        happycat(temp)
        
num=13
happycat(num)