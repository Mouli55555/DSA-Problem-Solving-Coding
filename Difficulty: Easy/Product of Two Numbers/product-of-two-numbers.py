#Back-end complete function Template for Python 3
class Solution:
    #Function to product two numbers.
    def product(ob, x, y):
        # code here
        return x*y
#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):

        x, y = map(int, input().strip().split(" "))

        ob = Solution()
        print(ob.product(x, y))
        print("~")
# } Driver Code Ends