import java.util.LinkedList;
import java.util.Queue;

public class sou {
    public void flatten(TreeNode root) {
        Queue<Integer> queue = new LinkedList<Integer>();

        at(root,queue);

           queue.poll();
           int size=queue.size();
           TreeNode root1=root;
           for(int n=0;n<size;n++){
                   root1.right=new TreeNode(queue.poll());
               root1.left=null;
                   root1=root1.right;

           }



    }
    public void at(TreeNode root,Queue list){
        if(root!=null){
            list.offer(root.val);
            at(root.left,list);
            at(root.right,list);
        }
    }
}

