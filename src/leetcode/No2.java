
/**
* @Title: No2.java
* @Package leetcode
* @Description: TODO
* @author wuwendi
* @date 2018年12月14日
* @version V1.0
*/
package leetcode;

/**
 * @Title: No2.java
 * @Package leetcode
 * @Description: 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的， 并且它们的每个节点只能存储
 *               一位 数字。 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 您可以假设除了数字 0
 *               之外，这两个数都不会以 0 开头。 示例： 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 ->
 *               0 -> 8 原因：342 + 465 = 807
 * @author wuwendi
 * @date 2018年12月14日
 * @version V1.0
 */
public class No2 {
	public static void main(String[] args) {
		System.out.println(9/10);
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum1 = 0;
		int sum2 = 0;
		int result = 0;
		// 倍数
		int bs = 1;
		do {
			sum1 = sum1 + l1.val;
			bs = bs * 10;
			l1 = l1.next;
		} while (l1 != null);

		bs = 1;
		do {
			sum2 = sum2 + l2.val;
			bs = bs * 10;
			l2 = l2.next;
		} while (l2 != null);
		result = sum1 + sum2;
		ListNode head;
		ListNode temp;
		head = new ListNode(result%10);
		result = result/10;
		while(result > 10) {
			temp = new ListNode(0);
		}
		return null;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}