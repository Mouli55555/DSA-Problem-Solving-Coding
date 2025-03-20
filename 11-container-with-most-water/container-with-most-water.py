class Solution:
    def maxArea(self, height: List[int]) -> int:
        area=[]
        n=len(height)
        start=0
        end=n-1
        temp1=0
        while(start<end):
            temp1=min(height[start],height[end])
            area.append((n-1)*temp1)
            n-=1
            if(temp1==height[start]):
                start+=1
            else:
                end-=1
        return max(area)
            