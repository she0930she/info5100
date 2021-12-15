#Python

#Q2
strs = ["eat","tea","tan","ate","nat","bat"]
import collections
def groupAnagram(arr):
    m=collections.defaultdict(list)
    for word in arr:
        letters=[0]*26
        for char in word:
            code= ord(char)- ord("a")
            letters[code]+=1
        tmp=""
        for num in letters:
            tmp+= str(num) + "#"
        m[tmp].append(word)

    ans=[]
    for array in m.values():
        ans.append(array)
    return ans

print(groupAnagram(strs))


#Q3
nums = [1,1,1]
k = 2

def cntSubarray(nums, k):
    m={0:1 }
    cnt=0
    sum=0
    for i in range(len(nums)):
        sum+= nums[i]
        if sum-k in m:
            cnt+= m[ sum-k ]

        if sum in m:
            m[sum]+=1
        else:
            m[sum]=1
    return cnt
print(cntSubarray(nums, k))
