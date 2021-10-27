#Python 



array = [1,3,-1,3,4,-1]
a=[ 1,1,1,2,2,0,8]
a2= [0,6,3,3,3,5,8,8]

#Q3
import collections
def sumRepeated(arr):
    c= collections.Counter(arr)
    sum=0
    for key, val in c.items():
        if val >1:
            sum+= key
    return sum

#test case
print(sumRepeated(array))
print(sumRepeated(a2) )



s=  "abcabcbb"
s1 = "abcabcbbxuyve"
#Q4
def longestString(s):
    slow=0
    ans=[]
    m={}
    ls= list(s)
    for j in range(len(ls)):
        if ls[j] in m:
            slow= max(slow, m[ ls[j] ]+1 ) #update slow if sees repeated char
        m[ ls[j] ] = j
        tmp = ls[slow: j+1] #store current non-repeated characters
        if len(tmp) > len(ans):
            ans= tmp
    return "".join(ans) #convert list to string

#test case
print( longestString(s))
print( longestString(s1))