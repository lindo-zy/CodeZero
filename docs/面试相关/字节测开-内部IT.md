## 一面

1.个人介绍，简历项目。

2.一个具体的测试场景：发帖，图片+文字，需要测试那些方面，其实就是问黑盒测试

3.HTTP和HTTPS，比较简单了

4.网页自动化测试流程方案，如何提高用例自动化率，需求一来就能测试那种（其实他们内部也没做，估计是看我有没有好方案吧）

5.使用和了解哪些测试框架(字节内部用的Cypress魔改的框架)，一般就是pytest、cypress、Selenium这些

算法题：https://leetcode.cn/problems/repeated-substring-pattern/

```
class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        return s in (s+s)[1:-1]
```



## 二面

1.个人介绍，简历项目。

2.华为路由器如何测试，要测试哪些方面，开放性问题

3.了解和使用过哪些测试工具，哪个比较深入

4.测开岗位，测试占比多些，你怎么看

5.测试在哪些地方可以提升效率

6.K8S和docker，展开讲讲，开放性问题

算法题：https://leetcode.cn/problems/trapping-rain-water/ 幸好做过，直接AC

```
from typing import List


class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        left_value = 0
        right_value = 0
        left = 0
        right = n - 1
        ans = 0
        while left < right:
            left_value = max(left_value, height[left])
            right_value = max(right_value, height[right])
            if height[left] < height[right]:
                ans += left_value - height[left]
                left += 1
            else:
                ans += right_value - height[right]
                right -= 1

        return ans

```

