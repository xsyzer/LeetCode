//给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？ 
//
// 示例: 
//
// 输入: 3
//输出: 5
//解释:
//给定 n = 3, 一共有 5 种不同结构的二叉搜索树:
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3 
// Related Topics 树 动态规划 
// 👍 884 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTrees(int n) {
        int[] r = new int[n];
        if(n<3) {
            return n;
        }
        for (int i = 0; i < 2; i++) {
            r[i] = i + 1;
        }
        for (int i = 2; i < n; i++) {
            r[i] = r[i-1]*2+r[i-2];
        }
        return r[n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
